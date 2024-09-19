/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.database;

import backend.usuarios.TipoUsuario;
import backend.usuarios.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author brandon
 */
public class ConexionDB {
    private static final String URL_MYSQL = "jdbc:mysql://localhost:3306/CONTROL_SITIO_WEB_REVISTAS";
    private static final String USER = "root";
    private static final String PASSWORD = "brandon031200";
    
    private Connection connection;
    
    public ConexionDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL_MYSQL, USER, PASSWORD);
            System.out.println("Ingresando a base de datos correctamente...");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la Base de Datos.");
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            
        }
    }
    
    public boolean existeUsuario(TipoUsuario tipoUsuario, String usuario){
        boolean existeUsuario = false;
        String select = "SELECT usuario FROM "+tipoUsuario+" WHERE usuario = '"+usuario+"';";
        try {
            Statement statementInsert = connection.createStatement();
            ResultSet resultSet = statementInsert.executeQuery(select);
            String usuarioExistente = null;
            usuarioExistente = resultSet.getString("usuario");
            if (usuarioExistente == null) {
                System.out.println("El usuario No existe");
                existeUsuario = false;
            }else{
                System.out.println("El usuario Si existe");
                existeUsuario = true;
            }
        } catch (SQLException e) {
            e.getStackTrace();
        }
        return existeUsuario;
    }
    
    public void almacenarUsuario(Usuario usuario){
        String insert = "INSERT INTO "+usuario.getTipo()+" (usuario, contraseña, path_foto, hobbies, temas_interes"
                + "gustos, descripcion) values ('"+usuario.getUsuario()+"', '"+usuario.getContraseña()+"'. '"
                +usuario.getPathFoto()+"', '"+usuario.getHobbies()+"', '"+usuario.getTemasInteres()+"', '"
                +usuario.getGustos()+"', '"+usuario.getDescripcion()+"');";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(insert);
            System.out.println("Usuario ingresado correctamente...");
        } catch (SQLException e) {
            System.out.println("Error al ingresar la solicitud");
            e.getStackTrace();
        }
    }
}
