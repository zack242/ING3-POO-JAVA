/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.pkg4;
import java.util.Scanner;

/**
 *
 * @author zack
 */
public class OOP4 {
    

    public static void main(String[] args) {
        
        int[] store = new  int  [5] ; 
        Scanner key  = new Scanner(System.in) ;
        int temp ; 
        
        
        System.out.println("Enter today's sales for : ");
        
        for (int i = 0 ; i<5 ; ++i)
        {
            System.out.print("Store " + (i+1) + ": ");
            
            store[i] = key.nextInt();
          
    
        }
        
        System.out.println("SALES BAR CHART : ");
        
        
        for (int j =0 ; j<5 ; ++j)
        {
            System.out.print("Store " + (j+1) + ": ");
            
            for(int k = 0 ; k < store[j]/100 ; k++)
            {
              System.out.print("*");
              
            }
              System.out.println("");           
      }
        
        
     System.exit(0);
        
    }
    
}
