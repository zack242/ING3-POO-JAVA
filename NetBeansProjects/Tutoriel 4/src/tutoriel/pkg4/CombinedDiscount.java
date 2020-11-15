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
public class CombinedDiscount extends DiscountPolicy {
 
    DiscountPolicy first , second ;    
    
    public CombinedDiscount(DiscountPolicy first , DiscountPolicy second)
    {
     this.first =  first ; 
     this.second = second ; 
        
    }
    
    
    @Override
    double computeDiscount(double count, double itemCost){
        
        double discount=0 ; 
        
        discount = first.computeDiscount(count, itemCost); 
        
        if(discount < second.computeDiscount(count, itemCost)) 
            discount = second.computeDiscount(count, itemCost) ; 
        
        return discount ; 
       
    }
    
    
}
