/*HOMEWORK 11B
 * You are given a BankAccount class. You are to write two subclasses: StudentAccount and NewWorldAccount

BankAccount:
This class is provided for you. It is different from earlier versions in that it requires a minimum balance of $1500. 
There is a $10.00 fee for any month where the ending balance is below the minimum balance. There is an endOfMonth method to handle 
end of month processing. Its subclasses will handle end of month processing differently.

StudentAccount:
This account is a subclass of BankAccount designed for the student with a low balance and who has only a few transactons 
(deposits and withdrawals) a month. It has no minimum balance, but there is a charges for every transaction after a certain 
number of free transactions. At the current time, the number of free transactions is 5 and the charge is a $3.00 for every 
transaction after that amount. Both deposits and withdrawals are transactions. There is no charge to get the balance. The 
fees are subtracted during end of month processing. Define and use constants.

NewWorldAccount:
This account is a subclass of BankAccount. In this type of account, you promise to leave the money in the bank for a 
specified about of time. (This time is called the time to maturity). Interest is paid on this type of account. The 
interest is compounded monthly. Interest is paid on the ending balance during end of month processing. The current 
interest rate is 1.1% per year compounded monthly.

The constructor takes an additional parameter: the amount of time you must leave the money in the bank in months as an int. 
This time desreases with each end of month processing. The penalty for early withdrawal is 20% of the amount withdrawn. 
The penalty is subtracted from the account immediately. If the account has a balance of $1000 and you withdraw $100 early, 
the account balance would be $880 + interest

Interest is added during end of month processing. There is no penalty for depositing money, but it must stay on deposit until 
the maturity date. Define and use constants Do't use magic numbers.

Provide a method getTimeToMaturity that returns the amount of time the money remaining before the money can be withdrawn penalty-free.
 * 
 */
public class PolymorphismRunner
{

   public static void main(String[] args)
   {
      BankAccount[] accounts = { new BankAccount(1000, "abc111"),
            new StudentAccount(1000, "xyz123"),
            new NewWorldAccount(3000, "rst456", 12),
            new StudentAccount(1000, "xyz124"),
            new NewWorldAccount(2000, "rst457", 24)
      };
      
      for (BankAccount a : accounts)
      {
         a.deposit(200);
         a.endOfMonth();
         a.withdraw(100);
         a.endOfMonth();
         System.out.printf("Balance: %.2f%n",  a.getBalance());
         if (a instanceof NewWorldAccount)
         {
        	 NewWorldAccount savings = (NewWorldAccount)a;
            System.out.println("Time to maturity: " + savings.getTimeToMaturity());
         }
      
      }

   }

}