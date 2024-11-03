//Create a Simple To-Do List: Create a console-based to-do list application.

import java.util.Scanner;

public class Simple_ToDo_List {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define a maximum number of tasks
        int maxTasks = 10;
        String[] toDoList = new String[maxTasks];
        int taskCount = 0; // Keep track of the current number of tasks

        int choice; // Variable for storing user's menu choice

        // Loop until the user chooses to exit
        do {
            // Display menu options
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Mark a task as completed");
            System.out.println("4. Remove a task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Get the user's choice
            choice = input.nextInt();
            input.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    // Add a new task if there is room in the array
                    if (taskCount < maxTasks) {
                        System.out.print("Enter the task to add: ");
                        String task = input.nextLine();
                        toDoList[taskCount] = task; // Store task at next available index
                        taskCount++;
                        System.out.println("Task added.");
                    } else {
                        System.out.println("To-Do list is full. Cannot add more tasks.");
                    }
                    break;

                case 2:
                    // View all tasks in the to-do list
                    System.out.println("\nCurrent To-Do List:");
                    if (taskCount == 0) {
                        System.out.println("No tasks in the list.");
                    } else {
                        for (int i = 0; i < taskCount; i++) {
                            System.out.println((i + 1) + ". " + toDoList[i]);
                        }
                    }
                    break;

                case 3:
                    // Mark a task as completed
                    System.out.print("Enter the task number to mark as completed: ");
                    int completedIndex = input.nextInt() - 1;
                    if (completedIndex >= 0 && completedIndex < taskCount) {
                        System.out.println("Task '" + toDoList[completedIndex] + "' marked as completed.");
                        toDoList[completedIndex] = null; // Set the completed task to null
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 4:
                    // Remove a task by shifting tasks
                    System.out.print("Enter the task number to remove: ");
                    int removeIndex = input.nextInt() - 1;
                    if (removeIndex >= 0 && removeIndex < taskCount) {
                        System.out.println("Task '" + toDoList[removeIndex] + "' removed from the list.");
                        // Shift tasks down to fill the gap
                        for (int i = removeIndex; i < taskCount - 1; i++) {
                            toDoList[i] = toDoList[i + 1];
                        }
                        toDoList[taskCount - 1] = null; // Clear the last position
                        taskCount--;
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 5:
                    // Exit the application
                    System.out.println("Exiting the to-do list application.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        } while (choice != 5); // Continue the loop until the user chooses to exit

        // Close the Scanner object
        input.close();
    }
}

// Output:
/*
 * To-Do List Menu:
 * 1. Add a task
 * 2. View tasks
 * 3. Mark a task as completed
 * 4. Remove a task
 * 5. Exit
 * Enter your choice: 1
 * Enter the task to add: reading a book
 * Task added.
 * 
 * To-Do List Menu:
 * 1. Add a task
 * 2. View tasks
 * 3. Mark a task as completed
 * 4. Remove a task
 * 5. Exit
 * Enter your choice: 1
 * Enter the task to add: doing 5 programs of java
 * Task added.
 * 
 * To-Do List Menu:
 * 1. Add a task
 * 2. View tasks
 * 3. Mark a task as completed
 * 4. Remove a task
 * 5. Exit
 * Enter your choice: 2
 * 
 * Current To-Do List:
 * 1. reading a book
 * 2. doing 5 programs of java
 * 
 * To-Do List Menu:
 * 1. Add a task
 * 2. View tasks
 * 3. Mark a task as completed
 * 4. Remove a task
 * 5. Exit
 * Enter your choice: 3
 * Enter the task number to mark as completed: 2
 * Task 'doing 5 programs of java' marked as completed.
 * 
 * To-Do List Menu:
 * 1. Add a task
 * 2. View tasks
 * 3. Mark a task as completed
 * 4. Remove a task
 * 5. Exit
 * Enter your choice: 4
 * Enter the task number to remove: 1
 * Task 'reading a book' removed from the list.
 * 
 * To-Do List Menu:
 * 1. Add a task
 * 2. View tasks
 * 3. Mark a task as completed
 * 4. Remove a task
 * 5. Exit
 * Enter your choice: 2
 * 
 * Current To-Do List:
 * 1. null
 * 
 * To-Do List Menu:
 * 1. Add a task
 * 2. View tasks
 * 3. Mark a task as completed
 * 4. Remove a task
 * 5. Exit
 * Enter your choice: 5
 * Exiting the to-do list application.
 */