/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoriel.pkg5;

import java.util.Scanner;
import java.lang.NumberFormatException;

/**
 *
 * @author zack
 */
public class GadgetOrderTaker {
    
    protected static Gadget []tableau = new Gadget[4];
    protected static int ordernum = 100;
    
    
   public GadgetOrderTaker()  
   {
       
   tableau[0] = new Gadget(101,"Electric hand warmer",12.99);
   tableau[1] = new Gadget(124,"Battery-operated plant waterer",7.55);
   tableau[2] = new Gadget(256,"Gerbil trimmer",9.99);
   tableau[3] = new Gadget(512,"Talking bookmaker",6.89);
   
   for(int i=1 ; i < tableau.length ; i++ )
       System.out.println( i + " / " + tableau[i]) ;
       
   main();
   }
    
 public static void main()
 {
    Scanner key = new Scanner(System.in);  
    String name;
    String adress;
    int itemnumber=0;
    int quantity =0;
    int numberitem = 0 ; 
    
   
    System.out.println("Name ");
    name = key.next();
    System.out.println("Adress");
    adress = key.next();
    
    Order A = new Order(ordernum++,name,adress);
    
   
        
    do{ 
        
    try {  
        
    numberitem++ ;     
    System.out.println("Item number");
    itemnumber= key.nextInt();
    
    if(itemnumber < 0 && itemnumber > 4)
     throw (new OrderException ("Invalide number item ")); 
   
    if(itemnumber!=999){
        
    System.out.println("Quantity");
    quantity= key.nextInt();
    
    if (quantity > 100)
        throw (new OrderException ("Max quantity reach")); 
    
    A.Additem(tableau[itemnumber],quantity); 
        
    }
    
    if(numberitem>4)
       throw (new OrderException ("Max item number reach")); 
     
     }catch(OrderException | NumberFormatException e )
     {
     System.out.println(e.getMessage());
     System.exit(1);   
     }
    
    
    }while(itemnumber!=999) ; 
   
    System.out.println("Order Complete");
    A.display();
       
     
 }
   
    
}
