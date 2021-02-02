 //SOLUTION
/**
 * Models a package of chips
 * @author kathleenobrien
 *
 */
public class Chips extends Product
{
	private int sodium;
	public final static int RECOMMENDED_DAILY_AMOUNT = 1500;
	
    /**
     * Constructs a Product with a price and a description
     * @param thePrice the price of this Chips
     * @param theDescription - the description of this Chips
     * @param sodium the milligrams of sodium in a serving of this Chips
     */
	public Chips(String theDescription, double thePrice, int sodium)
    {
        super(theDescription, thePrice);
        this.sodium = sodium;
    }
	
	/**
	 * Gets the amount of sodium in this Chips
	 * @return the amount of sodium in this Chips
	 */
	public int getSodium()
	{
		return sodium;
	}
	
	/**
	 * Gets the percentage of the ideal daily amount of sodium in a serving of this Chips contains
	 * @return the percentage of the ideal daily amount of sodium in a serving of this Chips contains
	 */
	public double percentOfDailyAmount()
	{
		return (double)sodium / RECOMMENDED_DAILY_AMOUNT * 100;
	}
	
    @Override
	public String getDescription()
	{
		return super.getDescription() + " " + sodium;
	}
}