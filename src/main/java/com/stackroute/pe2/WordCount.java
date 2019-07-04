package main.java.com.stackroute.pe2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
//import java.io.FileNotFoundException;
//import java.io.IOException;


public class WordCount {
    public String frequencyOfWords(String fileName) {
        try {
            File f1 = new File(fileName);                                   //Creation of File Descriptor for input file
            String[] words = null;                                                      //Intialize the word Array
            int wordcount = 0;                                                         //Intialize word count to zero
            FileReader fr = new FileReader(f1);                                       //Creation of File Reader object
            BufferedReader br = new BufferedReader(fr);                              //Creation of BufferedReader object
            String s;
            while ((s = br.readLine()) != null)                                              //Reading Content from the file
            {
                words = s.split(" ");                                                //Split the word using space
                wordcount = wordcount + words.length;                                      //increase the word count for each word
            }
            fr.close();
            System.out.println("Number of words in the file:" + wordcount);
            return fileName;
        } catch (Exception e) {

        }
        if(fileName=="")
            return "";
      return fileName;
    }

}
