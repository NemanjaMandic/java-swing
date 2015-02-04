
package swingjava;

import javax.swing.JFrame;


public class MouseDetailsFrameMain {
    public static void main(String args[]){
        MouseDetailsFrame mdf = new MouseDetailsFrame();
        mdf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mdf.setLocationRelativeTo(null);
        mdf.setSize(400, 150);
        mdf.setVisible(true);
    }
}
