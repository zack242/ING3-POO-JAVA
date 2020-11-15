/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;

/**
 *
 * @author zack
 */
public class Recording {
    
  private String title ; 
  private String artist ; 
  private  double time ; 
   
  public Recording(String title , String artist , double time)
  {
      this.title = title ; 
      this.artist= artist ; 
      this.time = time ; 
  }
  
  
   public String  getTitle() {
       return title ; 
   }
   public String getArtist() {
       return artist ;
   }
   public double getTime(){
       return time ;     
   }
   
    
   public void display()
   {
           System.out.println("Title : " + title );
           System.out.println("Artist : " + artist );
           System.out.println("Time : " + time);
          
       
   }
    
    
}
