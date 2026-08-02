import java.util.Scanner;

public class DigitExtraction {
    public static void Digit(int num){
        int hundreds = num/100;
        int tens = (num/10)%10;
        int unit = num%10;
        System.out.println("Hundreds: "+hundreds);
        System.out.println("Tens : "+tens);
        System.out.println("Unit : "+unit);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Digit(num);
        sc.close();
    }
}