package src.main.java.homeworkTestsDz8Lesson16.tests.fakes;

import src.main.java.homeworkTestsDz8Lesson16.game.Dice;

public class DiceSpy implements Dice {
    private final int number1;
    private final int number2;
    private boolean flag;
    public DiceSpy(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
        flag = false;
    }
    @Override
    public int roll() {
        //return new Random().nextInt(numberMin, numberMax);
        if (number1 != number2){
            if (!flag) {
                flag = true;
                return number1;
            } else {
                return number2;
            }
        } else {
            return number1;
        }
    }



}
