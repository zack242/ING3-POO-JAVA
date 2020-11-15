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
public class BuyNItemsGetOneFree extends DiscountPolicy {
    
    protected int n=0 ;
   
    public BuyNItemsGetOneFree(int n )
    {
     this.n=n;
        
    }
    
    @Override
    double computeDiscount(double count, double itemCost){
      
        double discount =0 ; 
        
        if(count >= 3 && count <= 5)
        return  itemCost ;  
        
        else if(count > 5)
        return  itemCost*2 ;     
        
        else 
        return 0 ; 
    }
    
    
}
