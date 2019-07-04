package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.MemberVariable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


 public class MemberVariableTest {

    MemberVariable variable;



    @Before
    public void setUp(){
        //System.out.println("Before");
        variable = new MemberVariable();
    }
    @After
    public void tearDown()
    {
        // System.out.println("After");
        variable = null;
    }
    @Test
    public void givenStringShouldReturnMemberNameAgeSalaryMessage(){
        //arrange


        //act
        String[] result=variable.isMemberOfClass("Bhavya",22,25000);

        //assert
        assertEquals(variable.isMemberOfClass("Bhavya",22,25000),result);
    }

   /* @Test
    public void givenNumberShouldReturnNotAPowerOfNumberMessage(){
        //arrange

        //act
        String[] result=variable.isMemberOfClass("",0,0);

        //assert
        assertEquals("",result);

    }*/

}
