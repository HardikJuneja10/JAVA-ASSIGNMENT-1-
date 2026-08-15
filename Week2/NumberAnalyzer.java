import java.util.Scanner;

public class NumberAnalyzer {

    static int readNumber(Scanner input) {
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static boolean isPositive(int number) {
        return number > 0;
    }

    static int absoluteValue(int number) {
        return Math.abs(number);
    }

    static int countDigits(int number) {

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        return count;
    }

    static int sumDigits(int number) {

        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        return sum;
    }

    static void printReport(
            int number,
            boolean even,
            boolean positive,
            int digitCount,
            int digitSum) {

        System.out.println("Number = " + number);
        System.out.println("Even = " + even);
        System.out.println("Positive = " + positive);
        System.out.println("Number of digits = " + digitCount);
        System.out.println("Sum of digits = " + digitSum);
    }
}
