/**
 * models a City name
 */
public class City
{
    private String city;

    public City(String city)
    {
        this.city = city;
    }
    
    public String getCity()
    {
    	return city;
    }
    
    //determines if the city name contains a double letter. 
    //Returns true is it does. Otherwise it returns false.
    public boolean doubleLetter()
    {
    	if (city.length() < 2)
    	{
    		return false;
    	}
    	
    	for (int i = 0; i < city.length() - 1; i++)
    	{
    		if ((city.substring(i, i+1)).equalsIgnoreCase(city.substring(i+1, i+2)))
    			return true;
    	}
    	
    	return false;
    }
}