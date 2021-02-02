/**
 * Test the City class
 */
public class CityTester
{
    public static void main(String[] args)
    {
        City name = new City("Saratoga");
        System.out.println("Double letter?: " + name.doubleLetter());
        System.out.println("Expected: false");
        
        name = new City("Seacliff");
        System.out.println("Double letter?: " + name.doubleLetter());
        System.out.println("Expected: true");
        
        name = new City("Lloydton");
        System.out.println("Double letter?: " + name.doubleLetter());
        System.out.println("Expected: true");
        System.out.println(name.getCity());
        System.out.println("Expected: Lloydton");
        
    }
}