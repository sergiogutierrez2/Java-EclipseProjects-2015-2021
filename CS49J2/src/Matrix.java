/*
 * Sergio Gutierrez
 * CS49J
 * 3/11/2020
 * This class shows how double dimensional arrays work,
 * and returns the sum of the major diagonal, and swaps rows and columns.
 */

import java.util.Arrays;
import java.util.Random;

public class Matrix {
	
    private int[][] array;
    public Matrix(int[][] array)
    {
        this.array = array;
    }
    
    public int sumMajorDiagonal(int[][] array) 
 {
     int sum = 0;
     for (int i = 0; i < array.length; i++) 
     {
         sum += array[i][i];
     }
     return sum;
 }

   public int[][] transposeMatrix(int[][] array)
 {
       int[][] copiedArray = new int[array[0].length][array.length];
	  for (int row = 0; row < array.length; row ++)
	  {
	       for (int column = 0; column < array[0].length; column++)
	       {
	    	   copiedArray[column][row]= array[row][column];
	       }
	  }	
 	return copiedArray;
  }

      public static void main(String[] args) 
    {
        Random rand = new Random();
        int array[][] = {{ rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)}, 
                         { rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)}, 
                         { rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)}};
        
        Matrix m = new Matrix(array);
        
        System.out.println("Original Matrix is: ");
        System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

        System.out.println("New Matrix is: ");
        System.out.println(Arrays.deepToString(m.transposeMatrix(array)).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        
        System.out.println("Sum of the Major Diagonal: ");
        System.out.println(m.sumMajorDiagonal(array));
    }
}