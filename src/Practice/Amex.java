package Practice;

public class Amex {

    public static void main(String[] args) {

        int [] array = {1,1,2,2,3,3};

        for(int i = 1; i< array.length; i++ ){
            if(array[i] == array[i-1]){
                array[i-1] = -1;
            }
        }
        for( int i : array)
            System.out.println(i);
    }
}
