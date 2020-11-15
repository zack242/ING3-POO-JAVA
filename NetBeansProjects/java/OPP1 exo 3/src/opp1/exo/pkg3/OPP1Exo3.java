/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opp1.exo.pkg3;
import java.util.Scanner ; 
/**
 *
 * @author zack
 */
public class OPP1Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int day = 0 ; 
     
        do {
        Scanner key = new Scanner(System.in) ; 
        System.out.print("Day of work ");
        day = key.nextInt(); 
      
        
       } while(day<1) ; 
        
       int tab[] = new int [day] ; 
        
           salaire (tab,day); 
           affiche(tab);
            
            
          System.exit(0);  
        
                
    }
    
    public static void  salaire (int tab[] , int x )
    {
        int temp = 10 ; 
        for(int i = 0 ; i < x  ; i++ ) 
        {
         tab[i] = temp ; 
         temp = temp*2 ; 
            
        }
            
    }
    
    
    public static void affiche (int tab[])
    {
        double somme = 0 ; 
        for(int i = 0 ; i < tab.length ; i++) {
            System.out.println( "["+ i + "] : " +  tab[i]); 
            somme = tab[i]; 
            
        }
            
       System.out.print("Your salary is " + (somme/100) + " livre ");
        
                    
       
        
    }
    
}
