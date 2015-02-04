
package swingjava;

 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
 import javax.swing.Box;
 import javax.swing.JFrame;
 import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class TextAreaFrame extends JFrame{
    private JTextArea textarea1;
    private JTextArea textarea2;
    private JButton copyJButton;
    
    public TextAreaFrame(){
        super("TextArea Demo");
        
        Box box = Box.createHorizontalBox();
        String demo = "This is a demo string to\n" +
              "illustrate copying text\nfrom one textarea to \n" +
              "another textarea using an\nexternal event\n";
        
        textarea1 = new JTextArea(demo, 10,15);
        box.add(new JScrollPane(textarea1));
        
        copyJButton = new JButton("Copy >>>");
        box.add(copyJButton);
        
        copyJButton.addActionListener(new ActionListener() {

            // set text in textArea2 to selected text from textArea1
            public void actionPerformed(ActionEvent e) {
                textarea2.setText(textarea1.getSelectedText());
            }
        });
        textarea2 = new JTextArea(10, 15);
        textarea2.setEditable(false);
        box.add(new JScrollPane(textarea2));
        add(box);
    }
}
