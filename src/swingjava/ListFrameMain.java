

package swingjava;

import javax.swing.JFrame;

public class ListFrameMain {
    public static void main(String[] args){
        
        ListFrame lf = new ListFrame();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lf.setLocationRelativeTo(null);
        lf.setSize(350, 150);
        lf.setVisible(true);
    }
}
