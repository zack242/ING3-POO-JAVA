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
public class RoomCarpet {
    
   private  RoomDimension size ; 
    private double Carpetcost ; 
    
    public RoomCarpet(double leght , double width)
    {
       
       size = new RoomDimension(leght , width );  
       
        
    } 
    
    double getCostcarpet(double cost )
    {
        
        
        return size.Getarea() * cost ; 
        
    }
    
    
}
