package src.main.java.workingWithBankAccountsDz6Lesson11;

public class Account {
    private String nnAccount;
    private Client client;

    public Account(String nnAccount, Client client, String nameClient){
        this.nnAccount = nnAccount;
        this.client = client;
    }

    public String getNnAccount(){
        return nnAccount;
    }
    public Client getClient(){
        return client;
    }
}
