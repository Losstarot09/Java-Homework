package com.rcs.Homework1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Sveiki!");
        System.out.println("šajā programmā Jūs ievadīsiet Fārenhaita grādus " +
                "un tie būs pārveidoti uz Celsija grādiem!");
        System.out.print("Lūdzu, ievadiet Fārenhaita grādus: ");
        Scanner scan = new Scanner(System.in);
        Double f = scan.nextDouble();
        scan.close();
        Double c = 5 * (f - 32) / 9;
        System.out.println(f + " Fārenhaita grādi ir " + c + " Celsija grādi");
    }
}
