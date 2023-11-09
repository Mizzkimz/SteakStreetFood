

package SteakStreetFood;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Put_Mission extends JPanel{
    
    private ImageIcon bglevel = new ImageIcon(this.getClass().getResource("BackgroundLevel.jpg"));
    private ImageIcon level1 = new ImageIcon(this.getClass().getResource("level1.png"));
    private ImageIcon level2 = new ImageIcon(this.getClass().getResource("level2.png"));
    private ImageIcon level3 = new ImageIcon(this.getClass().getResource("level3.png"));
    
    public JButton level1BT = new JButton(level1);
    public JButton level2BT = new JButton(level2);
    public JButton level3BT = new JButton(level3);
    

    Put_Mission(){
        
        setLayout(null);
        level1BT.setBounds(123, 360, 177,175);
        level1BT.setBorderPainted(false);
        level1BT.setBorder(null);
        level1BT.setOpaque(false);
        level1BT.setContentAreaFilled(false);
        add(level1BT);
        
        setLayout(null);
        level2BT.setBounds(507, 110, 177,175);
        level2BT.setBorderPainted(false);
        level2BT.setBorder(null);
        level2BT.setOpaque(false);
        level2BT.setContentAreaFilled(false);
        add(level2BT);
        
        setLayout(null);
        level3BT.setBounds(902, 355, 177,175);
        level3BT.setBorderPainted(false);
        level3BT.setBorder(null);
        level3BT.setOpaque(false);
        level3BT.setContentAreaFilled(false);
        add(level3BT);
        
        this.repaint();
    }
     
   
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(bglevel.getImage(), 0, 0, 1200, 665, this);
    
    }
}
