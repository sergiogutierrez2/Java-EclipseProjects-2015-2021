
/**
 * This class models a Circle in 2d space
 * 
 * @author KOBrien 
 * @version (July 30, 2016
 */
public class Circle
{
    private double radius;
    
    /**
     * Constructs a Circle with the given radius 
     * @param theRadius the radius of thie Circle
     */
    public Circle(double theRadius)
    {
        radius = theRadius;
    }
    
    /**
     * Gets the radius of this Circle
     * @return the radius of this circle
     */
    public double getRadius()
    {
        return radius;
    }
    
    /**
     * Set the radius of this Circle
     * @param newRadius the new radius of this Circle
     */
    public void setRadius(double newRadius)
    {
        radius = newRadius;
    }
    
    /**
     * Gets the area of this Circle
     * @return the area of this circle
     */
    public double area()
    {
        double area = Math.PI * radius * radius;
        return area;
    }
    
    static public double area(double r)
    {
        double area = Math.PI * r * r;
        return area;
    }
    

}
