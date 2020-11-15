/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3;

/**
 *
 * @author zack
 */
public class CabinRental {
    
    private int Cabin_Number ;
    protected double rental_rate ; 
    
    public CabinRental(int Cabin_Number ){
        
        this.Cabin_Number=Cabin_Number ; 
        
        switch(this.Cabin_Number){
            case 1 :  
            this.rental_rate = 950 ; 
                break ; 
            case 2 :  
            this.rental_rate = 950 ; 
                break ;
            case 3 :  
            this.rental_rate = 950 ; 
                break ;
            default :
                this.rental_rate = 1100 ;  
                break ; 
        }
             
    }
      
    int getNumber(){
        return Cabin_Number; 
    }
    
    double getRental(){
        return rental_rate ;    
    }
    
    void display(){
        System.out.println("The total for " + Cabin_Number + " is " + rental_rate);
        
    }
    
    
}
