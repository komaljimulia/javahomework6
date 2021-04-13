package homework6;

public class calculator {
    static void add(int a,int b){        System.out.println(a+b);    }//to get result of addition
    static void minus(int a,int b){
        System.out.println(a-b);
    }//to get result of subtraction
    void mod(int a,int b){System.out.println(a%b);}//added bcoz it was needed for homework 18
     void multiply(int a,int b){
        System.out.println(a*b);
    }//to get result of multiplication
     void divide(int a,int b){
         System.out.println(a/b);
    }//to get result of division
    public static void main(String[] args){//main method
        add(10,5);
        minus(10,5);
        calculator calc= new calculator();
        calc.multiply(10,5);
        calc.divide(10,5);


    }
}
