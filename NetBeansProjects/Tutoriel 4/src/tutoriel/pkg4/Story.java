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
public abstract class Story {
    
   protected  String title ; 
   protected  String author_name ; 
   protected  double number_page ;
   protected  String message ;
  
   
   
   
   
   
   
   String getTitle() {
       
      return title ;
       
   }
   
   String getAuthor() {
       
      return author_name ;
       
   }
   String getMessage() {
       
      return message ;
       
   }
   
   double getNumberofpage(){
       
       return number_page; 
   }
   
   void setTitle( String title ) 
   {
       
    this.title=title ;   
       
   }
   
   void setAuthor( String author_name ) 
   {
       
    this.author_name = author_name ;   
       
   }
   
   void setMessage( String message ) 
   {
       
    this.message = message ;   
       
   }
   
   void display()
   {
    System.out.println("Author : " + author_name);
    System.out.println("title : " + title);
    System.out.println("pages : " + number_page);
    System.out.println("Message: " + message);
    
       
       
   }
   
   
   
   
  public abstract void setNumeberPage(double number) ;  
   
      
}
