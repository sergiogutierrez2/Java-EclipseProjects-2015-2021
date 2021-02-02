/**
 * Test Food class
 */
public class FoodTester
{
   public static void main(String[] args)
   {
       Food berries = new Food("Strawberries", 4.95, 10);
       Food cheese = new Food("String Cheese", 5.50, 0);
       Food banana = new Food("Banana",5.95, 20);
       Food yummy = new Food("Fancy Chocolates", 10.50, 56);
       Food rice = new Food("Rice", 4.95, 45);
              
       rice.setCarbs(40);
       System.out.println(rice.getCarbs());
       System.out.println("Expected: 40");
       rice.setCarbs(46);
       System.out.println(rice.getCarbs());
       System.out.println("Expected: 46");
       
       System.out.println(cheese.isLowCarb());
       System.out.println("Expected: true");
       System.out.println(berries.isLowCarb());
       System.out.println("Expected: true");
       System.out.println(banana.isLowCarb());
       System.out.println("Expected: false");
       System.out.println(yummy.isLowCarb());
       System.out.println("Expected: false");
       
       System.out.println(yummy.getDescription());
       System.out.println("Expected: Fancy Chocolates  carbs=56");
       System.out.println(cheese.getDescription());
       System.out.println("Expected: String Cheese  carbs=0");
   }
}