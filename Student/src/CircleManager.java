import java.util.ArrayList;
/**
 * Manages an arrary list of Circle objects
 */
public class CircleManager
{
    private ArrayList<Circle> myCircles;

    /**
     * Constructs an empty CircleManager
     */
    public CircleManager()
    {
        myCircles = new ArrayList<Circle>();
    }

    /**
     * Adds a Circle object to this object
     * @param the Circle to add
     */
    public void add(Circle c)
    {
        myCircles.add(c);
    }

    /**
     * Gets the sum of the areas of the Circles in the 
     * CircleManager
     * @return the sum of the areas
     */
    public double sumAreas()
    {   	
    	if (myCircles.isEmpty())
    	{return 0;}
    	
    	double sum = 0;
    	
    		for (int i = 0; i < myCircles.size(); i++) 
    		 { 		      
    			 sum = sum + myCircles.get(i).area();
    	      }   	
    		return sum;	
    }
    
    /**
     * Gets the average of the areas of the Circles in 
     * the CircleManager
     * @return the average of the areas
     */
    public double averageArea()
    {
    	if (myCircles.isEmpty())
    	{return 0;}
    	
    	return sumAreas()/myCircles.size();
    }

    /**
     * Gets the largest Circle in this CircleManager
     * @return the largest Circle
     */
    public Circle largest()
    {
    	if (myCircles.isEmpty())
    	{return null;} 
    	
    	Circle largest = myCircles.get(0);
    	/*if (myCircles.size() == 1)
    	{
    		return myCircles.get(0);
    	} */
    	
		for (int i = 0; i < myCircles.size(); i++) 
		 { 		      
			if (largest.area() < myCircles.get(i).area())
			largest = myCircles.get(i);
	      }   	
		return largest;	
    }
    
    /**
     * Gets the first Circle in the CircleManger with 
     * radius > 10
     * @return the first Circle in the CircleManger with 
     * radius > 10
     */
    public Circle firstRadiusGreaterThan10()
    {
    	if (myCircles.isEmpty())
    	{return null;} 

		for (int i = 0; i < myCircles.size(); i++) 
		 { 		      
			if (myCircles.get(i).getRadius() > 10)
			return myCircles.get(i);
	      }   
		return null;
    }
    
    
    public ArrayList<Circle> RadiusGreaterThan10()
    {
    	ArrayList<Circle> circs = new ArrayList<Circle>();
    	
    	if (myCircles.isEmpty())
    	{return null;} 
    	
    	for (int i = 0; i < myCircles.size(); i++) 
		 { 		      
			if (myCircles.get(i).getRadius() > 10)
			{	
			circs.add(myCircles.get(i));
			}
	      }   	
		return circs;	
    }
    
    
    public String toString()
    {    	
        String s = "ManyCircles: [";
        s = s + myCircles.toString() + "]";
        return s;
    }
}
