

package swing2;

 import java.awt.BorderLayout;
 import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
 import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingConstants;




public class MenuFrame extends JFrame{
    
    private final Color[] colorValues = {
    Color.BLACK, Color.BLUE, Color.RED, Color.GREEN
    };
    private JRadioButtonMenuItem[] colorItems;
    private JRadioButtonMenuItem[] fonts;
    private JCheckBoxMenuItem[] styleItems;
    private JLabel displayJLabel;
    private ButtonGroup fontButtonGroup;
    private ButtonGroup colorButtonGroup;
    private int style;
    
    public MenuFrame(){
        super("Using JMenus");
        JMenu fileMenu = new JMenu("File");//create file menu
        fileMenu.setMnemonic('F'); // set mnemonic to F
        
        //create About... menu item
        JMenuItem aboutItem = new JMenuItem("About...");
        aboutItem.setMnemonic('A');
        fileMenu.add(aboutItem);
        
        aboutItem.addActionListener(new ActionListener() {

            // display message dialog when user selects About...
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuFrame.this, "This is an example\nof using menus",
                        "About", JOptionPane.PLAIN_MESSAGE);
            }
        });
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic('X');
        fileMenu.add(exitItem);
        exitItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               System.exit(0);
            }
        });
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(fileMenu);
        
        JMenu formatMenu = new JMenu("Format");
        formatMenu.setMnemonic('r');
        
        String[] colors = {"Black","Blue","Red","Green"};
        
        JMenu colorMenu = new JMenu("Color");
        colorMenu.setMnemonic('C');
        
        colorItems = new JRadioButtonMenuItem[colors.length];
        colorButtonGroup = new ButtonGroup();
        ItemHandler itemHandler = new ItemHandler();
        
        for(int count=0; count<colors.length; count++){
            colorItems[count] = new JRadioButtonMenuItem(colors[count]);
            colorMenu.add(colorItems[count]);
            colorButtonGroup.add(colorItems[count]);
            colorItems[count].addActionListener(itemHandler);
        }
        colorItems[0].setSelected(true);
        
        formatMenu.add(colorMenu);
        formatMenu.addSeparator();
        
        String[] fontNames = {"Serif","Monospaced","SansSerif"};
        JMenu fontMenu = new JMenu("Font");
        fontMenu.setMnemonic('n');
        
        fonts = new JRadioButtonMenuItem[fontNames.length];
        fontButtonGroup = new ButtonGroup();
        
        for(int count=0; count<fonts.length; count++){
            fonts[count] = new JRadioButtonMenuItem(fontNames[count]);
            fontMenu.add(fonts[count]);
            fontButtonGroup.add(fonts[count]);
            fonts[count].addActionListener(itemHandler);
        }
        fonts[0].setSelected(true); // select first Font menu item
        fontMenu.addSeparator();
        
        String[] styleNames = {"Bold","Italic"};
        
        styleItems = new JCheckBoxMenuItem[styleNames.length];
        StyleHandler styleHandler = new StyleHandler();
        
        for(int count=0; count<styleNames.length; count++){
            styleItems[count] = new JCheckBoxMenuItem(styleNames[count]);
            fontMenu.add(styleItems[count]);
            styleItems[count].addItemListener(styleHandler);
        }
        formatMenu.add(fontMenu);
        bar.add(formatMenu);
        
        displayJLabel = new JLabel("Sample Text", SwingConstants.CENTER);
        displayJLabel.setForeground(colorValues[0]);
        displayJLabel.setFont(new Font("Serif",Font.PLAIN, 72));
       
        getContentPane().setBackground(Color.CYAN);
        add(displayJLabel, BorderLayout.CENTER);
    }
    
    private class ItemHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            for(int i=0; i<colorItems.length; i++){
                if(colorItems[i].isSelected()){
                    displayJLabel.setForeground(colorValues[i]);
                    break;
                }
            }
            for(int i=0; i<fonts.length; i++){
                if(e.getSource() == fonts[i]){
                    displayJLabel.setFont(
                    new Font(fonts[i].getText(), style, 72));
                }
            }
            repaint();
        }
        
    }
    private class StyleHandler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
           String name = displayJLabel.getFont().getName();
           Font font;
           
           if(styleItems[0].isSelected() &&
                   styleItems[1].isSelected())
               font = new Font(name,Font.BOLD + Font.ITALIC, 72);
           else if(styleItems[0].isSelected())
               font = new Font(name,Font.BOLD,72);
           else if(styleItems[1].isSelected())
               font = new Font(name, Font.ITALIC, 72);
           else
               font = new Font(name, Font.PLAIN, 72);
           
           displayJLabel.setFont(font);
           repaint();
        }
        
    }
}
