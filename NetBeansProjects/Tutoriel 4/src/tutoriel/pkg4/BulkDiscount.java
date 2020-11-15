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
public class BulkDiscount extends DiscountPolicy {

    protected int  minimum = 0 ; 
    protected double percent = 0 ; 
     
    public BulkDiscount(int minimum , double percent)
    {
      this.minimum = minimum ; 
      this.percent = percent; 
    }
      
    @Override
    double computeDiscount(double count, double itemCost)
    {
        if(count > minimum)
           return itemCost - (itemCost * percent) ;  
        else 
            
        return 0 ; 
    }
    
    
}
