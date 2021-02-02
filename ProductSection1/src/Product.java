/*
 * Models a product that can increase and decrease in price.
 * @author Sergio Gutierrez
 * 
 */


public class Product {
    private String name;
    private double price;
    
    /*
     * Constructs a Product with the given price and name
     * @param theName the name for this Product
     * @param thePrice for this product
     */
    public Product (String theName, double thePrice)
    {
    	name = theName;
    	price = thePrice;
    }

    /*
     * Gets the price of this product
     * @return the price of this product
     */
public double getPrice()
{
	return price;
}

/*
 * Gets the name of this product
 * @return the name of this product
 */
public String getName()
{
	return name;
}

/*
 * Reduces the price by the given percent
 * @param percent the percent to reduce the price by
 */
public void reducePrice(double percent)
{
	double amountToReduce = price * percent/100;
	price = price - amountToReduce;		
}

/*
 * Increases the price by the given percent
 * @param percent the percent to increase the price by
 */
public void increasePrice(double percent)
{
	double amountToIncrease = price * percent/100;
	price = price + amountToIncrease;		
}

}