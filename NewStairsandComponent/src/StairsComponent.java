import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class StairsComponent extends JComponent
{  

   private static final long serialVersionUID = 1L;

   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
      Stairs flight1 = new Stairs(20, 10);
      flight1.draw(g2);
      
      Stairs flight2 = new Stairs(100, 30);
      flight2.draw(g2);
      
      Stairs flight3 = new Stairs(200, 50);
      flight3.draw(g2);
      
      Stairs flight4 = new Stairs(300, 70);
      flight4.draw(g2);
   }
}