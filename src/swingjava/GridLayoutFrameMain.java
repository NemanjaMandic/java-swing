

package swingjava;

import javax.swing.JFrame;


public class GridLayoutFrameMain {
    public static void main(String[] args){
        GridLayoutFrame gf = new GridLayoutFrame();
        gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gf.setLocationRelativeTo(null);
        gf.setSize(300, 200);
        gf.setVisible(true);
    }
}
