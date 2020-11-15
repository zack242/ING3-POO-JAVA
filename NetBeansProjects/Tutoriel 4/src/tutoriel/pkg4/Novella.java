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
public class Novella extends Story {

    
    final private double minlimitspage = 50;
    final private double  maxlimitspage = 100;
    
    @Override
    public void setNumeberPage(double number){
        
        if(number < 50)
          message = "You need to add " + (minlimitspage-number) + "pages";
        else if(number > 100)
           message = "You need to cut " + (number-maxlimitspage) + "pages";
        
        number_page = number ; 
            
        
    }
    
}
