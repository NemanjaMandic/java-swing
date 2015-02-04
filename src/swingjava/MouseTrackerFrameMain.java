

package swingjava;

import javax.swing.JFrame;

public class MouseTrackerFrameMain {
    public static void main(String[] args){
        MouseTrackerFrame mtf = new MouseTrackerFrame();
        mtf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mtf.setLocationRelativeTo(null);
        mtf.setSize(300, 200);
        mtf.setVisible(true);
    }
}
