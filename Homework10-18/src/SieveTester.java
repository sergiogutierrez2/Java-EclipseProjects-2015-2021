/*HOMEWORK 16B
 * The sieve of Earthosthenes is an algorithm for finding all the prime numbers less that or equal to a given integer. 
 * With a piece of paper the process would be:
Write down all the numbers less than or equal to n. Cross out all the multiples of 2 (except 2) Cross out all the multiples of 3 ... 
up to the square root of n.

Be sure to use a set in your implementation. You can simulate crossing out the multiples by removing the element. Do not use arrays.

You are to write a class Sieve.
It has a constructor that takes as a parameter the upper limit for the primes
public Sieve(int upperLimit)

It has methods:

public Set<Integer> getPrimes() which returns a set containing all the primes less than or equal to the upper limit. 
The numbers should be in increasing order. Implement the algorithm using a set.
public void setUpperLimit(int newLimit) which sets a new upper limit for this sieve
public int primeCount() which returns the number of primes that are less than the upper limit. 
Do this efficiently without duplicating code already written. 
(That is, this method should call the getPrimes method rather than finding the primes itself)
 */

import java.util.Set;

public class SieveTester
{

   public static void main(String[] args)
   {
      Sieve primesFinder = new Sieve(11);
      Set<Integer> primes = primesFinder.getPrimes();
      System.out.println(primes);
      System.out.println("Expected: [2, 3, 5, 7, 11]");
      
      primesFinder.setUpperLimit(101);
      primes = primesFinder.getPrimes();
      System.out.println(primes);
      System.out.println("Expected: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]");
      
      primesFinder = new Sieve(10000);
      primes = primesFinder.getPrimes();
      System.out.println(primesFinder.primeCount());
      System.out.println("Expected: 1229");
   }

}