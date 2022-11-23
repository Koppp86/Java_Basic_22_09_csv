package src.main.java.workingWithBankAccountsDz6Lesson11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bank {
    private String name;
    private Set<Client> clientSet;
    private Set<Account> accountSet;

    public Bank(String name){
        this.name = name;
        this.clientSet = new HashSet<>();
        this.accountSet = new HashSet<>();
    }

    public void addClient(Client client){
        clientSet.add(client);
    }
    public void addAccount(Account account){
        accountSet.add(account);
    }
    public List<Account> getAccounts(Client client) {
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
