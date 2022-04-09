package Basics.DataStructures;

public class Teladoc {
    public static void main(String[] args)
    {
        String str2 = "5$67"; // 567
        String str1 = "-2.01";
        String[] split = str1.split(".");

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
            // .99 + .20  1.19  1.11
             if(length1 > 0) sum += str1.charAt(--length1) - '0'; // 0 - 9 == -9
             if(length2 > 0) sum += str2.charAt(--length2) - '0';//-9+8 = -1

             sum+= carry;
            answer.append(sum % 10); // anser = 7
            carry = sum / 10;
            max--; // 1234
        }
        if (carry > 0) answer.append(carry);
        return answer.reverse().toString();
    }
}
