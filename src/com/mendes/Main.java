package com.mendes;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numberArray = {100, -443, 4, -73, 40, 200, -26};
        int sum = findSumArray(numberArray);
        System.out.println(Arrays.toString(numberArray) + " sayıların toplamı: " + sum);

        double average = findAverageArray(numberArray);
        System.out.println(Arrays.toString(numberArray) + " sayıların ortalaması: " + average);

        int[] negativeArray = createNegativeArray(numberArray);
        int[] positiveArray = createPositiveArray(numberArray);

        System.out.println("\n");
        System.out.println(Arrays.toString(numberArray) + " içindeki negatif sayılar:");
        showIntegerArray(negativeArray);

        System.out.println("\n");
        System.out.println(Arrays.toString(numberArray) + " içindeki pozitif sayılar:");
        showIntegerArray(positiveArray);

    }

    private static void showIntegerArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + "'inci eleman " + array[i]);
        }
    }

    private static double findAverageArray(int[] numberArray) {
        return findSumArray(numberArray) / numberArray.length;
    }

    private static int[] createPositiveArray(int[] numberArray) {
        int positive = findPositiveCount(numberArray);
        int[] positiveArray = new int[positive];
        int j = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] > 0) {
                positiveArray[j] = numberArray[i];
                j++;
            }
        }
        return positiveArray;
    }

    private static int[] createNegativeArray(int[] numberArray) {

        int negative = numberArray.length - findPositiveCount(numberArray);
        int[] negativeArray = new int[negative];
        int j = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] < 0) {
                negativeArray[j] = numberArray[i];
                j++;
            }
        }
        return negativeArray;
    }

    private static int findSumArray(int[] numberArray) {

        int sumArray = 0;
        for (int i = 0; i < numberArray.length; i++) {
            sumArray = numberArray[i] + sumArray;
        }
        return sumArray;
    }

    private static int findPositiveCount(int[] numberArray) {
        int counter = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] > 0) {
                counter++;
            }
        }
        return counter;
    }
}