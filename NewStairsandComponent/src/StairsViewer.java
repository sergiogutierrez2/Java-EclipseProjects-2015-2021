import javax.swing.JFrame;

public class StairsViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("Drawing");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      StairsComponent component = new StairsComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
