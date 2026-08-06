import java.util.Scanner;
public class calculatorr{
   public static void main(String[] args)  {
    Scanner sc = new Scanner ( System.in);
        System.out.println("ENTER FIRST NUMBER = ");
        int a  = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER = ");
        int b  = sc.nextInt();

      System.out.println("CHOOSE A OPERATION = ");
        System.out.println("1. ADDITION ");
       System.out.println("2. SUBTRACTION" );
       System.out.println( "3. MULTIPLICATION");
        System.out.println("4. DIVISION");

        System.out.println("enter your choice  = ");
        int choice = sc.nextInt();

        if (choice==1){
            System.out.println(" THE SUM IS  = "+(a+b));
        }

        if (choice==2){
            System.out.println(" THE SUBTRACTION IS  = "+(a-b));
        }

        if (choice==3){
            System.out.println(" THE MULTIPLICATION IS  = "+a*b);
        }

        if (choice==4){
            System.out.println(" THE DIVISION IS  = "+(a/b));
        }
        sc.close();


    }
}