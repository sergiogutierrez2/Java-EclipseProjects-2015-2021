/**
 * Models a Product that can increase and decrease in price
 */
public class Product13
{
    private double price;
    private String description;

    /**
     * Constructs a Product with a price and a description
     * @param thePrice the price of this Product
     * @param theDescription - the description of this product
     */
    public Product13(String theDescription, double thePrice)
    {
        price = thePrice;
        description = theDescription;
        
    }

    /**
     * Gets the price
     * @return the price of this Product object
     */
    public double getPrice()
    {
         return price;
    }
    
    /**
     * Gets the description
     * @return the description of the Product object
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Reduces the price of this product by the give percentage
     * @param percent the percentage to reduce the priice by
     */
    public void reducePrice(double percent)
    {
        double reduction = price * percent / 100;
        price = price - reduction;
    }
    
    /**
     * Increases the price by the given percent
     * @param percent the percent to increase the price by
     */
    public void increasePrice(double percent)
    {
        double increase = price * percent / 100;
        price = price + increase;
    } 
    
    @Override
    public String toString()
    {
       return getClass().getName() 
             + "[description=" + description 
             + ",price=" + price
             + "]";
    }
    
    @Override
    public boolean equals(Object otherObject)
    {
       if (otherObject == null) {return false;}
       if (this.getClass() != otherObject.getClass()) {return false;}
       Product13 other = (Product13)otherObject;
       return price == other.price
             && description.equals(other.description);
    }
}