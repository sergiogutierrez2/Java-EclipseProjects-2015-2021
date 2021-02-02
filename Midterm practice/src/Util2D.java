/**
 * Util2D creates an manages a 2d array of ints. 
 */
public class Util2D 
{
	private int[][] matrix;
	
	/**
	 * constructor that takes a 2d array as a parameter and assigns it to the instance variable.
	 * @param array 
	 */
	public Util2D(int[][] array)
    {
        matrix = array;
    }
    
	/**
	 * gets smallest int in the 2d array
	 * @return min the minimum value 
	 */
	public int getSmallest()
	{
	     int min = matrix[0][0];
	  	  for (int row = 0; row < matrix.length; row ++)
	  	  {
	  	       for (int column = 0; column < matrix[0].length; column++)
	  	       {
	  	    	   if (matrix[row][column] < min)
	  	 	      {
	  	 	        min = matrix[row][column];
	  	 	      } 	   
	  	       }
	  	  }
	    	return min;
	}
	
	/**
	 * gets the numbers of even elements in specified column
	 * @param column the selected column 
	 */
	public int numberOfEvenInColumn(int column)
	{
	     int even = 0;
		   for (int row = 0; row < matrix.length; row ++)
	  	  {
	  	    	   if ((matrix[row][column]) % 2 == 0)
	  	 	      {
	  	 	        even ++;
	  	 	      } 	   
	  	  }
		return even;
	}
	
	/**
	 * gets the last element in 2d array
	 * @return matrix[matrix.length - 1][matrix[0].length - 1]
	 */
	public int last()
	{
		//Gets the element in the last row of the last column
		return matrix[matrix.length - 1][matrix[0].length - 1];
	}
	
	/**
	 * Check if target is within 2d array
	 * @param true if it is within 2d array. 
	 */
	public boolean contains(int target)
	{
		   for (int row = 0; row < matrix.length; row ++)
	  	  {
	  	       for (int column = 0; column < matrix[0].length; column++)
	  	       {
	  	    	   if (matrix[row][column] == target)
	  	 	      {
	  	 	        return true;
	  	 	      } 	   
	  	       }
	  	  }
		return false;
	}
}
