package Basics.DataStructures;

public class Teladoc {
    public static void main(String[] args)
    {
        String str2 = "123456789012345678901";
        String str1 = "12345678";

        System.out.println(addNumbers(str1, str2));
    }

    public static String addNumbers(String str1, String str2)
    {
        StringBuilder answer = new StringBuilder();
        int length1 = str1.length(), length2 = str2.length();
        int max = Math.max(str1.length(), str2.length());

        int carry = 0;
        while(max > 0)
        {
            int sum = 0;
             if(length1 > 0) sum += str1.charAt(--length1) - '0';
             if(length2 > 0) sum += str2.charAt(--length2) - '0';

             sum+= carry;
            answer.append(sum % 10);
            carry = sum / 10;
            max--;
        }
        if (carry > 0) answer.append(carry);
        return answer.reverse().toString();
    }
}
