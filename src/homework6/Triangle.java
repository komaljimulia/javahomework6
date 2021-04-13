package homework6;
import java.util.Scanner;//import scanner
import java.lang.Math;//to use sqrt function
public class Triangle {
    public static void main(String args[]){//main method
        Scanner scan= new Scanner(System.in);//bcoz we have import scanner that is why we need to create object
        System.out.println("enter value of a: ");//print the message
        double a= scan.nextDouble();//to read the value
        System.out.println("enter value of b: ");//print the message
        double b= scan.nextDouble();//to read the value
        System.out.println("enter value of c: ");//print the message
        double c= scan.nextDouble();//to read the value
        double s  = (a+b+c)/2;//calculate perimeter of a triangle
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("the area of triangle is: "+area);//print the area of triangle
    }


}
