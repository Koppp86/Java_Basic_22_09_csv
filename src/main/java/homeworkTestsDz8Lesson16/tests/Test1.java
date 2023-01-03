package src.main.java.homeworkTestsDz8Lesson16.tests;

import src.main.java.homeworkTestsDz8Lesson16.assertions.Assertions;
import src.main.java.homeworkTestsDz8Lesson16.game.DiceImpl;

public class Test1 {
    // До того как мы начали писать тест ничего не было и тест не проходил)

    // После починки теста
    //private final FactorialCalculatorV01 factorialCalculator = new FactorialCalculatorV01();
    private final DiceImpl dicelmpl = new DiceImpl();


    public void testDiceImplNumbers() {
        String scenario = "T1. Dicelmpl. Метод возвращает разные числа";
        try {
            int actual1 = dicelmpl.roll();
            int actual2 = dicelmpl.roll();
            if (actual1 == actual2) {
                throw new AssertionError(String.format("Expected %d != %d", actual1, actual2));
            }

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
