package src.main.java;

import java.util.*;

public class HomeWorkSortingDz5_Interface {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();     // Массив для сортировки Выбором
        List<Integer> list2 = new ArrayList<>();    // Массив для Встроенной сортировки
        int indexMin;
        int valueMin;
        long start1;
        long end1;
        long start2;
        long end2;

        System.out.println("1) Наполнение Массивов.");
        for (int i = 0; i < 100_000; i++) {
            list1.add((int)(Math.random() * 100_001));
            list2.add((int)(Math.random() * 100_001));
        }

        System.out.println("2.1) Сортировка Выбором ...");
        start1 = new Date().getTime();
        for (int i = 0; i < list1.size()-1; i++) {
            indexMin = i;
            valueMin = list1.get(i);
            for (int j = i + 1; j < list1.size(); j++) {
                if (valueMin > list1.get(j)) {
                    valueMin = list1.get(j);
                    indexMin = j;
                }
            }
            list1.set(indexMin, list1.get(i));
            list1.set(i, valueMin);
        }
        end1 = new Date().getTime();
        System.out.println("2.2) Сортировка Выбором заняла " + (end1 - start1) + " ms");

        System.out.println("3.1) Встроенная сортировка ...");
        start2 = new Date().getTime();
        Collections.sort(list2);
        end2 = new Date().getTime();
        System.out.println("3.2) Встроенная сортировка заняла " + (end2 - start2) + " ms");
    }
}
