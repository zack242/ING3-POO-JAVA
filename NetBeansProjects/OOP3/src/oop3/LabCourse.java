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
public class LabCourse extends CollegeCourse {
    
 public LabCourse(String department , int course_number , int credit)
 {
     super(department,course_number,credit);
     feeparhour += 50 ; 
         
 }   

   

 @Override 
void display()
   {
    System.out.println("DATA OF LAB COURSE ");
    System.out.println("Departement : " + department);
    System.out.println("Course number : " + course_number);
    System.out.println("Credits : " + credit); 
    System.out.println("fee : " + feeparhour);
   } 


 
    
}
