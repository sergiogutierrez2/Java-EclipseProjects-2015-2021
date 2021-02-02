//HOMEWORK 13B
/*
 * You are given a CollegeWrestler class. A CollegeWrestler has a String name and a weight as a double. 
 * We need to order wrestlers in two ways: alphabetically by name and by weight. We can not do this with the Comparable interface.

Create two Comparator objects, one to handle each type of ordering. You can do this several different ways. 
If you write separate classes, call them CollegeWrestlerComparatorByWeight and CollegeWrestlerComparatorByName. 
If you use inner classes or anonymous inner classes in ComparatorRunner, just leave the text area for the Comparator files empty.

Then complete the ComparatorRunner class. It defines an ArrayList of CollegeWrestlers.

Sort by weight and then loop through the ArrayList printing the weight and then the name of each CollegeWrestlers (use Collections.sort)

Sort by name and then loop through the ArrayList printing the name and then the weight of each CollegeWrestlers.(use Collections.sort)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorRunner
{

   public static void main(String[] args)
   {
      ArrayList<CollegeWrestler> wrestlers = new  ArrayList<CollegeWrestler>();
      wrestlers.add(new CollegeWrestler("Collin", 175.5));
      wrestlers.add(new CollegeWrestler("Dong", 124.5));
      wrestlers.add(new CollegeWrestler("Jose", 140.9));
      wrestlers.add(new CollegeWrestler("Enrique", 290));
//HIDE      
      //by weight
      Collections.sort(wrestlers, new Comparator<CollegeWrestler>()
               {
                  public int compare(CollegeWrestler w1, CollegeWrestler w2)
                  {
                     return Double.compare(w1.getWeight(), w2.getWeight());
                  }
               }
               
            );
      
      for (CollegeWrestler w : wrestlers)
      {
         System.out.println( w.getWeight()  + " " + w.getName());
      }
      //by name
      
       class CollegeWrestlerComparatorByName implements Comparator<CollegeWrestler>
      {
          public int compare(CollegeWrestler w1, CollegeWrestler w2) 
          {
             return w1.getName().compareTo(w2.getName());
          }
      }
      Collections.sort(wrestlers, new CollegeWrestlerComparatorByName());
      
      for (CollegeWrestler w : wrestlers)
      {
         System.out.println(w.getName()    + " " + w.getWeight());
      }
       
//SHOW
   }
   
}   
