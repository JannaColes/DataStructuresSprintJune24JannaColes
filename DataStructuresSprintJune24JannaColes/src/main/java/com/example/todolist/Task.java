package com.example.todolist;

public class Task {
    private String description;
    private boolean isCompleted;
    private String color;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
        this.color = "\u001B[33m";
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    public String getDescription() {
        return  description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

   @Override
    public String toString() {
        return color + description + " (Status: " + (isCompleted ? "Completed" : "Pending") + ")" + "\u001B[33m";
   }
}
