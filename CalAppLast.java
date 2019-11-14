import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalAppLast implements ActionListener
{   
    //JButton button,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18,button19;
    
     CalAppLast ()
    { 
            JFrame frame = new JFrame("");
            frame.setForeground(Color.WHITE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocation(new Point(10, 50));
            frame.setSize(new Dimension(300, 120));
            frame.setTitle("HP Calc");
            frame.setBounds(100,50,296,419);
            frame.setResizable(false);
            //frame.setLayout(new GridLayout());
            frame.setLayout(new BorderLayout()); 

            JPanel grid = new JPanel();
            grid.setLayout(new GridLayout(5,4));
            frame.add(grid, BorderLayout.CENTER);
            frame.setVisible(true);

             JTextField txtfield = new JTextField(10);
             frame.add(txtfield,BorderLayout.NORTH);

             JButton button = new JButton("CE");
             grid.add(button);
             button.addActionListener(this);
             JButton button5 = new JButton("C");
             grid.add(button5);
             button5.addActionListener(this);
             JButton button19 = new JButton("X");
             grid.add(button19);
             button19.addActionListener(this);
             JButton button14 = new JButton("/");
             grid.add(button14);
             button14.addActionListener(this);

             JButton button1 = new JButton("7");
             grid.add(button1);
             button1.addActionListener(this);
             JButton button6 = new JButton("8");
             grid.add(button6);
             button6.addActionListener(this);
             JButton button10 = new JButton("9");
             grid.add(button10);
             button10.addActionListener(this);
             JButton button15 = new JButton("*");
             button15.addActionListener(this);
             grid.add(button15);

             JButton button2 = new JButton("4");
             grid.add(button2);
             button2.addActionListener(this);
             JButton button7 = new JButton("5");
             grid.add(button7);
             button7.addActionListener(this);
             JButton button11 = new JButton("6");
             grid.add(button11);
             button11.addActionListener(this);
             JButton button16 = new JButton("-");
             grid.add(button16);
             button16.addActionListener(this);

             JButton button3 = new JButton("1");
             grid.add(button3);
             button3.addActionListener(this);
             JButton button8 = new JButton("2");
             grid.add(button8);
             button8.addActionListener(this);
             JButton button12 = new JButton("3");
             grid.add(button12);
             button12.addActionListener(this);
             JButton button17 = new JButton("+");
             grid.add(button17);
             button17.addActionListener(this);

             JButton button4 = new JButton("+/-");
             grid.add(button4);
             button4.addActionListener(this);
             JButton button9 = new JButton("0");
             grid.add(button9);
             button9.addActionListener(this);
             JButton button13 = new JButton(".");
             grid.add(button13);
             button13.addActionListener(this);
             JButton button18 = new JButton("=");
             grid.add(button18);
             button18.addActionListener(this); 
    } 
     public void actionPerformed(ActionEvent e){
        //System.out.println(e.toString());
    }
    public static void main (String[] args) 
    {       
            
         
        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(6,4));

        CalAppLast ca = new CalAppLast ();
    }  
}
    
