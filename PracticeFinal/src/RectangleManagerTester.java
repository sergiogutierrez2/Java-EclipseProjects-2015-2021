/*
Complete the class RectangleManager that holds an array list of rectangles. 
The constructor does not take any parameters but initializes the instance variable. 
This is done for you, but you need to copy the starter code from the Codecheck URL below
It has methods: 
public void add(Rectangle r) which adds a Rectangle object to the RectangleManager
public Rectangle maxWidth() gets the Rectangle with the greatest width. If the ArrayList is empty, return null.
 */
import java.awt.Rectangle;

public class RectangleManagerTester
{
   public static void main(String[] args)
   {
       RectangleManager manager = new RectangleManager();
       System.out.println(manager.maxWidth());
       System.out.println("Expected: null");
       
       manager.add(new Rectangle(0, 0, 50, 75));
       manager.add(new Rectangle(0, 0, 150, 40));
       manager.add(new Rectangle(0, 0, 105, 140));
       
       System.out.println(manager.maxWidth());
       System.out.println("Expected: Rectangle[x=0,y=0,width=150,height=40]");
       
   }
}