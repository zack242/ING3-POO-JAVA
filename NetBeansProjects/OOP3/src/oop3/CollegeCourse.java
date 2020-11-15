/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3;

/**
 *
 * @author zack
 */
public class CollegeCourse {
    
   protected String department ; 
   protected int course_number ; 
   protected int credit ; 
   protected int  feeparhour = 120;
   
   public CollegeCourse (String department , int course_number , int credit)
   {
      this.department =  department ; 
      this.course_number = course_number ; 
      this.credit = credit ; 
       
   }
   
   void display()
   {
    System.out.println("DATA OF COURSE ");
    System.out.println("Departement : " + department);
    System.out.println("Course number : " + course_number);
    System.out.println("Credits : " + credit);
    System.out.println("fee : " + feeparhour);
    
   }
   
    
 
}
