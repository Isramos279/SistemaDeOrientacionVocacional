package controladores;

import modelos.Usuario;
import BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UsuarioController extends Conexion{
    public boolean registrarUsuario(Usuario usuario)
    {
        try {
            PreparedStatement preparedStatement;
            Connection connection=getConection();
            String sql="call sp_insertar_usuario(?,?,?,?,?,?)";
            
            preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1,usuario.getNombre());
            preparedStatement.setString(2,usuario.getApellido());
            preparedStatement.setString(3,usuario.getCedula());
            preparedStatement.setString(4,usuario.getFehcaNacimiento());
            preparedStatement.setString(5,usuario.getContrasenia());
            preparedStatement.setInt(6,usuario.getNivel());
            preparedStatement.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean existeUsuarioPorCedula(String cedula)
    {
        try {
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            Connection connection=getConection();
            String sql="SELECT COUNT(*) FROM tbl_usuario WHERE cedula=?";
            
            preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, cedula);
            resultSet=preparedStatement.executeQuery();
            if(resultSet.next()&&resultSet.getInt(1)==0)
            {
                return false;
            }
            else
            {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            return true;
        }
    }
     public boolean validarDatosDeIngreso(String cedula, String contrasenia)
    {
        try {
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            Connection connection=getConection();
            String sql="SELECT contrasenia FROM tbl_usuario WHERE cedula=?";
            preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, cedula);
            resultSet=preparedStatement.executeQuery();
            if(resultSet.next()&&resultSet.getString(1).equals(contrasenia))
            {
                return true;
            }
            else
            {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     public Usuario UsuarioPorCedula(String cedula)
    {
        Usuario usuario = new Usuario();
        try {
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            Connection connection=getConection();
            String sql="SELECT * FROM tbl_usuario WHERE cedula=?";
            preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, cedula);
            resultSet=preparedStatement.executeQuery();
            if(resultSet.next())
            {
                usuario.setId_usuario(resultSet.getInt(1));
                usuario.setNombre(resultSet.getString(2));
                usuario.setApellido(resultSet.getString(3));
                usuario.setCedula(resultSet.getString(4));
                usuario.setFehcaNacimiento(resultSet.getString(5));
                usuario.setContrasenia(resultSet.getString(6));
                usuario.setNivel(resultSet.getInt(7));
                return usuario;
                
            }
            else
            {
                return null;
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     public ArrayList<Object[]> ResultadoPorCedula(String cedula)
    {
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        int i=0;
        try {
            PreparedStatement preparedStatement;
            ResultSet resultSet;
            Connection connection=getConection();
            String sql="CALL sp_mostrar_respuesta_ambiente(?)";
            preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, cedula);
            resultSet=preparedStatement.executeQuery();
            while(resultSet.next())
            {
                Object[] fila = new Object[2];
                for(int j=0;j<2;j++)
                {
                    fila[j]=resultSet.getObject(j+1);
                }
                datos.add(fila);
                i++;
            }
            return datos;
        
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
