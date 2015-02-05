

package swing2;

import javax.swing.JFrame;

public class MenuFrameMain {
    public static void main(String[] args){
        MenuFrame mf = new MenuFrame();
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mf.setLocationRelativeTo(null);
        mf.setSize(500,250);
        mf.setVisible(true);
    }
}
