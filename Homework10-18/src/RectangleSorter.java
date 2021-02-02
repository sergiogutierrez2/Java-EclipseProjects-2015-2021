/*
 * HOMEWORK 15A
 * Write a class RectangleSorter. It has two static methods:

sortByArea(ArrayList<Rectangle> list) which sorts the rectangles in order of increasing area
sortByDescendingPerimeter (ArrayList<Rectangle> list)which sorts the rectangles in order of decreasing perimeter
You can provide a class that implements the Comparator interface or experiment with Lambda expression (pages 666 and 667)
 */
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class RectangleSorter
{
   /* using a lambda expression */
   public static void sortByArea(ArrayList<Rectangle> list)
   {
      Collections.sort(list, Comparator.comparing(r -> r.getWidth() * r.getHeight()));
      
   }
   
     /*creating a Comparator object from the class below*/
//   public  static void sortByArea(ArrayList<Rectangle> list)
//   {
//      Collections.sort(list, new RectangleAreaComparator() );
//   }   
   
     /*using anonymous class for  Comparator object */
//   public  static void sortByArea(ArrayList<Rectangle> list)
//   {
//      Collections.sort(list, new Comparator<Rectangle>() 
//            {
//               public int compare(Rectangle r1, Rectangle r2)
//               {
//                  return Double.compare(r1.getWidth() * r1.getHeight(), r2.getWidth() * r2.getHeight());
//               }
//            });
//   }      
   
   public static void sortByDescendingPerimeter(ArrayList<Rectangle> list)
   {
      Collections.sort(list, Comparator.comparing(r -> -(r.getWidth() + r.getHeight())));
   }
}

class  RectangleAreaComparator implements Comparator<Rectangle>
{
   public int compare(Rectangle r1, Rectangle r2)
   {
      
      double area1 = r1.getWidth() * r1.getHeight();
      double area2 = r2.getWidth() * r2.getHeight();
      return Double.compare(area1, area2);
   }

}