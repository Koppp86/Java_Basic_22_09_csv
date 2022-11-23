package src.main.java.workingWithBankAccountsDz6Lesson11;

import java.util.*;

public class WorkingWithBankAccountsDz6Lesson11 {
    public static void main(String[] args) {
        Bank bank1 = new Bank("ВТБ");

        Client client1 = new Client("Вася", 15);
        Client client2 = new Client("Петя", 20);
        Client client3 = new Client("Общий", 0);
        Client client4 = new Client("Вася", 25);
        Account account11 = new Account(12345601, client1, "Вася");
        Account account12 = new Account(12345602, client1, "Вася");
        Account account13 = new Account(12345603, client1, "Вася");
        Account account21 = new Account(12345604, client2, "Петя");
        Account account22 = new Account(12345605, client2, "Петя");
        Account account31 = new Account(12345606, client3, "Общий");
        Account account41 = new Account(12345607, client4, "Вася");

        bank1.addClient(client1);
        bank1.addClient(client2);
        bank1.addClient(client3);
        bank1.addAccount(account11);
        bank1.addAccount(account12);
        bank1.addAccount(account13);
        bank1.addAccount(account21);
        bank1.addAccount(account22);
        bank1.addAccount(account31);
        bank1.addAccount(account41);

        List<Account> clientAccounts = bank1.getAccounts(client2);   // 1) Найти все счета по клиенту2
        Client foundClient = bank1.findClient(account21);            // 2) Найти клиента по счету21

        System.out.println("1) Вывод Счетов Клиента2 Петя: ");
        for (Account accountOther : clientAccounts) {
            System.out.println(accountOther.getNnAccount());
        }
        System.out.println("2) Вывод Клиента Счета21: ");
        System.out.println(foundClient.getNameClient());

        Client client5 = new Client("Вася", 15);
        List<Account> clientAccounts2 = bank1.getAccounts(client5);   // 3) Найти все счета по клиенту5
        System.out.println("3) Вывод Счетов Клиента5 Васи: ");
        for (Account accountOther : clientAccounts2) {
            System.out.println(accountOther.getNnAccount());
        }
    }
}