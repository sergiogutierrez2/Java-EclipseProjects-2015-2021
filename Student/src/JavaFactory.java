import java.util.Scanner;

public class JavaFactory 

{
	
	public static void main (String[] args)
  {
	System.out.println("Please enter a price: " );
	Scanner scan = new Scanner(System.in);
	double price = scan.nextInt();
	double discountedPrice = price/3;
	
	System.out.println("The price after discount is: ");
	System.out.printf("$%.2f\n", discountedPrice);
	scan.nextLine();

	System.out.println("Please enter your name: " );
	String line = scan.nextLine();
	System.out.println(line);
	
	System.out.println("All done." );
	//print instead of println for formatting purposes
	scan.close();
  }            
	
}
