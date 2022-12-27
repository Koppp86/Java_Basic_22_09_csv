package src.main.java.dz7Lesson14ErrorProcessing;

public class FactorialCalculatorImpl implements FactorialCalculator  {
    public int factorial(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Вывод исключения - Нельзя вводить числа меньше нуля.");
        }
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
