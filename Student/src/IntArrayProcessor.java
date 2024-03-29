import java.util.Arrays;

/**
 * Work with arrays
 */
public class IntArrayProcessor
{
    private int[] integers;
    
    /**
     * Constructs an IntArrayProcessor with the given array
     * @param array the array to use in this IntArrayProcessor
     */
    public IntArrayProcessor(int[] array)
    {
        integers = array;
    }
    
    /**
     * Gets the maximum value in the array 
     * @return the maximum value in the array
     */
    public int getMax()
    {
    	int largest = integers[0];
    	for (int i = 1; i < integers.length; i++)
    	{
    	  if (integers [i] > largest)
    	   {
    	     largest = integers[i];
    	   }
    	}
    	return largest;
    }
    
    /**
     * Gets a string representing the sum of integers in 
     * the array. The integers are listed separated with a "+" 
     * followed by an "=" and then the sum 
     * @return a String representing the sum or the elements 
     * as an addition fact 
     */
    public String displaySum()
    {
    	String something = "";
    	
    	int total = 0;
    	for (int i = 0; i < integers.length; i++)
    	{
    		if(i == 0)
    	    {	
    	    something = something + integers[i];
    		total = total + integers[i];
    	    }
    		else if(i != integers.length - 1)
    	    {	
    	    something = something + "+" + integers[i];
    		total = total + integers[i];
    	    }
    	    else
    	    {
    	    	total = total + integers[i];
    	    	something = something + "+" + integers[i] + "="	+ total;
    	    }
    	}
    	
    	return something;
    }
    
    /**
     * Gets the number of even integers in the array
     * @return the number of even integers in the array
     */
    public int evenCount()
    {
        return 0;
    }
    
    @Override
	public String toString()
	{
		return Arrays.toString(integers);
	}
    
    public void swap(int index1, int index2)
    {
    	if (index1 < integers.length && index2 < integers.length && index1 >= 0 && index2 >= 0)
    	{
    	   	int temp = integers[index1];
        	integers[index1] = integers[index2];
        	integers[index2] = temp;
    	}
    	
    }
}
