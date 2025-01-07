import java.util.*;
class RectanglePerimeter{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the length of the rectangle");
int length= sc.nextInt();
System.out.println("Enter the breadth of the rectangle");
int breadth= sc.nextInt();
int perimeter= 2*(length + breadth);
System.out.println("Perimeter of the rectangle is " + perimeter + " m");
}
}
