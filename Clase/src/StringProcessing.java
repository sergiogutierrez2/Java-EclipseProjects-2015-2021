import java.util.Scanner;
public class StringProcessing
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = scan.nextLine();
        
        String vowels = "AEIOUaeiou";
        int count = 0;
        int numbervocals = 0;

        for (int i = 1; i <= phrase.length() ; i++)
        { 	
        if (vowels.contains(phrase.substring(count,i)))
        		{
        	      numbervocals++;
        		}
                count ++;
        }
        
        System.out.println(numbervocals++);
        
        scan.close();
        
        // Maestra
        //for (int i = 0; i < phrase.length(); i++;
        //{
        // String letter = phrase.substring (i, i + 1);
        
    }
}