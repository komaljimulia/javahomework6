package homework6;
import java.util.Scanner;//we import scanner here bcoz we need to import values here
public class homework18 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);//create object for scanner
        System.out.println("input first number:");//to ask user to add value
        int a= in.nextInt();
        System.out.println("input second number:");//to ask user to add value
        int b= in.nextInt();
        calculator.add(a,b);//i used calculator directly here bcoz its already made before in package.
        calculator.minus(a,b);
        calculator calc= new calculator();//creating new object of class to call instance methods
        calc.multiply(a,b);
        calc.divide(a,b);
        calc.mod(a,b);

    }
}
