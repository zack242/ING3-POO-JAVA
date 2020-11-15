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
public class StoryDemo {
    
    Story[] storys = new Story[6]; 
    
    public StoryDemo(){
        
       // Novel 
       Novel story1 = new Novel();
       Novel story2 = new Novel();
       
      story1.setAuthor("Popin");
      story1.setTitle("Belle et bete ");
      story2.setAuthor("Rumus");
      story2.setTitle("la colonie ");
      
      
       story1.setNumeberPage(120);
       story2.setNumeberPage(80);
       
       
      //Novella
       Novella story3 = new Novella();
       Novella story4 = new Novella();
       
      story3.setAuthor("Victor");
      story3.setTitle("LEs miserables");
      story4.setAuthor("Tony");
      story4.setTitle("le village perdu ");
      
      
       story3.setNumeberPage(10);
       story4.setNumeberPage(80);
       
       
       //ShortStory 
      ShortStory story5 = new ShortStory();
      ShortStory story6 = new ShortStory();
       
      story5.setAuthor("Beauvais");
      story5.setTitle("le rat");
      story6.setAuthor("albert");
      story6.setTitle("Camus ");
      
      
      story5.setNumeberPage(40);
      story6.setNumeberPage(60);
       
      
     storys[0]=story1 ; 
     storys[1]=story2 ; 
     storys[2]=story3 ;
     storys[3]=story4 ;
     storys[4]=story5 ;
     storys[5]=story6 ; 
            
         
        
    }
    
    
    void display(){
        
      for(int i = 0 ; i<6 ; i++)
     {
         
        storys[i].display(); 
         
     }
    }
            
    
    
    
}
