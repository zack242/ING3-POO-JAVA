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
public class Package {
    
    protected double weight ; 
    protected char shipping ;
    protected double cost ; 
    
    public Package(double weight,char shipping){
        calculateCost(weight,shipping);
        this.weight=weight; 
        this.shipping=shipping; 
        
    }
    
    void calculateCost(double weight , char shipping)
    {
        if( weight > 1 && weight <=8)
            switch(shipping)
            {
                case 'A': 
                 cost = 2.00 ; 
                    
                case 'T': 
                 cost = 1.50; 
                    
                case 'M':  
                 cost = 0.50 ;  
            }
            
        if( weight > 9 && weight <=16 )
            switch(shipping)
            {
                case 'A': 
                 cost = 3.00 ; 
                    
                case 'T': 
                 cost = 2.35; 
                    
                case 'M':  
                 cost = 1.50 ;  
            }
            
        if( weight > 17)
            switch(shipping)
            {
                case 'A': 
                 cost = 4.50 ; 
                    
                case 'T': 
                 cost = 3.25; 
                    
                case 'M':  
                 cost = 2.15 ;  
            }
            
        
        
    }
    
  void display(){
      System.out.println("The weight " + weight + " Oz ");
      System.out.println("Shipping method " + shipping );
      System.out.println("Shipping cost " + cost + "$");
       System.out.println("----------------------");
    
  }
    
    
}
