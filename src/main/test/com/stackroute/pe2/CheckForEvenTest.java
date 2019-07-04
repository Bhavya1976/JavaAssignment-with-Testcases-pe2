package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.CheckForEven;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CheckForEvenTest {


    CheckForEven check;
    @Before
    public void setUp(){
        //System.out.println("Before");
        check = new CheckForEven();
    }
    @After
    public void tearDown()
    {
        // System.out.println("After");
        check = null;
    }
    public void givenNumberShouldReturnEvenMessage(){
        //arrange


        //act
        boolean result=check.checkEven(2);

        //assert
        assertEquals(true,result);
    }

    @Test
    public void givenNumberShouldReturnOddMessage(){
        //arrange

        //act
        boolean result=check.checkEven(29);

        //assert
        assertEquals(false,result);
    }
   /* @Test
    public void givenNumberShouldReturnNegativeMessage(){
        //arrange
        //act
        boolean result = check.checkEven(-1);
        //assert
        assertEquals.("OutOfRange");
        ,result);
    }*/




}
