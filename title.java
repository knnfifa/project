import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class title implements ActionListener {
    JButton mybutton = new JButton("Start");
    ImageIcon bgicon;
    JLabel label2;
    title(){
        ImageIcon ball = new ImageIcon(getClass().getResource("ball1.png"));
        JLabel label1= new JLabel();

        
        label1.setText("Football quiz");
        label1.setVerticalAlignment(JLabel.TOP);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setFont(new Font("MV Boli",Font.PLAIN,30));
        label1.setIcon(ball);
        
        JFrame frame = new JFrame();
        frame.setTitle("Quiz about Football");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500,500);
        frame.setVisible(true);

        mybutton.setBounds(130,350,200,40);
        mybutton.addActionListener(this);
        mybutton.setFocusable(false);

        

        frame.add(mybutton);
        frame.add(label1);
        
        
        try{

            bgicon = new ImageIcon(getClass().getResource("fb.png"));
            label2 = new JLabel(bgicon);
            frame.add(label2);
        }catch(Exception e){
            System.out.println("null");
        }
        frame.setSize(500,500);
        frame.setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == mybutton){
            Quiz tileball = new Quiz();
        }
    }

    
}
