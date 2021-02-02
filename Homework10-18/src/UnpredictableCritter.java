//SOLUTION
import java.util.Random;
/**
* Simulates a critter that does not always move when told to
*/
public class UnpredictableCritter extends Critter
{
  private Random gen ;

  /**
   * Constructor for objects of class UnpredictableCritter 
   * with the given weight and a position of 0
   * @param weight the weight of the critter
   */
  public UnpredictableCritter(double weight)
  {
      super(weight);
      gen = new Random(543212345);
      
  }
  
  @Override
  public void move (int steps)
  {   
      if (gen.nextBoolean())
      {
          super.move(steps);
      }
  }
}