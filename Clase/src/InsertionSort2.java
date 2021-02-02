import java.util.Arrays;

class InsertionSort2 { 
    
    static void sort(int arr[]) 
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
        sort(arr); 
  
        printArray(arr); 
    } 
} 