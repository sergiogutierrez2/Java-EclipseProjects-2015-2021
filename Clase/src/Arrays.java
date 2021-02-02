import java.util.Scanner;
public class Arrays
{
    public static void main(String[] args)
    {
    	double[] primes = { 2, 3, 5, 7, 11 };
    	
    	for (double p: primes)
    	{
    	     p++;
    	}
    	
    	double sum = 0;
    	double average = 0;
    	
    	
    	for (int i = 0; i < primes.length; i++) 
            {
    		  System.out.println("Element at index " + i + " : "+ primes[i]);
    		  sum = primes[i] + sum;
            }
    	
    	average = sum / primes.length;
    	System.out.println(average);
        
    }
}