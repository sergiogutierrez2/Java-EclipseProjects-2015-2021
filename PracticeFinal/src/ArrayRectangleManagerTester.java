/*
Complete the class ArrayRectangleManager that holds an array of rectangles. 
The constructor takes an array of Rectangles as a parameter. This is done for you, but you need to copy the starter code from the Codecheck 
Add this method: 
public Rectangle maxWidth() gets the Rectangle with the greatest width. If the array is empty, return null.
 */

import java.awt.Rectangle;

public class ArrayRectangleManagerTester
{
   public static void main(String[] args)
   {
       Rectangle[] list = 
         {
            new Rectangle(0, 0, 50, 75),
            new Rectangle(0, 0, 150, 40),
            new Rectangle(0, 0, 107, 140)
        };
       
       ArrayRectangleManager manager = new ArrayRectangleManager(list);
       System.out.println(manager.maxWidth());
       System.out.println("Expected: Rectangle[x=0,y=0,width=150,height=40]");
       
   }
}