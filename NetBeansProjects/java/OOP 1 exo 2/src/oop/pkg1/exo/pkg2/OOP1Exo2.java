/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.pkg1.exo.pkg2;

import javax.swing.JOptionPane;


public class OOP1Exo2 {

    
    public static void main(String[] args) {
        
        String temp ; 
        int salary ; 
        double tax = 0 ; 
        
        JOptionPane.showMessageDialog(null," Tax Calculator ");
        temp = JOptionPane.showInputDialog (" What is your salary " );
        salary = Integer.parseInt(temp); 
        
        if (salary >= 50000 ) 
        {
            tax = (salary-50000) * 0.3 ;
            salary = 50000;     
        }
        if(salary >= 10000 )
        {
             tax = tax +  (salary-10000) * 0.2 ;     
        }
               
        JOptionPane.showMessageDialog(null,"Your tax is $" + tax +" " );
           
        System.exit(0);
        
    }
    
}
