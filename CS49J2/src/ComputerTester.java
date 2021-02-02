import java.util.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.io.PrintWriter;

public class ComputerTester {

    public static void main(String[] args) 
  {
    	//Desktop roy = new Desktop(1);
    	//Computer dodo = roy;
    	//Desktop solo = (Desktop) dodo;

    	/*    try {
    	        Scanner input = new Scanner(new File("names.txt"));
    	        String value = input.next();
    	        int number = Integer.parseInt(value);
    	        input.close();
    	        System.out.println("Done");
    	    }
    	    catch (FileNotFoundException ex) {
    	        System.out.println("Error opening file");
    	    }
    	    catch (NumberFormatException ex) {
    	        System.out.println("Cannot be converted");
    	    }
    	    System.out.println("Finished execution");

*/
    	/*Orca pookie = new Orca();

    	Object widget = pookie;
   	    System.out.println(pookie.toString());
   	    System.out.println(widget.toString());*/
    	
    	//Orca c = new Orca;
         Orca c = new Orca();
    	//Orca c = Orca();
    	
  }

public static void copyData(String sourcefilename, String outputfilename) throws IOException {
File inputFile = new File(sourcefilename);
Scanner in = new Scanner(inputFile);
PrintWriter out = new PrintWriter(outputfilename);

while(in.hasNextLine())
{
  String line = in.nextLine();
  out.println(line);
}

in.close();
out.close();
}

}