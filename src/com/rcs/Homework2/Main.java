package com.rcs.Homework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sveiki!");
        System.out.println("Mums ir dots kvadrāts koordinātu platnē ar virsotnem" +
                " (-2; 1), (3; 1), (3; -4) un (-2; -4)");
        System.out.println("Šajā programmā Jūs iavadīsiet koordinātus (X; Y), " +
                "un programma pateiks vai šis punkts atrodas ārpusē, iekšienē vai uz līnijas!");
        System.out.print("Lūdzu, ievādiet X koordināti: ");
        Scanner read = new Scanner(System.in);
        Double x = read.nextDouble();
        System.out.print("Lūdzu, ievādiet Y koordināti: ");
        Double y = read.nextDouble();
        read.close();
        System.out.printf("Jūsu koordināte (%s; %s) atrodas ", x, y);

        if (((x == -2 || x == 3) && (y >= -4 && y <= 1)) || ((y == -4 || y == 1) && (x >= -2 && x <= 3)) ) {
            System.out.println("uz līnijas");
        } else if (x > -2 && x < 3 && y > -4 && y < 1) {
            System.out.println("iekšienē");
        } else {
            System.out.println("ārpusē");
        }
    }
}
