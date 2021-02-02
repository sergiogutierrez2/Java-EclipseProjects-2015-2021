/*HOMEWORK 17C
Write an application IndexMaker which reads a simplified Java source file and produces an index containing identifiers. 
Print all the identifiers and all the line numbers on which each identifier occurs. But do not print reserved keywords. 
When you find an identifier, compare it against a list of reserved keywords and skip keywords. 
Be smart about this and do not use 50 if statements. Put the keywords in a data structure and check each identifier to see if it is in the collection. Here is a file of reserved keywords. Download it and put in your project. Name it reserved.txt.

Print the identifiers in lexicographical order. Display the line numbers in numeric order.

We will assume every string consisting of only letters, numbers, and underscores is either an identifier or reserved keyword. 
But we are ignoring keywords there are no comments to confuse things
You will need to set the delimiter: ...useDelimiter("[^A-Za-z_]+"); For simplicity, there will not be any identifiers that contain numbers.

Your output should be in this format:

ProcessRectangle: [4]
Rectangle: [2, 9, 11]
String: [7]
System: [13, 16]
args: [7]

You can simply declare that the main method throws the FileNotFoundException. You do not need to catch it.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//SHOW
public class IndexMaker
{
   public static void main(String[] args) throws FileNotFoundException
   {
      String filename = "ProcessRectangle.java"; //SUB "PaintJobCalculator.java"
//HIDE
      Scanner scan = new Scanner(new File("reserved.txt"), "UTF-8"); 

      //get the keywords
      Set<String> keywords = new HashSet<String>();
      while (scan.hasNext())
      {
         keywords.add(scan.next());
      }
      scan.close();

      int lineNumber = 1;
      Map<String, Set<Integer>> index = new TreeMap<>();
      scan = new Scanner(new File(filename), "UTF-8");
      
      while (scan.hasNextLine())
      {
         String nextLine = scan.nextLine();
         Scanner lineScanner = new Scanner(nextLine);
         lineScanner.useDelimiter("[^A-Za-z_]+");
         while (lineScanner.hasNext())
         {
            String word = lineScanner.next();
            if (!keywords.contains(word)) //this word is not a keyword
            {
               Set<Integer> integerSet = index.get(word);
               if (integerSet == null) // this word not in the map yet
               {
                  integerSet = new TreeSet<Integer>(); //create a set to hold the line numbers
               }
               integerSet.add(lineNumber);
               index.put(word, integerSet);
            }      
         }
         lineScanner.close();
         lineNumber++;
      }
      scan.close();   
      
      Set<String> keySet = index.keySet(); //get all the keys
      for (String key : keySet)
      {
         System.out.print(key + ": ");
         Set<Integer> lineNumbers = index.get(key);

         System.out.println(lineNumbers);
      }
//SHOW
   }
} 