/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import Controller.ConnexionSQL;
import Model.Company;
import View.LoadingPage;
import java.sql.SQLException;

/**
 *
 * @author zack
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
      ConnexionSQL A =  new ConnexionSQL();
      new LoadingPage().setVisible(true);
      // new mainPage().setVisible(true);
       Company mycompany = new Company();
      
     
      
    }
    
}
