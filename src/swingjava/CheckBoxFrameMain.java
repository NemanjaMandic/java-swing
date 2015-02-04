
package swingjava;

import javax.swing.JFrame;

public class CheckBoxFrameMain {
    
    public static void main(String[] args){
        CheckBoxFrame cbf = new CheckBoxFrame();
        cbf.setSize(275, 100);
        cbf.setLocationRelativeTo(null);
        cbf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cbf.setVisible(true);
    }
}
