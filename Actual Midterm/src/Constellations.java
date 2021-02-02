import java.util.Scanner;

public class Constellations {
	
	public static void main (String [] args)
	   {
		Scanner scan = new Scanner(System.in);
		System.out.print("What is your favorite constellation? ");
		String phrase = scan.nextLine();
		
		if (phrase.contains("Gemini"))
		{
			System.out.println("Twins!");	
		}
		
		else if (phrase.equalsIgnoreCase("Ursa Major"))
		{
			System.out.println("Isn't that the Big Dipper?");	
		}
		
		else if (phrase.equalsIgnoreCase("Ursa Minor"))
		{
			System.out.println("Sounds like a bear to me");	
		}
		
		else
		{
			System.out.println("A star by any other name");	
		}
		
		System.out.print("Enter double: ");
		double input = scan.nextDouble();
		int x = (int) (input / 1);
		
		System.out.println(x);	

		scan.close();
}

}