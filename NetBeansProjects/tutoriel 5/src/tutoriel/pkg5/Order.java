/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoriel.pkg5;

import java.util.ArrayList;

/**
 *
 * @author zack
 */
public class Order {
    
    double number ; 
    String name ; 
    String adress ; 
    ArrayList<Gadget> items; 
    double total ; 
    double fee; 
    
    public Order(double number , String name , String adress ){
        this.items = new ArrayList <>() ;
        this.number=number ; 
        this.name=name ; 
        this.adress = adress ;
        total = 0 ; 
        
        
    }
    
    public void  Additem(Gadget item ,int numberitem){
        
        for(int i = 0 ; i < numberitem ; i++)
        {
        items.add(item);
        total += item.getPrice();
        }
    }
    
    public void CalculateShipping()
    {
     
       if(total < 24.99)
           fee = 5.55 ; 
       else if (total > 25 && total < 49.99)
           fee = 8.55 ;
       else 
           fee=11.55 ; 
       
       total+=fee;
        
    }
    
    
    public void display(){
        
        CalculateShipping();
        System.out.println("Number : " + number);
        System.out.println("Name : " + name);
        System.out.println("Adress : " + adress);
        
        for(int i = 0 ; i < items.size() ; i++ )
           System.out.println(items.get(i)); 
        
        System.out.println("Total " + total);
        
        
        
    }
    
}
