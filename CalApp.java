import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalApp implements ActionListener
{
    
    public CalApp ()
    { 
        JFrame frame = new JFrame();
        frame.setForeground(Color.WHITE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocation(new Point(10, 50));
            frame.setSize(new Dimension(300, 120));
            frame.setTitle("Arithmetic");
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



    public static void main (String[] args) 
    {
        CalApp ca = new CalApp (); 
    

        btn1.addActionListener(new ActionListener){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                btn1Event(e);
                
            }
        });
        
        
        
        btn2.addActionListener(new ActionListener){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                btn2Event(e);
                
            }
        });
        
        btn3.addActionListener(new ActionListener){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                btn3Event(e);
                
            }
        });
        
        btn4.addActionListener(new ActionListener){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                btn4Event(e);
                
            }
        });
        
        btn5.addActionListener(new ActionListener){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                btn5Event(e);
                
            }
        });
    
        btn6.addActionListener(new ActionListener){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                btn6Event(e);
                
            }
        });
        
        btn7.addActionListener(new ActionListener){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                btn7Event(e);
                
            }
        });
        
        btn8.addActionListener(new ActionListener){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                btn8Event(e);
                
            }
        });
        
        btn9.addActionListener(new ActionListener){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                btn9Event(e);
                
            }
        });
        
        btn0.addActionListener(new ActionListener){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                btn0Event(e);
                
            }
        });
        
        
        
        btno1.addActionListener(new ActionListener){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                btno1Event(e);
                
            }
        });
        
        btno2.addActionListener(new ActionListener){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                btno2Event(e);
                
            }
        });
        
        btno3.addActionListener(new ActionListener){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                btno3Event(e);
                
            }
        });
        
        btno4.addActionListener(new ActionListener){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                btno4Event(e);
                
            }
        });
        
        btno5.addActionListener(new ActionListener){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                btno5Event(e);
                
            }
        });
        
        btnc.addActionListener(new ActionListener){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                btncEvent(e);
                
            }
        });  

        
        btnn1.addActionListener(new ActionListener
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                 btnn1Event(e);
                
            }
         
        });
        
        btnn2.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                 btnn2Event(e);
                
            }
         
        });
        
        
        
        btnn3.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                 btnn3Event(e);
                
            }
         
        });
      @Override
    // // public void actionPerformed (ActionEvent event)
    // // { 
    // //     String val == event.getActionCommand(); 
    // //     if(event =="1")
    // //         txtfield

  
  }  //      throw new UnsupportedOperationException("Not supported yet.");
    //}
}
    
