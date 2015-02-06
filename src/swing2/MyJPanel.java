

package swing2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class MyJPanel extends JPanel{
    private static Random generator = new Random();
    private ImageIcon picture;
    private final static String[] images = {
    "rails.png","java.png","java2.png","java3.png","apocalyptic-sunglasses.jpg"};
    
    public MyJPanel(){
        int randomNumber = generator.nextInt(images.length);
        picture = new ImageIcon(images[randomNumber]);
        
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        picture.paintIcon(this, g, 0, 0);
        
    }
    public Dimension getPreferedSize(){
        return new Dimension(picture.getIconWidth(),
        picture.getIconHeight());
    }
}
