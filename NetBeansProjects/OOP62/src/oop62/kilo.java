/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop62;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author zack
 */
public class kilo extends JFrame{
    
    private JLabel message ;
    private JTextField kilometre ; 
    private JButton buton,buton2,buton3 ; 
    private JPanel panel ; 
    private JRadioButton one,two,three ; 
    private ButtonGroup group;
    
    
    public kilo(){
        
        setTitle("Kilometre convertisseur "); 
        setSize(310,100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        BuildPanel();
        add(panel);
        
        setVisible(true);
        
         
    }
    
    private void BuildPanel(){
        
        message = new JLabel("Enter distance ");
        kilometre = new JTextField(10);
        buton = new JButton("1");
        buton2 = new JButton("2");
        buton3 = new JButton("3");
        one = new JRadioButton("Choice 1 ",true);
        two = new JRadioButton("Choice 2 ",true);
        three = new JRadioButton("Choice 3 ",true);
        group = new ButtonGroup();
        group.add(one);
        group.add(two);
        group.add(three);
        
        
        
        
        buton.setBackground(Color.RED);
        buton.setForeground(Color.BLUE );
        
        panel = new JPanel();
        
        
        
        panel.add(message);
        panel.add(kilometre);
        panel.add(buton);
        panel.add(buton2);
        panel.add(buton3);
        panel.add(one);
        panel.add(two);
        panel.add(three);
        buton.addActionListener(new calculer());
        buton2.addActionListener(new calculer());
        buton3.addActionListener(new calculer());
        one.addActionListener(new calculer());
        
                
        
        
    }
    
    public static void main(){
         
        new kilo();
        
    }
    
   
class calculer implements ActionListener 
{
    @Override
    public void actionPerformed(ActionEvent e){
        String input ; 
        double miles=0 ; 
         if( e.getSource()==buton )
        JOptionPane.showMessageDialog(null,"1 " + miles + " o");
        
        if( e.getSource()==buton2 )
        JOptionPane.showMessageDialog(null,"2 " + miles + " o");
        if( e.getSource()==buton3 )
        JOptionPane.showMessageDialog(null,"3" + miles + " o");
        
        if( one.isSelected() )
             JOptionPane.showMessageDialog(null,"oui" + miles + " o");
         if( two.isSelected() )
             JOptionPane.showMessageDialog(null,"no" + miles + " o");   
        
        
    }
    
    
    
} 
}
