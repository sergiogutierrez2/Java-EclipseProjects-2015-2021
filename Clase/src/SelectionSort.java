import java.util.Arrays;

/* with ints
class SelectionSort 
{ 
    void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            System.out.println(i);
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
            System.out.println(Arrays.toString(arr));
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
            System.out.println(Arrays.toString(arr));
        } 
    } 
  
    // Prints the array 
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver code to test above 
    public static void main(String args[]) 
    { 
        SelectionSort ob = new SelectionSort(); 
        int arr[] = {5, 1, 19, 25, 17, 21, 20, 9, 15, 14}; 
        ob.sort(arr); 
        //System.out.println("Sorted array"); 
        //ob.printArray(arr); 
    } 
} */

public class SelectionSort
{ 

 public static void main(String[] args)
 {
      String[] stringArray = {"lynx", "bass", "bear", "crab", "lion", "goat", "mole", "frog",
              "swan", "clam", "hawk", "wren", "mule", "oryx", "gnat", "lynx",
              "puma", "worm", "seal", "crow", "deer", "wolf", "dove", "duck"};

      System.out.println("Unsorted array:");
      for(String element: stringArray)
           System.out.print(element + " ");
      System.out.println();

      selectionSort(stringArray);

      System.out.println("Sorted array:");
      for(String element: stringArray)
            System.out.print(element + " ");
      System.out.println();
 }


 static void selectionSort(Comparable[] array)
 {
      int smallindex;
      for(int i = 0; i < array.length; i++)
      {
    	  System.out.println(i);
    	  smallindex = i; // set first element as smallest
           for(int j = i + 1; j < array.length; j++) // find smallest
                if(array[j].compareTo(array[smallindex]) < 0)
                     smallindex = j;
           System.out.println(Arrays.toString(array));
           if(smallindex != i)
                swap(array, smallindex, i);
      }
 }


 static void swap(Object[] array, int index1, int index2)
 {
      Object temp = array[index1];
      System.out.println(Arrays.toString(array));
      array[index1] = array[index2];
      System.out.println(Arrays.toString(array));
      array[index2] = temp;
      System.out.println(Arrays.toString(array));
 } 
}