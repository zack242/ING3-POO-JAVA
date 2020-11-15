/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zack
 */

import java.util.Scanner;

        
public class NewClass {

public static void main() {
    
    String name ; 
    int hours ; 
    double prixhoraire ; 
    double salaire ; 
    
    
    Scanner Key = new Scanner(System.in);
    
    System.out.print("What's your name ? "); 
    name = Key.nextLine(); 
    System.out.print("How many hours did you work ? "); 
    hours = Key.nextInt();
    System.out.print("Whats is your hourly pay rate ? ");
    prixhoraire = Key.nextDouble() ;
    
    salaire = hours * prixhoraire ; 
    
    System.out.println("Hello  " + name);
    System.out.println("Your salary is " + salaire);
    
    
}    
    
    
}
