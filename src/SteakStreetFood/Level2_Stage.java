package SteakStreetFood;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.geom.Rectangle2D;

public class Level2_Stage extends JPanel implements ActionListener {
    
    Person1 person = new Person1();
    
    private ImageIcon CookBG = new ImageIcon(this.getClass().getResource("CookBG2.jpg"));
    private ImageIcon Back = new ImageIcon(this.getClass().getResource("CloseButton.png"));
    private ImageIcon Pork = new ImageIcon(this.getClass().getResource("Pork.png"));
    private ImageIcon Fish = new ImageIcon(this.getClass().getResource("Fish.png"));
    private ImageIcon pan = new ImageIcon(this.getClass().getResource("pan.png"));
    private ImageIcon porkwithpan = new ImageIcon(this.getClass().getResource("Porkwithpan.png"));
    private ImageIcon fishwithpan = new ImageIcon(this.getClass().getResource("Fishwithpan.png"));
    private ImageIcon PorkSteak = new ImageIcon(this.getClass().getResource("PorkSteak.png"));
    private ImageIcon FishSteak = new ImageIcon(this.getClass().getResource("FishSteak.png"));
    private ImageIcon salad = new ImageIcon(this.getClass().getResource("Salad.png"));
    private ImageIcon salad1 = new ImageIcon(this.getClass().getResource("Salad1.png"));
    private ImageIcon yes = new ImageIcon(this.getClass().getResource("yes.png"));
    private ImageIcon no = new ImageIcon(this.getClass().getResource("no.png"));
    private ImageIcon win = new ImageIcon(this.getClass().getResource("win2.png"));
    private ImageIcon lose = new ImageIcon(this.getClass().getResource("lose2.png"));
    
    public JButton BackButton = new JButton(Back);
    public JButton PorkBT = new JButton(Pork);
    public JButton FishBT = new JButton(Fish);
    public JButton Pan1BT = new JButton(pan);
    public JButton Pan2BT = new JButton(pan);
    
    public JButton PorkPan1BT = new JButton(porkwithpan);
    public JButton FishPan1BT = new JButton(fishwithpan);
        
    public JButton PorkSteakPlate1BT = new JButton(PorkSteak);
    public JButton FishSteakPlate1BT = new JButton(FishSteak);
    
    public JButton SaladBT = new JButton(salad);
    
    boolean checkpan1 = false;
    boolean checkpan2 = false;
    
    //*** chack steak on plate***//
    boolean checkplate1 = false;
    boolean checkplate2 = false;
    
    boolean checkporkplate1 = false;
    boolean checkfishplate2 = false;
    
    boolean CGiveOPork = false;
    boolean CGiveOFish = false;
    boolean CGiveOSalad = false;
    
    
    
    public boolean CPorkPlate = false;
    public boolean CFishPlate = false;
    public boolean CSalad = false;
    
    
   
    public int times;
    public int randomc;
    public int cos;
    public boolean checkdebug = true;
    public boolean pass = false;
    public int countplate = 0;
    public int countsalad = 0;
    public int countscore = 0;
    
    int timepan = 5;
    int checktimepan1 = timepan;
    int checktimepan2 = timepan;
    boolean COrder_true = false ;
    int checkperson = 0;
    
