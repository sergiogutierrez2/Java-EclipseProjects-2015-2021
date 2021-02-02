//HOMEWORK 14B
//ARGS top_10_ceo_salaries.txt
//ARGS
//ARGS bad_file.txt
/*
Check the text file containing the information about the salaries of the top 10 highest paid CEOs.
Write a program CEOSalaries to print a list which contains the ticker symbol, colon space, the name of the CEO, space, 
and the salary printed with a $ and comma separators. Use printf. The first record looks like this

VRX: J. Michael Pearson $143,077,442
After all the records are printed, print: "Average salary: " and then the average salary with a $ and comma separators and 2 decimal places.

Note: You need to remove the $ and commas before using Integer.parseInt to convert a strings to an int.
The file name will be provided in the command line arguments. This will tell you how to use command line arguments in Eclipse.

Catch the exception if the file does not exist and print this message: No such file: filename

To process data in a file, you have to exam the file to determine the format of the data. 
In this case, the name of the CEO can be either two or three words. Company names also varies in length. 
If the CEO name has three parts, one will be an initial, (like J. in the first entry). 
The initial may be either the first or the second name. Notice that the last name is the third name from the end
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CEOSalaries
{
   public static void main(String[] args) 
   {
      //quit if there are no args
      if (args.length < 1)
      {
         System.out.println("Usage: java CEOSalaries top_10_ceo_salaries.txt");
         return; //no file, we are done
      }
      
      String filename = args[0];

      try(Scanner scan = new Scanner(new File(filename), "UTF-8"))
      {
         scan.nextLine(); //consume the header
         double sum = 0;
         double count = 0; //don't depend on there being 10 records
         while (scan.hasNextLine())
         {
            String line = scan.nextLine();
            String[] ceos = line.split("\\s+");
            int length = ceos.length;
            
            // get rid of the dollar sign and commas
            String stringSalary = ceos[length - 1].replace("$", "").replaceAll(",", ""); 
            
            double salary = Double.parseDouble(stringSalary); // might not be an int
            sum = sum + salary;
            count++;
            
            //The name will be at least  two elements 
            //it will have 3 elements if there is an intial
            String name = ceos[length - 4] + " " + ceos[length-3];
            if (isInitial(ceos[length - 4]) || isInitial(ceos[length - 5]))
            {
               name = ceos[length - 5] + " " + name;
            }
            System.out.printf("%s: %s $%,d%n", ceos[0], name, (int)salary);            
         }
         
         //all records have been processed
         double average = 0;
         if (count > 0)
         {
            average = sum / count;
         }
         System.out.printf("Average salary: $%,.2f", average);
      } //scanner closed here
      catch (FileNotFoundException ex)
      {
         System.out.println("No such file: " + filename);
      }
   }
   
   //test the given string to see if it is an initial
   //is inital if the length is 2 and the last character is a period
   public static boolean isInitial(String s)
   {
      return (s.length() == 2) && (s.substring(1).equalsIgnoreCase("."));

   }
}