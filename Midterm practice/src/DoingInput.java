import java.util.Scanner;

public class DoingInput
{
	public static void main (String[] args)
   {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the name of an animal: ");
	String phrase = scan.nextLine();
	
	if (phrase.contains("African lion"))
	{
		System.out.println("Fierce");	
	}
	
	else if (phrase.equalsIgnoreCase("african elephant"))
	{
		System.out.println("BIG");	
	}
	
	else
	{
		System.out.println("Wouldn't you like a kitten?");	
	}
	
	System.out.print("Please enter a double: ");
	double phrase2 = scan.nextDouble();
	
	System.out.print("Now enter an integer: ");
	int phrase3 = scan.nextInt();
	
	if (phrase3 != 0)
	{
		double div = phrase2 / phrase3;
		System.out.printf("%.2f%n", div);
	}
	
	else
	{
		System.out.println("Can not divide by 0");	
	}
	
	scan.close();
   }
}