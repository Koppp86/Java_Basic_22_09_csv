package src.main.java.dz12_Lesson23PriceInWords.tests;

import src.main.java.dz12_Lesson23PriceInWords.services.PriceInWordsImpl;

public class Test03 {
    private final PriceInWordsImpl priceInWordsImpl = new PriceInWordsImpl();

    public void testPriceInWordsImpl3() {
        String scenario = "T3. PriceInWordsImpl. Проверка Числа 3.";
        try {
            String actual = priceInWordsImpl.transformation(3);
            if (!actual.equals("три рубля")) {
                throw new AssertionError(String.format("Expected 3 != %s", actual));
            }

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
