/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AverageHeightPresidents
{
   public static void main(String[] args)
   {
       if(args.length != 1) {
           System.out.println("Please pass file name as command line argument");
           System.out.println("Usage: java AverageHeightPresidents <filename>");
           System.exit(1);
       }
      
       String filename = args[0];
       File inputFile = new File(filename);
       Scanner in = null;
       try {
           in = new Scanner(inputFile, "UTF-8");
       } catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
           System.exit(1);
       }
       double total = 0;
       int count = 0;
       double average;
       while (in.hasNextLine())
       {
           String line = in.nextLine();
           String cols[] = line.split(" ");

           int y = cols.length;
           int x = Integer.parseInt(cols[y-2]);
           total += x;
           count++;
       }
       // compute the average
       if(count==0)
       {
           average = 0;
       }

       else {
           average = total / count;
       }

       System.out.printf("Average %.2f\n", average);
       in.close();
   }
}
*/
/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AverageHeightPresidents
{
   public static void main(String[] args)
   {
       if(args.length < 1) {
           System.out.println("Please pass file name as command line argument");
           System.out.println("Usage: java AverageHeightPresidents president_by_height.txt");
           return; //can't do anything without the file
       }
      
       String filename = args[0];
       File inputFile = new File(filename);
       Scanner in = null;
       try {
           in = new Scanner(inputFile, "UTF-8");
       } catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
           //System.exit(1);
       }
       catch(Exception e )  //some other exeption
       {
           System.out.println(e.getMessage());
       }
       double total = 0;
       int count = 0;
       double average;
       while (in.hasNextLine())
       {
           String line = in.nextLine();
           String cols[] = line.split(" ");

           int y = cols.length;
           int x = Integer.parseInt(cols[y-2]);
           total += x;
           count++;
       }
       // compute the average
       if(count==0)
       {
           average = 0;
       }

       else {
           average = total / count;
       }

       System.out.printf("Average %.2f\n", average);
       in.close();
   }
}*/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AverageHeightPresidents 
{
public static void main(String[] args) throws FileNotFoundException 
{
  File inputFile = new File("president_by_height.txt");
  Scanner in = new Scanner(inputFile, "UTF-8");
  double total = 0;
  int count = 0;
  double average;
  while (in.hasNextLine()) 
  {
    String line = in.nextLine();
    // Use split
     String cols[] = line.split(" ");
     //7th indicates height in cm
     
     int y = cols.length;
     int x = Integer.parseInt(cols[y-2]);
      total += x;
      count++;
      
  }
// compute the average
    if(count==0)
  {
   average = 0; 
  }

  else {
     average = total / count;
     }

   System.out.printf("Average %.2f\n", average);
   in.close();
  }
}


/*
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

  public class AverageHeightPresidents
{
public static void main(String[] args) throws FileNotFoundException
{
  File inputFile = new File("president_by_height.txt");
  Scanner in = new Scanner(inputFile, "UTF-8");
  double total = 0;
  int count = 0;
  while (in.hasNextLine())
 {
   String line = in.nextLine();
   String[] str = line.split(" ");
   int l = str.length;
   int h = Integer.parseInt(str[l-2]);
   total+=h;
   count++;
 }

  double avg = total/count;
  System.out.printf("Average Height = %.2f", avg);
  
in.close();
  }
}*/