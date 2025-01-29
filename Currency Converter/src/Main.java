// Java program to convert from
// rupee to the dollar and vice-versa
// using Java Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main {

    // Function to convert from rupee
    // to the dollar and vice-versa
    // using Java Swing
    public static void converter()
    {


        JFrame f = new JFrame("CONVERTER");


        JLabel l1, l2;

        JTextField t1, t2;


        JButton b1, b2, b3;


        l1 = new JLabel("Peso:");
        l1.setBounds(30, 40, 70, 30);
        l2 = new JLabel("Dollars:");
        l2.setBounds(170, 40, 60, 30);


        t1 = new JTextField("0");
        t1.setBounds(80, 40, 50, 30);
        t2 = new JTextField("0");
        t2.setBounds(240, 40, 50, 30);


        b1 = new JButton("INR");
        b1.setBounds(50, 80, 60, 15);
        b2 = new JButton("Dollar");
        b2.setBounds(190, 80, 60, 15);
        b3 = new JButton("close");
        b3.setBounds(150, 150, 60, 30);

        // Adding action listener
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d
                        = Double.parseDouble(t1.getText());


                double d1 = (d / 65.25);


                String str1 = String.valueOf(d1);


                t2.setText(str1);
            }
        });


        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d2
                        = Double.parseDouble(t2.getText());

                // converting Dollars to rupees
                double d3 = (d2 * 65.25);

                // Getting the string value of the
                // calculated value
                String str2 = String.valueOf(d3);

                // Placing it in the text box
                t1.setText(str2);
            }
        });

        // Action listener to close the form
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });

        // Default method for closing the frame
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });


        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }

    // Driver code
    public static void main(String args[])
    {
        converter();
    }
}
