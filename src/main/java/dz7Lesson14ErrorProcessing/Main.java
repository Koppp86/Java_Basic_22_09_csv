package src.main.java.dz7Lesson14ErrorProcessing;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        IOService ioService = new IOStreamsService(System.out);
        try (MyInputStream myInputStream = new MyInputStream(System.in)){
            FactorialCalculator factorialCalculator = new FactorialCalculatorImpl();
            FactorialApplication application = new FactorialApplication(ioService, factorialCalculator, myInputStream);
            application.run();
        } catch (IOException e){
            System.out.println("Ошибка Ввода/Вывода");
        }
    }
}
