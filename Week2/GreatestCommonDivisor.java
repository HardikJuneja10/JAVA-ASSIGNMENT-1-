import java.util.Scanner;

public class GreatestCommonDivisor {

    public static int gcd(int first, int second) {

        first = Math.abs(first);
        second = Math.abs(second);

        if (second == 0) {
            return first;
        }
        else {
            return gcd(second, first % second);
        }
    }

    public void calculateGCD() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        int result = gcd(first, second);

        System.out.println("GCD = " + result);
    }
}
