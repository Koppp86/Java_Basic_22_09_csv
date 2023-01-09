package src.main.java.homeWorkOopDz4;

import java.util.Scanner;

public class HomeworkOopDz4 {
    public static void main(String[] agrs){
        String nameTest = "Тест_1. Проверка знаний о времени.";
        String[][] questions = {{"1) Сколько минут в часе?", "1. 60", "2. 100", "3. 50"},
                                {"2) Сколько часов в сутках?", "1. 12", "2. 24", "3. 36", "4. 48"},
                                {"3) Сколько месяцев в году?", "1. 10", "2. 11", "3. 12", "4. 13", "5. 15"}};
        int[] answers = {1, 2, 3};
        String nameInput = "Ввод_1";
        String nameOutput = "Вывод_1";
        Scanner scanner = new Scanner(System.in);
        String textOutput = "Давайте пройдем небольшой опрос. Ответом можно вводить только одну цифру варианта ответа.";

        Input input1 = new Input(nameInput, scanner);
        Output output1 = new Output(nameOutput, textOutput);
        Test test1 = new Test(nameTest, questions, input1, answers);
        output1.outputLn();
        test1.passTest();
    }
}
