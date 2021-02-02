//HIDE
/**
 * A time deposit that has a months to maturity and an
 * interest rate
 */
public class NewWorldAccount extends BankAccount
{
    public static final double ANNUAL_INTEREST_RATE = 1.1;
    public static final double EARLY_WITHDRAWAL_FEE_PERCENT = 20.0;
    public static final int MONTHS_PER_YEAR = 12;
    
    private int timeToMaturity;
    
    /**
     * Creates a NewWorldAccount with an inital balance, an ID and a
     * @param initialBalance the starting balance
     * @param id the id for this account
     * @param timeToMaturity the initial number of months until the account matures
     */
    public NewWorldAccount(double initialBalance, String id, int timeToMaturity)
    {
        super(initialBalance, id);
        this.timeToMaturity = timeToMaturity;
    }
    
    public int getTimeToMaturity()
    {
        return timeToMaturity;
    }
    
    public void withdraw(double amount)
    {
        super.withdraw(amount);
        if ( timeToMaturity > 0)
        {
            super.withdraw(amount * EARLY_WITHDRAWAL_FEE_PERCENT / 100.0);
        }
    }
    
    public void endOfMonth()
    {
    	timeToMaturity--;
        double monthlyInterest = getBalance() * ANNUAL_INTEREST_RATE / 100.0 / MONTHS_PER_YEAR;
        deposit(monthlyInterest);
    }
}
