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
public class Billing {
    
    
  double computeBill(double price){
      
     
      return price*1.08 ;
      
  }
    
   double computeBill(double price , double quantity ){
      
     
      return price*1.08*quantity ;
      
  }
    
    double computeBill(double price , double quantity ,double coupon ){
      double  temp = 0 ; 
       
      temp = price*quantity - coupon ; 
      return temp * 1.08 ;
      
  }
}
