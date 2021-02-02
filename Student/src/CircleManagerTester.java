
public class CircleManagerTester
{
	public static void main(String args[])
    {
        CircleManager circles = new CircleManager();
        circles.add(new Circle(10.0));
        circles.add(new Circle(100.0));
        circles.add(new Circle(1.0));
        System.out.printf("Sum: %.2f\n", circles.sumAreas());
        System.out.println("Expected: 31733.23");
        System.out.printf("Average: %.2f\n" , circles.averageArea());
        System.out.println("Expected: 10577.74");
        System.out.println("largest: " +circles.largest());
        System.out.println("Expected: Circle[radius=100.0]");
        System.out.println("Radius > 10: " + circles.firstRadiusGreaterThan10());
        System.out.println("Expected: Circle[radius=100.0]");
        
        System.out.println("\nWith an empty CircleManager:");
        
        circles = new CircleManager();
        System.out.println("Sum: " + circles.sumAreas());
        System.out.println("Expected: 0.0");
        System.out.println("Average: " + circles.averageArea());
        System.out.println("Expected: 0.0");
        System.out.println("largest: " +circles.largest());
        System.out.println("Expected: null");
        System.out.println("Radius > 10: " + circles.firstRadiusGreaterThan10());
        System.out.println("Expected: null");
        
        circles = new CircleManager();
        circles.add(new Circle(10.0));
        circles.add(new Circle(100.0));
        circles.add(new Circle(1.0));
        circles.add(new Circle(20.0));
        circles.add(new Circle(300.0));
        circles.add(new Circle(15));
        
        System.out.println("All circles with radius greater than 10: " + circles.RadiusGreaterThan10());
        System.out.println("Expected: 100 20 300 15");
        System.out.println(circles);
        
    }
}
