

package swingjava;

import javax.swing.JFrame;

public class PanelFrameMain {
    public static void main(String[] args){
        PanelFrame pf = new PanelFrame();
        pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pf.setLocationRelativeTo(null);
        pf.setSize(450, 250);
        pf.setVisible(true);
    }
}
