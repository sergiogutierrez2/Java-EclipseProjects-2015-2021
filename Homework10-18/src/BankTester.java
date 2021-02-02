/* HOMEWORK 10B
In this problem you will implement a solution using the design pattern for collecting objects. 
We are going to model a bank. A Bank uses an ArrayList to keep track of BankAccount objects. You will write the Bank class

The BankAccount class is provided for you. A BankAcount has a balance and a accountId.
A Bank has a constructor that takes no parameters. It needs to initialize the ArrayList used to collect bankAccounts

It has methods:

add adds the specified BankAccount to the Bank
largestFirst puts the BankAccount with the largest balance first in the list. If two have the same large balance, use the first one encountered 
in the list contains determines if a BankAccount with a given accountId is in the Bank. Return true is so, otherwise false
list gets an ArrayList of the BankAccount accountIds in the Bank that have balances over the specified amount.
list gets an ArrayList of the BankAccount accountIds in the Bank
 */

public class BankTester
{
   public static void main(String[] args)
   {
      Bank accounts = new Bank();
      
      //test empty bank
      accounts.largestFirst();
      
      //PRINT ARRAYLIST
      System.out.println(accounts.list());
      System.out.println("Expected: []");
      accounts.largestFirst();
      System.out.println(accounts.list());
      System.out.println("Expected: []");
      System.out.println(accounts.contains("abc123"));
      System.out.println("Expected: false");
      System.out.println(accounts.list(10000));
      System.out.println("Expected: []");
      
      accounts.add(new BankAccount(10000.0, "def333"));    
      accounts.add(new BankAccount(20000.0, "abc123")); 
      accounts.add(new BankAccount(15000.0, "pqr456")); 
      accounts.add(new BankAccount(20000.0, "xyz789"));
      accounts.add(new BankAccount(9500.0, "abc111")); 
      
      accounts.largestFirst();
      System.out.println(accounts.list());
      System.out.println("Expected: [abc123, def333, pqr456, xyz789, abc111]");
      
      System.out.println(accounts.contains("abc123"));
      System.out.println("Expected: true");
      System.out.println(accounts.contains("aaa999"));
      System.out.println("Expected: false");
      System.out.println(accounts.list(10000));
      System.out.println("Expected: [abc123, pqr456, xyz789]");
      System.out.println(accounts.list(100000));
      System.out.println("Expected: []");
      
//      accounts.add();          
   }
}