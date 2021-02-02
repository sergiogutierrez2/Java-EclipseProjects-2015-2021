import java.util.Scanner;

public class InputWork
{
   public static void main (String [] args)
   {
     Scanner scan = new Scanner(System.in);
     double min = 0.0;
     double sum = 0.0;
     double average = 0.0;
     int index = 0;
     String listOfInts = "";
     boolean first = true;
     boolean firstInteger = true;
     double input = 0;
     System.out.print("Enter a double or Q to quit: ");
     
     while(scan.hasNextDouble())
     {
        System.out.print("Enter a double or Q to quit: ");
        input = scan.nextDouble();
        
       if(input % 1 ==0 && firstInteger == true)
    {
       listOfInts = listOfInts + input;
       firstInteger=false;
    }
       else if(input % 1 == 0)
     {
        listOfInts = listOfInts + ", " + input;
     }
        if(first == true)
     {
         min = input;
         first = false;
     }
        else if(input < min)
     {
         min = input;
     }
          if(input < 0)
     {
      sum = input + sum;
      index++;
      average = sum/index;
      }
      
    }   
        if(first == true)
     {
        System.out.println("no input");
     }
        else
      {
        System.out.println(min);
       if (!listOfInts.isEmpty())
      {
         System.out.println(listOfInts);
      }
        System.out.println(average);
      }
        
        scan.close();
   }

}