//HOMEWORK 14C
//ARGS babynames1900s.txt babynames2000s.txt
//ARGS baby1.txt baby2.txt
//ARGS 
/*

Write an application called BabyNames1900sAnd2000s to print two columns in alphabetical order. 
The first column will contain all the boys names for 1900s that were still popular in 2000s. 
The second column will contain all the girls names for 1900s that were still popular in 2000s. 
Make the columns 30 characters wide and left justified. The file names will be specified as command line arguments.
If there are not 2 command line arguments, print the message:

Usage: java BabyNames1900sAnd2000s file1 file2
You can download the two files into Eclipse for testing from the following URLs

Here is the file format

	Males	Females
Rank	Name	Number	Name	Number
1	John	84,591	Mary	161,508
2	William	69,321	Helen	69,429

Do not use try / catch here. Just declare that the method throws an exception

For full points, design the program so you only read each file one time.

Your stack trace may be different than mine and Codecheck will not give you a pass. 
But if you are throwing the exception, you are doing the problem correctly. 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BabyNames1900sAnd2000s
{
   public static void main(String[] args) throws FileNotFoundException
   {
      if (args.length < 2)
      {
         System.out.println("Usage: java BabyNames1900sAnd2000s file1 file2");
         return; //can't do anything without the files
      }

      //get the Scanners with headers already read 
      Scanner scan1 = getScanner(args[0]);
      Scanner scan2 = getScanner(args[1]);

      //get the boy and girl list from the first file
      ArrayList<ArrayList<String>> lists = getLists(scan1);
      ArrayList<String> boyList1 = lists.get(0);
      ArrayList<String> girlList1 = lists.get(1);

      //get the boy and girl list from the second file
      lists = getLists(scan2);
      ArrayList<String> boyList2 = lists.get(0);
      ArrayList<String> girlList2 = lists.get(1);

      //find boys in both lists
      ArrayList<String> stillPopularBoys = getInBoth(boyList1, boyList2);
      Collections.sort(stillPopularBoys);
      //find girls in both lists
      ArrayList<String> stillPopularGirls = getInBoth(girlList1, girlList2);
      Collections.sort(stillPopularGirls);
      
      //print the lists in two columns
      printIn2Columns(stillPopularBoys, stillPopularGirls);
      scan1.close();
      scan2.close();

   }

   //get Scanner primed to the first line with names
   //returns the scanner
   private static Scanner getScanner(String filename) throws FileNotFoundException
   {
         Scanner in = new Scanner(new File(filename), "UTF-8");
         in.nextLine(); //get rid of both header lines
         in.nextLine();
         return in;   
   }

   //read the file containing only name records and make boy and girl lists
   //return an ArrayList of the lists
   private static ArrayList<ArrayList<String>> getLists(Scanner in)
   {
      ArrayList<String> boys = new ArrayList<String>();
      ArrayList<String> girls = new ArrayList<String>();

      //boy name is a 1, girl name at 3
      while (in.hasNextLine())
      {
         String[] line = in.nextLine().split("\\s+");
         boys.add(line[1]);
         girls.add(line[3]);

      }

      ArrayList<ArrayList<String>> lists = new ArrayList<>();
      lists.add(boys);
      lists.add(girls);
      return lists;
   }

   //Get the names in both list
   //returns an ArrayList containing the names in both lists
   private static ArrayList<String> getInBoth(ArrayList<String> list1, ArrayList<String> list2)
   {
      ArrayList<String> inBoth = new ArrayList<>();
      for (String s: list1)
      {
         if (list2.contains(s))
         {
            inBoth.add(s);
         }  
      }
      return inBoth;
   }

   //Print the boys in first column and girls in second.
   private static void printIn2Columns(ArrayList<String> stillPopularBoys, ArrayList<String> stillPopularGirls)
   {
      int maxSize = Math.max(stillPopularBoys.size(), stillPopularGirls.size());
      for (int i = 0; i < maxSize; i++)
      {
         String boy = "";
         String girl = "";
         //if there are boys left
         if (i < stillPopularBoys.size())
         {
            boy = stillPopularBoys.get(i);
         }

         //if there are girls left
         if (i < stillPopularGirls.size())
         {
            girl = stillPopularGirls.get(i);  
         }

         System.out.printf("%-30s%-30s%n", boy, girl);
      }
   }
}