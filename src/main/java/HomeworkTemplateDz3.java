package src.main.java;

//import java.util.locale.LocaleUtils.isNumeric;

import java.util.Scanner;

public class HomeworkTemplateDz3 {
    public static void main(String[] agrs){
        String[] questions = {"1) Сколько минут в часе?", "2) Сколько часов в сутках?", "3) Сколько месяцев в году?"};
        String[][] answers = {{"1. 60", "2. 100", "3. 50"},
                              {"1. 12", "2. 24", "3. 36", "4. 48"},
                              {"1. 10", "2. 11", "3. 12", "4. 13", "5. 15"}};
        int[] correctAnswers = {1, 2, 3};
        String resultQuestion;
        int resultQuestionInt = 0;
        boolean resultQuestionFlag;
        byte countResultCorrect = 0;
        byte countResultInCorrect = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Давайте пройдем небольшой опрос. Ответом можно вводить только одну цифру варианта ответа.");
        for (int i = 0; i<questions.length; i++){
            System.out.println(questions[i]);
            for (int j = 0; j<answers[i].length; j++){
                System.out.println(answers[i][j]);
            }
            resultQuestion = scanner.nextLine();

            do {
                try {
                    resultQuestionInt = Integer.parseInt(resultQuestion);
                    resultQuestionFlag = true;
                } catch (NumberFormatException e) {
                    resultQuestionFlag = false;
                    System.out.println("Введенное значение не является числом. Введите номер пункта ответа заново(цифрой): ");
                    resultQuestion = scanner.nextLine();
                }

                if (resultQuestionFlag) {
                    if (resultQuestionInt < 1 | resultQuestionInt > answers[i].length) {
                        resultQuestionFlag = false;
                        System.out.println("Вариант ответа введен неверно. Введите номер пункта ответа заново(цифрой пункта): ");
                        resultQuestion = scanner.nextLine();
                    }
                }
            } while (!resultQuestionFlag);

            if (resultQuestionInt == correctAnswers[i]){
                countResultCorrect++;
            } else {
                countResultInCorrect++;
            }
        }

        System.out.println();
        System.out.println("Результат. Вы набрали правильных ответов: " + countResultCorrect + ". Неправильных: " + countResultInCorrect);
    }
}
