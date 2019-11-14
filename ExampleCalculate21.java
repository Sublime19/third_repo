import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleCalculate21 implements ActionListener{
    JTextField fval,sval,resul;
    JButton buttonD, buttonE;
   
    public ExampleCalculate21()
    {
        //this is to create the frame container
        JFrame frame = new JFrame();
        frame.setForeground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(new Point(10, 50));
        frame.setSize(new Dimension(300, 120));
        frame.setTitle("Simple Addition");
        frame.setVisible(true); 
        //frame.pack();
        frame.setLayout(new FlowLayout());
            //to create the components on the fram

        JPanel txtpanel = new JPanel();
        //txtpanel.setLayout(new BorderLayout());
        JTextField txtfield = new JTextField();


        fval = new JTextField(10);
        frame.add(fval);


        JPanel txtpanel1 = new JPanel();
        JLabel label = new JLabel();    
        frame.add(txtpanel1);
       // txtpanel1.add(label);


        JButton buttonS = new JButton("-");
        txtpanel1.add(buttonS);
        buttonS.addActionListener(this);
       // JLabel jpls4 = new JLabel("");
       // txtpanel1.add(buttonS, FlowLayout.SOUTH);


        JButton buttonA = new JButton("+");
        txtpanel1.add(buttonA);
        buttonA.addActionListener(this);
       // JLabel jpls8 = new JLabel("");
       // txtpanel1.add(buttonA, FlowLayout.NORTH);


        JButton buttonM = new JButton("/");
        txtpanel1.add(buttonM);
        buttonM.addActionListener(this);
        //JLabel jpls2 = new JLabel("");
        //txtpanel1.add(buttonM,  FlowLayout.EAST);


        JButton buttonD = new JButton("*");
        txtpanel1.add(buttonD);
        buttonD.addActionListener(this);
        //JLabel jpls6 = new JLabel("");
        //txtpanel1.add(buttonD, FlowLayout.WEST);

        sval = new JTextField(10);
        frame.add(sval);    


        buttonE = new JButton("=");
        frame.add(buttonE);
        buttonE.addActionListener(this); 
        JLabel jpls = new JLabel("");
        //txtpanel1.add(jpls, FlowLayout.CENTER);

        resul = new JTextField(10);
        frame.add(resul);
    
        
    }
    public static void main(String[] args) {
        ExampleCalculate21 ec = new ExampleCalculate21();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int fval2 = Integer.parseInt(fval.getText());
        int sval2 = Integer.parseInt(sval.getText());

        //if ()
        //{}
        //int result = fval2 + sval2;
        // resul.setText(result+"");
        throw new UnsupportedOperationException("Not supported yet.");
    }
}