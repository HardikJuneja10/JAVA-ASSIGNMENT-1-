
import java.util.Scanner;

public class FinalValueOperations {

    public void calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of operations: ");
    int n = sc.nextInt();

        int X = 0;

        for (int i = 1; i <= n; i++) {
        System.out.print("Enter operation " + i + ": ");
        String operation = sc.next();

            if (operation.equals("++X") || operation.equals("X++")) {
                X++;
            }
            else if (operation.equals("--X") || operation.equals("X--")) {
                X--;
            }
      else {
                System.out.println("Invalid operation");
            }
        }

        System.out.println("Final value of X = " + X);

        sc.close();
    }
}
