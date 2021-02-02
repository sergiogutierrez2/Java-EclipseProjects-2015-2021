/*HOMEWORK 11A
Implement a subclass of Product called Chips. A Chips has a int instance variable, sodium, 
in addition to description and price. sodium is the number (int) of milligrams of sodium in a serving of this Chips. 
The American Heart Association says that the ideal diet contains less than 1500 mg of sodium a day.Define a constant for this value

Provide the instance variable and methods ( and no additional methods)

public int getSodium()
public double percentOfDailyAmount() returns the percentage of the ideal daily amount of sodium in a serving of this Chips
public String getDescription() returns the description of the Chips then a space and the amount of sodium. Use super
Do not redefine price or description in Chips.
 * 
 */

public class ChipsTester 
{
    public static void main(String[] args)
    {
        Chips fritos = new Chips ("Frito Lays", 2.99, 170);
        Chips kettle = new Chips("Kettle Sea Salt and Vinegar Patato Chips", 3.25, 180);
        Chips lentil = new  Chips("Daily Crave Lentil Chips", 2.50, 220);
        Product product = fritos; //fritos is a subclass of Product
        
        System.out.println(fritos.getPrice());
        System.out.println("Expected: 2.99");
        System.out.println(fritos.getSodium());
        System.out.println("Expected: 170");
        System.out.printf("Percent RDA: %.0f%n", fritos.percentOfDailyAmount());
        System.out.println("Expected: 11");
        System.out.println(fritos.getDescription());
        System.out.println("Expected: Frito Lays 170");
        
        System.out.println("price and sodium: " + kettle.getPrice() + " " + kettle.getSodium());
        System.out.println("Expected: 3.25 180");
        System.out.printf("Percent RDA: %.0f%n", kettle.percentOfDailyAmount());
        System.out.println("Expected: 12");    
        System.out.println(kettle.getDescription());
        System.out.println("Expected: Kettle Sea Salt and Vinegar Patato Chips 180");
    
        
        System.out.println("price and sodium: " + lentil.getPrice() + " " + lentil.getSodium());
        System.out.println("Expected: 2.5 220");
        System.out.printf("Percent RDA: %.0f%n", lentil.percentOfDailyAmount());
        System.out.println("Expected: 15");    
        System.out.println(lentil.getDescription());
        System.out.println("Expected: Daily Crave Lentil Chips 220");
    }
}