

package swingjava;

import java.awt.Color;
 import java.awt.event.KeyListener;
 import java.awt.event.KeyEvent;
 import javax.swing.JFrame;
 import javax.swing.JTextArea;

public class KeyDemo extends JFrame implements KeyListener{
    
    //lines of textarea
    private String line1 = "";
    private String line2 = "";
    private String line3 = "";
    private JTextArea textArea; // textarea to display output
    
    public KeyDemo(){
        super("Keystroke events");
        
        textArea = new JTextArea(10, 15);
        textArea.setText("Press any key on the keyboard...");
        textArea.setEnabled(false); // disable textarea
        textArea.setDisabledTextColor(Color.BLACK);
        add(textArea);
        addKeyListener(this); // allow frame to process key events
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        line1 = String.format("Key typed: %s", e.getKeyChar());
         setLines2and3(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
      line1 = String.format("Ley pressed: %s", KeyEvent.getKeyText(e.getKeyCode()));
      setLines2and3(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
       line1 = String.format("Key released: %s", 
               KeyEvent.getKeyText(e.getKeyCode()));
       setLines2and3(e);
    }
    // set second and third lines of output
    private void setLines2and3(KeyEvent e){
       line2 = String.format("This key is %san action key", 
               e.isActionKey() ? "" : "not");
       String temp = KeyEvent.getKeyModifiersText(e.getModifiers());
       
       line3 = String.format("Modifier keys pressed: %s", (temp.equals("")? "none" : temp));
       
       textArea.setText(String.format("%s\n%s\n%s\n", line1,line2,line3));
    }
}
