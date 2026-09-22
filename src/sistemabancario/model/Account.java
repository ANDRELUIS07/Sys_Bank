package sistemabancario.model;

import java.time.LocalDate;

public abstract class Account {
    private String accountNumber;
    private String branch;
    private double balance;
    private Client client;
    private LocalDate date;

    public Account(String accountNumber, String branch, Client client){
        this.accountNumber = accountNumber;
        this.branch = branch;
        this.balance = 0.0;
        this.client = client;
        this.date = LocalDate.now();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getDate() {
        return date;
    }
}
