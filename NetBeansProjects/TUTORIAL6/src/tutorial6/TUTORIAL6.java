/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;


public class TUTORIAL6 extends JFrame
{
      
        private JTextField minutes ;
        private JRadioButton Daytime,Evening,Offpeak; 
        private ButtonGroup group;
        private JPanel Panel ;
        private JLabel message ; 
        private JLabel charge ; 
        private final double RATE_DAYTIME = 0.07 , RATE_EVENING = 0.12 , RATE_OFFPEAK = 0.05 ;
        
       
  
    public TUTORIAL6 ()
    {
          
           setTitle("Telephone calls");
           setSize(300,100);
           setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           buildPanel();
           add(Panel);
           
           setVisible(true);
           
      }
       
       final void buildPanel()
       {
           
           Daytime = new JRadioButton("Daytime",true);
           Evening = new JRadioButton("Evening",true);
           Offpeak = new JRadioButton("Off Peak ",true);
           minutes = new JTextField(5);
           message = new JLabel("The number of minutes");
           charge = new JLabel("");
           
       
           group = new ButtonGroup(); 
           group.add(Daytime);
           group.add(Evening);
           group.add(Offpeak);
           
            Panel = new JPanel();
            Panel.add(message);
            Panel.add(minutes);
            Panel.add(Daytime);
            Panel.add(Evening);
            Panel.add(Offpeak);   
            Panel.add(charge);
            
            minutes.addActionListener(new chargecalcul());
            Daytime.addActionListener(new chargecalcul());
          
           
       }
        
       class chargecalcul implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           
            String input ; 
            double time ; 
            
            input = minutes.getText();
            time = Double.parseDouble(input) ; 
            
            
            if( Daytime.isSelected())
                JOptionPane.showMessageDialog(null,"Charge :" + RATE_DAYTIME *time + "$ " );
                
            if(Evening.isSelected())
                JOptionPane.showMessageDialog(null, "Charge :" + RATE_EVENING *time + "$ " );
                    
            if(Offpeak.isSelected() )
               JOptionPane.showMessageDialog(null, "Charge :" + RATE_OFFPEAK*time + "$ " );
                   
        }
           
           
           
       }
              
     public static void main(String[] args) throws SQLException, Exception {
       
      new TUTORIAL6();
      new CITY();
    
   
         
    }  
        
        
    }
    
    



