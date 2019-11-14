/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 *///
//package opescocalculator;

/**
 *
 * //@author Boluwatife
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ExampleCalculate implements ActionListener{
    JTextField fval, sval,resul;
    JButton button;
   
    public ExampleCalculate()
    {
        //this is to create the frame container
        JFrame frame = new JFrame();
	frame.setForeground(Color.WHITE);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocation(new Point(10, 50));
	frame.setSize(new Dimension(300, 120));
	frame.setTitle("Simple Addition");
	frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        //to create the components on the frame
        fval = new JTextField(10);
        frame.add(fval);
        JLabel jpls = new JLabel("+");
        frame.add(jpls);
        sval = new JTextField(10);
        frame.add(sval);
        JLabel jeq = new JLabel("=");
        frame.add(jeq);
        
        resul = new JTextField(10);
        frame.add(resul);
        button = new JButton("Add");
        frame.add(button);
        button.addActionListener(this);   
    }
    public static void main(String[] args) {
        ExampleCalculate ec = new ExampleCalculate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int fval2 = Integer.parseInt(fval.getText());
        int sval2 = Integer.parseInt(sval.getText());
        int result = fval2 + sval2;
        resul.setText(result+"");
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
