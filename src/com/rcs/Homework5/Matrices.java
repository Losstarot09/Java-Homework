package com.rcs.Homework5;

import java.util.Random;
import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        //Matricas deklaracija
        Random rnd = new Random();
        int size = rnd.nextInt(4) + 3;
        int[][] matrix = new int[size][size];
        Scanner read = new Scanner(System.in);
        System.out.printf("Matrix size is %dX%d\n", size, size);
        //matricas definēšana
        while (true) {
            //Lietotjas izvēl definet atomatiski va manuāli
            System.out.print("Do you want to enter matrix values manually? (y/n): ");
            String choice = read.nextLine().trim().toLowerCase();
            if (choice.equals("y") || choice.equals("yes")) {
                //manuala matricas definēšana
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.printf("Please, enter whole number from 1 to 100 for matrix[%d][%d] = ", i, j);
                        matrix[i][j] = read.nextInt();
                    }
                }
                read.close();
                break;
            } else if (choice.equals("n") || choice.equals("no")) {
                //automatiska matricas definēšana
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        matrix[i][j] = rnd.nextInt(100) + 1;
                    }
                }
                read.close();
                break;
            }
            System.out.println("Please, enter only \"yes\", \"y\", \"no\" or \"n\"");
        }
        System.out.println();
        //matricas izvadīšana uz konsoli
        System.out.println("Created matrix is:");
        for (int[] line : matrix) {
            for (int column : line) {
                System.out.printf("%4d;", column);
            }
            System.out.println();
        }
        System.out.println();
        //matricas parveršana par diagonal mātricu
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i == j ? matrix[i][j] : 0;
            }
        }
        //matricas izvadīšana uz konsoli
        System.out.println("Diagonal matrix is:");
        for (int[] line : matrix) {
            for (int column : line) {
                System.out.printf("%4d;", column);
            }
            System.out.println();
        }
    }
}
