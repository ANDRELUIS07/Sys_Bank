package sistemabancario.model;

import java.time.LocalDate;

// Classe base (abstrata) para criar qualquer tipo de conta
public abstract class Account {

    // Atributos privados (segurança de dados)
    private String accountNumber; // Número da conta (ex: "1234-5")
    private String branch;        // Número da agência (ex: "0001")
    private double balance;       // Saldo da conta com centavos
    private Client client;        // Objeto com os dados do dono da conta
    private LocalDate date;       // Data em que a conta foi aberta

    // Construtor: Executado ao criar uma nova conta
    public Account(String accountNumber, String branch, Client client){
        this.accountNumber = accountNumber;
        this.branch = branch;
        this.balance = 0.0;          // Toda conta nova começa com saldo zero
        this.client = client;
        this.date = LocalDate.now(); // Pega a data de hoje automaticamente
    }

    // Retorna o número da conta (Não pode ser alterado)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Retorna a agência
    public String getBranch() {
        return branch;
    }

    // Altera a agência
    public void setBranch(String branch) {
        this.branch = branch;
    }

    // Retorna o saldo (Sem 'set' para ninguém mudar o saldo direto)
    public double getBalance() {
        return balance;
    }

    // Retorna o cliente dono da conta
    public Client getClient() {
        return client;
    }

    // Altera o cliente dono da conta
    public void setClient(Client client) {
        this.client = client;
    }

    // Retorna a data de criação (Não pode ser alterada)
    public LocalDate getDate() {
        return date;
    }

    // Adiciona dinheiro ao saldo (apenas se o valor for positivo)
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
        }
    }

    // Remove dinheiro do saldo (apenas se houver saldo suficiente)
    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}
