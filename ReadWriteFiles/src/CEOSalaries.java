import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

/**
   This program reads a file with numbers, and writes the numbers to another
   file, lined up in a column and followed by their total.
*/
public class CEOSalaries
{
   public static void main(String[] args) throws FileNotFoundException
   {
      // Prompt for the input and output file names

      Scanner console = new Scanner(System.in);
      System.out.print("Input file: ");
      String inputFileName = console.next();

      // Construct the Scanner and PrintWriter objects for reading and writing

      File inputFile = new File(inputFileName);
      Scanner in = new Scanner(inputFile);

      // Read the input and write the output

      //double total = 0;
      
      int count = 0;
      int grandtotal = 0;

      while (in.hasNextLine())
      {
         /*double value = in.nextDouble();
         System.out.printf("%15.2f%n", value);
         System.out.println(inputFileName.nextLine());
         total = total + value;*/
    	  
    	  int total = 0;
    	  String[] sequence = new String [5];
    	  String line = in.nextLine();
    	  line = line.replaceAll("[,$]", "");
    	  System.out.printf("%s: %s ", sequence[0], sequence[2]);
    	  total = Integer.parseInt(sequence[4]);
    	  //System.out.printf("%s", df.format(total));
    	  System.out.println();
    	  grandtotal += total;
    	  count++; 
      }

      //System.out.printf("Total: %8.2f%n", total);
      //System.out.println("Average salary $" + formatter.format(average));
      System.out.printf("Average Salary: $" + "%,.2f",  grandtotal/count);

      /*catch (FileNotFoundException e)
      { 
    	  System.out.println("No such file: " + args[0]);
      }*/
      
      in.close();
      console.close();
   }

}