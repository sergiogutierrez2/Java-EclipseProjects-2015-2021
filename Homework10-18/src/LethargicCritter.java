/*HOMEWORK 11C
In both Critter and LethargicCritter classes from 11c, add equals and toString methods. 
In the Critter class toString method, you will need to get a string representation of the history ArrayList. 
You can can do that by calling history.toString(). Call super.toString in LethargicCritter's toString.
*/
/**
 * Lethargic critter only eats and sleeps.
 * 
 */
public class LethargicCritter extends Critter
{
    private boolean timeToEat;

    /**
     * Constructor for objects of class LethargicCritter
     * with the given weight and a position of 0
     * @param weight weight of this critter
     */
    public LethargicCritter(double weight)
    {
        super(weight);
        timeToEat = true;
    }
    
    @Override
    public void move(int steps)
    {
        if (timeToEat)
        {
            addHistory("eat");
        }
        else
        {
            addHistory("sleep");
        }
        
        timeToEat = !timeToEat;
    }

    @Override
    public String toString()
    {
       return super.toString() + "[timeToEat=" + timeToEat + "]";
    }
    
    @Override
    public boolean equals(Object otherObject)
    {
       if (!super.equals(otherObject)) {return false;}
       LethargicCritter other = (LethargicCritter)otherObject;
       return this.timeToEat == other.timeToEat;
    }

}