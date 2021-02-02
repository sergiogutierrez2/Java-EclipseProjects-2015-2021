import java.util.Scanner;

public class Javaint {

	public static void main(String[] args) 
	{
          int number;
	        
	        //int firstN = scan.nextInt();
	        
		do {
			 Scanner scan = new Scanner(System.in);
		        System.out.print("Please enter a number");
		         number = scan.nextInt();
		         scan.close();
		} while ( number <= 0); 
		
		
	}
}
