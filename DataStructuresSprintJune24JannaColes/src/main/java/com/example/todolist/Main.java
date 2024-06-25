package com.example.todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to the To-Do List Manager!");
        System.out.println("Quote of the day: " + QuoteProvider.getRandomQuote());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Create user");
            System.out.println("2. Add a task to the user");
            System.out.println("3. Mark task as completed");
            System.out.println("4. View the tasks for the user");
            System.out.println("5. Exit");
            System.out.print("Choose and option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {

                case 1:
                    createUser(scanner);
                    break;

                case 2:
                    addTaskToUser(scanner);
                    break;

                case 3:
                    markTaskAsCompleted(scanner);
                    break;

                case 4:
                    viewTasksForUser(scanner);
                    break;

                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createUser(Scanner scanner) {
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        users.add(new User(name));
        System.out.println("User created Successfully");
    }

    private static void addTaskToUser(Scanner scanner) {
        System.out.print("Enter user Name: ");
        String userName = scanner.nextLine();
        User user = findUser(userName);
        if (user != null) {
            System.out.print("Enter task description: ");
            String description = scanner.nextLine();
            user.addTask(description);
            System.out.println("Task added successfully.");
        } else {
            System.out.println("User not found.");
        }

    }

    private static void markTaskAsCompleted(Scanner scanner) {
        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();
        User user = findUser(userName);
        if (user != null) {
            System.out.print("Enter task description: ");
            String description = scanner.nextLine();
            user.markTaskAsCompleted(description);
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("User not found.");
        }
    }


    private static void viewTasksForUser(Scanner scanner) {
        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();
        User user = findUser(userName);
        if (user != null) {
            user.printTasks();
        } else {
            System.out.println("User not found.");
        }
    }

    private static User findUser(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
}


