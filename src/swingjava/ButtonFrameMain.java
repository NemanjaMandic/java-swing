

package swingjava;

import javax.swing.JFrame;

public class ButtonFrameMain {
    public static void main(String[] args){
        
        ButtonFrame bf = new ButtonFrame();
        bf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bf.setLocationRelativeTo(null);
        bf.setSize(275, 110);
        bf.setVisible(true);
    }
}
