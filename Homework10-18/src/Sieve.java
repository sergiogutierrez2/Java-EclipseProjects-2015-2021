//HOMEWORK 16B

import java.util.Set;
import java.util.TreeSet;

public class Sieve
{
   private int upperLimit;
   public Sieve(int upperLimit)
   {
      this.upperLimit = upperLimit;
   }

   public Set<Integer> getPrimes()
   {
      Set<Integer> primes = new TreeSet<Integer>();
      for (int i = 2; i <= upperLimit; i++)
         primes.add(i);

      for (int k = 2; k * k <= upperLimit; k++)
         for (int i = 2; i * k <= upperLimit; i++)
            primes.remove(i * k);
      
      return primes;
   }
   
   public void setUpperLimit(int newLimit) 
   {
      upperLimit = newLimit;
   }
   
   public int primeCount() 
   {
      return getPrimes().size();
   }
}