package com.rcs.Homework3;

import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {
        boolean nameCheck = false;
        String nameSurname = "";
        Scanner read = new Scanner(System.in);
        while (!nameCheck) {
            System.out.print("Please, enter your name and surname: ");
            nameSurname = read.nextLine().trim();

            if (nameSurname.contains(" ")) {
                nameSurname = nameSurname.replaceAll("\\s+", " ");
                nameCheck = true;
            } else {
                System.out.println("Error: you entered only name or surname, or there is no space between them");
            }
        }
        read.close();
        String name = "'" + nameSurname.toUpperCase().charAt(0) +
                nameSurname.toLowerCase().substring(1, nameSurname.indexOf(" ")) + "'";
        System.out.println(name);
        String surname = nameSurname.toUpperCase().substring(nameSurname.indexOf(" ") + 1);

        if (surname.contains(" ")) {
            String surname2 = "'" + surname.substring(surname.indexOf(" ") + 1) + "'";
            surname = "'" + surname.substring(0, surname.indexOf(" ")) + "'";
            System.out.println(surname);
            System.out.println(surname2);
        } else {
            surname = "'" + surname + "'";
            System.out.println(surname);
        }
    }
}
