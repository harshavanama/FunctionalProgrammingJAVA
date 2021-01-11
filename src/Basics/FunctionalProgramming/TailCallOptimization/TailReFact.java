package Basics.FunctionalProgramming.TailCallOptimization;

public class TailReFact {
    public static void main(String[] args) {

        System.out.println("Regular - " + reFact(4));
        System.out.println("Tail - " + tailReFact(4,1));
    }
    public static long reFact(int n){

        if(n<=1)
            return n;
        else
        return n * reFact(n-1);
    }

    public static long tailReFact(int n  , int a ){

        if(n<=1)
            return a;
        else
        return n * tailReFact(n-1 ,a);
    }
}
