package main.java.com.stackroute.pe2;

public class PowerOfANumber {

    public static String isPowerOfANumber(int number) {


        String str="";
        if (number == 0)
            return null;
        while (number > 1) {
            if (number%4== 0)
                return null;
            number=number/4;

        }
        if (isPowerOfANumber(number).equals(1)) {
            str = "not a power of 4";
        }
        else {
            str = "is a power of 4";
        }
        return str;


    }

}
