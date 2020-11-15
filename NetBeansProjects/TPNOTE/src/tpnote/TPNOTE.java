/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpnote;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zack
 */
public class TPNOTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        CalculatorTest A = new CalculatorTest(); // Q1 
        A.main();
        // Q2(); //Q2 fonction 
        
    }
    
    
   static void Q2() {
    
        Scanner key=new Scanner(System.in);
        ArrayList<Integer> rock=new ArrayList<Integer>();
        int nbRock, location, jump=0, value = 0, calcul;
        
        System.out.println("Enter the number of rock");
        nbRock=key.nextInt();
        System.out.println("Enter the position of the "+nbRock+" rocks");
        
        // Add the rock
        for(int i=0;i<nbRock;i++)
        {
            location=key.nextInt();
            rock.add(location);
        }
        
        
        while(rock.get(nbRock-1)>0)
        {
            
            for(int i=0; i<rock.size();i++)
            {
                // If the roc is too far
                if((rock.get(i)>50)&&(i-1>=0)&&(rock.get(i-1)>0))
                {
                    // If it is the first it's impossible
                    if(i==0)
                    {
                        jump=-1;
                        value=rock.get(i);
                        i=rock.size();
                       
                        
                    }
                    
                    //If it's the last, it's impossible
                    else if(i==(nbRock-1))
                    {
                        jump=-1;
                        value=rock.get(i);
                        i=rock.size();
                       
                    }
                    
                    // else we take the previous rock
                    else
                    {
                        value=rock.get(i-1);
                        jump=jump+1;
                        i=rock.size();
                    }
                }
                
                // if it's the last rock and it's near
                else if((rock.get(i)<=50) &&(i==(nbRock-1)) )
                {
                    value=rock.get(i);
                     jump=jump+1;
                     i=rock.size();
                }
                
                // if there are nothning possible
                else if(rock.get(i)>50)
                       
                {
                   jump=-1;
                   value=rock.get(i);
                   i=rock.size(); 
                    
                }
                
                
            }
            
            // Calcule the new distance
            for(int j=0;j<rock.size();j++)
            {
                
                calcul=rock.get(j)-value;
                rock.set(j,calcul);
                
            }

        }
        
        System.out.println(jump);
    }
   
    
    
}
