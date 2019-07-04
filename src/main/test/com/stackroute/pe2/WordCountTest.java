package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.WordCount;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WordCountTest {


    WordCount count;
    @Before
    public void setUp(){
        //System.out.println("Before");
        count = new WordCount ();
    }
    @After
    public void tearDown()
    {
        // System.out.println("After");
        count = null;
    }
    @Test
    public void givenNumberShouldReturnCountMessage(){
        //arrange


        //act
        String result=count.frequencyOfWords("config/FileDemo.txt");

        //assert
        assertEquals(count.frequencyOfWords("config/FileDemo.txt"),result);
    }

    @Test
    public void givenNumberShouldReturnFileNotFoundMessage(){
        //arrange

        //act
        String result=count.frequencyOfWords("" );

        //assert
        assertEquals("",result);

    }

}
