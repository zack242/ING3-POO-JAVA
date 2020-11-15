/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author zack
 */
public class Party {
    
    private final char grid[] = new char[9]; 
    private final int empty[] = new int[9]; 
    
    
    public Party() 
    {
    char k='1' ;    
          for(int i = 0 ; i < 9 ; i++ )
          {
            grid[i]=k; 
            empty[i]=0;
            k++;
        
           }       
    }   
       
       
    void display(){  
        
        JOptionPane.showMessageDialog(null,grid[0] +  " " + grid[1] + " " + grid[2]  
                                  + "\n" + grid[3] +  " " + grid[4] + " " + grid[5] 
                                  + "\n" + grid[6] +  " " + grid[7] + " " + grid[8]) ;
        
   
        }
    
    
        
              
            
    
    
    void player(int pos){
         
      if ( empty[pos]==0 )
       {
         grid[pos]='X';
         empty[pos]=1 ;
                      
       }else{
               
          JOptionPane.showMessageDialog(null, "You can play this position");
           
       }
          
    }
     
    void IA()
    {
      Random randomGenerator = new Random();
      int pos ; 
      
      do{
          pos = randomGenerator.nextInt(9);
         
          
      }while(empty[pos]==1 ) ; 
            
         grid[pos]='0';
         empty[pos]=1 ;
                              
    }
    
    
    Boolean win()
    {
        
     if(grid[0]==grid[1] && grid[1]==grid[2] ||
        grid[3]==grid[4] && grid[4]==grid[5] ||
        grid[6]==grid[7] && grid[7]==grid[8] ||
        grid[0]==grid[3] && grid[3]==grid[6] ||
        grid[1]==grid[4] && grid[4]==grid[7] ||
        grid[2]==grid[5] && grid[5]==grid[8] ||
        grid[0]==grid[4] && grid[4]==grid[8] ||
        grid[2]==grid[4] && grid[4]==grid[6] )
     {
         
      return true ; 
         
         
     }else{
         
         return false ; 
         
     }
  
        
    }
    
    void playingsystem()
    {
     int k=0 ;
     String temp ;
     
     JOptionPane.showMessageDialog(null, "Welcome to Tic Tac Toe ! ");
     display();
     
    do {
        
      if((k%2)==0)
      {
      temp = JOptionPane.showInputDialog("Your turn"); 
      player(Integer.parseInt(temp)-1);
          
      }else{
          
        IA(); 
          
      }  
        
      display();
        
      k++;    
     }while(win()==false);
     
     if(k%2==1)
     JOptionPane.showMessageDialog(null, "You win");
     else 
     JOptionPane.showMessageDialog(null, "IA win");
         
     
        
    }
    
    
     
    
}
