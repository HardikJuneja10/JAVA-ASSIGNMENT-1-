import java.util.Scanner;
public class Converter{
public static void main(String[]args){
Scanner sc= new Scanner (System.in);
System.out.print("ENTER TEMPERATURE IN CELSIUS =");
int celsius = sc.nextInt();
double fahrenheit = (celsius * 9.0 / 5) + 32;
System.out.print("THE TESMPERATUYRE IN FARHNEIT IS  = "+fahrenheit);







sc.close();
}
}