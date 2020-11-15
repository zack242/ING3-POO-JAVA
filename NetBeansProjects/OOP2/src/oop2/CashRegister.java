/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;

/**
 *
 * @author zack
 */
public class CashRegister {
    
    private final RetailItem Items ; 
    private final int itempurchased ; 
    private double  Subtotal = 0 ; 
    
    public CashRegister(RetailItem Items , int itempurchased) 
    {
        this.Items = Items ; 
        this.itempurchased=itempurchased ; 
      
    
    }
   
    public double getSubtotal() {
        
        Subtotal = itempurchased * Items.getPrice();
        return Subtotal ;
        
    }
    
    public double  getTax() {
        
        return Subtotal*0.06 ;  
        
    }
    
    public double  getTotal()
    {
        return getSubtotal()+ getTax() ; 
        
    }
    
    
}
