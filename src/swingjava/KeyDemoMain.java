

package swingjava;

import javax.swing.JFrame;


public class KeyDemoMain {
    public static void main(String[] args){
        KeyDemo kd = new KeyDemo();
        kd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kd.setLocationRelativeTo(null);
        kd.setSize(350, 200);
        kd.setVisible(true);
    }
}
