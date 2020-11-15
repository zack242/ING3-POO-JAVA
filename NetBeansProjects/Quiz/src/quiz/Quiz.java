/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author zack
 */
public class Quiz {
    
    Question[] Questions = new Question[5];
    private int points=0 ; 
    
     public static void main(String args[]) {
        new QuizPanel().setVisible(true);
       
    }
    
    
    
    public Quiz(){
        
    Questions[0] = new Question("Which country has the largest population in the world ?","China","France","USA",0);
    Questions[1] = new Question("Which is the largest country in the world ?","USA","Russia","India",1);
    Questions[2] = new Question("Which is the country with the least population ?","Vatican","Monaco","Lituania",0);
    Questions[3] = new Question("Which is the biggest country in Africa continent ?","Morroco","Tunisia","Algeria",2);
    Questions[4] = new Question("What is the capital city of America ?","New York","Washinghton","Las vegas",1);
     
              
    }
    
    int getpoint(){
         
        return points;
        
    }
    
    void Setpoint(int point){
        
        points+=point;
        
    }
    
    
    
    
  
 class Question {
     
     String quiz ; 
     String[] answers = new String[3]; 
     private int goodanswer ; 
     
     public Question(String quiz , String ans1 , String ans2 , String ans3,int goodanswer){
         
         this.quiz = quiz ; 
         answers[0]= ans1 ; 
         answers[1]= ans2;
         answers[2]= ans3;
         this.goodanswer=goodanswer; 
         
                
     }
       
     
    int correction(boolean ans0 , boolean ans1 , boolean ans2)
    {
      int nbr=0; 
      int pts = 0 ;
        
     if(ans0==true)
         nbr++;    
     if(ans1==true)
         nbr++; 
     if(ans2==true)
        nbr++;
     
     if(nbr==1)
         pts=5;
     
     if(nbr==2)
         pts=3;
     
     if(nbr==3)
         pts=1;
     
     
     switch(goodanswer) {
         
         case 0 :
             if(ans0==true)
              return pts;   
             
             break ; 
             
         case 1 : 
             if(ans1==true)
             return pts;
             
             break ; 
             
         case 2 : 
             if(ans2==true)
              return pts;
             
             break ;
              
         
     }
         
     return 0 ;
     }
     
    }
     
       
}
