import java.util.Scanner;

public class LinearSearchToolkit {

    public int[] marks() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    static boolean contains(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }

    static int firstIndexOf(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    static int lastIndexOf(int[] arr, int target) {

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    static int countOccurrences(int[] arr, int target) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                count++;
            }
        }

        return count;
    }
}