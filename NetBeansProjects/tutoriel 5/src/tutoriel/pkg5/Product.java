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
public class Product {
    
   String productNum; 
   double price ; 
   
    
    public Product(String productNum , double price) throws ProductException
    {
        
        this.productNum=productNum ; 
        this.price=price ;
        throw new ProductException(productNum,price);
             
        
    }
    
}
