package homework6;

public class class4 {
    //declare two static and instance variables
    int a = 7;
    int b = 3;
    static String day= "Sunday";
    static String month= "March";
    //instance method
    void instMethod(){
        System.out.println("from instance method");
        System.out.println(a);
        System.out.println(day);
        System.out.println(b);
        System.out.println(month);

    }

    //static method
    static void statMethod(){
        //creating instance for a variable
        class4 cl4= new class4();
        System.out.println("from static method");
        System.out.println(cl4.a);
        System.out.println(day);
        System.out.println(month);
        System.out.println(cl4.b);
    }
    //main method
    public static void main(String[] args){
        class4 cl4 = new class4();
        statMethod();
        cl4.instMethod();
    }










}
