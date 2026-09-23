# DedeBank — Sistema Bancário em Java

Sistema bancário desenvolvido em Java com persistência em banco de dados relacional, simulando operações básicas de uma instituição financeira: cadastro de clientes, contas, depósitos, saques, transferências e histórico de transações.

## Funcionalidades

- Cadastro de clientes
- Abertura de contas (corrente e poupança)
- Depósito e saque
- Transferência entre contas
- Consulta de saldo
- Extrato de transações (histórico)

## Tecnologias utilizadas

- Java
- JDBC
- MySQL (ou outro banco relacional)

## Estrutura do projeto

```
src/sistemabancario/
│
├── Main.java                        → ponto de entrada da aplicação
│
├── model/
│   ├── Account.java                 → classe abstrata: número, agência, saldo, cliente, data
│   ├── CheckingAccount.java         → conta corrente (extends Account)
│   ├── SavingsAccount.java          → conta poupança (extends Account)
│   ├── Client.java                  → dados do cliente
│   ├── Bank.java                    → administra contas/clientes e orquestra operações
│   └── Transaction.java             → representa uma operação (depósito, saque, transferência)
│
├── enums/
│   └── TransactionType.java         → DEPOSIT, WITHDRAW, TRANSFER
│
├── exceptions/
│   ├── InsufficientFundsException.java
│   ├── InvalidAmountException.java
│   └── AccountNotFoundException.java
│
├── dao/
│   ├── ConnectionBD.java            → conexão com o banco de dados
│   ├── AccountDAO.java              → persistência de contas
│   ├── ClientDAO.java               → persistência de clientes
│   └── TransactionDAO.java          → persistência do histórico de transações
│
└── service/
    ├── AccountService.java          → regras de negócio de conta (abrir, encerrar)
    ├── BankService.java             → regras que envolvem o banco como um todo
    └── TransactionService.java      → valida e executa operações, gera registros de Transaction
```

### Camadas do projeto

- **model** — representa os dados e comportamentos essenciais das entidades (sem SQL, sem lógica de fluxo da aplicação).
- **service** — concentra a lógica de negócio: validações e orquestração entre múltiplas entidades (ex.: uma transferência mexe em duas contas ao mesmo tempo).
- **dao** — cuida exclusivamente da persistência (ler e escrever no banco de dados).
- **exceptions** — erros de domínio específicos (saldo insuficiente, valor inválido, conta não encontrada), em vez de exceptions genéricas do Java.
- **Main** — apenas inicializa e chama os services; não deve conter lógica de negócio nem SQL direto.

### Fluxo de uma transferência (exemplo)

```
Main → BankService.transfer(contaA, contaB, valor)
     → valida saldo (InsufficientFundsException se necessário)
     → Account.withdraw() / Account.deposit()
     → cria um objeto Transaction
     → TransactionDAO.save(transaction)
```

## Como executar

1. Clone o repositório
2. Crie o banco de dados usando o script SQL em `database/schema.sql` (se essa pasta existir no projeto)
3. Configure usuário e senha do banco na classe `ConnectionBD`
4. Compile e execute a classe `Main`

## Status do projeto

Em desenvolvimento — estrutura de pacotes definida; classes de modelo, DAOs e services sendo implementados progressivamente.
