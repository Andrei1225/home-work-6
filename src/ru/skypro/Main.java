package ru.skypro;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        // Задание 1

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Задание 2

        float minCosts = sum * 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minCosts) {
                minCosts = arr[i];
            }
        }

        double maxCosts = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxCosts) {
                maxCosts = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minCosts + " рублей. Максимальная сумма трат за день составила " + maxCosts + " рублей.");

        // Задание 3

        float averageCosts = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageCosts + " рублей.");

        // Задание 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        return arr;

    }
}
