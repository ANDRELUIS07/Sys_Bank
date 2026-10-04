package sistemabancario.model;

// Conta-corrente: é uma Account que tem limite para sacar além do saldo
public class CheckingAccount extends Account{
    private double limit;   // limite extra disponível na conta (cheque especial)

    // Cria a conta corrente: repassa os dados comuns para Account e guarda o limite
    public CheckingAccount(String accountNumber, String branch, Client client, double limit) {
        super(accountNumber, branch, client);
        this.limit = limit;
    }

    // Devolve o limite da conta
    public double getLimit() {
        return limit;
    }

    // Altera o limite da conta
    public void setLimit(double limit) {
        this.limit = limit;
    }
}