import java.awt.Rectangle;

public class ArrayRectangleManager 
{
    private Rectangle[] boxes;

    public ArrayRectangleManager(Rectangle[] array) 
    {
        boxes = array;
    }

    public Rectangle maxWidth() 
    {
        Rectangle max = boxes[0];
        for (int i = 0; i < boxes.length; i++) 
        {
            if (boxes[i].getWidth() > max.getWidth()) 
            {
                max = boxes[i];
            }
        }
        return max;
    }
}