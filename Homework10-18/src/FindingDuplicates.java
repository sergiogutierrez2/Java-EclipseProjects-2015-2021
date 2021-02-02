/* HOMEWORK 17B
 Write a program FindingDuplicates to search a file to see if it contains any words that have the same hash code. 
 Read the file with a Scanner and use a data structure that maps the hashcode to a set of words with that hashcode. 
 At the end, print out words that have the same hash code on the same line in lexicographical order. 
 (That will be any set with a length greater than 1)

Finally print the number of duplicates divided by the number of words. It will be a really small number. That is the percentage of collisions.

Set the delimiter to use: scan.useDelimiter("[^A-Za-z0-9_]+");

The book to search is at this URL. Download the plain text and save it in your project as "war_and_peace.txt". 
The book is "War and Peace" - so there will be lots of words. (586,914).
You can just declare that the main method throws FileNotFoundException. No need for a try/catch
 */
/*
 Write a program FindingDuplicates to search a file to see if it contains any words that have the same hash code. 
 Read the file with a Scanner and use a data structure that maps the hashcode to a set of words with that hashcode. 
 At the end, print out words that have the same hash code on the same line in lexicographical order. 
 (That will be any set with a length greater than 1)

Finally print the number of duplicates divided by the number of words. It will be a really small number. That is the percentage of collisions.

Set the delimiter to use: scan.useDelimiter("[^A-Za-z0-9_]+");
The book to search is at this URL. Download the plain text and save it in your project as "war_and_peace.txt". 
The book is "War and Peace" - so there will be lots of words. (586,914).

You can just declare that the main method throws FileNotFoundException. No need for a try/catch

 */
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class FindingDuplicates
{
   public static void main(String[] args) throws IOException 
   {
      Map<Integer, TreeSet<String>> hashCodeToStringMap = new HashMap<>();
      String filename = "war_and_peace.txt";
      Scanner scan = new Scanner(new File(filename));
      scan.useDelimiter("[^A-Za-z0-9_]+");
      int wordCount = 0;
      while (scan.hasNext())
      {
          String word = scan.next();
          Integer hashCode = word.hashCode();
          TreeSet<String> wordList;
          if (hashCodeToStringMap.containsKey(hashCode))
          {
             wordList = hashCodeToStringMap.get(hashCode);
          }
          else
          {
             wordList = new TreeSet<String>();
          }
          wordList.add(word);
          hashCodeToStringMap.put(hashCode, wordList);
          wordCount++;
      }
      
      //print strings with same hashcode
      double duplicates = 0;
      for (Integer key : hashCodeToStringMap.keySet())
      {
         if (hashCodeToStringMap.get(key).size() > 1)
         {
            System.out.println(hashCodeToStringMap.get(key));
            duplicates++;
         }
      }
      scan.close();
      
      if (wordCount > 0)
          System.out.println(duplicates/wordCount);
   }
}
