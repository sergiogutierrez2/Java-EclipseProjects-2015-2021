//import java.util.Scanner;

/**
 * processes words
 */
public class Words
{
    private String word;
    
    public Words(String theWord)
    {
        word = theWord;
    }
    
    /** 
     * Gets a string with the characters in reverse order
     * @return a string with the characters in reverse order
     */
    public String reverse()
    {
        String reversed = "";
    	for (int i = 0; i < word.length(); i++)
    	{
    		//char ch = word.charAt(i);   This would also work;
    		String ch = word.substring(i, i + 1);
    		reversed = ch + reversed;
    	}
    	
    	return reversed;
    }
    
    /**
     *  Gets the original word
     *  @return the original word
     */
    public String getWord()
    {
        return word;
    } 
    
    public static void main(String[] args)
    {
        Words one = new Words("Hello");
        //System.out.println(one.getWord());
        System.out.println(one.reverse());
    }
}