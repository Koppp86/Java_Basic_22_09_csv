package src.main.java.dz12_Lesson23PriceInWords.services;

public class PriceInWordsApplication {
    private final IOService ioService;
    private final PriceInWords priceInWords;

    public PriceInWordsApplication(IOService ioService, PriceInWords priceInWords) {
        this.ioService = ioService;
        this.priceInWords = priceInWords;
    }

    public void run(){
        while (true) {
            ioService.outputString("Введите Число n или команду \"exit\"");
            String command = ioService.inputString();
            if (command.equals("exit")) {
                break;
            } else {
                int n;
                try {
                    n = Integer.parseInt(command);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка_1. Введенное значение не является числом.");
                    continue;
                }

                String result = priceInWords.transformation(n);
                ioService.outputString("%d = %s", n, result);
            }
        }
    }
}