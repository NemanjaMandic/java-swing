
package swingjava;

 import java.awt.FlowLayout;
 import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 import java.awt.event.ItemListener;
 import java.awt.event.ItemEvent;
 import javax.swing.JFrame;
 import javax.swing.JTextField;
 import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame{
    
    private JTextField tf;
    private JCheckBox boldCb;
    private JCheckBox italicCb;
    
    public CheckBoxFrame(){
        super("JCheckBox Test");
        setLayout(new FlowLayout());
        
        tf = new JTextField("Watch the font style",20);
        tf.setFont(new Font("Serif", Font.PLAIN, 14));
        add(tf);
        
        boldCb = new JCheckBox("Bold");
        italicCb = new JCheckBox("Italic");
        add(boldCb);
        add(italicCb);
        
        CheckBoxHandler han = new CheckBoxHandler();
        boldCb.addItemListener(han);
        italicCb.addItemListener(han);
    }
    private class CheckBoxHandler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
          Font font = null;
          
          if(boldCb.isSelected() && italicCb.isSelected())
              font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
          else if(boldCb.isSelected())
              font = new Font("Serif",Font.BOLD, 14);
          else if(italicCb.isSelected())
              font = new Font("Serif", Font.ITALIC,14);
          else
              font = new Font("Serif",Font.PLAIN, 14);
          
          tf.setFont(font);
        }

       
        
    }
}
