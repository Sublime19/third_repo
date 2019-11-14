
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;    
import javax.swing.JTextField;
import java.awt.*;

public class NCalculator {

	
	static JButton btn1 = new JButton("1");
	static JButton btn2 = new JButton("2");
	static JButton btn3 = new JButton("3");
	static JButton btn4 = new JButton("4");
	static JButton btn5 = new JButton("5");
	static JButton btn6 = new JButton("6");
	static JButton btn7 = new JButton("7");
	static JButton btn8 = new JButton("8");
	static JButton btn9 = new JButton("9");
	static JButton btn0 = new JButton("0");
	static JButton btno1 = new JButton(" + ");
	static JButton btno2 = new JButton(" - ");
	static JButton btno3 = new JButton(" ÷ ");
	static JButton btno4 = new JButton(" × ");
	static JButton btno5 = new JButton("=");
	static JButton btnc = new JButton("AC");
	
	static JButton btnn1 = new JButton("DEL");
	static JButton btnn2 = new JButton(".");
	static JButton btnn3 = new JButton("%");
	

	
	static JTextField text = new JTextField(" ");
	
	static StringBuffer br = new StringBuffer();
	static StringBuffer br1 = new StringBuffer();
	
	
	static int number1;
	static int number2;
	static int result;
	static String no1;
	static String no2;
	static JButton bx;
	static String ans; 
	static Font f2;
	static String str;
	static String newstr;
	
	static float  n2;
	
	static int len;
	static int newlen;
	static int t1len;
  
	
  public static void main(String args[])
  {
     	  
	  JFrame frame = new JFrame("Calculator");
	   frame.setVisible(true);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //JFrame
	   frame.setBounds(100,50,296,419);
	   frame.setResizable(false);
	  
	 
	   JPanel panel = new JPanel();
	   panel.setBounds(0,0,290,391);
	   panel.setLayout(null);
	   panel.revalidate();
	   
	    panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		panel.add(btn7);
		panel.add(btn8);
		panel.add(btn9);
		panel.add(btn0);
		panel.add(btno5);
	    panel.add(btno1);
	    panel.add(btno2);
	    panel.add(btno3);
	    panel.add(btno4);
	    panel.add(text);
	    panel.add(btnc);
	    
		panel.add(btnn1);
		panel.add(btnn2);
		panel.add(btnn3);
	   

	     btnc.setBounds(1,100,72,58);
		 btnn1.setBounds(73,100,72,58);
		 btnn3.setBounds(145,100,72,58);
		
		 btn4.setBounds(1,216,72,58);
		 btn5.setBounds(73,216,72,58);
		 btn6.setBounds(145,216,72,58);
		
		 btn7.setBounds(1,158,72,58);
		 btn8.setBounds(73,158,72,58);
		 btn9.setBounds(145,158,72,58);
		
		 btn1.setBounds(1,274,72,58);
		 btn3.setBounds(145,274,72,58);
		
		 btn0.setBounds(1,332,144,58);
		 btnn2.setBounds(145,332,72,58);
		 btno1.setBounds(217,100,72,58);
		
		 btn2.setBounds(73,274,72,58);
		
		 btno2.setBounds(217,158,72,58);
		 btno4.setBounds(217,216,72,58);
		 btno3.setBounds(217,274,72,58);
		 btno5.setBounds(217,332,72,58);
		
		
		
		// btn1.setBackground(Color.WHITE);
		 // btn2.setBackground(Color.WHITE);
		 // btn3.setBackground(Color.WHITE);
		 // btn4.setBackground(Color.WHITE);
		 // btn5.setBackground(Color.WHITE);
		 // btn6.setBackground(Color.WHITE);
		 // btn7.setBackground(Color.WHITE);
		 // btn8.setBackground(Color.WHITE);
		 // btn9.setBackground(Color.WHITE);
		 // btn0.setBackground(Color.WHITE);
		
		 //btnn3.setBackground(Color.WHITE);
		 //btnc.setBackground(Color.WHITE);
		
		 //btno1.setBackground(Color.ORANGE);
		 //btno2.setBackground(Color.ORANGE);
		 //btno3.setBackground(Color.ORANGE);
		 //btno4.setBackground(Color.ORANGE);
		
		 // btnn1.setBackground(Color.WHITE);
		 // btnn2.setBackground(Color.WHITE);
		 //btno5.setBackground(Color.ORANGE);
		
		 text.setHorizontalAlignment(text.RIGHT);
		
		
		
		
		btn1.setBorder(null);
		btn2.setBorder(null);
		btn3.setBorder(null);
		btn4.setBorder(null);
		btn5.setBorder(null);
		btn6.setBorder(null);
		btn7.setBorder(null);
		btn8.setBorder(null);
		btn9.setBorder(null);
		btn0.setBorder(null);
		btnc.setBorder(null);
		btno1.setBorder(null);
		btno2.setBorder(null);
		btno3.setBorder(null);
		btno4.setBorder(null);
		btno5.setBorder(null);
		btnn1.setBorder(null);
		btnn2.setBorder(null);
		btnn3.setBorder(null);
		btnn3.setBorder(null);
		
		text.setBorder(null);

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 btnn3Event(e);
		
		c.add(panel);
		
		
	
  }

    public static void btn1Event(ActionEvent e)
    {
    	
    	
    	
    	
    	text.setText(text.getText()+"1");
    	
    	String n1 = text.getText();
    	
    	
    	n2 = Float.parseFloat(n1);
    

    	
    }
    
    public static void btn2Event(ActionEvent e)
    {
    	
    	text.setText(text.getText()+"2");

    	
    }
    
    public static void btn3Event(ActionEvent e)
    {
    	
    	text.setText(text.getText()+"3");

    	
    }
    
