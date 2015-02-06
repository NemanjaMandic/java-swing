

package swing2;

import java.awt.BorderLayout;
 import java.awt.Dimension;
 import java.awt.Graphics;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
 import java.util.Random;
 import javax.swing.JFrame;
 import javax.swing.JDesktopPane;
 import javax.swing.JMenuBar;
 import javax.swing.JMenu;
 import javax.swing.JMenuItem;
 import javax.swing.JInternalFrame;
 import javax.swing.JPanel;
 import javax.swing.ImageIcon;

public class DesktopFrame extends JFrame{
   
    private JDesktopPane theDesktop;
    
    public DesktopFrame(){
         super("JDesktop pane");
         
         JMenuBar bar = new JMenuBar(); //create menu bar
         JMenu addMenu = new JMenu("Add"); //create Add menu
         JMenuItem newFrame = new JMenuItem("Internal Frame");
         
         addMenu.add(newFrame); //add new frame item to add menu
         bar.add(addMenu); // add Add menu to menu bar
         setJMenuBar(bar); // set menu bar for this application
         
         theDesktop = new JDesktopPane(); //create desktop pane
         add(theDesktop); //add desktop pane to frame
         
         newFrame.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                JInternalFrame frame = new JInternalFrame("Internal frame",
                true, true, true, true);
                
                MyJPanel panel = new MyJPanel(); //create new panel
                frame.add(panel, BorderLayout.CENTER);
                frame.pack();
                
                theDesktop.add(frame); //attach internal frame
                frame.setVisible(true);
             }
         });
                 
    }
    
}
