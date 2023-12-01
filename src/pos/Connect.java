/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Anibal Saavedra
 */
public class Connect {
    
    public static Connection getConnect(){
        
        Connection conn = null;
        
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos_db","root","A*@1981@*S");
           
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return conn;
    }
}
