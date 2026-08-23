// package Week3.week_3.src;

import java.util.Scanner;

public class ArrayStatistics {

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

    public int ArraySum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public double Average(int[] arr) {

        int sum = ArraySum(arr);

        double average = (double) sum / arr.length;

        return average;
    }

    public int minimum(int[] arr) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public int maximum(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public int CountEven(int[] arr) {

        int even = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even++;
            }
        }

        return even;
    }

    void PrintSignCounts(int[] arr) {

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                positive++;
            }
            else if (arr[i] < 0) {
                negative++;
            }
            else {
                zero++;
            }
        }

        System.out.println("Number of positive: " + positive);
        System.out.println("Number of negative: " + negative);
        System.out.println("Number of zero: " + zero);
    }

    public static void main(String[] args) {

        ArrayStatistics obj = new ArrayStatistics();

        int[] arr = obj.marks();

        System.out.println("Sum: " + obj.ArraySum(arr));
        System.out.println("Average: " + obj.Average(arr));
        System.out.println("Minimum: " + obj.minimum(arr));
        System.out.println("Maximum: " + obj.maximum(arr));
        System.out.println("Even numbers: " + obj.CountEven(arr));

        obj.PrintSignCounts(arr);
    }
}