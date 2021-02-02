import java.util.ArrayList;

public class Util 
{

    static public int sum(int [] arr)
    {
    	int sum = arr[0];

        for(int i = 1; i< arr.length; i++ ) 
        {
           sum = arr[i] + sum;
        }   
        return sum;
    }   
    
    static public String word(ArrayList <String> themarklength)
    {
    	String longest = themarklength.get(0);
    	/*
    	int count = 0;
    	for(String n : themarklength)
    	{
            if(n.length() > longest.length())
            {
            	longest = themarklength.get(count);
            	count++;
            }
        }  
        return longest;*/
        
        for(int i = 0; i < themarklength.size(); i++)
        {
            if(themarklength.get(i).length() > longest.length())
            {
            	longest = themarklength.get(i);
            }
        } 
        return longest;
    }     
}
