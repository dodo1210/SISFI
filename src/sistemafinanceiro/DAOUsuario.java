/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafinanceiro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas
 */
public class DAOUsuario {
    
    Conexao instance = Conexao.getInstance();
    
    public boolean login(Usuario u){
        ResultSet rs = null;
        Connection con = null;
        con = instance.getConnection();
        PreparedStatement stmt = null;
        String str = "select * from usuario;";
        
         try {
            stmt = con.prepareStatement(str);
            rs = stmt.executeQuery();
            
            while(rs.next()){                                                                                                                                                                                                                                                                                                                                                                                                  
                if((rs.getString("nome").equals(u.getNome())) && (rs.getString("senha").equals(u.getSenha()))){                    
                    return true;
                }               
            }
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return false;
    }
    
}
