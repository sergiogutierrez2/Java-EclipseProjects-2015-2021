//import java.util.Scanner;                  
import java.util.ArrayList;

public class UtilTester
{
   public static void main(String [] args)
   {
      ArrayList<String> Str2 = new ArrayList<String>();
   // Add names to ArrayList
      Str2.add("Jimmy");
      Str2.add("Barbara");
      Str2.add("Mike");
      Str2.add("ELMIGUELON");
      
     //Util Str = new Util();
      //Util.word(Str2);
      
      //int[] intArray = new int[20];
      
      int [] intarray = {4 ,5, 7, 9, 1};
      //Util.sum(intarray);
   
      System.out.println(Util.word(Str2));  
      System.out.println(Util.sum(intarray)); 
   }
}