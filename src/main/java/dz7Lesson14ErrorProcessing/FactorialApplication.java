package src.main.java.dz7Lesson14ErrorProcessing;

public class FactorialApplication {
    private final IOService ioService;
    private final FactorialCalculator factorialCalculator;
    private final MyInputStream inputStream;
    private boolean flag = false;

    public FactorialApplication(IOService ioService, FactorialCalculator factorialCalculator, MyInputStream inputStream) {
        this.ioService = ioService;
        this.factorialCalculator = factorialCalculator;
        this.inputStream = inputStream;
    }

    public void run() {
        try {
            while (true) {
                ioService.outputString("Введите n или команду \"exit\"");
                String command = inputStream.inputString();
                if (command.equals("exit")) {
                    flag = true;
                    break;
                } else {
                    int n = Integer.parseInt(command);
                    int factorial = factorialCalculator.factorial(n);
                    ioService.outputString("%d! = %d", n, factorial);
                }
            }
        } catch (Exception e) {
            System.out.println("Исключение уровня 2 (" + e + ")");
        } finally {
            if (!flag) {
                run();
            }
        }
    }
}
