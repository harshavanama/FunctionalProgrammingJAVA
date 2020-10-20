package Basics.TypesOfLambda.NoReturnButParam;

public class NoReturnButParam {
    public static void main(String[] args) {

        //Type -2 Parameter and no return type
        LambdaInterface lambdaInterface1 = (a , b) -> System.out.println(a+b);
        lambdaInterface1.calculation(5,6);

        LambdaInterface lambdaInterface2 = (a,b) -> System.out.println(a-b);
        lambdaInterface2.calculation(20,5);

    }
}
