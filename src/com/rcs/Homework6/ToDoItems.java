package com.rcs.Homework6;

import java.util.ArrayList;
import java.util.List;

public class ToDoItems {
    private String title;
    private List<ToDoItem> toDoItems;

    public ToDoItems(String title) {
        this.title = title;
        this.toDoItems = new ArrayList<>();
    }

    public List<ToDoItem> getToDoItems() { return toDoItems; }

    public void addItem (ToDoItem item) { this.toDoItems.add(item); }

    public void displayItems () {
        for (ToDoItem item : this.toDoItems) {
            System.out.println(item);
        }
        System.out.println();
    }

    public void displayCompletedItems () {
        for (ToDoItem item : this.toDoItems) {
            if (item.getCompleted()) {
                System.out.println(item);
            }
        }
        System.out.println();
    }

    public void displayUncompletedItems () {
        for (ToDoItem item : this.toDoItems) {
            if (!item.getCompleted()) {
                System.out.println(item);
            }
        }
        System.out.println();
    }

    public void markCompletion (int itemNumber) {
        this.toDoItems.get(itemNumber - 1).markCompletion();
    }
}
