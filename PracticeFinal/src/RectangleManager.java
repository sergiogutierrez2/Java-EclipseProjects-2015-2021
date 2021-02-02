import java.util.ArrayList;
import java.awt.Rectangle;

public class RectangleManager
{
    private ArrayList<Rectangle> boxes;

    public RectangleManager()
    {
        boxes = new ArrayList<>();
    }

    public void add(Rectangle r)
    {
        boxes.add(r);
    }

    public Rectangle maxWidth(){
        if(boxes.size() == 0){
            return null;
        }
        else {
            Rectangle max = boxes.get(0);
            for (int i = 1; i < boxes.size(); i++) {
                if(boxes.get(i).getWidth() > max.getWidth()){
                    max = boxes.get(i);
                }
            }
            return max;
        }
    }

}