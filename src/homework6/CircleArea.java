package homework6;
import java.util.Scanner;//we need to import scanner. if we dont know then we can use '*' as well

public class CircleArea {
    public static void main(String args[]){//main method call
        Scanner scan= new Scanner(System.in);//we have to create object for scanner
      final  double pi=3.14;//final means its constant value
      System.out.println("enter value of r: ");//print the message
      double r= scan.nextDouble();//to read the value
      double a = pi*r*r;//formula
      System.out.println("the area of circle is: " +a );//print the message

    }


}
