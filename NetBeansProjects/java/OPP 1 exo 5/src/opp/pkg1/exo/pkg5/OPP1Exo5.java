/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opp.pkg1.exo.pkg5;

/**
 *
 * @author zack
 */
public class OPP1Exo5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       
        int sum = 0  ; 
        int nbr = 0 ; 
        
        System.out.println("The perfect number from 1 through 500 are : ");
        while(nbr <500)
        {
           for( int i = 1 ; i < nbr  ; i ++) 
           {
            
               if( (nbr % i ) == 0)
               {
                   
                sum = sum + i ; 
              
               }               
                            
           }
            if( sum == nbr ) 
            {
                System.out.println(nbr);
                
            }
                    
            sum = 0 ; 
            nbr ++ ; 
        }
                      
    }
    
}
