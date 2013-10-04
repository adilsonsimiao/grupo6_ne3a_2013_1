/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.DaoFucnionario;
import entidade.Funcionario;
import hibernate.HibernateDao;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fabio
 */
public class ConsultaFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaFuncionario
     */
    private Funcionario funcionario = new Funcionario();
    List<Funcionario> listaFucionario = new ArrayList<>();
    DefaultTableModel tableModel = new DefaultTableModel();

    public ConsultaFuncionario() {
        initComponents();
        setTitle("Consulta Cliente");
        tableModel.setColumnIdentifiers(new String[]{
            "ID", "E-mail", "Nome", "Cpf", "Rg", "Telefone"});
        jTAreaDadosConsulta.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAreaDadosConsulta = new javax.swing.JTable();
        jRBNome = new javax.swing.JRadioButton();
        jRBCpf = new javax.swing.JRadioButton();
        jTFCampoConsulta = new javax.swing.JTextField();
        jBConsultar = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jBOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        buttonGroup1.add(jRBNome);
        jRBNome.setSelected(true);
        jRBNome.setText("Consulta por nome");

        buttonGroup1.add(jRBCpf);
        jRBCpf.setText("Consulta por cpf");

        jBConsultar.setText("Consultar");
        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });

        jBFechar.setText("Cancelar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1376350673_Administrator.png"))); // NOI18N
        jLabel1.setText("Consultar Funcionário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, Short.MAX_VALUE)
        );

        jBCadastrar.setText("Cadastrar");

        jBOk.setText("Ok");
        jBOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jRBNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBCpf)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBFechar)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(23, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jTFCampoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jBConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 11, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBNome)
                    .addComponent(jRBCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAlterar)
                    .addComponent(jBExcluir)
                    .addComponent(jBFechar)
                    .addComponent(jBCadastrar)
                    .addComponent(jBOk))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 122, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jTFCampoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jBConsultar))
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 44, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed
        tableModel.setRowCount(0);
        if (jRBNome.isSelected()) {

            if (jTFCampoConsulta.getText().trim().equals("")) {
                listaFucionario = new DaoFucnionario().retrieveByNomeTodosFuncionarios();

                for (Funcionario f : listaFucionario) {
                    tableModel.addRow(new Object[]{
                        f.getId(), f.getEmail(), f.getNome(), f.getCpf(), f.getRg(), f.getTelefone()});
                    this.funcionario.setId(f.getId());
                }
            } else {

                try {
                    listaFucionario = new DaoFucnionario().retrieveByNome(jTFCampoConsulta.getText());

                    for (Funcionario f : listaFucionario) {
                        tableModel.addRow(new Object[]{
                            f.getId(), f.getEmail(), f.getNome(), f.getCpf(), f.getRg(), f.getTelefone()});
                        this.funcionario.setId(f.getId());
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Nao foi possivel localizar " + jTFCampoConsulta.getText());
                }
            }
        } else if (jRBCpf.isSelected()) {
            if (jTFCampoConsulta.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite  um nome para pesquisar" + jTFCampoConsulta.getText());
            } else {

                try {
                    listaFucionario = new DaoFucnionario().retrieveByCpf(jTFCampoConsulta.getText());

                    for (Funcionario f : listaFucionario) {
                        tableModel.addRow(new Object[]{
                            f.getId(), f.getEmail(), f.getNome(), f.getCpf(), f.getRg(), f.getTelefone()});
                        this.funcionario.setId(f.getId());
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Nao foi possivel localizar " + jTFCampoConsulta.getText());
                }
            }
        }
    }//GEN-LAST:event_jBConsultarActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        int row = jTAreaDadosConsulta.getSelectedRow();
        if (row <= 0) {
            JOptionPane.showMessageDialog(null, "Faça uma consulta e selecione um funcionário na tabela");
        } else {
            String sa = tableModel.getValueAt(row, 0).toString();
            int ValorRowColum = Integer.parseInt(sa);
            try {
                funcionario = new HibernateDao<Funcionario>().retrieve(ValorRowColum);
            } catch (Exception ex) {
                Logger.getLogger(ConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (jTFCampoConsulta.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecione um usuario para ser excluidos ");

            } else {
                try {
                    if (((int) this.jTAreaDadosConsulta.getValueAt(row, 0)) == funcionario.getId()) {
                        new HibernateDao().delete(funcionario);
                        tableModel.removeRow(row);
                        JOptionPane.showMessageDialog(null, "Cliente removido com sucesso");
                        jTAreaDadosConsulta.setModel(tableModel);
                    }
                } catch (Exception e) {
                }
            }
        }

    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        int row = jTAreaDadosConsulta.getSelectedRow();
        if (row <= 0) {
            JOptionPane.showMessageDialog(null, "Faça uma consulta e selecione um funcionário na tabela");
        } else {
            String sa = tableModel.getValueAt(row, 0).toString();
            int ValorRowColum = Integer.parseInt(sa);
            AlterarFuncionario alterarFuncionario = new AlterarFuncionario();
            try {
                alterarFuncionario.preencheTelaCadastro(ValorRowColum);
                alterarFuncionario.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(ConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOkActionPerformed
        dispose();
    }//GEN-LAST:event_jBOkActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaFuncionario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBCpf;
    private javax.swing.JRadioButton jRBNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAreaDadosConsulta;
    private javax.swing.JTextField jTFCampoConsulta;
    // End of variables declaration//GEN-END:variables
}
