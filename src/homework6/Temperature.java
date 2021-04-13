package homework6;

import java.util.Scanner;//we need to import scanner

public class Temperature {


    public static void main(String args[]) {//main method
        Scanner scan = new Scanner(System.in);//create object for scanner

        System.out.println("enter value of fahrenheit: ");//asked to enter the value
        int f = scan.nextInt();//to read the value
        double c = (f-32)*5/9.0;//formula
        System.out.println("temperature in celsius: " + c);//get value
    }

}
