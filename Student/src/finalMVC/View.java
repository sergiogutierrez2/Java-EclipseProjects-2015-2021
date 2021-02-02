package finalMVC;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class View extends JFrame {
    BlockingQueue<Message> queue;
    JTextField textField;
    JButton updateNameButton;
    JButton addClassButton;

    JLabel studentNameLabel;
    JLabel allClassesLabel;

   public View(BlockingQueue<Message> queue, String name, ArrayList<String> classes) {
        this.queue = queue;
 
        this.studentNameLabel = new JLabel(name);
        this.allClassesLabel = new JLabel(classes.toString());

        this.textField = new JTextField(10);
        this.updateNameButton = new JButton("updateName");
        this.addClassButton = new JButton("add a new class");

        updateNameButton.addActionListener( e -> {
       String value = textField.getText();
       try {
            queue.put(new NewNameMessage(value));
         }  catch (InterruptedException exception) {
         //do nothing
       }
   });

  addClassButton.addActionListener(e -> {
      String value = textField.getText();
       try {
              queue.put(new AddClassMessage(value));
           } catch (InterruptedException exception) {
              // do nothing
            }
      });

        this.add(studentNameLabel);
        this.add(allClassesLabel);
        this.add(textField);
        this.add(updateNameButton);
        this.add(addClassButton);

       this.setSize(500, 500);
       this.setLayout(new FlowLayout());
       this.setVisible(true);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

     public void updateNameInView(String value) {
     this.studentNameLabel.setText(value);
  }
 
     public void updateListOfClassesInView(ArrayList<String> classes) {
     this.allClassesLabel.setText(classes.toString());
    }
}