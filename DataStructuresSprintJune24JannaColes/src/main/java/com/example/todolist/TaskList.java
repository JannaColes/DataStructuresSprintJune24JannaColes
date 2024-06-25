package com.example.todolist;

public class TaskList {
    private TaskNode head;

    public TaskList() {
        this.head = null;
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        TaskNode newNode = new TaskNode(newTask);

        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void markTaskAsCompleted(String description) {
        TaskNode current = head;
        while (current !=null) {
            if (current.task.getDescription().equals(description)) {
                current.task.markAsCompleted();
                return;
            }
            current = current.next;
        }
    }

    public void printTasks() {
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
}
