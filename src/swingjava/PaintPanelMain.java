
package swingjava;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PaintPanelMain {
   public static void main(String[] args){
       JFrame application = new JFrame("A simple paint program");
       PaintPanel pp = new PaintPanel();
       
       application.add(pp, BorderLayout.CENTER);
       
       application.add(new JLabel("Drag the mouse to draw"),BorderLayout.SOUTH);
       application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       application.setLocationRelativeTo(null);
       application.setSize(400, 400);
       application.setVisible(true);
   } 
}
