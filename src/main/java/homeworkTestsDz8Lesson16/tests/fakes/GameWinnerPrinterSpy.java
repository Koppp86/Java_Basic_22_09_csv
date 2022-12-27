package src.main.java.homeworkTestsDz8Lesson16.tests.fakes;

import src.main.java.homeworkTestsDz8Lesson16.game.GameWinnerPrinter;
import src.main.java.homeworkTestsDz8Lesson16.game.Player;

import java.util.List;

public class GameWinnerPrinterSpy implements GameWinnerPrinter {
    private final List<String> actualFlow;

    public GameWinnerPrinterSpy(List<String> actualFlow) {
        this.actualFlow = actualFlow;
    }
    @Override
    public void printWinner(Player winner) {
        //System.out.printf("Победитель: %s%n", winner.getName());
        actualFlow.add(String.format("Победитель: %s%n", winner.getName()));
    }

}
