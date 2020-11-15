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
public class SavingsAccount {
    
    private double balance ;
    private double interest ;
    
    
   public  SavingsAccount(double newbalance , double anualinterest ){
       
       balance = newbalance;
       interest=anualinterest ; 
      
   } 
   
   public void subtracting(double amount) {
       
       balance = balance - amount ; 
       
   }
   
     public void deposit(double amount) {
       
       balance = balance + amount ; 
       
   }
      
    public double monthlyinterest () {
       
       balance = balance + balance * (interest/12 ); 
       
       return balance ; 
              
       
   }
       
    
}
