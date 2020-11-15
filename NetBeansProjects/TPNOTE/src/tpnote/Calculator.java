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
public class Calculator {
    
    
     
    public static int compute ( String [ ] tokens ) throws CalculatorException //compute classe use to compare the legth of tokens 
    {
       
        int length = 0 ;  //Declaration of variable 
        int tmp = 0 ;
        int quit = 0 ; 
        
        for(int i = 1 ; i < tokens.length ; i++ )
        {
            
            length=tokens[0].length(); //We compare all the tokens with the length of the first tokens 
            tmp = tokens[i].length();
              
              
            if(length==tmp)   //If 2 tokens have the same length we incremente ++  
              quit ++ ; 
             
            else if(length != tmp && quit == 0)//if to tokens havent the same length we throw a Calculator Exception       
            throw new CalculatorException("Exception : No token are equal to the input"); 
          
            else if(length !=tmp && quit != 999 )//if to tokens havent the same length and 2 passed tokens get the same length we throw a other Calculator Exception                    
            throw new CalculatorException("Exception : Only one token is equal to the input",true); 
                            
                 
        } 
            
        return length ; 
    }

    
    
    
    public static boolean parseAndCompute ( String input ) {
         
        int length = 0 ; 
        
        String[] tokens = input.split(" "); // we use the methode .split to separate the string in tokens 
        
        System.out.println("--------------------"); 
        for (String token : tokens) {
            System.out.println("Tokens : " + token);
        }
        System.out.println("--------------------"); 
      
        //Try and Catch some Exception from the methode compute 
        try {
            
            length = compute(tokens);
            
        } catch (CalculatorException ex){
            
            System.out.println(ex.getMessage());
            
            return ex.getquit() ; // if an error we exit the programme with booleen 
            
        }
        
        System.out.println("The length of the tokens is " + length); // We print the result 
       
        return true ; 
    }
    
    
}
