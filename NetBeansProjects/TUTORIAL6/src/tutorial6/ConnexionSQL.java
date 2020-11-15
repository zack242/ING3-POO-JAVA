/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial6;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * 
 * Librairies importées
 */
import java.sql.*;
import java.util.ArrayList;


/**
 * 
 * Connexion a votre BDD locale ou à distance sur le serveur de l'ECE via le tunnel SSH
 * 
 * @author segado
 */

public final class ConnexionSQL {

  
    private ResultSet rset;
    private ResultSetMetaData rsetMeta;
    private Connection conn ; 
    private Statement stmt = null ;
    
   
   
    public Connection getConnexion() throws SQLException, ClassNotFoundException{
      
        
        try {
           
       //  String urlDatabase = "jdbc:mysql://db4free.net:3306/bd_zakaria?verifyServerCertificate=false&useSSL=true";
       String urlDatabase = "jdbc:mysql://localhost:8889/" + "cities?verifyServerCertificate=false&useSSL=true";
        Class.forName("com.mysql.jdbc.Driver");
      
        conn =  DriverManager.getConnection(urlDatabase,"root","root");
        System.out.print("Connexion reussi ");
        stmt = conn.createStatement();
        return conn ; 
        
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
       
        return null ; 
  
   
    }
    
     public  ConnexionSQL() throws Exception{
       
       conn = getConnexion(); 
       String sql = "SELECT * FROM `city` ; ";   
       stmt = conn.createStatement() ;
       rset = stmt.executeQuery(sql) ;
            
         while (rset.next()) {
            System.out.println(rset.getString("name")) ;
         }
       
        
    }
     
     ArrayList <String> remplire() throws SQLException
     {
        ArrayList <String> cities = new ArrayList<>() ;
        String sql = "SELECT * FROM `city` ; ";  
        rset = stmt.executeQuery(sql) ;
             
         while (rset.next()){
           cities.add(rset.getString("name"));
         }
        
         
       return cities ; 
         
     }
     
     String requete(String sql) throws SQLException{
         
        rset = stmt.executeQuery(sql);
        String tmp=" " ; 
        while (rset.next()){
           tmp = rset.getString("population");
         }
        
        return tmp ;  
         
     }
     
     



}
