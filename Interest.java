import java.util.Scanner ;
public class Interest{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("ENTER PRINCIPAL AMOUNT  = ");
        double amount  = sc.nextDouble();
        System.out.print("ENTER RATE  = ");
        double rate  = sc.nextDouble();
        System.out.print("ENTER TIME IN YEARS  = ");
        double time  = sc.nextDouble();
        double simpleInterest = (amount*rate*time)/100;
        System.out.print(" THE SIMPLE INTEREST IS = "+ simpleInterest);
        double totalamount= simpleInterest+ amount;
        System.out.print(" THE TOTAL AMOUNT  IS = "+ totalamount);
        sc.close();
    }
    }
