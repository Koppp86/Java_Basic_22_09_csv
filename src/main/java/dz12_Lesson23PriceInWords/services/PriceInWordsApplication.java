package src.main.java.dz12_Lesson23PriceInWords.services;

import static src.main.java.dz12_Lesson23PriceInWords.services.Validator.check;

public class PriceInWordsApplication {
    private final IOConsoleService ioService;
    private final PriceInWords priceInWords;

    public PriceInWordsApplication(IOConsoleService ioService, PriceInWords priceInWords) {
        this.ioService = ioService;
        this.priceInWords = priceInWords;
    }

    public void run(){
        while (true) {
            ioService.outputString("Введите <X Y> или <exit>, где X = Целое Число, а Y = Код валюты (RUB или USD)");
            String command = ioService.inputString();

            if (command.equals("exit")) {
                return;
            } else {
                if (!Validator.check(command)) {
                    continue;
                } else {
                    String[] parametrs = command.split(" ");
                    int amount = Integer.parseInt(parametrs[0]);
                    String currencyCode = parametrs[1];
                    Currency instance = Currency.valueOf(currencyCode);

                    String result = priceInWords.transformation(amount, instance);
                    ioService.outputString("%d = %s", amount, result);
                }
            }
        }
    }
}