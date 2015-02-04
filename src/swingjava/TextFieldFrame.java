
package swingjava;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame{
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JPasswordField pf;
    
   
// TextFieldFrame constructor adds JTextFields to JFrame
    public TextFieldFrame(){
        super("Testing JTextField an JPaswsord");
        setLayout(new FlowLayout()); // set frame layout
        
        // construct textfield with 10 columns
        tf1 = new JTextField(10);
        add(tf1); // add textField1 to JFrame
        
        // construct textfield with default text
        tf2 = new JTextField("Unesi teks ovde");
        add(tf2);
        
        tf3 = new JTextField("Uneditable text field",21);
        tf3.setEditable(false);
        add(tf3);
        
        pf = new JPasswordField("Hidden text");
        add(pf);
        
        // register event handlers
        TextFieldHandler handler = new TextFieldHandler();
        tf1.addActionListener(handler);
        tf2.addActionListener(handler);
        tf3.addActionListener(handler);
        pf.addActionListener(handler);
                }
   
        // private inner class for event handling
    private class TextFieldHandler implements ActionListener{

       // process text field events
        public void actionPerformed(ActionEvent e) {
            String string = ""; //declare string to display
            
            //user pressed Enter in JTextField tf1
            if(e.getSource() == tf1)
                string = String.format("tf1: %s", e.getActionCommand());
            
            // user pressed Enter in JTextField tf2
            else if(e.getSource() == tf2)
                string = String.format("tf2: %s", e.getActionCommand());
            
            // user pressed Enter in JTextField tf3
            else if(e.getSource() == tf3)
                string = String.format("tf3: %s", e.getActionCommand());
      
         
            // user pressed Enter in JTextField passwordField
            else if(e.getSource() == pf)
                string = String.format("pf: %s", e.getActionCommand());
       
        
            //display JtextField content
            JOptionPane.showMessageDialog(null, string);
        }
        
    }
    
    }












