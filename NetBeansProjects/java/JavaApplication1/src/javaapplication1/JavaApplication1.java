/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import javax.swing.JOptionPane; 

/**
 *
 * @author zack
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      int cols , rows ; 
      
      Scanner key = new Scanner(System.in);      
      System.out.print("How many cols ? ");
      cols = key.nextInt();
      System.out.print("How many raws ? ");
      
      rows = key.nextInt();
      
         for (int r = 0 ; r < rows ; r++)
         {
         
             for (int c = 0 ; c < cols ; c++)
             {
                 System.out.print("*");    
             }
             
         System.out.println();
         
          }
         
     System.exit(0);           
  
    }
    
}
