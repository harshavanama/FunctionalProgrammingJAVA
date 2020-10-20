package Basics.FunctionalInterface;

public class LambdaUnderTheHood {
    public static void main(String[] args) {
        MyFunctionalInterface fun1 = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Impl 1");
            }
        };
        MyFunctionalInterface fun2 = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Impl 2");
            }
        };
    }
}
