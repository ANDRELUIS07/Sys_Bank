package sistemabancario.model;

public class CheckingAccount extends Account{
    private double limit;

    public CheckingAccount(String accountNumber, String branch, Client client, double limit) {
        super(accountNumber, branch, client);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
