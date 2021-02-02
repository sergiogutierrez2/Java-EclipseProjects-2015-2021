//HIDE
/**
* A type of BankAccount where there are charges 
* for each transaction over the allowed number
*/
public class StudentAccount extends BankAccount
{
  public static final double TRANSACTION_FEE = 3.00;
  public static final int FREE_TRANSACTIONS = 5;
  
  private int transactions;
  
  /**
   * Creates a StudentAccount object with a starting balance and account id
   * @param initialBalance the starting balance
   * @param id the account id
   */
  public StudentAccount(double initialBalance, String id)
  {
      super(initialBalance, id);
      transactions = 0;      
  }
  
  @Override
  public void deposit(double amount)
  {
      super.deposit(amount);
      transactions++;
  }
  
  @Override
  public void withdraw(double amount)
  {
      super.withdraw(amount);
      transactions++;
  }
  
  @Override
  public void endOfMonth()
  {
      int excessTransactions = transactions - FREE_TRANSACTIONS;
      if (excessTransactions > 0)
      {
          double fee = excessTransactions * TRANSACTION_FEE;
          super.withdraw(fee);
      }
      transactions = 0;
  }
}