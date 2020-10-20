package Basics.TypesOfLambda.MultipleStatements;

public class MultipleStatements {
    public static void main(String[] args) {

        LambdaInterface lambdaInterface = s -> {
            int l = s.length();
            System.out.println("Length " + l);
            return l;
        };
        System.out.println(lambdaInterface.lengthOfString("Heisenberg"));

    }
}
