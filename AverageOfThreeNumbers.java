
import java.util.*;
class AverageOfThreeNumbers{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your first numbers");
int n1= sc.nextInt();
System.out.println("Enter your second numbers");
int n2= sc.nextInt();
System.out.println("Enter your third numbers");
int n3= sc.nextInt();
double average= (n1+n2+n3)/3;
System.out.println("The average of 3 numbers is " +average);
}
}
