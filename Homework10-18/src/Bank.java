//SOLUTION
import java.util.ArrayList;
/**
 * Models a bank that manages bank accounts
 */
public class Bank
{
    private ArrayList<BankAccount> list;

    /**
     * Constructs an empty Bank
     */
    public Bank()
    {
        list = new ArrayList<>();
    }

    /**
     * Adds a BankAccount to this Bank
     * @param account the BankAccount to add
     */
    public void add(BankAccount account)
    {
        list.add(account);
    }

    /**
     * puts the BankAccount with the largest balance first in the list. 
     * If two have the same large balance, use the first one encountered in the list
     */
    public void largestFirst()
    {
        if (list.size() <= 0)
        {
           return;
        }
        
        //find max balance
        BankAccount largest = list.get(0);
        for (BankAccount b : list)
        {
           if (b.getBalance() > largest.getBalance())
           {
              largest = b;
           }
        }
        
        list.remove(largest);
        list.add(0,largest);
    }
    
    /**
     * Gets an ArrayList of all the accountIds in the Bank that have balances over
     * the specified target
     * @param target we want accounts with balance greater than target
     * @return an ArrayList of all the accountIds with balances greater than target
     */
    public ArrayList<String> list(double target)
    {
        ArrayList<String> results = new ArrayList<>();
        for (BankAccount b : list)
        {
           if (b.getBalance() > target)
           {
              results.add(b.getAccountId());   
           }
        }
        return results;
    }
    /**
     * Gets an ArrayList of all the accountIds in the Bank t
     * @return an ArrayList of all the accountIds with balances greater than target
     */
    public ArrayList<String> list()
    {
        ArrayList<String> results = new ArrayList<>();
        for (BankAccount b : list)
        {
            results.add(b.getAccountId());    
        }
        return results;
    }
    
    /**
     * determines if a account with a given accountId is in the Bank
     * @param id the accountId of the BankAccount to search for
     * @return true if a BankAccount with that accountId is in the 
     * bank, else false.
     */
    public boolean contains(String id)
    {
        boolean found = false;
        int i = 0;
        if (list.size() != 0)
        {
            while (i < list.size() && !found)
            {
                BankAccount account = list.get(i);
                if (account.getAccountId().equals(id))
                {
                    found = true;
                }
                else 
                {
                    i++;
                }
            }
        }
        return found;
    }
}