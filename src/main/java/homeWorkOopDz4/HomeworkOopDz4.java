package src.main.java.homeWorkOopDz4;

import java.util.Scanner;

public class HomeworkOopDz4 {
    public static void main(String[] agrs){
        String nameTest = "Тест_1. Проверка знаний о времени.";
        String[] questions = {"1) Сколько минут в часе?", "2) Сколько часов в сутках?", "3) Сколько месяцев в году?"};
        String[][] answers = {{"1. 60", "2. 100", "3. 50"},
                              {"1. 12", "2. 24",  "3. 36", "4. 48"},
                              {"1. 10", "2. 11",  "3. 12", "4. 13", "5. 15"}};
        int[] correctAnswers = {1, 2, 3};
        String nameInput = "Ввод_1";
        String nameOutput = "Вывод_1";
        String textOutput = "Давайте пройдем небольшой опрос. Ответом можно вводить только одну цифру варианта ответа.";

        Input input1 = new Input(nameInput, System.in);
        Output output1 = new Output(nameOutput, System.out);
        Test test1 = new Test(nameTest, questions, answers, correctAnswers, input1);
        output1.consoleUserOutput(textOutput);
        test1.passTest();
    }
}
