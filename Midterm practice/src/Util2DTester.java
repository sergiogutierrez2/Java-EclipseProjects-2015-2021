/**
 * Tester for Util2D class.
 * 
 * @author Kathleen O'Brien 
 */
public class Util2DTester
{
    public static void main(String[] args)
    {
        int[][] numbers = {
            {-5, 8, 6, 3, 11},
            {3, -6, -2, 5, -9},
            {1, 2, 5, 7, 6}
            };
        Util2D util = new Util2D(numbers);
        System.out.println("Smallest: " + util.getSmallest());
        System.out.println("Expected: -9");
        System.out.println("Even in column#1: " + util.numberOfEvenInColumn(1));
        System.out.println("Expected: 3");
        System.out.println("Even in column#0: " + util.numberOfEvenInColumn(0));
        System.out.println("Expected: 0");
        System.out.println("Last: " + util.last());
        System.out.println("Expected: 6");
        System.out.println("Contains: " + util.contains(8));
        System.out.println("Expected: true");
        System.out.println("Contains: " + util.contains(15));
        System.out.println("Expected: false");
        
        int[][] numbers2 = {
            {5, 3, 2, 4},
            {6, 1, 7, 8}
            };
        util = new Util2D(numbers2);
        
        System.out.println("Smallest: " + util.getSmallest());
        System.out.println("Expected: 1");
        System.out.println("Last: " + util.last());
        System.out.println("Expected: 8");
    }
}