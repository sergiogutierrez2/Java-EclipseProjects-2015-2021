import java.util.Arrays;

public class QuickSort
   {
       // top-level quicksort, expected time O(n lg n).
       public static void sort(Comparable[] a) {
           int n = a.length;
           sort(a, 0, n-1);
      }
  
      // quicksort subarray a[lo..hi]
      private static void sort(Comparable[] a, int lo, int hi) {
          if (hi <= lo) return;
          
    	  System.out.println(a.length-1);
    	  System.out.println("Starting");
          System.out.println("Lo= " + lo + ", Hi= " + hi);
          System.out.println(Arrays.toString(a));
          int j = partition(a, lo, hi); // pivot ended up at j
    	  System.out.println("j= " + j);
          sort(a, lo, j-1);    // recurse on left part
          sort(a, j+1, hi);    // recurse on right part
      }
  
      // partition subarray a[lo..hi] so that a[lo..j-1] <= a[j] <= a[j+1..hi],
      // and return the index j of the pivot value.  We use a random pivot.
      private static int partition(Comparable[] a, int lo, int hi) {
    	//  System.out.println(a.length-1);
    	 // System.out.println("Starting");
         // System.out.println("Lo= " + lo + ", Hi= " + hi);
        //  System.out.println(Arrays.toString(a));
          // Pick a random index k in the range {lo, .., hi}
          int k = lo + (int)((hi+1-lo)*Math.random());
          // a[k] will be the pivot, we first swap it into a[lo].
          swap(a, k, lo);
          // Now do the partition.
          Comparable v = a[lo];   // the pivot value (stays here until end)
          int i = lo;
          int j = hi + 1;
          while (true) {
              while (less(a[++i], v)) { if (i == hi) break; }
              while (less(v, a[--j])) { if (j == lo) break; }
              if (i >= j) break;
              swap(a, i, j);
          }
          swap(a, lo, j);         // move the pivot to a[j]
          System.out.println(a.length-1);
    	  System.out.println("Ending");
          System.out.println("Lo= " + lo + ", Hi= " + hi);
          System.out.println(j);
          System.out.println(Arrays.toString(a));
          return j;
      }
  
      // less: do a comparison, is v < w ?
      private static int cmpCounter = 0;
      private static boolean less(Comparable v, Comparable w) {
          ++cmpCounter;
          return v.compareTo(w) < 0;
      }
  
      // swap: exchange array entries a[i] and a[j]
      private static int swapCounter = 0;
      private static void swap(Object[] a, int i, int j) {
          ++swapCounter;
          System.out.println(Arrays.toString(a));
          Object tmp = a[i];
          System.out.println(Arrays.toString(a));
          a[i] = a[j];
          System.out.println(Arrays.toString(a));
          a[j] = tmp;
          System.out.println(Arrays.toString(a));
      }
  
      // simple test driver (can also sort the command-line arguments).
      // Prints out the number of swaps and comparisons used.
      public static void main(String[] args) {
          String[] a = {"lynx", "bass", "bear", "crab", "lion", "goat", "mole", "frog",
                  "swan", "clam", "hawk", "wren", "mule", "oryx", "gnat", "lynx",
                  "puma", "worm", "seal", "crow", "deer", "wolf", "dove", "duck"};
          if (args.length > 0)
              a = args;
          sort(a);
          // Print results:
          System.out.printf("sort used %d comparisons and %d swaps%n",
                            cmpCounter, swapCounter);
          for (String s: a)
              System.out.print(s+" ");
          System.out.println();
      }
  }