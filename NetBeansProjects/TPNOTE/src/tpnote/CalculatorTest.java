/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpnote;

import java.util.Scanner;

/**
 *
 * @author zack
 */
public class CalculatorTest {
    
     public static void main() {
        
         Calculator Calcul = new Calculator() ; 
         Scanner key = new Scanner(System.in);
         boolean tmp = true ; 
        
         String input ; 
         
         while(tmp == true){
         System.out.println("999/ Exit ");
         System.out.println("Enter the String :  ") ;
         input = key.nextLine();
         
         if("999".equals(input))
         tmp = false;
         else 
         tmp =  Calculator.parseAndCompute(input); 
         
        }
           
   
         
    }
    
    
    
}
