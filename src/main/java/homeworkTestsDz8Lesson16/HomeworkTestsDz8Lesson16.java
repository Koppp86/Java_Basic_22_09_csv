package src.main.java.homeworkTestsDz8Lesson16;

import src.main.java.homeworkTestsDz8Lesson16.tests.*;

public class HomeworkTestsDz8Lesson16 {
    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше

        Написать тесты (минимум 4) на классы DiceImpl и Game.
        Тесты должны найти не менее двух ошибок.

        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */
    public static void main(String[] args) {
        new Test1().testDiceImplNumbers();
        new Test2().testDiceImplRange();
        new Test3().testGame();
        new Test4().testGameDice();
    }
    
}