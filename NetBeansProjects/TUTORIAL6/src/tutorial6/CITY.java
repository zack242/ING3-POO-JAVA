/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial6;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author zack
 */
public class CITY extends JFrame implements ListSelectionListener{
    
    private JLabel message;
    private JList cities  ; 
    private JPanel panel ; 
    private ConnexionSQL BD ;
    
    
  public CITY() throws Exception {
        
           BD = new ConnexionSQL(); 
           setTitle("CITIES");
           setSize(400,200);
           setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           buildpanel();
           add(panel);
           setVisible(true);
         
       
   } 
    
  void buildpanel() throws Exception{
      
      ArrayList <String> city = BD.remplire();
     // String[] city = {"Paris","Casablanca","New York","Lyon","Lisbon"};
      cities = new JList( city.toArray() );
      panel = new JPanel();
      message = new JLabel("Cities");
      
      panel.add(message, BorderLayout.CENTER);
      panel.add(cities, BorderLayout.CENTER);
      cities.addListSelectionListener(this);
      
      
      
   }

    @Override
    public void valueChanged(ListSelectionEvent e){
         
        String sql = " SELECT * FROM `city` WHERE name = '" + (String)cities.getSelectedValue() +"';";
       
        try {
            message.setText("Population :" + BD.requete(sql));
        } catch (Exception ex) {
            Logger.getLogger(CITY.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }
    
    public void main() throws Exception {
          
        new CITY();
       
        
    }
    
}
