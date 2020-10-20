package Basics.TypesOfLambda.ReturnTypeAndParam;

public class ReturnTypeAndParam {
    public static void main(String[] args) {

        LambdaInterface lambdaInterface = s -> s.length();
        System.out.println(lambdaInterface.lengthOfString("Harsha"));

    }
}
