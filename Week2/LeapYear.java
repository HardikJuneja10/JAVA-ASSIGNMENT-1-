import java.util.Scanner;

public class LeapYear {
    public boolean LeapYear(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE YEAR TO BE CHECKED  = ");
            int year = sc.nextInt();

            boolean result;
            if (year %4==0){
                result= true;
            }
            else if (year % 400 == 0){
                result =  false;
            }
            else if(year % 100 == 0){
                result =  false;
            }
            else 
                result =  false; 

            if (result){
                System.out.print("Yes this is leap year");
            }
            else 
                System.out.print("No this is not leap year ");
        return false;
             
    }
}

