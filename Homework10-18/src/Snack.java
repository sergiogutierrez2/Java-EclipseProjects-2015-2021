/* HOMEWORK 13A
 * Models a snack
 * @author kathleenobrien
 *
 */
public class Snack extends Product13 implements Comparable<Snack>,  Cloneable
{
   private int gramsOfFat;
   /**
    * Constructor for objects of class Snack
    * @param price the price of this Snack
    * @param description the description of the Snack
    * @param gramsOfFat the grams of fat in this Snack
    */
   public Snack(String description, double price, int gramsOfFat)
   {
      super(description,price);
      this.gramsOfFat = gramsOfFat;
   }

   /**
    * Determines if this Snack is healthier than the
    * parameter based on grams of fat
    * @return true if this Snack has fewer grams of fat
    * otherwise return false
    */
   public boolean isHealthier(Snack other)
   {
      return gramsOfFat < other.gramsOfFat;
   }
   
   public int getGramsOfFat()
   {
      return gramsOfFat;
   }
   
   @Override
   public String toString()
   {
      return super.toString() 
            + "[gramsOfFat=" + gramsOfFat + "]";
   }
   
   @Override
   public boolean equals(Object otherObject)
   {
      if (!super.equals(otherObject)) {return false;}
      Snack other = (Snack)otherObject;
      return this.gramsOfFat == other.gramsOfFat;
   }
   
   @Override
   public int compareTo(Snack other)
   {
      if (gramsOfFat != other.gramsOfFat)
      {
         return gramsOfFat - other.gramsOfFat;
      }
      else if (Double.compare(getPrice(), other.getPrice()) != 0)
      {
         return Double.compare(getPrice(), other.getPrice()); //compares two double values
      }
      else
      {
         return getDescription().compareTo(other.getDescription());
      }
   }
   
   @Override
   public Object clone() 
   {
      try
      {
            Object cloned = super.clone();
            return cloned;
      }
      catch (CloneNotSupportedException ex)
      {
         return null;
      }
   }
}