/**
You are given a class Critter which represents an animal. 
A Critter has a weight and a position on a number line. The constructor initializes the position 
to 0 and sets the weight from the parameter. It has an ArrayList of Strings to keep a log of its activities. 
It has other methods you can view by opening the class in Bluej and then selecting Documentation from the drop down menu on the right.
Write a subclass of Critter called LazyCritter. No starter code for this
LazyCritter only eats and sleeps. A LazyCritter only has two modes: eat and sleep. When asked to move, it will either eat or sleep. 
A LazyCritter is created hungry so the first time its move method is called, the LazyCritter should eat. 
(and call addHistory to add the word "eat" to the history.) The next time the move method is called, 
the LazyCritter will sleep (and call addHistory to add the word "sleep" to the history). It will continue 
to alternate activities in this manner. 
You will need a boolean variable to keep track of which activity the LazyCritter should do next. 
This variable should be set in such a manner in the constructor that on the first call to move method, it will eat.
 */
public class LazyCritterTester
{
    public static void main(String[] args)
    {
        //LazyCritter
        Critter lazy = new LazyCritter(5.2);
        lazy.move(2);
        lazy.move(4);
        lazy.move(-1);
        lazy.move(3);
        lazy.move(5);
        
        System.out.println(lazy.getHistory());
        System.out.println("Expected: [eat, sleep, eat, sleep, eat]");
        System.out.println(lazy.getWeight());
        System.out.println("Expected: 5.2");
        System.out.println(lazy.getPosition());
        System.out.println("Expected: 0");
    }
}