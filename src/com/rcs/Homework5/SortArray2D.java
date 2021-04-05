package com.rcs.Homework5;

import java.util.Random;
import java.util.Scanner;

public class SortArray2D {

    public static void main(String[] args) {
        //masīva deklarešana
        //masīva rindu skaitu veidošana
        int lines;
        Scanner read = new Scanner(System.in);
        System.out.print("Please, enter how many lines matrix should have [5 - 15]: ");
        while (true) {
            String linesQuantity = read.nextLine().trim();
            //Parbaude vai ir ievadīts vesls skaitlis
            try {
                lines = Integer.parseInt(linesQuantity);
            } catch (Exception e) {
                System.out.print("Please enter whole number between 5 and 15: ");
                continue;
            }
            //Parbaude vai ievadīts skaitlis ir robežās [5-15]
            if (lines < 5 || lines > 15) {
                System.out.print("Please enter whole number between 5 and 15: ");
                continue;
            }
            read.close();
            System.out.println();
            break;
        }
        //masīva kolonu skaitu veidošana
        Random rnd = new Random();
        int columns = rnd.nextInt(12) + 4;
        int[][] matrix = new int[lines][columns];
        //masīva definešana
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(900) + 100;
            }
        }
        //masīva izadīšana uz konsoli
        System.out.println("Created matrix is:");
        for (int[] line : matrix) {
            for (int column : line) {
                System.out.printf("%4d;", column);
            }
            System.out.println();
        }
        System.out.println();
        //masīva kartošana katra rindā dilstošā secibā
        for (int i = 0; i < matrix.length; i++) {
            boolean check = false;
            int length = matrix[i].length - 1;
            while (!check) {
                for (int j = 0; j < length; j++) {
                    if (matrix[i][j] < matrix[i][j + 1]) {
                        int temp = matrix[i][j + 1];
                        matrix[i][j + 1] = matrix[i][j];
                        matrix[i][j] = temp;
                    }
                }
                length--;
                if (length == 0) {
                    check = true;
                }
            }
        }
        //masīva 1. rindasa mainīšana ar pedejo
        int[] temp = matrix[lines - 1];
        matrix[lines - 1] = matrix[0].clone();
        matrix[0] = temp.clone();
        //masīva izadīšana uz konsoli
        System.out.println("Sorted matrix is:");
        for (int[] line : matrix) {
            for (int column : line) {
                System.out.printf("%4d;", column);
            }
            System.out.println();
        }
    }
}
