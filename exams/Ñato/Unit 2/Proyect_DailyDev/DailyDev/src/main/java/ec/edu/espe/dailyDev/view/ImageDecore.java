package ec.edu.espe.dailyDev.view;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Olivier Paspuel
 */
public class ImageDecore extends javax.swing.JLabel {

    private int width;
    private int height;
    private String path;

    public ImageDecore(JPanel jpanel, String path) {
        this.path = path;
        this.width = jpanel.getWidth();
        this.height = jpanel.getHeight();
        this.setSize(width, height);
        
    }
    public void paint(Graphics graphics){
       ImageIcon img = new ImageIcon(getClass().getResource(path));
       graphics.drawImage(img.getImage(), 0, 0, width, height, null);
    }
    
}
