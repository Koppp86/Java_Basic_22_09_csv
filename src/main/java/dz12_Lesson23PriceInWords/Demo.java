package src.main.java.dz12_Lesson23PriceInWords;

import src.main.java.dz12_Lesson23PriceInWords.services.*;

public class Demo {
    public static void main(String[] args) {
        IOConsoleService ioService = new IOStreamsService(System.out, System.in);
        PriceInWordsImpl priceInWords = new PriceInWordsImpl();
        PriceInWordsApplication application = new PriceInWordsApplication(ioService, priceInWords);
        application.run();
    }
}
