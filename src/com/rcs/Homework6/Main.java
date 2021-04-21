package com.rcs.Homework6;

import java.util.Scanner;

import static com.rcs.Homework6.SelectedOption.*;


public class Main {
    public static void main(String[] args) {
        System.out.print("Please, enter name for your To-Do list: ");
        Scanner read = new Scanner(System.in);
        ToDoItems toDoList = new ToDoItems(read.nextLine());
        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.print("Type number of the option you want to do:\n" +
                    "1. Add To-Do items\n" +
                    "2. Mark task as completed\n" +
                    "3. Display all To-Do items\n" +
                    "4. Display uncompleted To-Do items\n" +
                    "5. Display completed To-Do items\n" +
                    "Type \"q\" or \"quit\" to exit program: ");
            String option = read.nextLine();
            switch (option.toLowerCase().trim()) {
                case "1" :
                    System.out.println();
                    AddItems(toDoList);
                    break;

                case "2" :
                    System.out.println();
                    if (toDoList.getToDoItems().size() > 0) {
                        MarkTask(toDoList);
                    } else {
                        System.out.println("you don't have To-Do items");
                    }
                    break;

                case "3" :
                    System.out.println();
                    if (toDoList.getToDoItems().size() > 0) {
                        System.out.println("Your To-Do items are:");
                        toDoList.displayItems();
                    } else {
                        System.out.println("you don't have To-Do items");
                    }
                    break;

                case "4" :
                    System.out.println();
                    if (toDoList.getToDoItems().size() > 0) {
                        System.out.println("Your uncompleted To-Do items are:");
                        toDoList.displayUncompletedItems();
                    } else {
                        System.out.println("you don't have To-Do items");
                    }
                    break;

                case "5" :
                    System.out.println();
                    if (toDoList.getToDoItems().size() > 0) {
                        System.out.println("Your completed To-Do items are:");
                        toDoList.displayCompletedItems();
                    } else {
                        System.out.println("you don't have To-Do items");
                    }
                    break;

                case "q" :
                case "quit":
                    exit = true;
                    break;
                default:
                    System.out.println("Please, enter number of the option or \"q\"/\"quit\"");
            }
        }
        read.close();
    }
}
