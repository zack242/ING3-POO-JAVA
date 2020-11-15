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
public class InsuredPackage extends Package{
   double insurance  ; 
    
    public  InsuredPackage(double weight , char shipping){
        
        super(weight,shipping);
        

        if( cost > 0 && cost <= 1.00)
            insurance = 2.45 ; 
        if( cost > 1.01 && cost <= 3.00)
            insurance = 3.95 ; 
        if( cost > 3.01)
            insurance = 5.55 ; 
             
        cost +=insurance ; 
      
        
    }
    
    
    @Override 
    void display(){
      System.out.println("The weight " + weight + " Oz ");
      System.out.println("Shipping method " + shipping );
      System.out.println("Insurance cost " + insurance + "$");
      System.out.println("Shipping cost " + cost + "$");
      System.out.println("----------------------");
    
  }
    
    
}
