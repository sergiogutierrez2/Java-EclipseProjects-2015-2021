import java.util.ArrayList;

public class PlanetarySystem extends ArrayList<AstronomicalBody> {

	Star star;

	@Override
	public boolean add(AstronomicalBody ab)
	{
		if (!(ab instanceof Star))
        { 
			super.add(ab);
			return true;
        }
		
		if (ab instanceof Star && star == null)
        { 
			super.add(ab);
			star = (Star) ab;
			return true;
        }
		
		if (ab instanceof Star && star != null)
        { 
			return false;
        }
		
		return false;
	}

	public int getTotalMass()
	{
		   int total=0;

	        for(int i=0; i< this.size(); i++){

	            total+=this.get(i).getMass();
	        }
	        return total;
	}

	public String toString()
	{
		String st = "Astronomical Bodies:";
		
        for(int i = 0; i < this.size(); i++)
        {
        	if ((this.get(i).getName()).equals(""))
        	{
        		st += "\n" + (i+1) + ". " + "No name. " + this.get(i).getName() + "Mass: " + this.get(i).getMass();
        	}
        	else
        	st += "\n" + (i+1) + ". " + "Name: " + this.get(i).getName() + ", Mass: " + this.get(i).getMass();
        }
        st += "\n";
        return st;
	}

    @Override
    public boolean equals(Object obj)
    {   
       if(obj instanceof PlanetarySystem)
        {   
    	   PlanetarySystem other = (PlanetarySystem) obj;   
            return this.star.equals(other.star)==true && this.getTotalMass()==other.getTotalMass()  && this.size()==other.size();
        }
         return false;
    }
	
}
