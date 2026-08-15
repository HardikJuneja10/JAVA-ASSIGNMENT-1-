import java.util.Scanner;
public class PrimeNumber {
    public boolean isPrime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number to be checked  = ");
        int num = sc.nextInt();
        sc.close();
        if (num <= 1) {
            System.out.println("NOT A PRIME NUMBER ");
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                System.out.println( "NOT A PRIME N UMBER ");
                    return false;
            }
        }
        System.out.println("IS A PRIME NUMBER ");
        return true;
    }
}
