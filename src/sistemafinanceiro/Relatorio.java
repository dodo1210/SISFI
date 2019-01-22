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
public class Relatorio extends javax.swing.JFrame {

    /**
     * Creates new form Relatorio
     */
    public static ArrayList<Valores> valores = new ArrayList<>();
    
    public Relatorio() {
        setResizable(false);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_dia5 = new javax.swing.JTextField();
        l_dia9 = new javax.swing.JLabel();
        tf_mes5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        tf_mes4 = new javax.swing.JTextField();
        l_mes4 = new javax.swing.JLabel();
        bt_relatorio = new javax.swing.JButton();
        l_dia6 = new javax.swing.JLabel();
        tf_dia4 = new javax.swing.JTextField();
        l_valor_caixa = new javax.swing.JLabel();
        l_dia7 = new javax.swing.JLabel();
        l_mes5 = new javax.swing.JLabel();
        l_dia8 = new javax.swing.JLabel();
        bt_voltar = new javax.swing.JButton();
        bt_voltar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tf_dia5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dia5ActionPerformed(evt);
            }
        });

        l_dia9.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        l_dia9.setText("Dia saída");

        tf_mes5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_mes5ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia", "Mês", "Descrição", "Valor", "Tipo"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        tf_mes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_mes4ActionPerformed(evt);
            }
        });

        l_mes4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        l_mes4.setText("Mês");

        bt_relatorio.setFont(new java.awt.Font("Cantarell", 1, 17)); // NOI18N
        bt_relatorio.setText("GERAR RELATÓRIO");
        bt_relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_relatorioActionPerformed(evt);
            }
        });

        l_dia6.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        l_dia6.setText("Dia");

        l_caixa.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        l_caixa.setText("0,0 R$");

        tf_dia4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dia4ActionPerformed(evt);
            }
        });

        l_valor_caixa.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        l_valor_caixa.setText("CAIXA DO PERÍODO:");

        l_dia7.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        l_dia7.setText("Dia entrada");

        l_mes5.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        l_mes5.setText("Mês");

        l_dia8.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        l_dia8.setText("Dia");

        bt_voltar.setFont(new java.awt.Font("Cantarell", 1, 17)); // NOI18N
        bt_voltar.setText("VOLTAR");
        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });

        bt_voltar1.setFont(new java.awt.Font("Cantarell", 1, 17)); // NOI18N
        bt_voltar1.setText("DELETAR");
        bt_voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_voltar)
                        .addGap(18, 18, 18)
                        .addComponent(bt_voltar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(l_valor_caixa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l_caixa))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l_dia6)
                                    .addComponent(tf_dia4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l_mes4)
                                    .addComponent(tf_mes4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(l_dia7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_dia8)
                            .addComponent(tf_dia5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_dia9))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_mes5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_mes5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_relatorio)))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_dia9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_dia8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_dia5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_mes5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_mes5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bt_relatorio)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_dia7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_dia6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_dia4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_mes4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_mes4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_caixa)
                    .addComponent(l_valor_caixa)
                    .addComponent(bt_voltar)
                    .addComponent(bt_voltar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_dia5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dia5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dia5ActionPerformed

    private void tf_mes5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_mes5ActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_tf_mes5ActionPerformed

    private void tf_mes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_mes4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_mes4ActionPerformed

    private void bt_relatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_relatorioActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        DAOValores v = new DAOValores();
        float valor = 0;     
        try {
            valor = v.relatorio(Integer.parseInt(tf_dia4.getText()),Integer.parseInt(tf_mes4.getText()),Integer.parseInt(tf_dia5.getText()),Integer.parseInt(tf_mes5.getText()),model,valores);
        } catch (SQLException ex) {
            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        l_caixa.setText(String.valueOf(valor)+" R$");
        
        /*float entrada = 0,saida=0;
        Conexao instance = Conexao.getInstance();
        ResultSet rs = null;
        Connection con = null;
        con = instance.getConnection();
        PreparedStatement stmt = null;
        int i = 0;
        for(i=Integer.parseInt(tf_mes4.getText());i<Integer.parseInt(tf_mes5.getText());i++){
            
            String str = "select * from Valores where mes ="+String.valueOf(i);
        
            try {
                stmt = con.prepareStatement(str);
            
                rs = stmt.executeQuery();

                while(rs.next()){ 
                    Valores vale = new Valores(rs.getInt("codigo_movimentacao"));
                    vale.setId(rs.getInt("codigo_movimentacao"));
                    model.addRow(new Object[]{rs.getInt("dia"), rs.getInt("mes"), rs.getString("descicao"),rs.getFloat("valor")});
                    valores.add(vale);
                    if((rs.getString("tipo").equals("entrada"))){                    
                            entrada+=rs.getFloat("valor");
                    }else{
                        saida+=rs.getFloat("valor");
                    }              
                }
                stmt.execute();
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(i==Integer.parseInt(tf_mes5.getText())){
            for(i=1;i<=Integer.parseInt(tf_dia5.getText());i++){
                try{
                    String str = "select * from Valores where dia ="+String.valueOf(i)+" AND mes ="+String.valueOf(tf_dia5.getText());
                    stmt = con.prepareStatement(str);
                    rs = stmt.executeQuery();

                    while(rs.next()){ 
                        System.err.println("iiiii");
                        System.err.println(rs.getInt("dia")+" "+rs.getString("mes")+" "+rs.getString("descicao")+" "+rs.getString("valor"));
                        Valores vale = new Valores(rs.getInt("codigo_movimentacao"));
                        vale.setId(rs.getInt("codigo_movimentacao"));
                        model.addRow(new Object[]{rs.getInt("dia"), rs.getInt("mes"), rs.getString("descicao"),rs.getFloat("valor")});
                        valores.add(vale);
                        if((rs.getString("tipo").equals("entrada"))){                    
                            entrada+=rs.getFloat("valor");
                        }else{
                            saida+=rs.getFloat("valor");
                        }              
                    }
                    stmt.execute();
                    stmt.close();
                } catch (SQLException ex) {
                Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }*/
        
             
    }//GEN-LAST:event_bt_relatorioActionPerformed

    private void tf_dia4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dia4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dia4ActionPerformed

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        new Tela_Principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_voltarActionPerformed

    private void bt_voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltar1ActionPerformed
        int a = jTable2.getSelectedRow();
        String value = jTable2.getModel().getValueAt(a, 1).toString();
        
        String[] buttons = { "Não","Sim"};

        int rc = JOptionPane.showOptionDialog(null, "Deseja realmente excluir?", "Deseja realmente excluir?",
            JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);
        
        if(rc==1){
            DAOValores v = new DAOValores();
            v.delete(valores.get(rc).getId());
        }

    }//GEN-LAST:event_bt_voltar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_relatorio;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JButton bt_voltar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private static final javax.swing.JLabel l_caixa = new javax.swing.JLabel();
    private javax.swing.JLabel l_dia6;
    private javax.swing.JLabel l_dia7;
    private javax.swing.JLabel l_dia8;
    private javax.swing.JLabel l_dia9;
    private javax.swing.JLabel l_mes4;
    private javax.swing.JLabel l_mes5;
    private javax.swing.JLabel l_valor_caixa;
    private javax.swing.JTextField tf_dia4;
    private javax.swing.JTextField tf_dia5;
    private javax.swing.JTextField tf_mes4;
    private javax.swing.JTextField tf_mes5;
    // End of variables declaration//GEN-END:variables
}