

package SteakStreetFood;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frist_stage extends JPanel{
    private ImageIcon wallpaper = new ImageIcon(this.getClass().getResource("PlayBG.jpg"));
    private ImageIcon starts = new ImageIcon(this.getClass().getResource("PlayButton.png"));
    public JButton StartButton = new JButton(starts);
    
    frist_stage(){
        setLayout(null);
        StartButton.setBounds(350, 480, 450, 150);
        StartButton.setBorderPainted(false);
        StartButton.setBorder(null);
        StartButton.setOpaque(false);
        StartButton.setContentAreaFilled(false);
        add(StartButton);
        
        this.repaint();
    }
    
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(wallpaper.getImage(), 0, 0, 1200, 665, this);

    }
}

