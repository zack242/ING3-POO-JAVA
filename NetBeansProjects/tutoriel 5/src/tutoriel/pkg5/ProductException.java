/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoriel.pkg5;

/**
 *
 * @author zack
 */
public class ProductException extends Exception {
    
    private String Message ; 
    
    public ProductException(String productNum , double price){
       
        
        if( productNum.length() != 3)
         Message = "Wrong product number" ; 
        else if(price < 0.01)
         Message = "Wrong price less than 0.01$ ";
        else if(price > 1000)
         Message = "Wrong price over than 1000$ ";
        else 
            Message = "Build Succes";
        
        
        
        
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getMessage()
    {
     return Message ;    
    }
    
    
}
