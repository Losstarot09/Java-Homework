package com.rcs.Homework6;

import java.util.Scanner;

public class SelectedOption {

    public static void AddItems(ToDoItems toDoItems) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.print("Please, enter name of the To-Do item: ");
            String name = read.nextLine();
            Priority priority;

            while (true){
                System.out.print("please, enter priority level (LOW, MEDIUM, HIGH): ");
                try {
                    priority = Priority.valueOf(read.nextLine().toUpperCase().trim());
                    break;
                } catch (Exception ex) {
                    System.out.println("Error, unknown priority");
                }
            }

            toDoItems.addItem(new ToDoItem(name, priority));

            System.out.println("Enter \"q\" to stop adding To-Do items or any other key to continue");
            String key = read.nextLine().toLowerCase().trim();

            if (key.equals("q")) { break; }
        }
    }

    public static void MarkTask(ToDoItems toDoItems) {
        Scanner read = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("Your To-Do Items are:");
            toDoItems.displayItems();
            try {
                System.out.print("Please, enter number of To-Do item you want to mark as completed: ");
                number = read.nextInt();
                if (number > 0 && number <= toDoItems.getToDoItems().size()){
                    break;
                } else {
                        System.out.println("Error, there is no To-Do item with that number!");
                }
            } catch (Exception ex) {
                System.out.println("Error, there is no To-Do item with that number!");
            }
        }
        toDoItems.markCompletion(number);
    }
}
