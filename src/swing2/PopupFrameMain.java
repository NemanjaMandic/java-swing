

package swing2;

import javax.swing.JFrame;


public class PopupFrameMain {
    public static void main(String[] args){
        PopupFrame pf = new PopupFrame();
        pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pf.setLocationRelativeTo(null);
        pf.setSize(400, 350);
        pf.setVisible(true);
    }
}
