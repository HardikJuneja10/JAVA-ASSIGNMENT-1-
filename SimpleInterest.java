import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        double finalAmount = principal + simpleInterest;

        System.out.println("\n----- RESULT -----");
        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Final Amount = " + finalAmount);

        sc.close();
    }
}