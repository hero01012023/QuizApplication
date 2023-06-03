
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    
    JButton rules,back;
    JTextField tfname;
    
    //creat a Constracctar
    Login(){
        setBounds(0,0,1300,800);
        getContentPane().setBackground(new Color(209, 242, 235 ));
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icon/Login.jpeg"));
        setLayout(null);
        JLabel image=new JLabel(i1);
        image.setBounds(10, 20, 600, 500);
        add(image);
        
        JLabel heading=new JLabel("Welcome to DIU Quiz Application.");
        heading.setBounds(650, 20, 600, 300);
        heading.setFont(new Font("Algerian",Font.BOLD,30));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        JLabel name=new JLabel("Enter Your Name / ID :");
        name.setBounds(650, 40, 300, 400);
        name.setFont(new Font("Algerian",Font.BOLD,20));
        name.setForeground(Color.BLACK);
        add(name);
        
        tfname=new JTextField();
        tfname.setBounds(650,270,300,40);
        tfname.setFont(new Font("Mongolian BaitiFont",Font.BOLD,16));
        add(tfname);
        
        rules=new JButton("Start");
        rules.setBounds(650,350,100,30);
        rules.setBackground(Color.BLACK);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back=new JButton("Quit");
        back.setBounds(850,350,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
    
    setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==rules){
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
    }  
        else if (ae.getSource()== back){
        
        setVisible(false);
    }
        
    }
    
    public static void main(String[] args) {
       //Creat a Object, Anonimus Object
        new Login();
        
    }
    
}
