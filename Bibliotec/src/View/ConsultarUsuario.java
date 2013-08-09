/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.DaoUsuario;
import entidade.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fabio
 */
public class ConsultarUsuario extends javax.swing.JFrame {

    private Usuario usuario = new Usuario();
    private DaoUsuario daoUsuario = new DaoUsuario();
    List<Usuario> listaUsuario = new ArrayList<>();
    DefaultTableModel tableModel;

    public ConsultarUsuario() {
        initComponents();

        setTitle("Consulta Cliente");

        jTAreaDadosConsulta.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
            "Id ", "Nome", "Cpf", "Telefone", "idEndereco"
        }));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGConsulta = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAreaDadosConsulta = new javax.swing.JTable();
        jRBNome = new javax.swing.JRadioButton();
        jRBCpf = new javax.swing.JRadioButton();
        jTFCampoConsulta = new javax.swing.JTextField();
        jBConsultar = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Consulta de usuário");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 622, -1));

        jTAreaDadosConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTAreaDadosConsulta.setToolTipText("");
        jScrollPane1.setViewportView(jTAreaDadosConsulta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 201, 598, 264));

        BGConsulta.add(jRBNome);
        jRBNome.setSelected(true);
        jRBNome.setText("Consulta por nome");
        getContentPane().add(jRBNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 112, -1, -1));

        BGConsulta.add(jRBCpf);
        jRBCpf.setText("Consulta por cpf");
        getContentPane().add(jRBCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 112, -1, -1));
        getContentPane().add(jTFCampoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 156, 410, 25));

        jBConsultar.setText("Consultar");
        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(jBConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 154, 170, -1));

        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });
        getContentPane().add(jBFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 477, -1, -1));

        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 477, -1, -1));

        jButton2.setText("Alterar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 477, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed
        tableModel = (DefaultTableModel) jTAreaDadosConsulta.getModel();

        if (jTFCampoConsulta.getText().equals("") || jTFCampoConsulta.getText().equals(" ")) {
            JOptionPane.showMessageDialog(null, "Digite  um nome para pesquisar" + jTFCampoConsulta.getText());
        }

        try {
            if (jRBNome.isSelected() == true) {


           //     usuario = daoUsuario.buscarNome(jTFCampoConsulta.getText());
 //               tableModel.addRow(new Object[]{usuario.getId(), usuario.getNome(), usuario.getCpf(), usuario.getTelefone(), usuario.getIdEndereco()});
                jTAreaDadosConsulta.setModel(tableModel);
            }
            if (jRBCpf.isSelected() == true) {
         //                usuario = daoUsuario.buscarCPF(jTFCampoConsulta.getText());

   //             tableModel.addRow(new Object[]{usuario.getId(), usuario.getNome(), usuario.getCpf(), usuario.getTelefone(), usuario.getIdEndereco()});
                jTAreaDadosConsulta.setModel(tableModel);

            }




        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Nao foi possivel localizar o nome " + jTFCampoConsulta.getText());
        }

    }//GEN-LAST:event_jBConsultarActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTFCampoConsulta.getText().equals("") || jTFCampoConsulta.getText().equals(" ")) {
           
                 } else {

           JOptionPane.showMessageDialog(null, "Selecione um usuario para alterar" + jTFCampoConsulta.getText());
             AlterarUsuario alt = new AlterarUsuario();
            alt.preencheTelaCadastro(usuario);
            alt.setVisible(true);
   
    }//GEN-LAST:event_jButton2ActionPerformed
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tableModel = (DefaultTableModel) jTAreaDadosConsulta.getModel();
        int row = jTAreaDadosConsulta.getSelectedRow();

        if (jTFCampoConsulta.getText().equals("") || jTFCampoConsulta.getText().equals(" ")) {
            JOptionPane.showMessageDialog(null, "Selecione um usuario para ser excluidos" + jTFCampoConsulta.getText());

        } else {



            try {
                
        
            if (((int)this.jTAreaDadosConsulta.getValueAt(row, 0))==usuario.getId()) {
                System.out.println("deu certo");
                 daoUsuario.delete(usuario);
                tableModel.removeRow(row);  
                JOptionPane.showMessageDialog(null, "Cliente removido com sucesso");
               
                
            }
           
            } catch (Exception e) {
            }
    }//GEN-LAST:event_jButton1ActionPerformed
    }

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
            java.util.logging.Logger.getLogger(ConsultarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGConsulta;
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBCpf;
    private javax.swing.JRadioButton jRBNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAreaDadosConsulta;
    private javax.swing.JTextField jTFCampoConsulta;
    // End of variables declaration//GEN-END:variables
}
