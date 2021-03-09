package com.rcs.Homework4;

import java.util.Random;
import java.util.Scanner;

public class SortArrays {

    public static void main(String[] args) {
        boolean check = false;
        Scanner read = new Scanner(System.in);
        int arraySize = 0;
        while (!check) {
            System.out.print("Please, enter a whole number between 20 and 40: ");
            arraySize = read.nextInt();

            if (arraySize >= 20 && arraySize <= 40) {
                check = true;
                read.close();
            } else {
                System.out.println("Your number not in range [20; 40].");
            }
        }

        int[] arrayForSort = new int[arraySize];
        Random rand = new Random();
        System.out.println("Generated array of integer numbers: ");

        for (int i = 0; i < arraySize; i++) {
            arrayForSort[i] = rand.nextInt(90) + 10;
            if (i == arraySize - 1) {
                System.out.println(arrayForSort[i]);
            } else {
                System.out.print(arrayForSort[i] + "; ");
            }
        }

        while (arraySize > 1) {
            for (int i = 0; i < arraySize - 1; i++) {
                if (arrayForSort[i] > arrayForSort[i +1]) {
                    int temp = arrayForSort[i + 1];
                    arrayForSort[i + 1] = arrayForSort[i];
                    arrayForSort[i] = temp;
                }
            }
            arraySize--;
        }
        System.out.println("Sorted array of integer numbers: ");

        for (int i = 0; i < arrayForSort.length; i++) {
            if (i == arrayForSort.length - 1) {
                System.out.println(arrayForSort[i]);
            } else {
                System.out.print(arrayForSort[i] + "; ");
            }
        }
    }
}
