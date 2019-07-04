package main.java.com.stackroute.pe2;

public class ReverseAndCheckForPalindrome {

    public static int isReverse(int num){
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
            return num;
        }
        return 0;
    }

}
