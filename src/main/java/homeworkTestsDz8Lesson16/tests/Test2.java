package src.main.java.homeworkTestsDz8Lesson16.tests;

import src.main.java.homeworkTestsDz8Lesson16.assertions.Assertions;
import src.main.java.homeworkTestsDz8Lesson16.game.DiceImpl;

public class Test2 {
    private final DiceImpl dicelmpl = new DiceImpl();

    public void testDiceImplRange() {
        String scenario = "T2. Dicelmpl. Метод возвращает числа в Диапазоне от 1 до 6";
        try {
            int actual = dicelmpl.roll();
            if (actual < 1 || actual > 6) {
                throw new AssertionError(String.format("Expected %d between 1 and 6", actual));
            }

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
