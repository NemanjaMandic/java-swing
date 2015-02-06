

package swing2;

import javax.swing.JFrame;


public class JTabbedPaneFrameMain {
    public static void main(String[] args){
        JTabbedPaneFrame pf = new JTabbedPaneFrame();
        pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pf.setLocationRelativeTo(null);
        pf.setSize(300, 250);
        pf.setVisible(true);
    }
}
