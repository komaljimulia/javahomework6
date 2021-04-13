package homework6;

import java.util.Scanner;

public class Homework16 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);//create object for scanner
        System.out.println("Input first binary Number: ");//ask the user to add value
        String a=in.nextLine(); //10

        System.out.println("Input second binary Number: ");//ask the user to add value
        String b=in.nextLine();//11

        Integer no1 = Integer.parseInt(a,2);//for integer class .parseint function
        System.out.println ("Decimal no1: "+ no1);

        Integer no2 = Integer.parseInt(b,2);
        System.out.println ("Decimal no2: "+ no2);

        Integer res = no1 + no2;
        System.out.println ("Decimal result:" + res);//just to print the add result
        System.out.println("Binary result: "+ Integer.toBinaryString(res));//covert binery to decimal

    }
}
