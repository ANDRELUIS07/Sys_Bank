package sistemabancario.model;

import java.time.LocalDateTime;

// Registra uma operação feita no banco (depósito, saque ou transferência)
public class Transaction {
    private int id;                    // identificador (gerado pelo banco de dados)
    private TransactionType type;      // tipo da operação
    private double amount;             // valor movimentado
    private LocalDateTime date;        // data e hora da operação
    private Account source;            // conta de origem (null no depósito)
    private Account destination;       // conta de destino (null no saque)

    // Cria a transação e registra a data e hora atuais
    public Transaction (TransactionType type, double amount, Account source, Account destination){
        this.type = type;
        this.amount = amount;
        this.date = LocalDateTime.now();
        this.source = source;
        this.destination = destination;
    }

    // Devolve o id da transação
    public int getId() {
        return id;
    }

    // Define o id (usado depois de salvar no banco)
    public void setId(int id) {
        this.id = id;
    }

    // Devolve o tipo da operação
    public TransactionType getType() {
        return type;
    }

    // Devolve o valor movimentado
    public double getAmount() {
        return amount;
    }

    // Devolve a data e hora da operação
    public LocalDateTime getDate() {
        return date;
    }

    // Devolve a conta de origem
    public Account getSource() {
        return source;
    }

    // Devolve a conta de destino
    public Account getDestination() {
        return destination;
    }
}