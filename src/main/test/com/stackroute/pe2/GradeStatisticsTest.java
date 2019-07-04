package main.test.com.stackroute.pe2;


import main.java.com.stackroute.pe2.GradeStatistics;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeStatisticsTest {

    GradeStatistics grade;
    @Before
    public void setUp(){
        //System.out.println("Before");
        grade = new GradeStatistics();
    }
    @After
    public void tearDown()
    {
        // System.out.println("After");
        grade = null;
    }
    @Test
    public void givenNumberShouldReturnMaxGradeMessage(){
        //arrange


        //act
        int result=grade.isMax();

        //assert
        assertEquals(" ",result);
    }

    @Test
    public void givenNumberShouldReturnMinGradeMessage(){
        //arrange

        //act
        int result=grade.isMin();

        //assert
        assertEquals(" ",result);

    }
    @Test
    public void givenNumberShouldReturnErrorMessage(){
        //arrange
        //act
        int result=grade.readGrades(-1);
        //
        assertEquals("Enter the valid grade ",result);
    }

}
