public class Weather
{
	private double[][] matrix;
	
	/**
	 * constructor that takes a 2d array as a parameter and assigns it to the instance variable.
	 * @param array 
	 */
	public Weather(double[][] array)
    {
        matrix = array;
    }
	
	public int countMild()
	{
		int number = 0;
		
		for (int row = 0; row < matrix.length; row ++)
	  	  {
	  	       for (int column = 0; column < matrix[0].length; column++)
	  	       {
	  	    	   if (matrix[row][column] >= 55 && matrix[row][column] <= 80)
	  	 	      {
	  	 	        number++;
	  	 	      } 	   
	  	       }
	  	  }
		return number;
	}
	
}	