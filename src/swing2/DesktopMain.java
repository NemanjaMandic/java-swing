

package swing2;

import javax.swing.JFrame;


public class DesktopMain {
    public static void main(String[] args){
        DesktopFrame df = new DesktopFrame();
        df.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        df.setLocationRelativeTo(null);
        df.setSize(600, 500);
        df.setVisible(true);
    }
}
