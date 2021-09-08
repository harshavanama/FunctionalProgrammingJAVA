package Basics;

public class FizzBuzz {
    public static void main(String[] args) {
        int arr [] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        fizzBuzz(arr);
    }


    public static void fizzBuzz(int[] arr){

        for(int i : arr){
            if(i%3==0 && i%5==0) System.out.println("FizzBuzz");
            else if(i%5 ==0) System.out.println("Buzz");
            else if(i%3==0) System.out.println("Fizz");
            else System.out.println(i);
        }
    }
}
