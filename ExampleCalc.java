import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Swing {

	public static void main(String[] args){

		JFrame frame = new JFrame("ExampleCalc");
		frame.setVisible(true);
		frame.setSize(300, 120);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JPanel txtpanel = new JPanel();
		JTextField txtfield = new JTextField();
		frame.add(txtpanel);
		txtpanel.add(txtfield); //


		JPanel txtpanel1 = new JPanel();
		JLabel label = new JLabel();	
		frame.add(txtpanel1);
		txtpanel1.add(label);

		JButton buttonS = new JButton("-");
		txtpanel1.add(buttonS);


		JButton buttonA = new JButton("+");
		txtpanel1.add(buttonA);


		JButton buttonM = new JButton("*");
		txtpanel1.add(buttonM);


		JButton buttonD = new JButton("/");
		txtpanel1.add(buttonD);




	}
}