/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



/**
 *
 * @author tekal
 */
public class MySqlConnect {
    Connection con;
    public Connection getConn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","root");
           
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"database connection unsuccesful"+e);
        }
        return con;
    }

    
    
}
