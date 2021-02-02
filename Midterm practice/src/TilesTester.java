import java.awt.Rectangle;
public class TilesTester
{
    public static void main(String[] args)
    {
        Tiles rectangles = new Tiles();
        rectangles.largest(); //should not throw an exception
        System.out.println(rectangles.totalArea());
        System.out.println("Expected: 0.0");
        
        //add some rectangles
        rectangles.add(new Rectangle(0, 0, 20, 75));
        rectangles.add(new Rectangle(0, 0, 100, 50));
        rectangles.add(new Rectangle(0, 0, 80, 40));
        rectangles.add(new Rectangle(0, 0, 50, 100));
        rectangles.add(new Rectangle(0, 0, 50, 50));
        
        Rectangle max = rectangles.largest();
        if (max != null)
        {
            System.out.println("Largest: " + max);
            System.out.println("Expected: java.awt.Rectangle[x=0,y=0,width=100,height=50]");
        }
        
        double area = rectangles.totalArea();
        System.out.println("total area: " + area);
        System.out.println("Expected: 17200.0");
        
    }
}