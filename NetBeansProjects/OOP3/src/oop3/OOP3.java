/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3;
import java.util.Scanner;
 

/**
 *
 * @author zack
 */
public class OOP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DemoCabinRental();
      //  UseCourse();
      // retailStore();
     // USEpackage() ;
        
    }
    
//EXO 1     
static void  DemoCabinRental()
{
    Scanner key = new Scanner(System.in);
    int number ; 
    int typeofroom; 
    
   
    System.out.println("Plese insert the number of the room : ") ; 
    number=key.nextInt();
    System.out.println("Type of the cabine :\n 1/Regular Room \n 2/Holiday Home") ; 
    typeofroom = key.nextInt();
    
    switch (typeofroom){
        
        case 1 : 
            CabinRental Room = new CabinRental(number);
            Room.display();
            break ; 
            
        case 2 : 
            HolidayCabinRental Room2 = new HolidayCabinRental(number) ; 
            Room2.display();
            break ;
                  
   
    }
    
   

} 
 
//EXO 2
static void UseCourse()
    {
    String Course ;  
    int number ; 
    int credit ; 
    Scanner key = new Scanner(System.in);    
    System.out.println("What is your course : ");
    Course = key.nextLine(); 
    System.out.println("What is number : ");
    number = key.nextInt();
    System.out.println("Number of credit :");
    credit = key.nextInt();
    
   
    switch(Course){
        
        case "BIO", "CHM", "CIS","PHY" -> {
            LabCourse A = new LabCourse(Course,number,credit);
            A.display();
            }
        default -> {
            CollegeCourse B = new CollegeCourse(Course,number,credit);
            B.display();
            }
                  
    }
     
          
    }


static void retailStore()
{   
    String name ; 
    String adress ; 
    double number ;
    double total=0 ; 
    double CustomerNumber ; 
    boolean mailing ;
    double amount ; 
    
    Scanner key = new Scanner(System.in);    
    System.out.println("What is your name : ");
    name = key.nextLine(); 
    System.out.println("What is your adress : ");
    adress = key.nextLine();
    System.out.println("Number :");
    number = key.nextDouble();
    System.out.println("Do you want mailing :");
    mailing = key.nextBoolean();
    System.out.println("Customer Number");
    CustomerNumber=key.nextDouble();  
    System.out.println("Amount");
    amount=key.nextDouble(); 
    System.out.println("total :");
    total=key.nextDouble(); 
        
    Customer A = new Customer(name,adress,number,CustomerNumber,mailing);
    Customer B = new PreferredCustomer(name,adress,number,CustomerNumber,mailing,amount);
    
     A.purchases(total);
     System.out.println("For our preferred customer ");
     B.purchases(total);
     
   
  
}


static void USEpackage()
{
    Package A = new Package(10,'M');
    Package B = new Package(4,'A');
    Package C = new Package(40,'T');
    
    InsuredPackage D = new InsuredPackage(10,'M');
    InsuredPackage E = new InsuredPackage(4,'A');
    InsuredPackage F = new InsuredPackage(40,'T');
    
    A.display();
    B.display();
    C.display();
    D.display();
    E.display();
    F.display();
    
  
}

 
    
}

