import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class OpescoCalculator2 implements ActionListener{
    private JTextField screen;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private JButton bc,broot,bmodule,bdivide,bmultiply,bminus,bplus,bequal,bdot,b0,bon,bdelete,bmips,bmr,bsquare;
    private JFrame myFrame;
    private JPanel mypanel;
   
    OpescoCalculator2(){
        myFrame =new JFrame("OPesco calculator");
        myFrame.setLayout(new BorderLayout());
        myFrame.setBackground(Color.MAGENTA);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLocationRelativeTo(null);
        
        screen = new JTextField(20);
        screen.setPreferredSize(new Dimension(20,30));
        screen.setEditable(false);
        screen.setBackground(Color.GREEN);
        myFrame.add(screen, BorderLayout.NORTH);
        mypanel = new JPanel();
        mypanel.setLayout(new GridLayout(6,4));
        bon = new JButton("ON"); mypanel.add(bon); bon.addActionListener(cal);
        bc = new JButton("C"); mypanel.add(bc); bc.addActionListener(cal);
        bdelete = new JButton("{"); mypanel.add(bdelete); bdelete.addActionListener(cal);
        bmips = new JButton("±"); mypanel.add(bmips); bmips.addActionListener(cal);
        bsquare = new JButton(" X2"); mypanel.add(bsquare); bsquare.addActionListener(cal);
        bmr = new JButton("MR"); mypanel.add(bmr); bmr.addActionListener(cal);     
        bmodule = new JButton("%"); mypanel.add(bmodule); bmodule.addActionListener(cal);
        broot = new JButton("√"); mypanel.add(broot); broot.addActionListener(cal);
        bdivide = new JButton("/"); mypanel.add(bdivide); bdivide.addActionListener(cal);
        b1 = new JButton("1");  mypanel.add(b1); b1.addActionListener(cal);
        b2 = new JButton("2"); mypanel.add(b2); b2.addActionListener(cal);
        b3 = new JButton("3"); mypanel.add(b3); b3.addActionListener(cal);
        bplus = new JButton("+");  mypanel.add(bplus); bplus.addActionListener(cal);
        b4 = new JButton("4");  mypanel.add(b4); b4.addActionListener(cal);
        b5 = new JButton("5"); mypanel.add(b5); b5.addActionListener(cal);
        b6 = new JButton("6"); mypanel.add(b6); b6.addActionListener(cal);
         bminus = new JButton("-"); mypanel.add(bminus); bminus.addActionListener(cal);
        b7 = new JButton("7");  mypanel.add(b7); b7.addActionListener(cal);
        b8 = new JButton("8"); mypanel.add(b8); b8.addActionListener(cal);
        b9 = new JButton("9"); mypanel.add(b9); b9.addActionListener(cal);
        bmultiply = new JButton("*"); mypanel.add(bmultiply); bmultiply.addActionListener(cal);
        b0 = new JButton("0");  mypanel.add(b0); b0.addActionListener(cal);
        bdot = new JButton("."); mypanel.add(bdot); bdot.addActionListener(cal);
        bequal = new JButton("="); mypanel.add(bequal); bequal.addActionListener(cal);
        myFrame.add(mypanel, BorderLayout.CENTER);
        myFrame.setVisible(true);
        myFrame.pack();
    }
    public void actionPerformed(ActionEvent e){
        System.out.println(e.toString());
    }
    public static void main(String[] args) {
        myFrame =new JFrame("OPesco calculator");
        myFrame.setLayout(new BorderLayout());
        myFrame.setBackground(Color.MAGENTA);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLocationRelativeTo(null);
        
        screen = new JTextField(20);
        screen.setPreferredSize(new Dimension(20,30));
        screen.setEditable(false);
        screen.setBackground(Color.GREEN);
        myFrame.add(screen, BorderLayout.NORTH);
        mypanel = new JPanel();
        mypanel.setLayout(new GridLayout(6,4));
        bon = new JButton("ON"); mypanel.add(bon); bon.addActionListener(cal);
        bc = new JButton("C"); mypanel.add(bc); bc.addActionListener(cal);
        bdelete = new JButton("{"); mypanel.add(bdelete); bdelete.addActionListener(cal);
        bmips = new JButton("±"); mypanel.add(bmips); bmips.addActionListener(cal);
        bsquare = new JButton(" X2"); mypanel.add(bsquare); bsquare.addActionListener(cal);
        bmr = new JButton("MR"); mypanel.add(bmr); bmr.addActionListener(cal);     
        bmodule = new JButton("%"); mypanel.add(bmodule); bmodule.addActionListener(cal);
        broot = new JButton("√"); mypanel.add(broot); broot.addActionListener(cal);
        bdivide = new JButton("/"); mypanel.add(bdivide); bdivide.addActionListener(cal);
        b1 = new JButton("1");  mypanel.add(b1); b1.addActionListener(cal);
        b2 = new JButton("2"); mypanel.add(b2); b2.addActionListener(cal);
        b3 = new JButton("3"); mypanel.add(b3); b3.addActionListener(cal);
        bplus = new JButton("+");  mypanel.add(bplus); bplus.addActionListener(cal);
        b4 = new JButton("4");  mypanel.add(b4); b4.addActionListener(cal);
        b5 = new JButton("5"); mypanel.add(b5); b5.addActionListener(cal);
        b6 = new JButton("6"); mypanel.add(b6); b6.addActionListener(cal);
        bminus = new JButton("-"); mypanel.add(bminus); bminus.addActionListener(cal);
        b7 = new JButton("7");  mypanel.add(b7); b7.addActionListener(cal);
        b8 = new JButton("8"); mypanel.add(b8); b8.addActionListener(cal);
        b9 = new JButton("9"); mypanel.add(b9); b9.addActionListener(cal);
        bmultiply = new JButton("*"); mypanel.add(bmultiply); bmultiply.addActionListener(cal);
        b0 = new JButton("0");  mypanel.add(b0); b0.addActionListener(cal);
        bdot = new JButton("."); mypanel.add(bdot); bdot.addActionListener(cal);
        bequal = new JButton("="); mypanel.add(bequal); bequal.addActionListener(cal);
        myFrame.add(mypanel, BorderLayout.CENTER);
        myFrame.setVisible(true);
        myFrame.pack();
        // TODO code application logic here
        OpescoCalculator2 ocal = new OpescoCalculator2();
    }
}
