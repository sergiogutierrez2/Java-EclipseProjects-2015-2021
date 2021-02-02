import java.awt.Rectangle;
import java.util.Arrays;

 /**
 * Class that creates rectangles with areas.
 */
public class Rectangles
{
    Rectangle [] rect;
    
    /** Constructs a rectangles class with the given array
    * @param arr the array to use in this IntArrayProcessor
    */
    public Rectangles(Rectangle [] arr)
    {
        rect = arr;
    }
    
     /**
     * Gets the maximum value in the array 
     * @return average, which is the average of areas in the array
     */
    public double averageArea()
    {
        double average = 0.0;
        
        for(int i=0; i<rect.length; i++)
        {
            average += (rect[i].getHeight()*rect[i].getWidth());
        }

        average = average / rect.length;
        return average;
    }

    /**
     * Swaps min and max values in rect array. 
     */
    public void swapMaxAndMin()
    {
        int max = 0;
        int min = 0;
        
        for(int i=1; i<rect.length; i++)
        {
            if((rect[max].getHeight()*rect[max].getWidth()) < (rect[i].getHeight()*rect[i].getWidth()))
                {
                   max = i;
                }

            if((rect[min].getHeight()*rect[min].getWidth()) > (rect[i].getHeight()*rect[i].getWidth()))
                {
                   min = i;
                }
        }

        Rectangle temp = rect[max];
        rect[max] = rect[min];
        rect[min] = temp;
    }
    
    @Override
    public String toString()
    {
        return Arrays.toString(rect);
    }

}