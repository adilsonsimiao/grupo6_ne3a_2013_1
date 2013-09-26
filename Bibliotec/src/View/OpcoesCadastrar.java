/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabio
 */
public class OpcoesCadastrar extends javax.swing.JFrame {

    /**
     * Creates new form OpcoesCadastrar
     */
    public OpcoesCadastrar() {
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

        jBUsuario = new javax.swing.JButton();
        jBLivro = new javax.swing.JButton();
        jBAutor = new javax.swing.JButton();
        jBEditora = new javax.swing.JButton();
        jBFuncionario = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1cadastro.png"))); // NOI18N
        jBUsuario.setText("Usuário");
        jBUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBUsuario.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jBUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUsuarioActionPerformed(evt);
            }
        });

        jBLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1376350938_Books.png"))); // NOI18N
        jBLivro.setText("Livro");
        jBLivro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBLivro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLivroActionPerformed(evt);
            }
        });

        jBAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1376348904_User.png"))); // NOI18N
        jBAutor.setText("Autor");
        jBAutor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAutor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAutorActionPerformed(evt);
            }
        });

        jBEditora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/woa_1_image_editor.png"))); // NOI18N
        jBEditora.setText("Editora");
        jBEditora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBEditora.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditoraActionPerformed(evt);
            }
        });

        jBFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1376350673_Administrator.png"))); // NOI18N
        jBFuncionario.setText("Funcionário");
        jBFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBFuncionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFuncionarioActionPerformed(evt);
            }
        });

        jBCancelar.setText("Ok");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(jBLivro)
                        .addGap(32, 32, 32)
                        .addComponent(jBEditora)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAutor)
                        .addGap(18, 18, 18)
                        .addComponent(jBFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBUsuario)
                            .addComponent(jBLivro)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBEditora)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBAutor)
                    .addComponent(jBFuncionario)
                    .addComponent(jBCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUsuarioActionPerformed
        CadastrarUsuario cadastrarUsuario = new CadastrarUsuario();
        cadastrarUsuario.setVisible(true);
    }//GEN-LAST:event_jBUsuarioActionPerformed

    private void jBLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLivroActionPerformed
        try {
            CadastrarLivros cadastrarLivros = new CadastrarLivros();
            cadastrarLivros.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(OpcoesCadastrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBLivroActionPerformed

    private void jBEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditoraActionPerformed
        CadastrarEditora cadastrarEditora = new CadastrarEditora();
        cadastrarEditora.setVisible(true);
    }//GEN-LAST:event_jBEditoraActionPerformed

    private void jBAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAutorActionPerformed
        CadastrarAutor cadastrarAutor = new CadastrarAutor();
        cadastrarAutor.setVisible(true);
    }//GEN-LAST:event_jBAutorActionPerformed

    private void jBFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFuncionarioActionPerformed
        CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario();
        cadastrarFuncionario.setVisible(true);
    }//GEN-LAST:event_jBFuncionarioActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(OpcoesCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcoesCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcoesCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcoesCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcoesCadastrar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAutor;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEditora;
    private javax.swing.JButton jBFuncionario;
    private javax.swing.JButton jBLivro;
    private javax.swing.JButton jBUsuario;
    // End of variables declaration//GEN-END:variables
}
