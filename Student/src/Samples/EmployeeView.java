package Samples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EmployeeView {

    private JFrame win;
    private JPanel frm;
    private JLabel name;
    private JButton action;

    public EmployeeView() {

        win = new JFrame("Employee Form");
        frm = new JPanel();
        name = new JLabel("Empty");
        action = new JButton("Next Employee");

        frm.setLayout(new BoxLayout(frm, BoxLayout.Y_AXIS));
        frm.add(name);
        frm.add(action);
        win.add(frm);
    }

    public void setName(String name) {
        this.name.setText(name);
    }

    public void setController(ActionListener cntlr) {
        action.addActionListener(cntlr);
    }

    public void open() {
        win.setSize(300, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}