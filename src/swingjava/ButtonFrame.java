
package swingjava;

 import java.awt.FlowLayout;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
 import javax.swing.JFrame;
 import javax.swing.JButton;
 import javax.swing.Icon;
 import javax.swing.ImageIcon;
 import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame{
   private JButton plainButt;
   private JButton fancyButt;
   
   // ButtonFrame adds JButtons to JFrame
   public ButtonFrame(){
       super("Testing Buttons");
       setLayout(new FlowLayout());
       
       plainButt = new JButton("Plain Button");
       add(plainButt);
       
       Icon bug1 = new ImageIcon(getClass().getResource("rails.png"));
       Icon bug2 = new ImageIcon(getClass().getResource("apocalyptic-sunglasses.jpg"));
       
       fancyButt = new JButton("Fancy Button", bug1);
       fancyButt.setRolloverIcon(bug2); // set rollover image
       add(fancyButt);
       
       ButtonHandler handler = new ButtonHandler();
       fancyButt.addActionListener(handler);
       plainButt.addActionListener(handler);
       
   }
   private class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", e.getActionCommand()));
        }
       
   }
}
