/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;
import java.util.Scanner ; 

/**
 *
 * @author zack
 */
public class OOP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);  
     /*  
       //Exo 1
        double balance = 0 ; 
        double  Interest = 0 ; 
        double NumberofMonths=0;  
        double amount = 0 ; 
       
       
        
        System.out.print("Your balance : ");
        balance = key.nextDouble();
        
        
        System.out.print("Anual Interest : "); 
        Interest = key.nextDouble(); 
        
        
        System.out.print("Number of months : ");
        NumberofMonths= key.nextDouble();
        
        SavingsAccount A = new SavingsAccount(balance,Interest); 
        
        for(int i = 0 ; i<NumberofMonths ; i++ ) 
        {
          System.out.print("Your deposit amount for the months  : ");
          amount = key.nextDouble();
          System.out.print("Your withdraw amount for the months : ");
          amount = key.nextDouble();
          System.out.println("Your monthly interst : " +  A.monthlyinterest() );
          
                 
            
        }
        
        */
     
        /*
        //Exo 2 
        Billing A = new Billing(); 
        
        System.out.println("Price "+  A.computeBill(3));
        System.out.println("Price "+  A.computeBill(10,2));
        System.out.println("Price "+  A.computeBill(32,4,10));
        
       */    
        
        /*
        //Exo 3 
        Rental obj1 = new Rental(); 
        String contract ; 
        double minutes=0 ; 
        System.out.print("Your contract number : ");
        contract = key.nextLine();
        System.out.print("Number of minutes : ");
        minutes = key.nextDouble();
        
        Rental obj2 = new Rental(contract,minutes) ;
        System.out.println("--------------------");
        
       
        
        obj1.display();
        
        obj2.display();
            
        */
        /*
        
        // Exo 4 
        
        double legth=0 , width=0 ;
        double price = 0 ; 
         System.out.println("Enter the dimension of the room");
         System.out.print("legth : ");
         legth = key.nextDouble(); 
         System.out.print("width : ");
         width = key.nextDouble(); 
         System.out.print("The price per square  : ");
         price = key.nextDouble(); 
         
         RoomCarpet A = new RoomCarpet(legth,width); 
         System.out.print("The cost is " + A.getCostcarpet(price));
         
       */
      
       /* 
        // EXO 5 
        RetailItem[] tab = new RetailItem[3]; 
        int items = 0 ;  
        
        tab[0] = new RetailItem("Jack",12,59.95);
        tab[1] = new RetailItem("Designer Jeans",40,34.95);
        tab[2] = new RetailItem("Shirt",20,24.95);
        
        System.out.print("What is the quantity of items being purchased : ");
        items = key.nextInt();
        
        CashRegister A = new CashRegister(tab[0],items); 
        
        
        System.out.println("Total witout TAX : " + A.getSubtotal() );
        System.out.println("Total with TAX : " + A.getTotal() );
        
        */
       
       /*
       //EXO 6 
       int numberofRecording = 2 ; 
       
       Recording[] tab = new Recording[numberofRecording]; 
       for(int i = 0 ; i < numberofRecording ; i++)
 {
           System.out.println("Title : ");
           String title = key.nextLine();
           System.out.println("Artist : ");
           String artist = key.nextLine();
           System.out.println("Time : ");
           int time = key.nextInt();
           System.out.println("");
           
        
           tab[i]=new Recording(title,artist,time);
                   
  }
      
       int temp = 0 ;
       System.out.println("Sorted by : 1/Song title  2/Artist  3/Playing time ");
       temp = key.nextInt();
       
       */
       
       
          
         
         
    }
    
  
    
    
    
}
