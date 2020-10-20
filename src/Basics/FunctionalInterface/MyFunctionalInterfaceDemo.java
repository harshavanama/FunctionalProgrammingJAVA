package Basics.FunctionalInterface;

public class MyFunctionalInterfaceDemo {
    public static void main(String args[]){
//        MyFunctionalInterface fun = () -> System.out.println("Hello");
//        fun.myMethod();
        onTheFly(()-> System.out.println("Hola"));
    }

    public static void onTheFly(MyFunctionalInterface fun){
        fun.myMethod();
    }
}
