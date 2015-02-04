
package swingjava;

import javax.swing.JFrame;

public class TextFieldFrameMain {
    public static void main(String[] args){
        TextFieldFrame tff = new TextFieldFrame();
        tff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tff.setSize(400, 160);
        tff.setLocationRelativeTo(null);
        tff.setVisible(true);
    } 
}
