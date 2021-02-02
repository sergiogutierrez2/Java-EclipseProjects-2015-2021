/*
 * Sergio Gutierrez
 * CS49J
 * 3/11/2020
 * This class shows how arrays work,
 * and returns the average, sum, minimum, and maximum of the elements.
 */

import java.util.Scanner;

    public class DataSet 
{
   private double[] array;
   private int size;

    public DataSet(int maximumNumberOfValues) 
  {
       size = 0;
      array = new double[maximumNumberOfValues];
   }

     public void addValue(double value) 
   {
       if(size < array.length)
         {
           array[size++] = value;
          }
   }

     public double getSum() 
   {
       double sum = 0;
       for (int i = 0; i < size; i++) 
      {
           sum += array[i];
       }
       return sum;
   }

    public double getAverage() 
  {
       double total = 0;
       for (double element : array) {
           total = total + element;
       }
       return total/size;
   }

    public double getMaximum() 
 {
    	double max = array[0];
    	for (int i = 1; i < array.length; i++)
    	{
    	  if (array[i] > max)
    	   {
    	     max = array[i];
    	   }
    	}
    	return max;
   }

     public double getMinimum() 
  {
    	double min = array[0];
    	for (int i = 1; i > array.length; i++)
    	{
    	  if (array [i] < min)
    	   {
    	     min = array[i];
    	   }
    	}
    	return min;
   }

   public static void main(String[] args) 
{
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the amount of elements in the Array: ");
       int number = in.nextInt();
       DataSet set = new DataSet(number);
       
       System.out.print("Enter the values to be used: ");
         for(int i=0; i<number; i++)
       {
           double var = in.nextDouble();
           set.addValue(var);
       }
         
       System.out.println("Sum is : " + set.getSum());
       System.out.println("Average is: " + set.getAverage());
       System.out.println("Maximum is: " + set.getMaximum());
       System.out.println("Minimum is: " + set.getMinimum());
       in.close();
   }
}