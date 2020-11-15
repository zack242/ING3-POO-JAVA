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
public class PreferredCustomer extends Customer{
    
    private double amount ;
    private int discount ; 
    
    public PreferredCustomer(String name,String adress,double number,double Customer_number,boolean mailing,double amount ){
        super(name,adress,number,Customer_number,mailing);
        this.amount = amount ; 
      
        
        
    }
    
    
    @Override
    void purchases(double total){
        amount += total ; 
        
       if(amount > 500 )
                discount = 5;
       if (amount > 1000) 
              discount = 6;
       if(amount > 1500)       
              discount = 7 ; 
       if(amount > 2000)       
              discount = 10 ; 
              
                           
       System.out.println("Mr " + name);
       System.out.println("Your total is " + ((100-discount)*total)/100 );
       System.out.println("You got " + discount +"% of discount");
        
    }
    
    
   
    
}
