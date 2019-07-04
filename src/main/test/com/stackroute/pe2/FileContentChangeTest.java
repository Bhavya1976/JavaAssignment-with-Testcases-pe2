package main.test.com.stackroute.pe2;


import main.java.com.stackroute.pe2.FileContentChange;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FileContentChangeTest {


    FileContentChange file;
    @Before
    public void setUp(){
        //System.out.println("Before");
        file  = new FileContentChange();
    }
    @After
    public void tearDown()
    {
        // System.out.println("After");
        file = null;
    }
    @Test
    public void givenNumberShouldReturnFileNotFoundMessage(){
        //arrange


        //act
        String result=file.fileContentChange("");
        //assert
        assertEquals("",result);
    }

    @Test
    public void givenNumberShouldReturnFileChangeMessage(){
        //arrange

        //act
        String result=file.fileContentChange("config/FileDemo.txt");

        //assert
        assertEquals(file.fileContentChange("config/FileDemo.txt"),result);
    }


}
