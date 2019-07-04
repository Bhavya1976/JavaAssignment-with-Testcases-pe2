package main.test.com.stackroute.pe2;


import main.java.com.stackroute.pe2.ReverseAndCheckForPalindrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseAndCheckForPalindromeTest {


    ReverseAndCheckForPalindrome reverse;
    @Before
    public void setUp(){
        //System.out.println("Before");
        reverse = new   ReverseAndCheckForPalindrome ();
    }
    @After
    public void tearDown()
    {
        // System.out.println("After");
        reverse = null;
    }
    @Test
    public void givenNumberShouldReturnPalindromeMessage(){
        //arrange


        //act
        int result=reverse.isReverse(4554);

        //assert
        assertEquals("power of 4 ",result);
    }

    @Test
    public void givenNumberShouldReturnNotAPalindromeMessage(){
        //arrange

        //act
        int result=reverse.isReverse(1234);

        //assert
        assertEquals("Not a power of 4 ",result);

    }
    @Test
    public void givenNumberShouldReturnErrorMessage(){
        //arrange
        //act
        int result=reverse.isReverse(-1124);
        //
        assertEquals("",result);
    }

}
