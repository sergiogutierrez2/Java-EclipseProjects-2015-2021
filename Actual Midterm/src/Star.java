/**
 * Star temperature class 
 */
public class Star 
{
	 private int temperature;
	 
	 public static final int MAXIMUM = 25000;
	 public static final int MINIMUM = 3000;
	 
	 /**
	  * constructor that a string and int
	  * @param city the city
	  * @param temeprature the temperature
	   */
	    public Star(int temperature)
	    {
	        setTemperature(temperature);
	    }
	    
	    /**
		  * constructor that a string and int
		  * @return temperature the temperature
		   */
	    public int getTemperature()
	    {
	    	return temperature;
	    }
	    
	    /**
		  * sets the temperature
		   */
	    public void setTemperature(int x)
	    {
	    	this.temperature = x;
	    }
	    
	    /**
		  * constructor that a string and int
		  * @param city the city
		  * @param temeprature the temperature
		   */
	    public void getType()
	    {
	    	if (temperature < MINIMUM)
	    		setTemperature(MINIMUM);

	    		else if (temperature > MAXIMUM)
	    		setTemperature(MAXIMUM);
	    }
	
}
