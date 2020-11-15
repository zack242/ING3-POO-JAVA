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
public class ShuffleCipher implements MessageEncoder {

    private int  n =0 ; 
    
    public ShuffleCipher(int n){
     this.n=n;
        
    }
       
    private String suffle(String plainText)
    {
    
        
        String code=" ";
        for(int i = 0 ; i <plainText.length()/2 ; i++)
        {
             code=code+plainText.charAt(i)+plainText.charAt(plainText.length()/2 + i);
             
        }
          
        return code; 
                  
    }
    
    @Override
    public String encode(String plainText){
        
        for(int i = 0 ; i < n ; i++)
            plainText = suffle(plainText);
        
        return plainText;
        
    }
    
    
    
    
}
