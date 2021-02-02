/**
 * Stamps R Us makes rubber stamps consisting of a person's initials.
 * @author Sergio Gutierrez
*/

public class Stamp 
{
    private String first;
    private String middleInitial;
    private String last;
    
    /**
     * Constructs a stamp with the given name
     * @param theFirst the first name of the person
     * @param theMiddleInitial the middle initial of the student
     * @param theLast the last name of the student
     */
    public Stamp(String theFirst, String theMiddleInitial, String theLast)
    {
    	first = theFirst;
    	middleInitial = theMiddleInitial;
    	last = theLast;
    }
    
    /**
     * Constructs a stamp with the given name
     * @param theFirst the first name of the person
     * @param theLast the last name of the student
     */
    public Stamp(String theFirst, String theLast)
    {
    	first = theFirst;
    	middleInitial = "";
    	last = theLast;
    }
    
    /**
     * Gets the first name of the person.
     * @return First the first name of the person.
     */
      public String getFirst()
     {
	    return first;
     } 
     
    /**
     * Gets the middle initial of the person.
     * @return MiddleInitial the middle initial of the person.
     */
      public String getMiddleInitial()
     {
	    return middleInitial;
     }
     
    /**
     * Gets the last name of the person.
     * @return Last the last name of the person.
     */
      public String getLast()
     {
	    return last;
     } 
    
     /**
     * Gets the total characters of a person's name
     * @return the charactercount.
     */
      public int characterCount()
     {
	    return first.length() + middleInitial.length() + last.length();
     } 
     
     /**
     * Gets the initials of a person
     * @return the initials of the person
     */
      public String getInitials()
     {
	    return first.charAt(0) + getMiddleInitial() + last.substring(0,1);
     }
    
}