import java.util.Arrays;

/*
class InsertionSort { 
    
    void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
        	System.out.println(i - 1);
        	System.out.println(Arrays.toString(arr));
            int key = arr[i]; 
            int j = i - 1; 
  
            // Move elements of arr[0..i-1], that are 
             // greater than key, to one position ahead 
              // of their current position 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
                //System.out.println(Arrays.toString(arr));
            } 
            arr[j + 1] = key; 
            System.out.println(Arrays.toString(arr));
        } 
    } 
  
    
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {5, 1, 19, 25, 17, 21, 20, 9, 15, 14 }; 
  
        InsertionSort ob = new InsertionSort(); 
        ob.sort(arr); 
  
        printArray(arr); 
    } 
} 
*/

 public class InsertionSort{

  public static void main(String[] args){
 
	  String[] arr ={"lynx", "bass", "bear", "crab", "lion", "goat", "mole", "frog",
              "swan", "clam", "hawk", "wren", "mule", "oryx", "gnat", "lynx",
              "puma", "worm", "seal", "crow", "deer", "wolf", "dove", "duck"};
      int count = 0;
      String sortedArray[] = sort_sub(arr, arr.length); 
      for(int i=0;i<sortedArray.length;i++){
     // System.out.print(sortedArray[i]);
     }
   }

     static int counter = 1;
  
    public static String[] sort_sub(String array[], int f){
    String temp="";
    for(int i = 0; i<f; i++){
    	System.out.println("i=" + i);
    	 System.out.println(counter + " " + Arrays.toString(array));
    	 counter++;
    	 
       for(int j=i+1;j<f;j++){
         if(array[i].compareToIgnoreCase(array[j])>0){
             temp = array[i];
        	 System.out.println(counter + " " + Arrays.toString(array));
        	 counter++;
             array[i]=array[j];
        	 System.out.println(counter + " " + Arrays.toString(array));
        	 counter++;
             array[j]=temp;
        	 System.out.println(counter + " " + Arrays.toString(array));
        	 counter++;
           }
    	// System.out.println(counter + " " + Arrays.toString(array));
    	// counter++;
        }
     }
       return array;
     }
} 