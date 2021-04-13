package homework6;

public class class1 {
    //instance variable- variables which are declare inside the class but outside the methods
     int a= 7;
     int b= 8;
//instance method
    void method(){

        System.out.println(a);
        System.out.println(b);


    }

//main method
public static void main(String[] args){
        //creating instance of class1.
    class1 obj= new class1();
    //calling instance method
      obj.method();

}

}
