
// Write a Java program to reverse a String.
import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter gthe string :");
        String str = input.nextLine();
        StringBuffer str2 = new StringBuffer(str);

        System.out.println("Reverse String is " + str2.reverse());
    }
}