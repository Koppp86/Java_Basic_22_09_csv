package src.main.java.homeWorkOopDz4;

import java.util.Scanner;
import java.io.*;
public class Test{
    private String name;
    private String[][] questions;
    private Input input;
    private int[] answers;
    private int counterResultCorrect;
    private int counterResultInCorrect;

    Test(String name, String[][] questions, Input input, int[] answers){
        this.name = name;
        this.questions = questions;
        this.input = input;
        this.answers = answers;
    }

    public void passTest(){
        for (int i = 0; i < questions.length; i++){
            boolean resultAsk = Question.ask(questions[i], input.scanner, answers[i]);
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