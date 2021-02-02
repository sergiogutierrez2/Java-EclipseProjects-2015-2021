//SOLUTION
/**
 * simulates a critter that moves quickly
 */
public class OverAchievingCritter extends Critter
{

    /**
     * Constructor for objects of class OverAchievingCritter
     * with the given weight and a position of 0
     * @param weight the weight of this ImpatientCritter
     */
    public OverAchievingCritter(double weight)
    {
        super(weight);
       
    }
    
    @Override
    public void move(int steps)
    {
        super.move(steps * 2);
    }

}