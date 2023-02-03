package src.main.java.workingWithBankAccountsDz6Lesson12;

import java.util.*;

public class WorkingWithBankAccountsDz6Lesson12 {
    public static void main(String[] args) {
        Bank bank1 = new Bank("ВТБ");

        Client client1 = new Client("Вася", 15);
        Client client2 = new Client("Петя", 20);
        Client client3 = new Client("Общий", 0);
        Account account11 = new Account("12345601");
        Account account12 = new Account("12345602");
        Account account13 = new Account("12345603");
        Account account21 = new Account("12345604");
        Account account22 = new Account("12345605");
        Account account31 = new Account("12345606");

        bank1.addAccountClient(account11, client1);
        bank1.addAccountClient(account12, client1);
        bank1.addAccountClient(account13, client1);
        bank1.addAccountClient(account21, client2);
        bank1.addAccountClient(account22, client2);
        bank1.addAccountClient(account31, client3);

        Set<Account> foundAccounts = bank1.findAccountsMap(client2);        // 1) Найти все счета по клиенту2
        System.out.print("1) Вывод Счетов Клиента \"" + client2.getName() + "\" : ");
        for (Account account: foundAccounts) {
            System.out.print("\"" + account.getNnAccount() + "\" ");
        }
        System.out.println();
        Client foundClient2 = bank1.findClientMap(account21);               // 2) Найти клиента по счету21
        System.out.println("2) Вывод Клиента Счета \"" + account21.getNnAccount() + "\" : " + foundClient2.getName());
    }
}
