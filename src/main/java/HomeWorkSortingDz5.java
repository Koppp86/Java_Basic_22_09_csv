package src.main.java;

public class HomeWorkSortingDz5 {
    public static void main(String[] args) {
        int[] array1 = new int[10];     // Массив для сортировки Выбором
        int[] array2 = new int[10];     // Массив для сортировки Пузырьком
        int index;
        int value;
        System.out.println("1.1) Наполнение Массива для сортировки Выбором: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int)(Math.random() * 11));
            System.out.println(i + " " + array1[i]);
        }
        System.out.println("1.2) Сортировка Выбором.");
        for (int i = 0; i < array1.length-1; i++) {
            index = i;
            value = array1[i];
            for (int j = i + 1; j < array1.length; j++) {
                if (value > array1[j]) {
                    value = array1[j];
                    index = j;
                }
            }
            array1[index] = array1[i];
            array1[i] = value;
        }
        System.out.println("1.3) Вывод отсортированного Массива Выбором: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(i + " " + array1[i]);
        }
        System.out.println("2.1) Наполнение Массива для сортировки Пузырьком: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = ((int)(Math.random() * 101));
            System.out.println(i + " " + array2[i]);
        }
        System.out.println("2.2) Сортировка Пузырьком.");
        for (int i = array2.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array2[j] > array2[j+1]) {
                    value = array2[j];
                    array2[j] = array2[j+1];
                    array2[j+1] = value;
                }
            }
        }
        System.out.println("2.3) Вывод отсортированного Массива Пузырьком: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(i + " " + array2[i]);
        }
    }
}
