package sistemabancario.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private String code;
    private List<Client> clients;
    private List<Account> accounts;

    public Bank(String name, String code){
        this.name = name;
        this.code = code;
        this.clients = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    public void addClient(Client client){
        clients.add(client);
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public List<Client> getClients(){
        return clients;
    }

    public List<Account> getAccounts(){
        return accounts;
    }

}
