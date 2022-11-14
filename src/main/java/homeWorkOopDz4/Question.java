package src.main.java.homeWorkOopDz4;

import java.util.Scanner;

public class Question {
    static String resultQuestion;
    static int resultQuestionInt;
    static boolean resultQuestionFlag;

    static boolean ask (String[] arrayString, Scanner scanner, int correctAnswer){
        // 1) Выводим Текст Вопроса и Ответы на него
        for (int i = 0; i < arrayString.length; i++){
            System.out.println(arrayString[i]);
        }
        // 2) Просим Пользователя ввести ответ на него
        resultQuestion = scanner.nextLine();
        // 3) Проверяем (сверяем с правильным) - если ответ верный - Возвращаем true (false)
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
                if (resultQuestionInt < 1 | resultQuestionInt > arrayString.length - 1) {
                    resultQuestionFlag = false;
                    System.out.println("Вариант ответа введен неверно. Введите номер пункта ответа заново(цифрой пункта): ");
                    resultQuestion = scanner.nextLine();
                }
            }
        } while (!resultQuestionFlag);

        return resultQuestionInt == correctAnswer;
    }
}