package src.main.java.homeworkTestsDz8Lesson16.tests;

import src.main.java.homeworkTestsDz8Lesson16.assertions.Assertions;
import src.main.java.homeworkTestsDz8Lesson16.game.*;
import src.main.java.homeworkTestsDz8Lesson16.tests.fakes.*;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

    public void testGameDice() {
        String scenario = "T4. Game. Кубик однозначный";
        try {
            List<String> expectedFlow = List.of("Победитель: Игорь  ");
            List<String> actualFlow = new ArrayList<>();

            Dice diceSpy = new DiceSpy(1,1);
            GameWinnerPrinter gameWinnerPrinterSpy = new GameWinnerPrinterSpy(actualFlow);

            Game game = new Game(diceSpy, gameWinnerPrinterSpy);
            game.playGame(new Player("Вася"), new Player("Игорь"));

            Assertions.assertEquals(expectedFlow.get(0).length(), actualFlow.get(0).length());

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

}
