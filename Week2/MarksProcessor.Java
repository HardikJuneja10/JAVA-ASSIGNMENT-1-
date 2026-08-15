import java.util.Scanner;

public class MarksProcessor {

    public static boolean isValidMark(int mark) {
        return mark >= 0 && mark <= 100;
    }

    public void processMarks() {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int highest = 0;
        int passes = 0;
        int failures = 0;

        while (true) {
            System.out.print("Enter mark (-1 to stop): ");
            int mark = sc.nextInt();

            if (mark == -1) {
                break;
            }

            if (!isValidMark(mark)) {
                System.out.println("Invalid mark. Please enter a mark from 0 to 100.");
                continue;
            }

            count++;
            sum += mark;

if (mark > highest) {
                highest = mark;
            }

     if (mark >= 50) {
                passes++;
            }
     else {
                failures++;
            }
        }

        printResults(count, sum, highest, passes, failures);

        sc.close();
    }

    public static double calculateAverage(int sum, int count) {
        if (count == 0) {
            return 0;
        }

        return (double) sum / count;
    }

    public static void printResults(int count, int sum, int highest,
    int passes, int failures) {

        
        System.out.println("Number of valid marks = " + count);
        System.out.println("Sum of marks = " + sum);
        System.out.println("Average mark = " + calculateAverage(sum, count));

        if (count > 0) {
            System.out.println("Highest mark = " + highest);
        }
        else {
            System.out.println("Highest mark = No marks entered");
        }

        System.out.println("Number of passes = " + passes);
        System.out.println("Number of failures = " + failures);
    }
}