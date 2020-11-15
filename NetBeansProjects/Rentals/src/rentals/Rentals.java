/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentals;


public class Rentals {
    
    private final int  ParkSideCoast = 600;
    private final int  PoolSideCoast = 750;
    private final int  LakeSideCoast = 825 ; 
    private final int  Addbedroom = 75 ; 
    private final int  AddMeals = 200 ;
    private boolean meals = false ;
    private int total=0 ; 
    private int totalbed=0;
    
   
    public static void main(String[] args) {
       new RentalsVisual().setVisible(true);
      
        
    }
    
    public Rentals(int Location){
       
       if(Location == 1)
           total += 600 ; 
       if (Location == 2)
           total +=750 ; 
       if(Location == 3)
           total +=825 ; 
         
    }
    
    void AddBedroom(int room){
        
    
        totalbed=room*Addbedroom ; 
        
        
    }
    
    void AddMeals(){
        if(meals == false)
        total +=200 ; 
        
        meals = true ; 
        
    }
    
    int getTotal(){
        return total+totalbed ;
    }
    
}
