
package swingjava;

import javax.swing.JFrame;


public class TextAreaFrameMain {
    public static void main(String[] args){
        TextAreaFrame tf = new TextAreaFrame();
        tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf.setLocationRelativeTo(null);
        tf.setSize(425, 200);
        tf.setVisible(true);
    }
}
