package sistemabancario.model;

import java.util.ArrayList;
import java.util.List;

// Representa o banco: guarda seus clientes e suas contas
public class Bank {
    private String name;               // nome do banco
    private String code;               // código do banco
    private List<Client> clients;      // lista de clientes cadastrados
    private List<Account> accounts;    // lista de contas abertas

    // Cria o banco e inicia as listas vazias (sem isso elas ficam null)
    public Bank(String name, String code){
        this.name = name;
        this.code = code;
        this.clients = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    // Adiciona um cliente na lista
    public void addClient(Client client){
        clients.add(client);
    }

    // Adiciona uma conta na lista
    public void addAccount(Account account){
        accounts.add(account);
    }

    // Devolve a lista de clientes
    public List<Client> getClients(){
        return clients;
    }

    // Devolve a lista de contas
    public List<Account> getAccounts(){
        return accounts;
    }

}