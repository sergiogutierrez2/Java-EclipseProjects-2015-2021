import java.util.Arrays;

public class WordProcessor 
{
   private static final int INITIAL_CAPACITY = 8;
   private String arr[];
   private int count;

   /**
   * Constructor that takes no parameters and initializes the array so it can hold 8 elements.
   */
   public WordProcessor() 
   {
       arr = new String[INITIAL_CAPACITY];
       count = 0;
   }

   /**
   * Adds the given string at the end of the partially filled array.
   * @param toAdd
   */
   public void add(String toAdd) 
   {
       growIfNeeded();
       arr[count] = toAdd;
       count += 1;
   }

   /**
   * Adds the String at the specified index and grows the array by doubling its
   * size if necessary and then add the element
   * @param toAdd the value to be added in the array.
   * @param index the index where the new value will be stored.
   */
   public void add(String toAdd, int index) 
   {
       growIfNeeded();

       if (arr[index] != null) 
       {
           for (int i = count - 1; i > index; i--)
               arr[i] = arr[i - 1];
       }
      
       arr[index] = toAdd;
       count += 1;
   }

   /**
   * If elements at adjacent indexes are equal, then remove one
   */
   public void removeAdjacentDuplicates() 
   {
       if (count > 0) 
       {
           for (int i = 0; i < (count - 1); i++) 
           {
               String str = arr[i];
               while (str.equalsIgnoreCase(arr[i + 1])) 
               {
                   for (int j = i + 2; j < count; j++)
                       arr[j - 1] = arr[j];
                  
                   count -= 1;
               }
           }
       }
   }

   /**
   * Checks to see if the array is full. If it is, it doubles the size of the
   * array and copies the elements to a the new array in the same order.
   */
   private void growIfNeeded() 
   {
       if ((count % INITIAL_CAPACITY) == 0) 
       {
           arr = Arrays.copyOf(arr, arr.length/*count*/ + INITIAL_CAPACITY);
       }
   }

   /**
   * Returns a string representation of the array.
   * The string starts with "[" and ends with "]" 
   * The elements of the array are separated by commas. 
   */
   public String toString() 
   {
       StringBuffer sb = new StringBuffer();
       sb.append("[");

       if (count != 0) 
       {
           sb.append(arr[0]);

           for (int i = 1; i < count; i++)
               sb.append(", " + arr[i]);
       }
       sb.append("]");
       return sb.toString();
   }
}