    public static void btn4Event(ActionEvent e)
    {
    	
    	text.setText(text.getText()+"4");

    }	
    
    public static void btn5Event(ActionEvent e)
    {
    	
    	text.setText(text.getText()+"5");

    	
    }
    
    public static void btn6Event(ActionEvent e)
    {
    	
    	text.setText(text.getText()+"6");

    }	
    
    public static void btn7Event(ActionEvent e)
    {
    	
    	text.setText(text.getText()+"7");

    	
    }
    
    public static void btn8Event(ActionEvent e)
    {
    	
    	text.setText(text.getText()+"8");

    	
    }
    
    public static void btn9Event(ActionEvent e)
    {
    	
    	text.setText(text.getText()+"9");

    	
    }
    
    public static void btn0Event(ActionEvent e)
    {
        String zero = text.getText();
        
    	if(zero.equals("0"))
    	{
    		text.setText("0");
    	}
    	else
    	{
    		
    		text.setText(text.getText()+"0");
    	}
    	

    	
    }
    
    public static void btno1Event(ActionEvent e)
    {
    	try
    	{
    	String no1=text.getText();
        
    	
    	
    	if(Float.parseFloat(no1)==n2)
    	{
    		text.setText(no1+"+");
    	}
    		
    	
    	
        number1=Integer.parseInt(no1);
  	
       	text.setText(number1+"+");
       	newstr= text.getText();	

       	br1 = new StringBuffer(newstr);
       	
       	t1len = newstr.length();
       	
 	
     	bx=(JButton)e.getSource();
    	}
    	catch(NumberFormatException ex1)
    	{}
    
    }
    
    public static void btno2Event(ActionEvent e)
    {
        try
        {
    	String no1=text.getText();
        
    	number1=Integer.parseInt(no1);
  	
       	text.setText(number1+"-");
       	newstr= text.getText();	

       	br1 = new StringBuffer(newstr);
       	
       	t1len = newstr.length();
       	
 	
     	bx=(JButton)e.getSource();
        }
        catch(NumberFormatException ex1)
        {}
    	
    }
    
    
    public static void btno3Event(ActionEvent e)
    {
    	try
    	{
            String no1=text.getText();
   
            number1=Integer.parseInt(no1);
  	
       	text.setText(number1+"÷");
       	newstr= text.getText();	

       	br1 = new StringBuffer(newstr);
       	
       	t1len = newstr.length();
       	
 	
     	bx=(JButton)e.getSource();
    	}
    	catch(NumberFormatException ex1)
        {}

    	
    }
    
    public static void btno4Event(ActionEvent e)
    {
    	try
    	{
    	String no1=text.getText();
      
    	number1=Integer.parseInt(no1);
   	
        	text.setText(number1+"×");
        	newstr= text.getText();	

        	br1 = new StringBuffer(newstr);
        	
        	t1len = newstr.length();
        	
  	
      	bx=(JButton)e.getSource();
    	}
    	catch(NumberFormatException ex1)
        {}
 
    }
    
    public static void btnn3Event(ActionEvent e)
    {
       try
       {
     	 String no1=text.getText();
       
     	number1=Integer.parseInt(no1);
     	
       	text.setText(number1+"%");
       	newstr= text.getText();	

       	br1 = new StringBuffer(newstr);
       	
       	t1len = newstr.length();
       	
 	
     	bx=(JButton)e.getSource();
       }
       catch(NumberFormatException ex1)
       {}
    }
    
    
    public static void btnn1Event(ActionEvent e)
    { 
    	try
    	{
    	str = text.getText();
    	
    	br = new StringBuffer(str);
    	
    	len = str.length();
        
    	newlen=len-1;
        
    	br.setLength(newlen);
    	
    	String str2=br.toString();
    	
    	text.setText(str2);
    	}
    	catch(StringIndexOutOfBoundsException del)
    	{}
        
        
    }
    
    public static void btnn2Event(ActionEvent e)
    {
    	try
    	{
    	String no1=text.getText();
    	
    	number1=Integer.parseInt(no1);
    	
         	text.setText(number1+".");
         	bx=(JButton)e.getSource();
         	
         	String nos= text.getText();
    	}
    	catch(NumberFormatException dot)
    	{}
         	
       
    }
    
    public static void btno5Event(ActionEvent e)
    {
    	try
    	{
    		
    	
    	String str2 =br1.toString();

     	no2=text.getText();
     	
     	int newlen2 = no2.length();
     	
     
     	String str3 = no2.substring(t1len,newlen2);
     	
     	number2=Integer.parseInt(str3);
     	
     			
     	
     	if(bx==btno1)
     	{
     		result=number1+number2;
       	 ans=Integer.toString(result);
         	 text.setText(String.valueOf("= "+ans));
     	}
     	
     	else if(bx==btno2)
     	{
     		result=number1-number2;
     		ans=Double.toString(result);
            	 text.setText(String.valueOf("= "+ans));
     	}
     	 
     	else if(bx==btno4)
     	{
     		result=number1*number2;
     		ans=Double.toString(result);
            	 text.setText(String.valueOf("= "+ans));
     	} 
     	else if(bx==btno3)
     	{
     		if(number2==0)
     		{
     			
     			text.setText("INVALID");
     			
     		}
     		else
     		{
     			result=number1/number2;

     			ans=Double.toString(result);
           	    text.setText(String.valueOf("= "+ans));
     			
     		}
   	
     	} 
     	else if(bx==btnn3)
 		{
 			result=number1%number2;

 			ans=Double.toString(result);
       	    text.setText(String.valueOf("= "+ans));
 			
 		}
    	}
    	catch(NumberFormatException ex)
    	{}
     	
     	
    }
    
    public static void btncEvent(ActionEvent e)
     {
    	
     	text.setText("");
    
    	
     }
    
 
}
