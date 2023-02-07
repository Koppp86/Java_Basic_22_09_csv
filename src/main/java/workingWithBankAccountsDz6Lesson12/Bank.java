package src.main.java.workingWithBankAccountsDz6Lesson12;

import java.util.*;

public class Bank {
    private String name;
    private Map<Account, Client> accountClientMap;
    private Map<Client, Set<Account>> clientAccountsMap;

    public Bank(String name){
        this.name = name;
        this.accountClientMap = new HashMap<>();
        this.clientAccountsMap = new HashMap<>();
    }

    public Map<Account, Client>  getAccounts(){
        return accountClientMap;
    }
    public Map<Client, Set<Account>> getClients(){
        return clientAccountsMap;
    }

    public void addAccountClient(Account account, Client client){
        accountClientMap.put(account, client);

        Set<Account> accountClient = clientAccountsMap.get(client);
        if (accountClient == null){
            Set<Account> accountNew = new HashSet<>();
            accountNew.add(account);
            clientAccountsMap.put(client, accountNew);
        } else {
            Set<Account> clientAccounts = clientAccountsMap.get(client);
            clientAccounts.add(account);
        }
    }

    public Set<Account> findAccountsMap(Client client) {
        return clientAccountsMap.get(client);
    }
    public Client findClientMap(Account account){
        return accountClientMap.get(account);
    }
}
