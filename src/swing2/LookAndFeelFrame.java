
package swing2;

 import java.awt.GridLayout;
 import java.awt.BorderLayout;
 import java.awt.event.ItemListener;
 import java.awt.event.ItemEvent;
 import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class LookAndFeelFrame extends JFrame{
    
    private UIManager.LookAndFeelInfo[] looks; // look and feels
    private String[] lookNames; // names of look and feels
    private JRadioButton[] radio; // radio buttons to select look-and-feel
    private ButtonGroup group; // group for radio buttons
    private JButton button; // displays look of button
    private JLabel label; // displays look of label
    private JComboBox comboBox; // displays look of combo box
    
    public LookAndFeelFrame(){
        super("Look and Feel");
        
        looks = UIManager.getInstalledLookAndFeels();
        lookNames = new String[looks.length];
        
        for(int i=0; i<looks.length; i++)
            lookNames[i] = looks[i].getName();
        
        JPanel northPanel = new JPanel();//create north panel
        northPanel.setLayout(new GridLayout(3, 1, 0, 5));
        
        label = new JLabel("This is a " + lookNames[0] + " look and feel", 
        SwingConstants.CENTER);
        northPanel.add(label);
        
        button = new JButton("JButton");
        northPanel.add(button);
        
        comboBox = new JComboBox(lookNames);
        northPanel.add(comboBox);
        
        radio = new JRadioButton[looks.length];
        
        JPanel southPanel = new JPanel(); //create south panel
        
        int rows = (int)Math.ceil(radio.length/3.0);
        southPanel.setLayout(new GridLayout(rows, 3));
        
        group = new ButtonGroup(); //button group for look and feels
        
        ItemHandler handler = new ItemHandler();
        
        for(int count=0; count<radio.length; count++){
            radio[count] = new JRadioButton(lookNames[count]);
            radio[count].addItemListener(handler);
            group.add(radio[count]); //add radio button to group
            southPanel.add(radio[count]); //add radio button to panel
        }
        add(northPanel, BorderLayout.NORTH); // add north panel
        add(southPanel, BorderLayout.SOUTH);
        
        radio[0].setSelected(true); // set default selection
        
    }
    private void changeLookAndFeel(int value){
        try{
            // set look-and-feel for this application
            UIManager.setLookAndFeel(looks[value].getClassName());
            SwingUtilities.updateComponentTreeUI(this);
        }catch(Exception exc){
            exc.printStackTrace();
        }
    }
    private class ItemHandler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
           for(int count=0; count<radio.length; count++){
               if(radio[count].isSelected()){
                   label.setText(String.format("This is a %s look-and-feel", lookNames[count]));
                   comboBox.setSelectedIndex(count);
                   changeLookAndFeel(count);
               }
           }
        }
        
    }
}   
