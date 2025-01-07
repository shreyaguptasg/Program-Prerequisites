import java.util.*;
class SimpleInterest{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter Principal amount");
int principal= sc.nextInt();
System.out.println("Enter the Rate");
int rate= sc.nextInt();
System.out.println("Enter the Time duration");
int time = sc.nextInt();
double simple_interest= (principal * rate* time)/100;
System.out.println("Simple Interest is " +simple_interest);
}
}