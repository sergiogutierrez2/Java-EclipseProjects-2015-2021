import java.util.Scanner;

public class WordTest {
	
	public static void main (String[] args)
	  {
		System.out.println("Please enter a phrase of at least three words: " );
		Scanner scan = new Scanner(System.in);
		String phrase = scan.nextLine();
		//double discountedPrice = price/3;
		
		System.out.println("The Phrase you entered is: ");
		System.out.println(phrase);
		//scan.nextLine();
		
		System.out.println("The first word in the phrase is: ");
		System.out.println(phrase.substring(0, phrase.indexOf(" ")));
		
		//lol me confundio la maistra
		System.out.println("The second word in the phrase is: ");
		//lol//String second = phrase.substring(phrase.indexOf(" ") + 1, phrase.indexOf(" ") +)
		//lol had to do this to make other program work//System.out.println(phrase.indexOf(" "), phrase.indexOf(" ") + 1);
		

		/*System.out.println("Please enter a word: ");
		String first = scan.nextLine();
		
		String first = */ 
		
		/*System.out.println("Please enter your name: " );
		String line = scan.nextLine();
		System.out.println(line);
		
		System.out.println("All done." );*/
		scan.close();
	  }  

}
