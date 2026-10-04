package sistemabancario.model;

// Tipos de transação que o banco aceita (só esses três valores são permitidos)
public enum TransactionType {
    DEPOSIT,    // depósito: dinheiro entra na conta
    WITHDRAW,   // saque: dinheiro sai da conta
    TRANSFER    // transferência: dinheiro sai de uma conta e entra em outra
}