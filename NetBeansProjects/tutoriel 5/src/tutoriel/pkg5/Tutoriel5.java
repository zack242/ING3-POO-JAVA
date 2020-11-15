/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoriel.pkg5;

import static java.awt.SystemColor.text;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author zack
 */
public class Tutoriel5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       //  exo2();
      // GadgetOrderTaker A = new GadgetOrderTaker();
         
      PrintWriter output = new PrintWriter("/Users/zack/NetBeansProjects/tutoriel 5/src/tutoriel/pkg5/ValidNumber.txt");
      File file = null ;  
      
        try {
        file = new File("/Users/zack/NetBeansProjects/tutoriel 5/src/tutoriel/pkg5/390234.txt");
        Scanner input = new Scanner(file);
        
        while(input.hasNext())
        {
            
            String tmp = input.next();
            String[] tab = tmp.split(""); 
            double som =0 ; 
             
            for(int i = 0 ; i < 5 ; i++ )
            {   
             som += Double.parseDouble(tab[i]);   
             
            }
            if( som%10 == Double.parseDouble(tab[5])){
                System.out.print(tmp);
                output.print(tmp);
                
            }
          
        }
        }catch(FileNotFoundException e ){
             
             System.out.print(e.getMessage());
             
         }
         
          output.close();
       

     exo5();         
    }
    
    
    void exo1(){
        
        Scanner key = new Scanner(System.in) ; 
        int value = 0 ; 
        double result ; 
        
         try {
             
          System.out.print("value :");
          value = key.nextInt(); 
          result =  Math.sqrt(value); 
          
           if (Double.isNaN(result) ==true) 
            throw new ArithmeticException("positif number only");
           else 
              System.out.print(result);
           
        }catch(ArithmeticException e)
        {
         
            System.out.print(e.getMessage());
            
        }
        
    }
    
    static void exo2()
    {
        
    try{
     Product A = new Product("AAbA",100);
     
    }catch (ProductException e)
    {
        System.out.println(e.getMessage());
    }    
    try{
     Product B = new Product("AAA",100);
     
    }catch (ProductException e)
    {
        System.out.println(e.getMessage());
    }  
    try{
     Product C = new Product("CCC",1001);
     
    }catch (ProductException e)
    {
        System.out.println(e.getMessage());
    }   
     try{
    Product D = new Product("DDD",0.001);
     
    }catch (ProductException e)
    {
        System.out.println(e.getMessage());
    }      
              
        
        
    }
    
    
    static void exo5() throws FileNotFoundException{
        
        
       PrintWriter highfile = new PrintWriter("high-performers");
       PrintWriter lowfile = new PrintWriter("low-performers");
        
        
        int idnumber,currentssales ; 
        String lastname,firstname;
        
        Scanner key = new Scanner(System.in);
        
        System.out.println("id number"); 
        idnumber= key.nextInt();
        System.out.println("Last name ");
        lastname= key.next();
        System.out.println("First name ");
        firstname= key.next();
        System.out.println("current sales ");
        currentssales =  key.nextInt(); 
      //  System.out.print(idnumber + lastname + firstname + currentssales);
        
        String tmp = idnumber + " " + lastname + " " + firstname + " " + currentssales + "$" ; 
       
        if(currentssales > 1000)
          highfile.print(tmp);
        else 
         lowfile.print(tmp);   
       
               
        highfile.close();
        lowfile.close();
        
        
     
    }
    
}

