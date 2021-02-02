/**HOMEWORK 11C
 * You are given a class Critter which represents an animal. Critter class will be the superclass of a set of subclasses classes. 
 * A Critter has a weight and a position on a number line. The constructor initializes the position to 0 and sets the weight from the parameter. 
 * Critter has an ArrayList of Strings to keep a log of its activities. It has other methods which you can view here

You are to implement the following subclasses of Critter

OverAchievingCritter: A OverAchievingCritter  always does more than asked. If  you tell an OverAchievingCritter to move 5, 
it will actually move 10 steps. You will override the move method.

LethargicCritter: A LethargicCritter only has two activities: eat and sleep. When asked to move, it will either eat or sleep. 
A LethargicCritter is created hungry so the first time its move method is called, the LethargicCritter should eat. 
(and add the word "eat" to the history. The next time the move method is called, the LethargicCritter will sleep 
(and add the word "sleep" to the history). It will continue to alternate activities in this manner.

UnpredictableCritter: A UnpredictableCritter is very stubborn. It only moves when it feels like it. You will override the move method. 
If you call the UnpredictableCritter's move method, sometimes it will move and sometimes it will not. The decision is totally random. 
In the conctructor construct a Random object with a seed 543212345. You can use Random's nextBoolean method or nextInt with a parameter of 
1 to help you determine if the Critter should move.
 * Tests Critter subclasses.
 * 
 */
public class CritterTester
{
   public static void main(String[] args)
   {
	   System.out.println("Test OverAchievingCritter");
      Critter overAchiever = new OverAchievingCritter(15.7);
      overAchiever.move(10);
      overAchiever.move(-3);
      System.out.println(overAchiever.getHistory());
      System.out.println("Expected: [move to 20, move to 14]");
      System.out.println(overAchiever.getPosition());
      System.out.println("Expected: 14");

      System.out.println("Test LethargicCritter");
      Critter lazy = new LethargicCritter(5.2);
      lazy.move(2);
      lazy.move(4);
      lazy.move(-1);
      lazy.move(3);
      lazy.move(5);

      System.out.println(lazy.getHistory());
      System.out.println("Expected: [eat, sleep, eat, sleep, eat]");
      System.out.println(lazy.getPosition());
      System.out.println("Expected: 0");

      System.out.println("Test UnpredictableCritter");
      Critter mule = new UnpredictableCritter(8.2);
      mule.move(2);
      mule.move(4);
      mule.move(-1);
      mule.move(3);
      mule.move(5);

      System.out.println(mule.getHistory());
      System.out.println("move to -1, move to 2, move to 7]");
      System.out.println(mule.getPosition());
      System.out.println("Expected: 7");


   }

}