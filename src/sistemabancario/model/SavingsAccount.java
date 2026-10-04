package sistemabancario.model;

// Conta poupança: é uma Account que rende juros
public class SavingsAccount extends Account{
    private double interestRate;   // taxa de rendimento (ex: 0.005 = 0,5% ao mês)

    // Cria a poupança: repassa os dados comuns para Account e guarda a taxa
    public SavingsAccount(String accountNumber, String branch, Client client, double interestRate) {
        super(accountNumber, branch, client);
        this.interestRate = interestRate;
    }

    // Devolve a taxa de rendimento
    public double getInterestRate() {
        return interestRate;
    }

    // Altera a taxa de rendimento
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Calcula o rendimento sobre o saldo e soma ao saldo
    public void applyInterest() {
        double interest = getBalance() * interestRate;
        if (interest > 0) {      // só deposita se houver rendimento
            deposit(interest);
        }
    }
}