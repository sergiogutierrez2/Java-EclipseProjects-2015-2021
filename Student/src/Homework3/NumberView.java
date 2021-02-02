package Homework3;

import javax.swing.*;
import java.awt.*;

public class NumberView extends JFrame {
    Model model;

    public NumberView(int n1, int n2, int n3, Model model) {

        // NumberView -> Model -> GraphView
        this.model = model;

        // setLayout(new GridLayout(4,1));

        add(new JLabel("Red"));
        JTextField redNumber = new JTextField(10);
        redNumber.setText(n1 + "");
        add(redNumber);

        add(new JLabel("Orange"));
        JTextField orangeNumber = new JTextField(10);
        orangeNumber.setText(n2 + "");
        add(orangeNumber);

        add(new JLabel("Yellow"));
        JTextField yellowNumber = new JTextField(10);
        yellowNumber.setText(n3 + "");
        add(yellowNumber);

        JButton update = new JButton("Update");
        add(update);
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        update.addActionListener(event -> {
            int number1 = Integer.parseInt(redNumber.getText());
            int number2 = Integer.parseInt(orangeNumber.getText());
            int number3 = Integer.parseInt(yellowNumber.getText());
            model.updateValues(number1, number2, number3);
        });


    }
}

