
public class Star extends AstronomicalBody {
	
	public Star (double mass, String name)
	{
		super (mass, name);
	}

	@Override
    public void rotate()
    {
    	 System.out.println("Rotating around the center of a galaxy");
    }
    
    @Override
    public boolean equals(Object obj)
    {   
       if(obj instanceof Star)
        {   
    	   Star other = (Star) obj;   
            return this.getMass()== other.getMass() && this.getName().equals(other.getName());
        }
         return false;
    }
}
