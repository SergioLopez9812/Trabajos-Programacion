
package trabajobases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class conexion {

    String usuario = "root";
    String url = "jdbc:mysql://localhost/";
    String contraseña = "";
    String nombreB = "prueba";
    String control = "com.mysql.jdbc.Driver";
    Connection cone;

    public conexion() {
    }

    public Connection conectar() {
        try {
            Class.forName(control);
            cone = DriverManager.getConnection("jdbc:mysql://localhost/prueba", "root", "");
            JOptionPane.showMessageDialog(null, "BIENVENIDO");
        } catch (ClassNotFoundException | SQLException e) {
        }
        return null;

    }

    public Statement mostrar() {
        try {
            Statement s = cone.createStatement();
            ResultSet rs = s.executeQuery("select * from persona");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("nombre") + " " + rs.getDate("nacimiento"));
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public Connection cerrar() {
        try {
            cone.close();
            JOptionPane.showMessageDialog(null, "se cerro");
        } catch (SQLException e) {
        }
        return null;
    }

}
