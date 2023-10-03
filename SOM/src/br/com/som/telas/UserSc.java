/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.som.telas;

/**
 *
 * @author vickb
 */
import java.sql.*;
import br.com.som.dal.ModuloConexao;
import javax.swing.JOptionPane;


public class UserSc extends javax.swing.JInternalFrame {

    Connection conexao = null; // Variavel do modulo de conexão
    PreparedStatement pst = null; // Manipular instruções SQL
    ResultSet rs = null; // Exibe os resultados das instruções SQL
    /**
     * Creates new form UserSc
     */
    public UserSc() {
        initComponents();
        conexao = ModuloConexao.conectar();
    }
    
    private void consultar(){
        String sql = "select * from usuarios where iduser=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,txtUsId.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtUsNome.setText(rs.getString(2));
                txtUsFon.setText(rs.getString(3));
                txtUsLog.setText(rs.getString(4));
                txtUsPsw.setText(rs.getString(5));
                cbxUsPerf.setSelectedItem(rs.getString(6));
                
            } else { 
                JOptionPane.showMessageDialog(null,"Usuário não encontrado.");
                txtUsNome.setText(null);
                txtUsFon.setText(null);
                txtUsLog.setText(null);
                txtUsPsw.setText(null);
                cbxUsPerf.setSelectedItem(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);// caso haja um erro
            // retorna numa janela
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsId = new javax.swing.JTextField();
        txtUsNome = new javax.swing.JTextField();
        txtUsLog = new javax.swing.JTextField();
        txtUsPsw = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        cbxUsPerf = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtUsFon = new javax.swing.JFormattedTextField();
        btnUsCreate = new javax.swing.JButton();
        btnUsRead = new javax.swing.JButton();
        btnUsUpdt = new javax.swing.JButton();
        btnUsDel = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuários");
        setPreferredSize(new java.awt.Dimension(900, 450));

        jLabel1.setText("Nome");

        jLabel2.setText("id");

        jLabel3.setText("Senha");

        jLabel4.setText("Login");

        txtUsId.setText("              ");
        txtUsId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsIdActionPerformed(evt);
            }
        });

        txtUsNome.setText("              ");
        txtUsNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsNomeActionPerformed(evt);
            }
        });

        txtUsLog.setText("              ");
        txtUsLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsLogActionPerformed(evt);
            }
        });

        txtUsPsw.setText("        ");

        jLabel5.setText("Perfil");

        cbxUsPerf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "admin", "user", " " }));
        cbxUsPerf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUsPerfActionPerformed(evt);
            }
        });

        jLabel6.setText("Telefone");

        try {
            txtUsFon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtUsFon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsFonActionPerformed(evt);
            }
        });

        btnUsCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/som/icones/create.png"))); // NOI18N
        btnUsCreate.setToolTipText("Adicionar Usuário");
        btnUsCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnUsRead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/som/icones/read.png"))); // NOI18N
        btnUsRead.setToolTipText("Consultar Usuários");
        btnUsRead.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsReadActionPerformed(evt);
            }
        });

        btnUsUpdt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/som/icones/update.png"))); // NOI18N
        btnUsUpdt.setToolTipText("Atualizar ");
        btnUsUpdt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnUsDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/som/icones/delete.png"))); // NOI18N
        btnUsDel.setToolTipText("Excluir Usuário");
        btnUsDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxUsPerf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtUsPsw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(txtUsLog, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUsId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(jLabel6)
                        .addGap(77, 77, 77)
                        .addComponent(txtUsFon, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnUsCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsRead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsUpdt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsDel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsCreate)
                    .addComponent(btnUsRead)
                    .addComponent(btnUsUpdt)
                    .addComponent(btnUsDel))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtUsId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(txtUsFon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1))
                            .addComponent(txtUsNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4))
                    .addComponent(txtUsLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtUsPsw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(cbxUsPerf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        setBounds(0, 0, 691, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsIdActionPerformed

    private void txtUsNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsNomeActionPerformed

    private void txtUsLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsLogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsLogActionPerformed

    private void cbxUsPerfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUsPerfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUsPerfActionPerformed

    private void txtUsFonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsFonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsFonActionPerformed

    private void btnUsReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsReadActionPerformed
        // Chamar o met. consultar.
        consultar();
    }//GEN-LAST:event_btnUsReadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsCreate;
    private javax.swing.JButton btnUsDel;
    private javax.swing.JButton btnUsRead;
    private javax.swing.JButton btnUsUpdt;
    private javax.swing.JComboBox cbxUsPerf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JFormattedTextField txtUsFon;
    private javax.swing.JTextField txtUsId;
    private javax.swing.JTextField txtUsLog;
    private javax.swing.JTextField txtUsNome;
    private javax.swing.JPasswordField txtUsPsw;
    // End of variables declaration//GEN-END:variables
}
