package src.main.java.workingWithBankAccountsDz6Lesson11;

public class Account {
    private int nnAccount;
    Client client;

    public Account(int nnAccount, Client client, String nameClient){
        this.nnAccount = nnAccount;
        this.client = client;
    }

    public int getNnAccount(){
        return nnAccount;
    }
    public Client getClient(){
        return client;
    }
}
