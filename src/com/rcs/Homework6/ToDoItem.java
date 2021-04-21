package com.rcs.Homework6;

public class ToDoItem {

    private String description;
    private Priority priority;
    private boolean completed;

    public ToDoItem(String description, Priority priority) {
        this.description = description;
        this.priority = priority;
        this.completed = false;
    }

    public String getDescription () { return this.description; }
    public void setDescription (String description) { this.description = description; }

    public Priority getPriority () { return this.priority; }
    public void setPriority (Priority priority) { this.priority = priority; }

    public boolean getCompleted () { return this.completed; }

    public void markCompletion() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return String.format("Description: %s; Priority: %s; Completed: %s", this.description,
                this.priority, this.completed ? "Yes" : "No");
    }
}
