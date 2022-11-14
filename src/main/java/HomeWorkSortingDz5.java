package src.main.java;

import java.util.Arrays;
import java.util.Date;

public class HomeWorkSortingDz5 {
    public static void main(String[] args) {
        int[] array1 = new int[100_000];    // Массив для сортировки Выбором
        int[] array2 = new int[100_000];    // Массив для Встроенной сортировки
        int indexMin;
        int valueMin;
        long start1;
        long end1;
        long start2;
        long end2;

        System.out.println("1) Наполнение Массивов.");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int)(Math.random() * 100_001));
            array2[i] = ((int)(Math.random() * 100_001));
        }
        System.out.println("2.1) Сортировка Выбором ...");
        start1 = new Date().getTime();
        for (int i = 0; i < array1.length-1; i++) {
            indexMin = i;
            valueMin = array1[i];
            for (int j = i + 1; j < array1.length; j++) {
                if (valueMin > array1[j]) {
                    valueMin = array1[j];
                    indexMin = j;
                }
            }
            array1[indexMin] = array1[i];
            array1[i] = valueMin;
        }
        end1 = new Date().getTime();
        System.out.println("2.2) Сортировка Выбором заняла " + (end1 - start1) + " ms");

        System.out.println("3.1) Встроенная сортировка ...");
        start2 = new Date().getTime();
        Arrays.sort(array2);
        end2 = new Date().getTime();
        System.out.println("3.2) Встроенная сортировка заняла " + (end2 - start2) + " ms");
    }
}