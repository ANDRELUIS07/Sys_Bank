package sistemabancario.model;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(String accountNumber, String branch, Client client, double interestRate) {
        super(accountNumber, branch, client);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void apllyInterest() {
        double interest = getBalance() * interestRate;
        if (interest > 0) {
            deposit(interest);
        }
    }
}
