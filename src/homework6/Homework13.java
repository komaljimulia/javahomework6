package homework6;
import java.util.Scanner;//import scanner//we import scanner here
public class Homework13 {
    public static void main(String[] args){//main method
        Scanner in= new Scanner(System.in);//create object for scanner
        System.out.println("enter first value");//asking user to enter value
        double num1=in.nextDouble();//then we are calling it in our system
        System.out.println("enter second value");//asking user to enter second value
        double num2=in.nextDouble();//then we are calling it in our system
        System.out.println("enter third value");//asking user to enter third value
        double num3=in.nextDouble();//then we are calling it in our system
        System.out.println("average of 3: " +(num1+num2+num3)/3);//average of 3

    }

}
