/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1.exo.pkg1;
import java.util.Scanner ;
/**
 *
 * @author zack
 */
public class OOP1Exo1 {
    
     static double DozenEggs = 3.25 ;
     static double Eggs  = 0.45 ;

   
    public static void main(String[] args) {
        
        int nbrEggs ; 
        int nbrDozen ; 
        double total ; 
        
      
       Scanner key = new Scanner(System.in); 
       
        System.out.print("Who many eggs you want ? ");
        nbrEggs = key.nextInt(); 
        
        nbrDozen = nbrEggs / 12 ; 
        nbrEggs -= nbrDozen * 12 ; 
        
        total = nbrDozen * DozenEggs + nbrEggs * Eggs ; 
 
        System.out.print("You ordered ");
        System.out.print(nbrEggs+nbrDozen*12);
        System.out.println(" Eggs.");
        System.out.println("That's " + nbrDozen + " dozen at $" + DozenEggs +  " and " + nbrEggs + " loose Eggs at $"  
        + Eggs + " each for a total of $" +  total );
        
        System.exit(0);      

    }
    
}
