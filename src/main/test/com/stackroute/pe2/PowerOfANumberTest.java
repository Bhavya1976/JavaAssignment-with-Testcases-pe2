package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.PowerOfANumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class PowerOfANumberTest {


        PowerOfANumber power;
        @Before
        public void setUp(){
            //System.out.println("Before");
            power = new PowerOfANumber();
        }
        @After
        public void tearDown()
        {
            // System.out.println("After");
            power = null;
        }
        @Test
        public void givenNumberShouldReturnPowerOfNumberMessage(){
            //arrange


            //act
            String result=power.isPowerOfANumber(256);

            //assert
            assertEquals(power.isPowerOfANumber(256),result);
        }

        @Test
        public void givenNumberShouldReturnNotAPowerOfNumberMessage(){
            //arrange

            //act
            String result=power.isPowerOfANumber(24);

            //assert
            assertEquals(power.isPowerOfANumber(24),result);

        }
        @Test
        public void givenNumberShouldReturnErrorMessage(){
            //arrange
            //act
            String result=power.isPowerOfANumber(0);
            //
            assertEquals(power.isPowerOfANumber(0),result);
        }



    }
