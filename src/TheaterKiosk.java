//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt the user for their age
        System.out.print("Please enter your age: ");

        // Check if the input is an integer
        if (in.hasNextInt()) {
            int age = in.nextInt();  // Read the age

            // Check if the user is 21 or older
            if (age >= 21) {
                System.out.println("You are eligible to get a wristband.");
            }
        } else {
            // Handle non-integer input
            System.out.println("Invalid input. Please enter a valid age.");
        }

        // Close the scanner
        in.close();
    }
}

