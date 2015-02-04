
package swingjava;

import javax.swing.JFrame;

public class FlowLayoutFrameMain {
    public static void main(String[] args){
        FlowLayoutFrame f = new FlowLayoutFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setSize(300, 100);
        f.setVisible(true);
    }
}
