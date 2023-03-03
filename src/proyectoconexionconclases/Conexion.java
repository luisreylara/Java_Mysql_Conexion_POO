 
package proyectoconexionconclases;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class Conexion {
    
    String bd = "";
    String usuario="";
    String pwd = "";
    String cadena= "jdbc:mysql://IP:3306/";
    Connection cx;
    
    public Connection Conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//  con = DriverManager.getConnection("jdbc:mysql://datamoviles.tk:3306/admin_default", "admin_luis", "2023");            
            cx = DriverManager.getConnection(cadena+bd,usuario,pwd);
            System.out.println("Si se conecto");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return cx;
    }
}
