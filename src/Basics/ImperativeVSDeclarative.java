package Basics;


import java.util.stream.IntStream;

public class ImperativeVSDeclarative {
    public static void main(String[] args) {
        //problem - print sum of all the even numbers till 100

        //Imperative
        int sumOfEvens = 0;
        for(int i =0; i <= 100 ; i ++){
            if(i % 2 == 0)
                sumOfEvens+=i;
        }
        System.out.println(sumOfEvens);
        //Functional or Declarative style
        int sumOfEvens1 =  IntStream.rangeClosed(1,100)
                .filter(i -> i%2 ==0)
                .reduce((x,y) -> x+y)
                .getAsInt();
        System.out.println(sumOfEvens1);
    }

}
