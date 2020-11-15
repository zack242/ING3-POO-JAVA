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
public class Customer extends Person {
   protected final  double Customer_number ;
   protected final  boolean mailing ; 
   
   public Customer(String name,String adress,double number,double Customer_number,boolean mailing)
   {
      super(name,adress,number);
      this.Customer_number = Customer_number; 
      this.mailing = mailing; 
      
            
   }
   
   void purchases(double total){
       System.out.println("Mr " + name);
       System.out.println("Your total is " + total );
           
   }
   
     
}
