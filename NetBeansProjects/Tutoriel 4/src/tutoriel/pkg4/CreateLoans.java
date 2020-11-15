/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoriel.pkg4;
import java.util.Scanner;
/**
 *
 * @author zack
 */
public class CreateLoans implements LoanConstants {
    
    Loan[] Loans = new Loan[5];
    Scanner key = new Scanner(System.in);
    
  
 public CreateLoans ()
 {
    String name,type,term;
    double rate,amont,number;
     
     System.out.println("What is current prime interest rate ?");
     rate = key.nextDouble();
     
     
     for(int i = 0 ; i <2 ; i++ )
     {
       System.out.println("Number ? ");
       number=key.nextDouble();
       System.out.println("Last name ? ");
       name=key.next();
       System.out.println("Type of loan ?");
       type=key.next();
       System.out.println("Amont ?");
       amont=key.nextDouble();
       System.out.println("Term ?");
       term=key.next();
       
      if(amont > maxloan){
       amont=maxloan ;      
       }
       
       if(term != short_term || term != medium_term || term != long_term){
       System.out.println("Try again the term ?");
       term=key.next();    
       }
       
                
       if("Personal".equals(type))
           Loans[i]=new PersonalLoan(number,name,amont,term,rate);
       else if("Business".equals(type))
           Loans[i]=new BusinessLoan(number,name,amont,term,rate);
         
       
     }
     
     for(int i = 0 ; i<2 ; i++)
     {
        
         System.out.print(Loans[i]); 
     }
     
     
 }   
    
    
    
}
