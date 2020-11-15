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
public class Gadget {
    
    protected double item ; 
    protected String description ; 
    protected double price ; 
    
    public Gadget(double item , String description ,double price){
        
        this.description = description ; 
        this.item=item; 
        this.price=price ; 
        
    }
    @Override
    public String toString()
    {
        return item + " : " + description + " : " + price;
           
    }
    
    public double getPrice(){
        
        return price ; 
    }
    
    
}
