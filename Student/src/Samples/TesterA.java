package Samples;

import javax.swing.SwingUtilities;

public class TesterA
{
    public static void main(String[] args) {           
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {                                           
                ModelA model = new ModelA(0);
                ViewA view = new ViewA("-"); 
                ControllerA controller = new ControllerA(model,view);
                controller.contol();
            }
        });  
    }
}