    Thread timecount = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    if(checkpan1 == true &&  checktimepan1 > 0){
                        checktimepan1--;
                    }
                    if(checkpan2 == true && checktimepan2 > 0){
                        checktimepan2--;
                    }
                    times--;
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                }
                if(checkdebug == true){
                    repaint();
                }        
            }
        }
    });
    
    public Level2_Stage() {
        
        timecount.start();
        
        setLayout(null);
        BackButton.setBounds(1100, 0, 84, 90);
        BackButton.setBorderPainted(false);
        BackButton.setBorder(null);
        BackButton.setOpaque(false);
        BackButton.setContentAreaFilled(false);
        add(BackButton);
        
        setLayout(null);
        PorkBT.setBounds(938,530, 292, 187);
        PorkBT.setBorderPainted(false);
        PorkBT.setBorder(null);
        PorkBT.setOpaque(false);
        PorkBT.setContentAreaFilled(false);
        add(PorkBT);
        PorkBT.addActionListener(this);
        
        setLayout(null);
        FishBT.setBounds(938,338, 292, 187);
        FishBT.setBorderPainted(false);
        FishBT.setBorder(null);
        FishBT.setOpaque(false);
        FishBT.setContentAreaFilled(false);
        add(FishBT);
        FishBT.addActionListener(this);
             
        setLayout(null);
        Pan1BT.setBounds(460,490, 292, 187);
        Pan1BT.setBorderPainted(false);
        Pan1BT.setBorder(null);
        Pan1BT.setOpaque(false);
        Pan1BT.setContentAreaFilled(false);
        add(Pan1BT);
        Pan1BT.addActionListener(this);
        
        setLayout(null);
        Pan2BT.setBounds(460,346, 292, 187);;
        Pan2BT.setBorderPainted(false);
        Pan2BT.setBorder(null);
        Pan2BT.setOpaque(false);
        Pan2BT.setContentAreaFilled(false);
        add(Pan2BT);
        Pan2BT.addActionListener(this);
        
        setLayout(null);
        SaladBT.setBounds(50,392, 200, 200);
        SaladBT.setBorderPainted(false);
        SaladBT.setBorder(null);
        SaladBT.setOpaque(false);
        SaladBT.setContentAreaFilled(false);
        add(SaladBT);
        SaladBT.addActionListener(this);
        
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(CookBG.getImage(), 0, 0, 1200, 665, this);
        
        g.setColor(Color.WHITE);
        g.fillRect(10, 10, 175, 150);
        
        g.setColor(Color.BLACK);
        g.setFont(new Font("Rockwell",Font.BOLD,25));
        g.drawString("Time : "+times,40,35);
        
        g.setColor(Color.BLUE);
        g.setFont(new Font("Rockwell",Font.BOLD,25));
        g.drawString("Steak : "+countplate,40,70);
        
        g.setColor(Color.GREEN);
        g.setFont(new Font("Rockwell",Font.BOLD,25));
        g.drawString("Salad : "+countsalad,40,105);
        g.setFont(new Font("Rockwell",Font.BOLD,20));
        
        
        g.setColor(Color.ORANGE);
        g.setFont(new Font("Rockwell",Font.BOLD,25));
        g.drawString("Score : "+countscore,40,140);
        g.setFont(new Font("Rockwell",Font.BOLD,20));
                    
        
        g.setColor(Color.WHITE);
        g.fillOval(630,615, 30, 30);
        g.fillOval(630,462, 30, 30);
        
        g.setColor(Color.BLACK);
        g.drawOval(630,615, 30, 30);
        g.drawOval(630,462, 30, 30);
        
        g.setColor(Color.BLACK); 
        g.drawString(""+checktimepan1, 640,638);
        g.drawString(""+checktimepan2, 640,485);
        
        if(cos > 0){
            randomc = (int)(Math.random() * (5  - 0 + 0) + 0);
            System.out.println(randomc);
            if(randomc == 0 ) {
                checkperson = 1;
            }
            else if(randomc == 1 ){
                checkperson = 2;
            }
            else if(randomc == 2 ){
                checkperson = 3;
            }
            else if(randomc == 3 ){
                checkperson = 4;
            }
            else if(randomc == 4 ){
                checkperson = 5;
            }
            cos = 0;    
        }
        if(checkperson == 1){
            g.drawImage(PorkSteak.getImage(),350,155,130,60,this);
            g.drawImage(person.im[0].getImage(),500,140,180,200,this);
            CPorkPlate=true;           
        }
        
        else if( checkperson == 2 ){
            g.drawImage(PorkSteak.getImage(),350,155,130,60,this);
            g.drawImage(person.im[1].getImage(),500,140,180,200,this);
            CPorkPlate=true;     
        }
        else if(checkperson == 3 ){
            g.drawImage(FishSteak.getImage(),650,200,130,60,this);
            g.drawImage(person.im[2].getImage(),500,140,140,200,this);
            CFishPlate=true; 
        }
         else if(checkperson == 4 ){
            g.drawImage(FishSteak.getImage(),650,200,130,60,this);
            g.drawImage(person.im[3].getImage(),500,140,160,200,this);
            CFishPlate=true; 
        }
        else if(checkperson == 5 ){
            g.drawImage(salad1.getImage(),650,200,100,85,this);
            g.drawImage(person.im[4].getImage(),500,140,160,200,this);
            CSalad=true; 
        }
        
        
        //*******Order steak********//
        if(CPorkPlate == true){
            if(CGiveOPork == true){
                countplate++;
                countscore++;
                cos = 1;
                COrder_true = true;
                CPorkPlate = false;
                CGiveOPork = false;
                g.drawImage(yes.getImage(),500,200,120,120,this);
            }
            else if(CGiveOFish == true){
                CGiveOFish = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            
            else if(CGiveOSalad == true){
                CGiveOSalad = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
        }
        
        //********Order fishsteak*******//
        if(CFishPlate == true){
            if(CGiveOPork == true){
                CGiveOPork = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOFish == true){
                countplate++;
                countscore++;
                cos = 1;
                CPorkPlate = false;
                CFishPlate = false;
                CGiveOFish = false;
                g.drawImage(yes.getImage(),500,200,120,120,this);
            }
            
            else if(CGiveOSalad == true){
                CGiveOSalad = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
        }
        
        
        //***** Order Salad *****//
        if(CSalad == true ){
            if(CGiveOPork == true){
                CGiveOPork = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOFish == true){
                CGiveOFish = false;
                g.drawImage(no.getImage(),500,200,120,120,this);
            }
            else if(CGiveOSalad == true){
                System.out.println("Salad");
                countsalad++;
                countscore++;
                cos = 1;
                COrder_true = true;
                CGiveOSalad = false;
                CSalad = false;
                g.drawImage(yes.getImage(),500,200,120,120,this);
            }
        }
        
        //**********How to win in game**********//
        if(times <= 0){
            if(countscore>= 19){
                g.drawImage(win.getImage(),350, 120, 403, 334, this);
                g.setColor(Color.BLACK);
                g.setFont(new Font("Rockwell",Font.BOLD,37));
                g.drawString(" "+countscore,653,378);
                                
                timecount.stop();
                this.removeAll();
                add(BackButton);
            }
            else{
                if(countscore< 19)
                g.drawImage(lose.getImage(),350, 120, 403, 334, this);
                g.setColor(Color.BLACK);
                g.setFont(new Font("Rockwell",Font.BOLD,37));
                g.drawString(" "+countscore,653,378);
                
                timecount.stop();
                this.removeAll();
                add(BackButton);
            }
            
        }
        
    }
    
    
    public void actionPerformed(ActionEvent e) {
        //*************************************//
        //*****put steak on the pan*****//
        //*************************************//
        if(e.getSource() == PorkBT){
            if(checkpan1 == false){
                this.remove(Pan1BT);
                setLayout(null);
                PorkPan1BT.setBounds(460,490, 292, 187);
                PorkPan1BT.setBorderPainted(false);
                PorkPan1BT.setBorder(null);
                PorkPan1BT.setOpaque(false);
                PorkPan1BT.setContentAreaFilled(false);
                add(PorkPan1BT);
                PorkPan1BT.addActionListener(this);
                checkpan1 = true;
            }}
        else if(e.getSource() == FishBT){
            if(checkpan2 == false){
                this.remove(Pan2BT);
                setLayout(null);
                FishPan1BT.setBounds(460,346, 292, 187);
                FishPan1BT.setBorderPainted(false);
                FishPan1BT.setBorder(null);
                FishPan1BT.setOpaque(false);
                FishPan1BT.setContentAreaFilled(false);
                add(FishPan1BT);
                FishPan1BT.addActionListener(this);
                checkpan2 = true;
            }
        }
        //**********************************//
        //*****put steak on the plate*****//
        //**********************************//
      
        else if(e.getSource() == PorkPan1BT){
            if(checktimepan1 <= 0 ){
                    this.remove(PorkPan1BT);
                    setLayout(null);
                    PorkSteakPlate1BT.setBounds(700,530, 292, 187);
                    PorkSteakPlate1BT.setBorderPainted(false);
                    PorkSteakPlate1BT.setBorder(null);
                    PorkSteakPlate1BT.setOpaque(false);
                    PorkSteakPlate1BT.setContentAreaFilled(false);
                    add(PorkSteakPlate1BT);
                    PorkSteakPlate1BT.addActionListener(this);
                    checkpan1 = false;
                    checkplate1 = true;
                    checkporkplate1 = true;
                    
                    checktimepan1 = timepan;
                    
            }
        }
        
        else if(e.getSource() == FishPan1BT){
            if(checktimepan2 <= 0 ){
                this.remove(FishPan1BT);
                    setLayout(null);
                    FishSteakPlate1BT.setBounds(700,340, 292, 187);
                    FishSteakPlate1BT.setBorderPainted(false);
                    FishSteakPlate1BT.setBorder(null);
                    FishSteakPlate1BT.setOpaque(false);
                    FishSteakPlate1BT.setContentAreaFilled(false);
                    add(FishSteakPlate1BT);
                    FishSteakPlate1BT.addActionListener(this);
                    checkpan2 = false;
                    checkplate2 = true;
                    checkfishplate2 = true;         
                    checktimepan2 = timepan;
                
            }
        }
        
        //*********************************//
        //*****Give Order to Customer*****//
        //*********************************//
        else if(e.getSource() == this.SaladBT){
            CGiveOSalad = true;
        }
        
        else if(e.getSource() == this.PorkSteakPlate1BT){
            remove(PorkSteakPlate1BT);
            CGiveOPork = true;
            checkplate1 = false;
          
        }
        
        else if(e.getSource() == this.FishSteakPlate1BT){
            remove(FishSteakPlate1BT);
            CGiveOFish = true;
            checkplate2 = false;
           
        }
        
        this.repaint();
    }
}
