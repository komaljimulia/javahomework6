package homework6;

public class class3 {
    //declare one static and instance variables
    int a = 7;
    static String day= "Sunday";
    //instance method
    void instMethod(){
        System.out.println("from instance method");
        System.out.println(a);
        System.out.println(day);
    }

//static method
    static void statMethod(){
        //creating instance for a variable
        class3 cl3= new class3();
        System.out.println("from static method");
        System.out.println(cl3.a);
        System.out.println(day);
            }
            //main method
            public static void main(String[] args){
        class3 cl3 = new class3();
        statMethod();
        cl3.instMethod();
            }




}
