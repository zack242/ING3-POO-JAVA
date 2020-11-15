/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpnote;

/**
 *
 * @author zack
 */
public class CalculatorException extends Exception {
    protected boolean quit ; 
    
    public CalculatorException (String message) //Overriding the constructor of Exception 
    {
        super(message);
        quit = false ; 
    }
    
    public CalculatorException (String message , boolean quit) //Overriding the constructor of Exception 
    {
        super(message);
        this.quit=quit;
    }
    
    boolean getquit(){ 
        return quit ; 
    }
    
    
    
}
