
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JBarzahlungsDialogUI{

	//public static void main(String[] args){

JPanel _barzahlPanel;
JFrame _barzahlFrame;

String _barzahlungseingabe;
int _barzahlungseingabeAlsInt;

JTextField _betrag; 


public JBarzahlungsDialogUI()
{   
    _barzahlPanel = new JPanel();
    _barzahlFrame = new JFrame();
    setPanelUi();
    _barzahlFrame.add(_barzahlPanel);
    _barzahlungseingabe = JOptionPane.showInputDialog(_barzahlFrame, "Betrag, den man dir gegeben hat, eingeben!", "Wert der Barzahlung");
}

//to get the String as Int, so that I can calculate the rest money later
public void getBareingabeAlsInt()
{
    _barzahlungseingabeAlsInt = Integer.valueOf(JOptionPane.showInputDialog(_barzahlFrame, "Betrag, den man dir gegeben hat, eingeben!", "Wert der Barzahlung"));
}

//my trys to get something new added to the input dialog..
public void setPanelUi()
{
    _barzahlPanel.setLayout(new GridLayout());

    JLabel testLabel = new JLabel("supertoller Test");      
    _barzahlPanel.add(testLabel);       
    _barzahlPanel.add(new JButton("Geiler Testbutton"));
}
}
//}