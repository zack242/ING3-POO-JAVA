/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoriel.pkg4;

/**
 *
 * @author zack
 */
public abstract class Loan implements LoanConstants {
    
   protected   double number ; 
   protected  String lastname ;
   protected double amont ; 
   protected double interst_rate ;
   protected  String term ; 
    
   public Loan(double number , String lastname , double amont,String term,Double rate)
   {
     
       
   this.number = number ; 
   this.lastname = lastname ; 
   this.amont = amont ; 
   this.term = term ; 
   this.interst_rate = rate ;
  
         
   } 
  
   
    public void tostring() {
       
       System.out.println( "Name : " + lastname );
       System.out.println( "Number : " + number );
       System.out.println( "Amont : " + amont + " Term : " + term + " Interst :" + interst_rate +"%"  );
       
         
   }
    
    
        
    
}
