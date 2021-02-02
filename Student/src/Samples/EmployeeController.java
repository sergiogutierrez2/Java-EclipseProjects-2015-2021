package Samples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class EmployeeController implements ActionListener {

    private EmployeeView view;
    private EmployeeModel model;

    public EmployeeController(EmployeeView v, EmployeeModel m) {
        view = v;
        model = m;
        view.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.setName(model.getNextName());
    }
}