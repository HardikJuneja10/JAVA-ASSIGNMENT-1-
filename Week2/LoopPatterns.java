import java.util.Scanner;

public class LoopPatterns {
    public void Patter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();
        
    
        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<=rows; j++){
                System.out.print("*");
            }
            System.out.println();
        

        for( i = 1; i<=rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }
}
