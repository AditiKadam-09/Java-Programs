
//Find the first even number in a list and breaks the loop when it finds.
import java.util.Scanner;
import java.util.ArrayList;

public class FirstEvenNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the list
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        // Declare an ArrayList to store the elements
        ArrayList<Integer> list = new ArrayList<>();

        // Input the elements of the list
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            list.add(scanner.nextInt());
        }

        // Find the first even number and break the loop
        findFirstEvenNumber(list);

        scanner.close();
    }

    // Method to find the first even number in the list
    public static void findFirstEvenNumber(ArrayList<Integer> list) {
        for (int num : list) {
            if (num % 2 == 0) {
                System.out.println("The first even number is: " + num);
                return; // Breaks the loop when the first even number is found
            }
        }
        System.out.println("No even number found in the list.");
    }
}
