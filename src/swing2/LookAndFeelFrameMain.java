

package swing2;

import javax.swing.JFrame;


public class LookAndFeelFrameMain {
    public static void main(String[] srgs){
        LookAndFeelFrame lf = new LookAndFeelFrame();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lf.setLocationRelativeTo(null);
        lf.setSize(400, 220);
        lf.setVisible(true);
    }
}
