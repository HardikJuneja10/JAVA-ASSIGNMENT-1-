import java.util.Scanner;

public class MenuCalculator {

    // void method
    public void printMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Exit");
    }

    public int readChoice(Scanner sc) {
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        while (choice < 0 || choice > 4) {
            System.out.println("Invalid choice. Please enter 0 to 4.");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        }

        return choice;
    }

    
    public double calculate(double num1, double num2, int choice) {

        switch (choice) {
            case 1:
                return num1 + num2;

            case 2:
                return num1 - num2;

            case 3:
                return num1 * num2;

            case 4:
                return num1 / num2;

            default:
                return 0;
        }
    }

    
    public void displayResult(double result) {
        System.out.println("RESULT = " + result);
    }
}
    
