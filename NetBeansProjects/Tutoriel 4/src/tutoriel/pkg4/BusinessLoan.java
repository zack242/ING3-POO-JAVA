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
public class BusinessLoan extends Loan  {
    
   public BusinessLoan(double number , String lastname , double amont,String term,double rate)
   {
       super(number,lastname,amont,term,rate);
       interst_rate += 1 ;
       
       
   }
    
    
    
}
