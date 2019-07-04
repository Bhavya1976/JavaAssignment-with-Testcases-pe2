package main.java.com.stackroute.pe2;

public class FactorialOfNumber {

    public static int isPrintIntFactorials(int fn)
    {
        int i  = 1;

        fn = 1;

        while (true)
        {
            // System.out.printf("The factorial of %1$d is is %2$d.\n", i, fn);
            if (Integer.MAX_VALUE / fn < (i+1)) {
                //System.out.printf("The factorial of %d is out of range.\n", (i+1));
                break;
            }
            i++;
            fn *= i;
        }
        return fn;

    }

    public static long isPrintLongFactorials(long fn)
    {
        long i  = 1L;
        fn = 1L;

        while (true)
        {
            System.out.printf("The factorial of %1$d is is %2$d.\n", i, fn);
            if (Long.MAX_VALUE / fn < (i+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i+1));
                break;
            }
            i++;
            fn *= i;
        }

        return fn;

    }

}
