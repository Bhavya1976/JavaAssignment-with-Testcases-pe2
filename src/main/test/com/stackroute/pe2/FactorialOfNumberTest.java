package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.FactorialOfNumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialOfNumberTest {


    FactorialOfNumber fact;
    @Before
    public void setUp(){
        //System.out.println("Before");
        fact = new FactorialOfNumber();
    }
    @After
    public void tearDown()
    {
        // System.out.println("After");
        fact = null;
    }
    public void givenNumberShouldReturnFactorialMessage(){
        //arrange


        //act
        int result=fact.isPrintIntFactorials(12);

        //assert
        assertEquals(479001600,result);
    }

    @Test
    public void givenNumberShouldReturnLongFactorialMessage(){
        //arrange

        //act
        long result=fact.isPrintLongFactorials(20);
        //assert
        assertEquals(fact.isPrintLongFactorials(20),result);
    }

}
