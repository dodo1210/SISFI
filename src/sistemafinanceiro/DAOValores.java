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
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author douglas
 */
public class DAOValores {
    
    Conexao intance = Conexao.getInstance();

        
    public boolean save(Valores v){
        Connection con = intance.getConnection();
        System.err.println(v.getDescricao()+v.getTipo());
        PreparedStatement stmt = null; 
        try {   
            stmt = con.prepareStatement("INSERT INTO Valores (descicao,tipo,dia,mes,valor)VALUES(?,?,?,?,?)");
            stmt.setString(1, v.getDescricao());
            stmt.setString(2,v.getTipo());
            stmt.setInt(3, v.getDia());
            stmt.setInt(4,v.getMes());
            stmt.setFloat(5, v.getValor());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ ex);
            return false;
        }finally{
            Conexao.closeConection(con, stmt);
            return false;
        }
        
    }
    
    public float soma(String tipo){
        
        float soma = 0;
        System.err.println(tipo);
        Conexao instance = Conexao.getInstance();
        ResultSet rs = null;
        Connection con = null;
        con = instance.getConnection();
        PreparedStatement stmt = null;
        String str = "select * from Valores;";
        
         try {
            stmt = con.prepareStatement(str);
            rs = stmt.executeQuery();
            
            while(rs.next()){                                                                                                                                                                                                                                                                                                                                                                                                  
                if((rs.getString("tipo").equals(tipo))){                    
                    soma+=rs.getFloat("valor");
                }               
            }
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return soma;
    }
    
    public float relatorio(int dia_entrada, int mes_entrada, int dia_saida, int mes_saida, DefaultTableModel model,ArrayList<Valores> valores)throws SQLException{
                    
        float entrada = 0,saida=0;
        Conexao instance = Conexao.getInstance();
        ResultSet rs = null;
        Connection con = null;
        con = instance.getConnection();
        PreparedStatement stmt = null;
        System.err.println(dia_entrada+" "+mes_entrada+" "+dia_saida+" "+mes_saida);
        int i = 0;
        for(i=mes_entrada;i<mes_saida;i++){
            
            String str = "select * from Valores where mes ="+String.valueOf(i);
        
            stmt = con.prepareStatement(str);
            rs = stmt.executeQuery();

            while(rs.next()){ 
                Valores vale = new Valores(rs.getInt("codigo_movimentacao"));
                vale.setId(rs.getInt("codigo_movimentacao"));
                valores.add(vale);
                System.err.println(i);
                model.addRow(new Object[]{rs.getInt("dia"), rs.getInt("mes"), rs.getString("descicao"),rs.getFloat("valor"),rs.getString("tipo")});
                System.err.println(rs.getInt("dia")+" "+rs.getString("mes")+" "+rs.getString("descicao")+" "+rs.getString("valor"));
                if((rs.getString("tipo").equals("entrada"))){ 
                    entrada+=rs.getFloat("valor");
                    System.err.println(entrada);
                }else{
                    saida+=rs.getFloat("valor");
                    System.err.println(saida);
                }              
            }
            stmt.execute();
            stmt.close();
        }
        
        if(i==mes_saida){
            for(i=1;i<=dia_saida;i++){
            
                String str = "select * from Valores where dia ="+String.valueOf(i)+" AND mes ="+String.valueOf(mes_saida);
                stmt = con.prepareStatement(str);
                rs = stmt.executeQuery();

                while(rs.next()){
                    Valores vale = new Valores(rs.getInt("codigo_movimentacao"));
                    vale.setId(rs.getInt("codigo_movimentacao"));
                    valores.add(vale);
                    model.addRow(new Object[]{rs.getInt("dia"), rs.getInt("mes"), rs.getString("descicao"),rs.getFloat("valor"),rs.getString("tipo")});
                    System.err.println(rs.getInt("dia")+" "+rs.getString("mes")+" "+rs.getString("descicao")+" "+rs.getString("valor"));
                    if((rs.getString("tipo").equals("entrada"))){                    
                        entrada+=rs.getFloat("valor");
                        System.err.println(entrada);
                    }else{
                        saida+=rs.getFloat("valor");
                        System.err.println(saida);
                    }              
                }
                stmt.execute();
                stmt.close();
            }
        }
        
        return entrada-saida;
    }
    
    public boolean delete(int id){
        Connection con = intance.getConnection();
        PreparedStatement stmt = null;
        String str = "delete from Valores where codigo_movimentacao="+id+";";
        
        try {
            stmt = con.prepareStatement(str);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Problemas ao Deletar!");
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
}
