/*HOMEWORK 16A
Write a class, TextCondensor, whose constructor takes an ArrayList<String> as a parameter. Save the ArrayList as the only instance variable.
Provide methods:

public Set<String> condenseText() which removes any duplicates and returns an Set<String> 
containing words without duplicates and in alphabetical order. Think Set
public int condensedSize() which gets the number of unique elements in the text. 
Do this efficiently without duplicating code already written. Do not use an unnecessary instance variable.
public void setList(ArrayList<String> newText) which sets a new list of text
public double relativeSize() gets the percent the condensed text is of the original ( condensed size / original size) * 100 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class TextCondensorRunner
{
   public static void main(String[] args) throws FileNotFoundException
   {
       TextCondensor condensor = new TextCondensor(readFile("humpty.txt"));
       Set<String> condensed = condensor.condenseText();
       System.out.println(condensed);
       System.out.println(condensor.condensedSize());
       System.out.printf("%.2f%n", condensor.relativeSize());
       
       condensor.setList(readFile("mary.txt"));
       condensed = condensor.condenseText();
       System.out.println(condensed);
       System.out.println(condensor.condensedSize());
       System.out.printf("%.2f%n", condensor.relativeSize());
   }
   
   public static ArrayList<String> readFile(String filename) throws FileNotFoundException
   {
      ArrayList<String> words = new ArrayList<>();
      Scanner scan = new Scanner(new File(filename));
      scan.useDelimiter("[^a-zA-Z']+");
      while (scan.hasNext())
      {
         words.add(scan.next().toLowerCase());
      }
      scan.close();
      return words;
   }
}