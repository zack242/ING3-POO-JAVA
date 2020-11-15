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
public class ShortStory extends Story {

    final private double limitspage = 50;
    
    
    
    @Override
    public void setNumeberPage(double number){
    
        if(number>limitspage)
            message = "You need to cut " + (number-limitspage) + "pages" ;
        
        number_page = number ;
    }
    
}
