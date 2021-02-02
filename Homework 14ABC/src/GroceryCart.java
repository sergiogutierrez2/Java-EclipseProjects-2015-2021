//SOLUTION
//HOMEWORK 14A
/*
 You are given a text file containing the contents of a shopping cart at a grocery store. 
 The records consists of a item name (which can be any number of words) a price, and a quantity separated by one or more white spaces. 
 The file has this format:

item  price  quantity
raman  0.50  5
whole wheat bread  2.48  1
You are to complete the class called GroceryCart.

which will read the items and then print: the name, the price, the quantity, and the extended price. 
Extended price is the quantity * the price. Use printf (page 530 section 11.2.9) to format the output so that it is displayed in columns. 
The column with the name will be 20 characters wide an left justified. Each of the numbers will 8 characters wide and right justified. 
Price and extended price should have 2 decimal places. 
After all items are processed, print the word Total:, a space, a $ and then the total value of all the items in the cart (with 2 decimal places). 
It will look like this:

raman                   0.33       5    1.65
whole wheat bread       2.48       1    2.48
edamame                 1.85       2    3.70
corn tortillas          0.75       3    2.25
apples                  1.00       2    2.00
salmon                 11.90       1   11.90
paneer                  3.29       1    3.29
tofu                    1.75       2    3.50
dried chilies           1.05       5    5.25
Total: $36.02
Here is a file that will be used by Codecheck. Copy it into your project.

Declare that the main method throws an exception when the file is not found.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GroceryCart
{

   public static void main(String[] args) throws FileNotFoundException
   {
      String fileName = "items.txt"; //SUB "items2.txt"
      Scanner scan = new Scanner(new File(fileName), "UTF-8");
      double extendedPrice = 0;
      double total = 0;
      scan.nextLine(); //consume the header
      while (scan.hasNextLine())
      {
         String name = "";
         while (!scan.hasNextDouble())
         {
             name = name + scan.next() + " ";
         }
         name = name.trim();
         double price = scan.nextDouble();
         int quantity = scan.nextInt();
         extendedPrice = price *  quantity;
         total = total + extendedPrice;
         System.out.printf("%-20s%8.2f%8d%8.2f%n", name, price, quantity, extendedPrice);
      }
      System.out.printf("Total: $%.2f", total);
      scan.close();
   }

}