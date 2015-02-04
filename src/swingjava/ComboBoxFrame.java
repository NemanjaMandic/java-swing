package swingjava;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame {

    private JComboBox imagesJComboBox;
    private JLabel label; // label to display selected icon

    private static final String[] names
            = {"rails.png", "java.png", "java2.png", "java3.png"};
    private Icon[] icons = {
        new ImageIcon(getClass().getResource(names[ 0])),
        new ImageIcon(getClass().getResource(names[ 1])),
        new ImageIcon(getClass().getResource(names[ 2])),
        new ImageIcon(getClass().getResource(names[ 3]))};

    // ComboBoxFrame constructor adds JComboBox to JFrame
    public ComboBoxFrame() {
        super("Testing JComboBox");
        setLayout(new FlowLayout()); // set frame layout

       imagesJComboBox = new JComboBox( names ); // set up JComboBox
       imagesJComboBox.setMaximumRowCount( 3 ); // display three rows
       
       imagesJComboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
              if(event.getStateChange() == ItemEvent.SELECTED)
                  label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
            }
        });
       add(imagesJComboBox);
       label = new JLabel(icons[0]);
       add(label);
    }
}