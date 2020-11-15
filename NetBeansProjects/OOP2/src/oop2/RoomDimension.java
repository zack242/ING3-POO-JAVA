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
public class RoomDimension {
    
    double length ;
    double width ; 
    
    
    public RoomDimension(double newlength , double newwidth) {
        
        length = newlength; 
        width = newwidth ;  
        
    }
      
    
    double Getarea ()
    {
        
        return length*width ; 
        
    }
    
}
