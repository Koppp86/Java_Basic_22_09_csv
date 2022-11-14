package src.main.java;

import java.util.Scanner;

public class HomeworkOopDz4 {
    public static void main(String[] agrs){
        String[] questions = {"1) Сколько минут в часе?", "2) Сколько часов в сутках?", "3) Сколько месяцев в году?"};
        String[][] answers = {{"1. 60", "2. 100", "3. 50"},
                              {"1. 12", "2. 24", "3. 36", "4. 48"},
                              {"1. 10", "2. 11", "3. 12", "4. 13", "5. 15"}};
        int[] correctAnswers = {1, 2, 3};

        Question question1 = new Question();
        question1.setQuestion(questions[0]);
        Question question2 = new Question();
        question2.setQuestion(questions[1]);
        Question question3 = new Question();
        question3.setQuestion(questions[2]);

        Answers answers1 = new Answers();
        answers1.setAnswer(0, answers[0][0]);
        answers1.setAnswer(1, answers[0][1]);
        answers1.setAnswer(2, answers[0][2]);
        Answers answers2 = new Answers();
        answers2.setAnswer(0, answers[1][0]);
        answers2.setAnswer(1, answers[1][1]);
        answers2.setAnswer(2, answers[1][2]);
        answers2.setAnswer(3, answers[1][3]);
        Answers answers3 = new Answers();
        answers3.setAnswer(0, answers[2][0]);
        answers3.setAnswer(1, answers[2][1]);
        answers3.setAnswer(2, answers[2][2]);
        answers3.setAnswer(3, answers[2][3]);
        answers3.setAnswer(4, answers[2][4]);

        CorrectAnswer correctAnswer1 = new CorrectAnswer();
        correctAnswer1.setCorrectAnswer(correctAnswers[0]);
        CorrectAnswer correctAnswer2 = new CorrectAnswer();
        correctAnswer2.setCorrectAnswer(correctAnswers[1]);
        CorrectAnswer correctAnswer3 = new CorrectAnswer();
        correctAnswer3.setCorrectAnswer(correctAnswers[2]);

        Counter counterResultCorrect = new Counter();
        Counter counterResultInCorrect = new Counter();

        Processing process1 = new Processing();

        System.out.println("Давайте пройдем небольшой опрос. Ответом можно вводить только одну цифру варианта ответа.");

        System.out.println(question1.getQuestion());
        answers1.printAnswer(answers[0].length);
        if (process1.accounting(answers[0].length, correctAnswer1.getCorrectAnswer())){
            counterResultCorrect.add();
        } else {
            counterResultInCorrect.add();
        }

        System.out.println(question2.getQuestion());
        answers2.printAnswer(answers[1].length);
        if (process1.accounting(answers[1].length, correctAnswer2.getCorrectAnswer())){
            counterResultCorrect.add();
        } else {
            counterResultInCorrect.add();
        }

        System.out.println(question3.getQuestion());
        answers3.printAnswer(answers[2].length);
        if (process1.accounting(answers[2].length, correctAnswer3.getCorrectAnswer())){
            counterResultCorrect.add();
        } else {
            counterResultInCorrect.add();
        }

        System.out.println();
        System.out.println("Результат. Вы набрали правильных ответов: " + counterResultCorrect.getCounter() +
                           ". Неправильных: " + counterResultInCorrect.getCounter());
    }
}

class Question{
    String name;

    String getQuestion (){
        return name;
    }
    void setQuestion (String nameQuestion){
        name = nameQuestion;
    }
}

class Answers{
    String[] name = new String[5];

    String getAnswer (int numberAnswer){
        return name[numberAnswer];
    }
    void printAnswer (int countAnswers){
        for(int i = 0; i < countAnswers; i++){
            System.out.println(name[i]);
        }
    }
    void setAnswer (int numberAnswer, String nameAnswer){
        name[numberAnswer] = nameAnswer;
    }
}

class CorrectAnswer{
    int name;

    int getCorrectAnswer (){
        return name;
    }
    void setCorrectAnswer (int nameCorrectAnswer){
        name = nameCorrectAnswer;
    }
}

class Counter{
    int name = 0;

    int getCounter (){
        return name;
    }
    void setCounter (int nameCounter){
        name = nameCounter;
    }
    void add (){
        name++;
    }
}

class Processing{
    String resultQuestion;
    int resultQuestionInt = 0;
    boolean resultQuestionFlag;
    Scanner scanner = new Scanner(System.in);
    boolean accounting (int countAnswers, int correctAnswer){
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
                if (resultQuestionInt < 1 | resultQuestionInt > countAnswers) {
                    resultQuestionFlag = false;
                    System.out.println("Вариант ответа введен неверно. Введите номер пункта ответа заново(цифрой пункта): ");
                    resultQuestion = scanner.nextLine();
                }
            }
        } while (!resultQuestionFlag);

        return resultQuestionInt == correctAnswer;
    }
}
