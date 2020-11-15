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
public class RetailItem {
    
  private String description  ; 
   private int unitsOnHand ; 
   private double  price ; 
   
   public RetailItem(String description ,int unitsOnHand ,double  price ){
       
       this.description=description ; 
       this.unitsOnHand = unitsOnHand ; 
       this.price = price ; 
            
   }
   
   String getDescription(){
       return description ; 
   }
   
   int getUnitsOnHand(){
       return unitsOnHand ; 
   }
   
   double getPrice(){
       return price ;
   }
    
    
    
    
}
