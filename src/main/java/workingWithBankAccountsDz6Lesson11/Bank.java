package src.main.java.workingWithBankAccountsDz6Lesson11;

import java.util.*;

public class Bank {
    private String name;
    private Set<Client> clientSet;
    private Set<Account> accountSet;
    private Map<Account, Client> accountClientMap;

    public Bank(String name){
        this.name = name;
        this.clientSet = new HashSet<>();
        this.accountSet = new HashSet<>();
        this.accountClientMap = new HashMap<>();
    }

    public void addClient(Client client){
        clientSet.add(client);
    }
    public void addAccount(Account account){
        accountSet.add(account);
    }
    public void addAccountClient(Account account, Client client){
        accountClientMap.put(account, client);
    }

    public StringBuilder findAccountsMap(Client client) {
        StringBuilder result = null;
        for (Map.Entry<Account, Client> entry: accountClientMap.entrySet()){
            if (client.equals(entry.getValue())) {
                if (result == null) {
                    result = new StringBuilder(Integer.toString(entry.getKey().getNnAccount()));
                } else {
                    result.append(", ").append(entry.getKey().getNnAccount());
                }
            }
        }
        return result;
    }
    public Client findClientMap(Account account){
        return accountClientMap.get(account);
    }

    public List<Account> findAccounts(Client client) {
        List<Account> resultAccounts = new ArrayList<>();
        for (Account accountOther : accountSet) {
            if (client.equals(accountOther.getClient())) {
                resultAccounts.add(accountOther);
            }
        }
        return resultAccounts;
    }
    public Client findClient(Account account){
        Client resultClient = new Client();
        for (Account accountOther : accountSet) {
            if (account.equals(accountOther)) {
                resultClient = accountOther.getClient();
                break;
            }
        }
        return resultClient;
    }
}
