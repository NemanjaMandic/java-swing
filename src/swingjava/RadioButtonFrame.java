
package swingjava;

import java.awt.FlowLayout;
import java.awt.Font;
 import java.awt.event.ItemListener;
 import java.awt.event.ItemEvent;
 import javax.swing.JFrame;
 import javax.swing.JTextField;
 import javax.swing.JRadioButton;
 import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame{
    
    private JTextField tf;
    private Font plainFont;
    private Font italicFont;
    private Font boldFont;
    private Font italicBoldFont;
    private JRadioButton plainRadio;
    private JRadioButton boldRadio;
    private JRadioButton italicRadio;
    private JRadioButton italicBoldRadio;
    private ButtonGroup radioGroup;
    
    
    
    public RadioButtonFrame(){
        super("RadioButton Test");
        setLayout(new FlowLayout());
        
        tf = new JTextField("Watch the font style",25);
        add(tf);
        
       plainRadio = new JRadioButton("Plain",true);
       boldRadio = new JRadioButton("Bold",false);
       italicRadio = new JRadioButton("Italic",false);
       italicBoldRadio = new JRadioButton("Bold/Italic",false);
       add(plainRadio);
       add(boldRadio);
       add(italicRadio);
       add(italicBoldRadio);
       
       //create logical relationship between JRadioButtons
       radioGroup = new ButtonGroup();
       radioGroup.add(plainRadio);
       radioGroup.add(boldRadio);
       radioGroup.add(italicRadio);
       radioGroup.add(italicBoldRadio);
               
       // create font objects
       plainFont = new Font("Serif",Font.PLAIN,15); 
       boldFont = new Font("Serif",Font.BOLD,15); 
       italicFont = new Font("Serif",Font.ITALIC,15); 
       italicBoldFont = new Font("Serif",Font.ITALIC + Font.BOLD, 15); 
       tf.setFont(plainFont); // set initial font to plain
        
       plainRadio.addItemListener(new RadioButtonHandler(plainFont));
       boldRadio.addItemListener(new RadioButtonHandler(boldFont));
       italicRadio.addItemListener(new RadioButtonHandler(italicFont));
       italicBoldRadio.addItemListener(new RadioButtonHandler(italicBoldFont));
    }
    private class RadioButtonHandler implements ItemListener{
        
        private Font font; // font associated with this listener
        
        public RadioButtonHandler(Font f){
            font = f; // set the font of this listener
        }
        @Override
        public void itemStateChanged(ItemEvent e) {
          tf.setFont(font);
        }

       
        
    }
}
