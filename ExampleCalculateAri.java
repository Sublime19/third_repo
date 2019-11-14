import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ExampleCalculateAri implements ActionListener{
    JTextField fval, sval,resul;
    JButton button,button1,button2,button4;
   
    public ExampleCalculateAri()
    {
        //this is to create the frame container
        JFrame frame = new JFrame();
	frame.setForeground(Color.WHITE);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocation(new Point(10, 50));
	frame.setSize(new Dimension(300, 120));
	frame.setTitle("Simple Arithmetic");
	frame.setVisible(true);
    frame.setLayout(new BorderLayout());
    
        //to create the components on the frame

        JPanel txtpanel = new JPanel();
        txtpanel.setLayout(new FlowLayout());

        JTextField txtfield = new JTextField();


        // Addition Component - 

        fval = new JTextField(10);
        txtpanel.add(fval);
        JLabel jpls = new JLabel("+");
        txtpanel.add(jpls, BorderLayout.CENTER); 

        sval = new JTextField(10);
        txtpanel.add(sval);
        JLabel jeq = new JLabel("=");
        txtpanel.add(jeq);

        resul = new JTextField(10);
        txtpanel.add(resul);

        button = new JButton("Add");
        txtpanel.add(button);
        button.addActionListener(this);   

        // Subtraction Component
        
        //fval = new JTextField(10);
        //frame.add(fval);
        JLabel jpls1 = new JLabel("-");
        txtpanel.add(jpls1, BorderLayout.SOUTH);
        //sval = new JTextField(10);
        //frame.add(sval);
        //JLabel jeq1 = new JLabel("=");
        //frame.add(jeq1);
        //resul = new JTextField(10);
        //frame.add(resul);
        button1 = new JButton("Sub");
        txtpanel.add(button1);
        button1.addActionListener(this);   



        // Multiplication Component

        //fval = new JTextField(10);
        //frame.add(fval);
        JLabel jpls2 = new JLabel("*");
        txtpanel.add(jpls2, BorderLayout.NORTH);
        //sval = new JTextField(10);
        //frame.add(sval);
        //JLabel jeq2 = new JLabel("=");
        //frame.add(jeq2);
        //resul = new JTextField(10);
        //frame.add(resul);
        button2 = new JButton("Multiply");
        txtpanel.add(button2);
        button2.addActionListener(this);   




        // Division Component

        //fval = new JTextField(10);
        //frame.add(fval);
        JLabel jpls4 = new JLabel("/");
        txtpanel.add(jpls4, BorderLayout.EAST);
        //sval = new JTextField(10);
        //frame.add(sval);
        //JLabel jeq4 = new JLabel("=");
        //frame.add(jeq4);
        //resul = new JTextField(10);
        //frame.add(resul);
        button4 = new JButton("Div");
        txtpanel.add(button4);
        button4.addActionListener(this);   
    }
    public static void main(String[] args) {
        ExampleCalculateAri ec = new ExampleCalculateAri();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int fval2 = Integer.parseInt(fval.getText());
        int sval2 = Integer.parseInt(sval.getText());
        int result = fval2 - sval2;
        resul.setText(result+"");
        throw new UnsupportedOperationException("Not supported yet.");
        
    }
}