/*Firstly I created a main JPanel with a BorderLayout. This JPanel will be split horizontally, the CENTRE component will be another JPanel containing the text areas and labels, and the SOUTH component will be a JPanel containing the buttons.

The JPanel that contains the text areas is given a GridLayout so that it can be easily split vertically, and is also given a hgap of 10 to add some spacing.

The left and right JPanels that are put into that are both the same. They have a BorderLayout with a  vgap to add spacing. The NORTH component is a JLabel and the CENTRE component is a JScrollPane containing a JTextArea.

Finally, the SOUTH component of the main JPanel is another JPanel which is given a BorderLayout again. Three JButtons are added with WEST, CENTRE and EAST attributes allocated accordingly.

The overall result looks like:*/




import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Exampledownload {

   	 {

       JFrame jFrame = new JFrame();
       jFrame.setTitle("Testing Title");
       jFrame.setLocationRelativeTo(null);

       JPanel mainPanel = new JPanel(new BorderLayout());
       mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

       JPanel listPanel = new JPanel(new GridLayout(0, 2, 10, 0));

       JPanel leftListPanel = new JPanel(new BorderLayout(0, 10));
       JLabel leftLabel = new JLabel("Left value:");
       JTextArea leftTextArea = new JTextArea("Hello Hello Hello\nTesting!\ntest");
       JScrollPane leftScrollPane = new JScrollPane(leftTextArea);
       leftListPanel.add(leftLabel, BorderLayout.NORTH);
       leftListPanel.add(leftScrollPane, BorderLayout.CENTER);

       JPanel rightListPanel = new JPanel(new BorderLayout(0, 10));
       JLabel rightLabel = new JLabel("Right value:");
       JTextArea rightTextArea = new JTextArea("Hello Hello Hello\nTesting!\ntest");
       JScrollPane rightScrollPane = new JScrollPane(rightTextArea);
       rightListPanel.add(rightLabel, BorderLayout.NORTH);
       rightListPanel.add(rightScrollPane, BorderLayout.CENTER);

       listPanel.add(leftListPanel);
       listPanel.add(rightListPanel);
       mainPanel.add(listPanel, BorderLayout.CENTER);

       JPanel buttonsPanel = new JPanel(new BorderLayout());
       buttonsPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
       buttonsPanel.add(new JButton("Do something"), BorderLayout.WEST);
       buttonsPanel.add(new JButton("Do something different"), BorderLayout.CENTER);
       buttonsPanel.add(new JButton("Do something even more different"), BorderLayout.EAST);
       mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

       jFrame.setContentPane(mainPanel);
       jFrame.pack();
       jFrame.setVisible(true);
   }
}