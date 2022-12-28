package src.main.java.homeWorkOopDz4;

import java.util.Scanner;

public class Question {
    private String resultQuestion;
    private int resultQuestionInt;

    public boolean ask (String[] arrayString, Input input, int correctAnswer){
        boolean resultQuestionFlag;
        // 1) Выводим Текст Вопроса и Ответы на него
        for (int i = 0; i < arrayString.length; i++){
            System.out.println(arrayString[i]);
        }
        // 2) Просим Пользователя ввести ответ на него - Считываем то, что ввел Пользователь
        resultQuestion = input.consoleUserInput();
        // 3) Проверяем (сверяем с правильным) - если ответ верный - Возвращаем true (false)
        do {
            try {
                resultQuestionInt = Integer.parseInt(resultQuestion);
                resultQuestionFlag = true;
            } catch (NumberFormatException e) {
                resultQuestionFlag = false;
                System.out.println("Введенное значение не является числом. Введите номер пункта ответа заново(цифрой): ");
                resultQuestion = input.consoleUserInput();
            }

            if (resultQuestionFlag) {
                if (resultQuestionInt < 1 | resultQuestionInt > arrayString.length - 1) {
                    resultQuestionFlag = false;
                    System.out.println("Вариант ответа введен неверно. Введите номер пункта ответа заново(цифрой пункта): ");
                    resultQuestion = input.consoleUserInput();
                }
            }
        } while (!resultQuestionFlag);

        return resultQuestionInt == correctAnswer;
    }
}