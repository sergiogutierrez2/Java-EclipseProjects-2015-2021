/* HOMEWORK 10A
 * In this problem you will write several static methods to work with arrays and ArrayLists. 
 * Remember that a static method does not work on the instance variables of the class. All the data needed is provided in the parameters. 
 * Call the class ArrayUtil. Notice how the methods are invoked in ArrayUtilTester.

public static int min(int[] array) gets the minimum value in the array or Integer.MIN_VALUE if the array has no elements
public static int contains(String[] array, String letter)gets the number of words in the array that starts with the given letter. 
The comparison is case-insensitive. 'A' and 'a' are counted as the same letter
public static ArrayList<String> contains(String[] list, char letter)gets an ArrayList of all the strings 
in the given array that contain the given letter. The comparison is case-insensitive. 'A' and 'a' are counted as the same letter
The last two methods are an example of overloading.*/

public class ArrayUtilTester
{

   public static void main(String[] args)
   {
      //testing min method
      int[] numbers = {5, 8, 4, 6, 2, 1, 7, 3};
      System.out.println(ArrayUtil.min(numbers));
      System.out.println("Expected: 1");

      int[] numbers2 = {2, 9, 4, 6, 5, 8, 7, 3};
      System.out.println(ArrayUtil.min(numbers2));
      System.out.println("Expected: 2");

      int[] numbers3 = {10, 9, 4, 6, 5, 8, 7, 3};
      System.out.println(ArrayUtil.min(numbers3));
      System.out.println("Expected: 3");
      
      int[] numbers4 = {}; //an array with no elements
      System.out.println(ArrayUtil.min(numbers4));
      System.out.println("Expected: -2147483648");
      
      String[] empty = new String[0]; //an array with no elements

      //testing first contains
      String[] javaIdentifiers = {"Integer", "Double", "Float", "Char",
            "Boolean", "long", "short", "byte"};
      System.out.println(ArrayUtil.contains(javaIdentifiers,"c"));
      System.out.println("Expected: 1");
      System.out.println(ArrayUtil.contains(javaIdentifiers, "x"));
      System.out.println("Expected: 0");
      System.out.println(ArrayUtil.contains(javaIdentifiers,"B"));
      System.out.println("Expected: 2");
      System.out.println(ArrayUtil.contains(empty,"B"));
      System.out.println("Expected: 0");
      
      
      //testing second contains
      
      String[] words = {"Big", "Java", "is","best", "Be", "the", "computer", "CS46A/B"};

      System.out.println(ArrayUtil.contains(words, 'e'));
      System.out.println("Expected: [best, Be, the, computer]");
      System.out.println(ArrayUtil.contains(words, 'b'));
      System.out.println("Expected: [Big, best, Be, CS46A/B]");
      System.out.println(ArrayUtil.contains(words, 'A'));
      System.out.println("Expected: [Java, CS46A/B]");
      System.out.println(ArrayUtil.contains(words, 'k'));
      System.out.println("Expected: []");
      
      System.out.println(ArrayUtil.contains(empty, 'b'));
      System.out.println("Expected: []");

   }

}