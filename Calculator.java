import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        while (true) { // Loop to run calculator multiple times

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.println("\nChoose Operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");

            System.out.print("Enter your choice (1-4): ");
            int operation = sc.nextInt();

            double result;

            // Conditional Logic using switch
            switch (operation) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;

                case 4:
                    // Conditional Logic using if
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

            System.out.print("\nDo you want to perform another calculation? (Y/N): ");
            choice = sc.next().charAt(0);

            if (choice == 'N' || choice == 'n') {
                System.out.println("Calculator Closed.");
                break; // Exit loop
            }
        }

        sc.close();
    }
}