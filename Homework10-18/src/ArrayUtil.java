//SOLUTION
import java.util.ArrayList;
/**
 * A utility class of static methods for working with arrays
 * @author kathleenobrien
 *
 */
public class ArrayUtil
{
	/**
	 * Gets the smallest value in the given array
	 * @param array the int array to process. 
	 * @return the smallest value in the given array or Integer.MIN_VALUE if the array has no elements
	 */
	public static int min(int[] array)
	{
		if (array.length == 0)
		{
			return Integer.MIN_VALUE;
		}

		int smallest = array[0];
		for (int value : array)
		{
			if (value < smallest)
			{
				smallest = value;
			}
		}
		return smallest;
	}

	/**
	 * Gets the number of words in the array that starts with the given letter.
	 * @param array the array to search
	 * @param letter the letter to search for as the first letter of a string in the array
	 * @return the number of strings in the array that  start with the given letter
	 */
	public static int contains(String[] array, String letter)
	{
		int count = 0;
		if (array.length != 0)
		{
			for (String s :  array)
			{
				String first = s.substring(0, 1).toLowerCase();
				if(first.equals(letter.toLowerCase()))
				{
					count++ ;
				}
			}
		}
		return count;
	}

	/**
	 * Gets an array list with all the words from the given 
	 * array that contain  the given letter
	 * @param list the ArrayList to search
	 * @param letter the character to see if a string contains
	 * @return an array list containing all the words from the given list
	 * that contain the given character
	 */
	public static ArrayList<String> contains(String[] list, char letter)
	{
		ArrayList<String> results = new ArrayList<>();
		String ch = "" + Character.toLowerCase(letter); //get the char as a String
		for (String word : list)
		{
			String s = word.toLowerCase();
			
			if (s.contains(ch))
			{
				results.add(word);
			}
		}

		return results;

	}
}