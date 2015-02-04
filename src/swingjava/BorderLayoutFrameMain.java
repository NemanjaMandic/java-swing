

package swingjava;

import javax.swing.JFrame;


public class BorderLayoutFrameMain {
   public static void main(String[] args){
        BorderLayoutFrame bf = new BorderLayoutFrame();
        bf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bf.setLocationRelativeTo(null);
        bf.setSize(300, 200);
        bf.setVisible(true);
   }
    
}
