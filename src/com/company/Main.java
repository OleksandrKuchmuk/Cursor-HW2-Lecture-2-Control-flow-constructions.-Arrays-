package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int largestValue = 0;
        int smallestValue = 500;
        int summOfAllPairedIndices = 0;
        double count = 0;
        int countDivisoin3 = 0;

//        1. Заповнити масив тільки парними числами
        int[] array = new int[100];
        for (int i = 0, a = 0; i < array.length; i++) {
            array[i] = (a += 2);
        }

//        2. Заповнити масив рандомними числами
        for (int i = 0; i < array.length; i++) {
            Random randomNumbers = new Random();
            array[i] = randomNumbers.nextInt(500);
        }

//        3. Вивести середнє значення масиву
        for (int i : array) {
            count += i;
            if (i % 3 == 0) {
                countDivisoin3 += i;
            }
        }
        count /= array.length;
        System.out.println("The average value of the array: " + count);
        System.out.println();

//        4. Вивести суму всіх значень кратних 3
        System.out.println("The sum of all values multiples of 3: " + countDivisoin3);
        System.out.println();

//        5. Вивести значення всіх парних індексів масиву
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println("The value of the " + i + " array element:   " + array[i]);
            }
        }
        System.out.println();

//        6. Просортувати масив в порядку зростання
//        Insertion sort
        for (int i = 1; i < array.length; ++i) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }

//        7. Вивести найменше значення в масиві
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= smallestValue) {
                smallestValue = array[i];
            }
        }
        System.out.println("The smallest value of the array:  " + smallestValue);
        System.out.println();


//        8. Вивести найбільше значення масиву
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= largestValue) {
                largestValue = array[i];
            }
        }
        System.out.println("The largest value of the array:   " + largestValue);
        System.out.println();


//        9. Вивести суму значень всіх парних індексів
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                summOfAllPairedIndices += array[i];
            }
        }
        System.out.println("The sum of all paired indices:   " + summOfAllPairedIndices);
        System.out.println();

//        10. Вивести перших 20 символів з таблиці ASCI
        System.out.println("The first 20 characters of the ASCI table:");
        for (char i = 32; i < 52; i++) {
            System.out.print(i + " ");
        }
//
//* (завдання з зірочкою)
//        Заповнити масив рандомними числами, вивести їх, потім поміняти місцями парні з непарними


    }
}

