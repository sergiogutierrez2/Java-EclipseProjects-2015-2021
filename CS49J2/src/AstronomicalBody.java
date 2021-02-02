
public class AstronomicalBody {

	private double mass;
	private String name;
	
    public AstronomicalBody (double mass, String name)
    {
        this.mass = mass;
        this.name = name;
    }
	
    public double getMass()
    {
       return mass;
    }
    
    public void setMass(double mass)
    {
    	this.mass = mass;
    }
	
    public String getName()
    {
       return name;	
    }
    
    public void setName(String name)
    {
    	this.name = name;
    }
    
    public void rotate()
    {
    	System.out.println("Rotating around a star");
    }
}
