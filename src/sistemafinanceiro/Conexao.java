/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafinanceiro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas
 */
public class Conexao {
    ResultSet rs = null;
    private static Statement stmt = null;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/sisfi?useSSL=false";
    private static final String USER = "root";
    private static final String SENHA = "dodo123";
    
    private static Conexao instance = null;
    protected Conexao() {
        // Exists only to defeat instantiation.
    }
   public static Conexao getInstance() {
      if(instance == null) {
         instance = new Conexao();
      }
      return instance;
   }
    
    public static Connection getConnection(){
        
        try {
            Class.forName(DRIVER);
            System.err.println(URL+USER+SENHA);
            return DriverManager.getConnection(URL, USER,SENHA);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Desculpe Erro na Conexeão!" + ex, "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
    
    public static void closeConection(Connection con){
        
        
            try {
                if(con!=null){
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    public static void closeConection(Connection con, PreparedStatement stmt){
        
        closeConection(con);
        
            try {
                if(stmt!=null){
                    stmt.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    public static void closeConection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        closeConection(con, stmt);
        
            try {
                if(rs!=null){
                    rs.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
}
