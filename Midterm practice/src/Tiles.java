import java.util.ArrayList;
import java.awt.Rectangle;
/**
 * Manages an list of rectangular tiles objects
 */
public class Tiles
{
   ArrayList<Rectangle> tiles;
   
   
   /**
    * Constructor for the arraylist of rectangles
    */
   public Tiles()
   {
	   tiles = new ArrayList<Rectangle>();
   }
   
   
   /**
    * adds rectangles
    * @param r the rectangle r
    */
   public void add(Rectangle r)
   {
	   tiles.add(r);
   }
   
   /**
    * returns total area
    * @return sum the sum of the areas
    */
   public double totalArea()
   {
   	if (tiles.isEmpty())
   	{return 0;}
   	
   	double sum = 0;
   	
   		for (int i = 0; i < tiles.size(); i++) 
   		 { 		      
   			 sum = sum + (getArea(tiles.get(i)));
   	      }   	
   		return sum;	
   }
   
   /**
    * returns largest area
    * @return largest the largest of the areas
    */
   public Rectangle largest()
   {
   	if (tiles.isEmpty())
   	{return null;} 
   	
   	Rectangle largest = tiles.get(0);
   	
		for (int i = 0; i < tiles.size(); i++) 
		 { 		      
			if ((getArea(largest)) < getArea(tiles.get(i)))
			largest = tiles.get(i);
	      }   	
		return largest;	
   }
   
   /**
    * returns the area of the rectangle
    * @return x the area of the rectangle
    */
   public double getArea(Rectangle r)
   {
	   double x = r.getWidth()*r.getHeight();
	   return x;
   }
   
   /**
    * returns the edited string of the object
    * @return tiles.toString() the string
    */
    @Override
    public String toString()
    {
        return tiles.toString();
    }
}