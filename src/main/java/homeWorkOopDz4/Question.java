package src.main.java.homeWorkOopDz4;

public class Question implements UserQuestion {
    private final String name;
    private final String[] answers;
    private final int correctAnswer;
    private final Input input;
    private String resultQuestion;
    private int resultQuestionInt;

    public Question (String name, String[] answers, int correctAnswer, Input input){
        this.name = name;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
        this.input = input;
    }

    @Override
    public boolean ask (){
        boolean resultQuestionFlag;
        // 1) Выводим Текст Вопроса и Ответы на него
        System.out.println(name);
        for (int i = 0; i < answers.length; i++){
            System.out.println(answers[i]);
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
                if (resultQuestionInt < 1 | resultQuestionInt > answers.length) {
                    resultQuestionFlag = false;
                    System.out.println("Вариант ответа введен неверно. Введите номер пункта ответа заново(цифрой пункта): ");
                    resultQuestion = input.consoleUserInput();
                }
            }
        } while (!resultQuestionFlag);

        return resultQuestionInt == correctAnswer;
    }
}