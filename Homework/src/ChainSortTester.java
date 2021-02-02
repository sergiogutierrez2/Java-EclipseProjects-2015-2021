   import java.util.*;
   
   public class ChainSortTester
   {
      public static void main(String[] args)
      {
         ArrayList<Chain> chains = new ArrayList<>();
         chains.add(new Chain(10, "Target", 1844));
         chains.add(new Chain(2, "Whole Foods", 480));
         chains.add(new Chain(3, "Whole Foods", 500));
   
         Collections.sort(chains);
         // Now the array list is sorted by area
         for (Chain c : chains)
            System.out.println(c.toString());
      }
   }