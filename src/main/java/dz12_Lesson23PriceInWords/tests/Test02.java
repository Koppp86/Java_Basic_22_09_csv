package src.main.java.dz12_Lesson23PriceInWords.tests;

import src.main.java.dz12_Lesson23PriceInWords.services.PriceInWordsImpl;

public class Test02 {
    private final PriceInWordsImpl priceInWordsImpl = new PriceInWordsImpl();

    public void testPriceInWordsImpl11() {
        String scenario = "T2. PriceInWordsImpl. Проверка Числа 11.";
        try {
            String actual = priceInWordsImpl.transformation(11);
            if (!actual.equals("одиннадцать рублей")) {
                throw new AssertionError(String.format("Expected 11 != %s", actual));
            }

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
