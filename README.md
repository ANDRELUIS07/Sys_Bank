# Sistema Bancário em Java

Sistema bancário simples desenvolvido em Java com persistência em banco de dados MySQL, simulando operações básicas de uma instituição financeira.

## Funcionalidades

- Cadastro de clientes
- Abertura de contas (corrente e poupança)
- Depósito e saque
- Transferência entre contas
- Consulta de saldo
- Extrato de transações

## Tecnologias utilizadas

- Java
- MySQL
- JDBC

## Estrutura do projeto

```
sistema-bancario/
├── src/
│   └── main/
│       └── java/
│           └── com/seuusuario/sistemabancario/
│               ├── Main.java
│               ├── model/
│               │   ├── Cliente.java
│               │   ├── Conta.java
│               │   ├── ContaCorrente.java
│               │   ├── ContaPoupanca.java
│               │   └── Transacao.java
│               ├── dao/
│               │   ├── ConexaoBD.java
│               │   ├── ClienteDAO.java
│               │   ├── ContaDAO.java
│               │   └── TransacaoDAO.java
│               └── service/
│                   ├── ContaService.java
│                   └── TransacaoService.java
├── database/
│   └── schema.sql
├── .gitignore
└── README.md
```
## Como executar

1. Clone o repositório
2. Crie o banco de dados MySQL usando o script em `database/schema.sql` (se você criar essa pasta)
3. Configure usuário e senha do banco na classe de conexão
4. Compile e execute a classe `Main`
