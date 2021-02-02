
public class Preschool 
{
//check tiles under midterm, or circle manager under student, or RectangleManager under practicefinal
	import java.util.ArrayList;
	import java.util.Collections;
	/**
	 * Arraylist preschool
	 */
	public class Preschool
	{
	   ArrayList<String> names;
	   
	   
	   /**
	    * Constructor for the arraylist of rectangles
	    */
	   public Preschool()
	   {
		   names = new ArrayList<String>();
	   }
	   
	   
	   /**
	    * adds rectangles
	    * @param r the rectangle r
	    */
	   public void enroll(String name)
	   {
		   names.add(name);
	   }
	   
	   /**
	    * returns total area
	    * @return sum the sum of the areas
	    */
	   public void sort()
	   {
	   	Collections.sort(names);
	   	
	   	/*if (tiles.isEmpty())
	   	{return 0;}
	   	
	   	double sum = 0;
	   	
	   		for (int i = 0; i < tiles.size(); i++) 
	   		 { 		      
	   			 sum = sum + (getArea(tiles.get(i)));
	   	      }   	
	   		return sum;	*/
	   }
	   
	   /**
	    * returns largest area
	    * @return largest the largest of the areas
	    */
	   public String shortest()
	   {
	   	/*if (tiles.isEmpty())
	   	{return null;} 
	   	
	   	Rectangle largest = tiles.get(0);
	   	
			for (int i = 0; i < tiles.size(); i++) 
			 { 		      
				if ((getArea(largest)) < getArea(tiles.get(i)))
				largest = tiles.get(i);
		      }   	
			return largest;	*/
	   }
	   
	   /**
	    * returns the area of the rectangle
	    * @return x the area of the rectangle
	    */
	   public String getInitials()
	   {

	   }
	   
	   /**
	    * returns the edited string of the object
	    * @return tiles.toString() the string
	    */
	    @Override
	    public String toString()
	    {
	        return names.toString();
	    }
	}