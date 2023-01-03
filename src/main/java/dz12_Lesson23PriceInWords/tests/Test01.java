package src.main.java.dz12_Lesson23PriceInWords.tests;

import src.main.java.dz12_Lesson23PriceInWords.services.PriceInWordsImpl;

public class Test01 {
    private final PriceInWordsImpl priceInWordsImpl = new PriceInWordsImpl();

    public void testPriceInWordsImpl1() {
        String scenario = "T1. PriceInWordsImpl. Проверка Числа 1.";
        try {
            String actual = priceInWordsImpl.transformation(1);
            if (!actual.equals("один рубль")) {
                throw new AssertionError(String.format("Expected 1 != %s", actual));
            }

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
