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
public class Rental {
    
    public double numberofminutes ; 
    public  static double rentalrate=40;
    private double minutesoverhour; 
    private int rentalhours ;
    private double price ; 
    private String contractnumber ; 
    
    public Rental(String  contractnumber , double numberofminutes){
        
        this.contractnumber = contractnumber ; 
        this.numberofminutes = numberofminutes ; 
     
    }
    
    public Rental(){
        
         contractnumber = "A000" ; 
         numberofminutes = 100 ; 
     
    }
    
    double totalprice()
    {
       rentalhours = (int) (numberofminutes/60) ; 
       System.out.print(rentalhours);
       minutesoverhour = numberofminutes - (rentalhours*60) ;  
       price = rentalhours * rentalrate ; 
       
       return price ; 
                 
    
    }
    
    void display(){
        
        totalprice();
        
        System.out.println("Contract : " + contractnumber );
        System.out.println("Rental hours : " + rentalhours) ; 
        System.out.println("minutes : " + minutesoverhour) ; 
        System.out.println("Price  : " + price ) ; 
        
         
    }
    
    
    
    
    
    
    
}
