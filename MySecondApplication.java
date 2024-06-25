import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Taking input for the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Taking input for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Adding the two numbers
        int sum = num1 + num2;

        // Printing the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Closing the scanner
        scanner.close();
    }
}
