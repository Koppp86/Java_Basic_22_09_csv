package src.main.java;

import java.util.Scanner;

public class HomeworkTemplateDz3 {
    public static void main(String[] agrs){
        String[] firstQuestionAndAnswers= {"1) Сколько минут в часе?", "1. 60", "2. 100", "3. 50"};
        String[] secondQuestionAndAnswers= {"2) Сколько часов в сутках?", "1. 12", "2. 24", "3. 36", "4. 48"};
        String[] thirdQuestionAndAnswers= {"3) Сколько месяцев в году?", "1. 10", "2. 11", "3. 12", "4. 13", "5. 15"};
        byte resultFirstQuestion;
        byte resultSecondQuestion;
        byte resultThirdQuestion;
        byte countResult = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Давайте пройдем небольшой опрос. Ответом можно вводить только одну цифру варианта ответа.");
        for (int i = 0; i<firstQuestionAndAnswers.length; i++){
            System.out.println(firstQuestionAndAnswers[i]);
        }
        resultFirstQuestion = scanner.nextByte();
        for (int i = 0; i<secondQuestionAndAnswers.length; i++){
            System.out.println(secondQuestionAndAnswers[i]);
        }
        resultSecondQuestion = scanner.nextByte();
        for (int i = 0; i<thirdQuestionAndAnswers.length; i++){
            System.out.println(thirdQuestionAndAnswers[i]);
        }
        resultThirdQuestion = scanner.nextByte();

        if (resultFirstQuestion == 1) {
            countResult++;
        }
        if (resultSecondQuestion == 2){
            countResult++;
        }
        if (resultThirdQuestion == 3){
            countResult++;
        }

        System.out.println();
        System.out.println("Результат. Вы набрали правильных ответов: " + countResult);
    }
}
