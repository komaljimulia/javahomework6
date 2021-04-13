package homework6;
import java.util.Scanner;//to use the scanner
public class TimesTable {
    public static void main(String[] args){//main method
        Scanner in = new Scanner(System.in);//create object for scanner
        System.out.println("Input the Number: ");//ask the user to add value
        int n = 8;//bcoz its 8 times table
        for (int i = 1; i <= 10; i++){//we want till 10 not more than that
            System.out.println(n + "*" + i + " = " + (n * i));//how it looks
        }
    }
}
