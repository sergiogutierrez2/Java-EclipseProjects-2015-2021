import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class Stairs
{  

    private int x;
    private int y;
    
    /*
     * Constructs a Product with the given price and name
     * @param x the coordinate.
     * @param y the y coordinate.
     */
    public Stairs (int x, int y)
    {
    	this.x = x;
    	this.y = y;
    }


/*
 * Draws the steps.
 * @param Graphics2D g2 to draw the rectangles and circles.
 */
public void draw(Graphics2D g2)
{
    Rectangle box1 = new Rectangle(x, y, 20, 20);
    g2.setColor(Color.BLUE);
    g2.draw(box1);
    
    Rectangle box2 = new Rectangle(x, y + 20, 40, 20);
    g2.setColor(Color.GREEN);
    g2.fill(box2);
    
    Rectangle box3 = new Rectangle(x, y + 40, 60, 20);
    g2.setColor(Color.MAGENTA);
    g2.fill(box3);
    
    Ellipse2D.Double redCircle = new Ellipse2D.Double(x, y, 20, 20);
    g2.setColor(Color.RED);
    g2.fill(redCircle);
    

   Line2D.Double line = new Line2D.Double(x, y, x + 60, y + 60);
   g2.setColor(Color.BLACK);
   g2.draw(line);

}

}    
