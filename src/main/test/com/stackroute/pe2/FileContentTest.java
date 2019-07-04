package main.test.com.stackroute.pe2;


import main.java.com.stackroute.pe2.FileContent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FileContentTest {


    FileContent file;
    @Before
    public void setUp(){
        //System.out.println("Before");
        file  = new FileContent();
    }
    @After
    public void tearDown()
    {
        // System.out.println("After");
        file = null;
    }
    public void givenNumberShouldReturnFileNotFoundMessage(){
        //arrange


        //act
        String result=file.readFile("");
        //assert
        assertEquals("",result);
    }

    @Test
    public void givenNumberShouldReturnFileReadMessage(){
        //arrange

        //act
        String result=file.readFile("JavaAssignmentspe2/config/");

        //assert
        assertEquals("JavaAssignmentspe2/config/"
                ,result);
    }

}
