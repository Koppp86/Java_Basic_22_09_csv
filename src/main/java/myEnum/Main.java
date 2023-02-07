package src.main.java.myEnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter amount and currency code:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parametrs = userInput.split(" ");
        Integer amount = Integer.valueOf(parametrs[0]);
        String currencyCode = parametrs[1];
        Currency instance = Currency.valueOf(currencyCode);
        String endingMessage = instance.getEndingsMessage(amount);
        double convertedAmount = instance.convert(100.0, Currency.USD);
        System.out.println(convertedAmount);
        System.out.println(amount + " " + currencyCode);
        System.out.println(amount + " " + endingMessage);
    }
}
