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
public class SubstitutionCipher implements MessageEncoder {
   
    private int shift=0 ; 
    
    public SubstitutionCipher(int shift){
        this.shift=shift ; 
        
    }

    @Override
    public String encode(String plainText)
    {
        StringBuilder Textencode = new StringBuilder(); 
        
      
        for(int i = 0 ; i < plainText.length() ;i++){
            
             Textencode.insert(i,(char)(plainText.charAt(i)+ shift)); 
           
        }
          
            
        return Textencode.toString(); 
        
    }
       
}
