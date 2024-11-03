//Sort a List of Names: Write a program that sorts a list of names in alphabetical order.

import java.util.Scanner;

public class Sort_a_List_of_Names {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for the size of the array
        System.out.print("Enter the number of names: ");
        int size = input.nextInt();
        input.nextLine(); // Consume newline

        // Declare array to store names
        String[] arr = new String[size];

        // Get names from the user
        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            arr[i] = input.nextLine();
        }

        // Bubble Sort Algorithm to sort names in alphabetical order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Compare two adjacent strings and swap if they are in the wrong order
                if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Display sorted names
        System.out.println("\nNames in alphabetical order:");
        for (String name : arr) {
            System.out.println(name);
        }

        input.close();
    }
}

// Output:
/*
 * Enter the number of names: 5
 * Enter 5 names:
 * Name 1: kirti
 * Name 2: aditi
 * Name 3: tejasvi
 * Name 4: devyani
 * Name 5: anjali
 * 
 * Names in alphabetical order:
 * aditi
 * anjali
 * devyani
 * kirti
 * tejasvi
 */