package src.main.java.homeWorkOopDz4;

import java.util.Scanner;
import java.io.*;
public class Test{
    private final String name;
    private final String[][] questions;
    private final Input input;
    private final int[] answers;
    private int counterResultCorrect;
    private int counterResultInCorrect;

    Test(String name, String[][] questions, Input input, int[] answers){
        this.name = name;
        this.questions = questions;
        this.input = input;
        this.answers = answers;
    }

    public void passTest(){
        Question question = new Question();
        for (int i = 0; i < questions.length; i++){
            boolean resultAsk = question.ask(questions[i], input, answers[i]);
            if (resultAsk) {
                counterResultCorrect++;
            } else {
                counterResultInCorrect++;
            }
        }
        System.out.println();
        System.out.println("Результат. Вы набрали правильных ответов: " + counterResultCorrect +
                           ". Неправильных: " + counterResultInCorrect);
    }
}