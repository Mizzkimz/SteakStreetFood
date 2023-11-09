package SteakStreetFood;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main_game extends JFrame implements ActionListener{

    frist_stage enterGame = new frist_stage();
    Put_Mission enterLevel = new Put_Mission();
    Level1_Stage Level1Stage = new Level1_Stage();
    Level2_Stage Level2Stage = new Level2_Stage();
    Level3_Stage Level3Stage = new Level3_Stage();
    
    public main_game(){
        this.setSize(1200,700);
        this.add(enterGame);
        enterGame.requestFocusInWindow();
        enterGame.StartButton.addActionListener(this);
        enterLevel.level1BT.addActionListener(this);
        enterLevel.level2BT.addActionListener(this);
        enterLevel.level3BT.addActionListener(this);
        
        Level1Stage.BackButton.addActionListener(this);
        
        Level2Stage.BackButton.addActionListener(this);
        
        Level3Stage.BackButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == enterGame.StartButton){
            this.setLocationRelativeTo(null);
            this.remove(enterGame);
            this.setSize(1200,700);
            this.setTitle("Select a stage");
            this.add(enterLevel);
            enterLevel.requestFocusInWindow();
        }
        else if(e.getSource() == enterLevel.level1BT){
            this.setLocationRelativeTo(null);
            this.remove(enterLevel);
            this.setSize(1200,700);
            this.setTitle("StageLevel1");
            this.add(Level1Stage);
            Level1Stage.requestFocusInWindow();
            Level1Stage.cos = 1;
            Level1Stage.times = 60;
            
        }
        
        else if(e.getSource() == Level1Stage.BackButton){
            this.setLocationRelativeTo(null);
            this.remove(Level1Stage);
            this.setSize(1200,700);
            this.setTitle("Select a stage");
            this.add(enterLevel);
            enterLevel.requestFocusInWindow();
        }
        
        else if(e.getSource() == enterLevel.level2BT){
            this.setLocationRelativeTo(null);
            this.remove(enterLevel);
            this.setSize(1200,700);
            this.setTitle("StageLevel2");
            this.add(Level2Stage);
            Level2Stage.requestFocusInWindow();
            Level2Stage.cos = 1;
            Level2Stage.times = 80;
            
        }
        
        else if(e.getSource() == Level2Stage.BackButton){
            this.setLocationRelativeTo(null);
            this.remove(Level2Stage);
            this.setSize(1200,700);
            this.setTitle("Select a stage");
            this.add(enterLevel);
            enterLevel.requestFocusInWindow();
        }
        
        else if(e.getSource() == enterLevel.level3BT){
            this.setLocationRelativeTo(null);
            this.remove(enterLevel);
            this.setSize(1200,700);
            this.setTitle("StageLevel3");
            this.add(Level3Stage);
            Level3Stage.requestFocusInWindow();
            Level3Stage.cos = 1;
            Level3Stage.times = 80;
            
        }
        
        else if(e.getSource() == Level3Stage.BackButton){
            this.setLocationRelativeTo(null);
            this.remove(Level3Stage);
            this.setSize(1200,700);
            this.setTitle("Select a stage");
            this.add(enterLevel);
            enterLevel.requestFocusInWindow();
        }
        
        this.validate();
        this.repaint();
    }
    
    public static void main(String[] args){
        JFrame gui = new main_game();
        gui.setSize(1200,700);
        gui.setVisible(true);
        gui.setTitle("Steak Street Food");
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setLocationRelativeTo(null);
        gui.setResizable(false);
    }
   
}
