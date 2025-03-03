import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        // Get a valid non-negative integer from the user
        int number = getNonNegativeInteger();

        // Calculate the factorial of the number
        long factorial = calculateFactorial(number);

        // Display the result to the user
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    // Method to get a valid non-negative integer input from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Keep prompting until a valid non-negative integer is entered
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            // Check if the input is a valid integer
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                // Check if the integer is non-negative
                if (number >= 0) {
                    return number;
                } else {
                    System.out.println("Error: Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }
        }
    }

    // Method to calculate the factorial of a non-negative integer
    public static long calculateFactorial(int n) {
        // Handle base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }

        // Initialize result as 1
        long result = 1;

        // Loop to calculate factorial
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
