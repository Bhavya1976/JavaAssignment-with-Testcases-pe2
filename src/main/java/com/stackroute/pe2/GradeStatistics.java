package main.java.com.stackroute.pe2;


import java.util.Scanner;
import java.lang.Class;

public class GradeStatistics {





        public final int GRADE_MINIMUM = 0;
        public final int GRADE_MAXIMUM = 100;

        public static  int[] grades;


        public   int  readGrades(int num)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the number of students: ");
            int numberStudents = in.nextInt();

            grades = new int[numberStudents];

            int i = 0;
            while (i < numberStudents)
            {
                System.out.printf("Enter the grade for student %1$d: ", (i+1));
                int grade = in.nextInt();
                if (GRADE_MINIMUM <= grade && grade <= GRADE_MAXIMUM)
                {
                    grades[i] = grade;
                    i++;
                }
                else {
                    System.out.println("Error! Grade must be integer between 0 and 100!");
                }
            }
            return 0;
        }

        public  int isMin()
        {
            if (grades.length == 0) {
                return 0;
            }

            int min = grades[0];
            for (int i = 0; i < grades.length; i++) {
                min = (min > grades[i]) ? grades[i] : min;
            }
            return min;
        }

        public int isMax()
        {
            if (grades.length == 0) {
                return 0;
            }

            int max = grades[0];
            for (int i = 0; i < grades.length; i++) {
                max = (max < grades[i]) ? grades[i] : max;
            }
            return max;
        }





    }
