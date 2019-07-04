package main.java.com.stackroute.pe2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileContentChange {

    public String fileContentChange(String fileName) {
        try {
            File f1 = new File(fileName);                                   //Creation of File Descriptor for input file
            // String[] words = null;                                                      //Intialize the word Array
            //  int wordcount = 0;                                                         //Intialize word count to zero
            FileReader fr = new FileReader(f1);                                       //Creation of File Reader object
            BufferedReader br = new BufferedReader(fr);                              //Creation of BufferedReader object
            String str;
            while ((str = br.readLine()) != null)                                              //Reading Content from the file
            {
                return (str.toUpperCase() + "\n");
                //Split the word using space
            }
            //increase the word count for each word

            fr.close();
            //System.out.println("Number of words in the file:" + wor);
            return fileName;
        } catch (Exception e) {

        }
        return fileName;
    }
}



