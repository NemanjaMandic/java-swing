

package swingjava;

 import java.awt.Color;
 import java.awt.BorderLayout;
 import java.awt.event.MouseListener;
 import java.awt.event.MouseMotionListener;
 import java.awt.event.MouseEvent;
 import javax.swing.JFrame;
 import javax.swing.JLabel;
 import javax.swing.JPanel;

public class MouseTrackerFrame extends JFrame{
   
    private JPanel mousePanel;
    private JLabel statusBar;
    
    public MouseTrackerFrame(){
        super("Mouse Events");
        
        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER);
        
        statusBar = new JLabel("Mouse outside JPanel");
        add(statusBar, BorderLayout.SOUTH);
        
        MouseHandler han = new MouseHandler();
        mousePanel.addMouseListener(han);
        mousePanel.addMouseMotionListener(han);
    }
    private class MouseHandler implements MouseListener,
            MouseMotionListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            statusBar.setText(String.format("Clicked at [%d, %d]", e.getX(),e.getY()));
        }

        @Override
        public void mousePressed(MouseEvent e) {
           statusBar.setText(String.format("Pressed at [%d, %d]", e.getX(), e.getY()));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
           statusBar.setText(String.format("Released at [%d, %d]", e.getX(),e.getY()));
        }

        @Override
        public void mouseEntered(MouseEvent e) {
           statusBar.setText(String.format("Entered at [%d, %d]", e.getX(), e.getY()));
           mousePanel.setBackground(Color.GREEN);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            statusBar.setText("Mouse outside JPanel");
            mousePanel.setBackground(Color.WHITE);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
           statusBar.setText(String.format("Dragged at [%d, %d]", e.getX(), e.getY()));
        }

        @Override
        public void mouseMoved(MouseEvent e) {
           statusBar.setText(String.format("Moved at [%d, %d]", e.getX(),e.getY()));
        }
        
    }
}
