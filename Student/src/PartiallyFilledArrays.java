import java.util.Arrays;

public class PartiallyFilledArrays
{
    public static void main(String[] args)
    {
        //set up a partially filled array
        String[] keywords = {"if", "for", "goto", "while", "int", null, null};  
        int size = 5;
        int old = 6;
        //index 2 is not a Java keyword. Remove it by moving all the following items up one

        for (int counter = 0; counter < old; counter++) 
        {
        	if (counter >= 3)
        	{
        		keywords[counter - 1] = keywords[counter];
        	}
        }


        String[] a = new String[size];
        // make a one smaller
        a = Arrays.copyOf(keywords, keywords.length - 1);
        for (String i : a)
            {
        	  System.out.println(i);
            }
        /* This also works
        char[] array = new char[] {'a', 'b', 'c'};
        char[] copy = ArrayUtils.clone(array);*/
        
        
    }
}