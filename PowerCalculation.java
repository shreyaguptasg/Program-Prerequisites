import java.util.*;
import java.lang.Math;
class PowerCalculation{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your base number");
int base= sc.nextInt();
System.out.println("Enter your exponent number");
int exponent= sc.nextInt();
int cal= Math.pow(base, exponent);
System.out.println(cal);
}
}
