import java.util.*;

class Temperature_converter{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the temperature in Celsius");
int n1= sc.nextInt();
double converted_temp= (n1 * 9/5) + 32;
System.out.println("temperature in Fahrenhit is " + converted_temp);
}
}