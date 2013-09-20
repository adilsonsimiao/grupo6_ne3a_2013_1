/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.DaoAutor;
import entidade.Autor;
import entidade.Usuario;
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
public class ConsultaAutor extends javax.swing.JFrame {

    private DefaultTableModel tableModel = new DefaultTableModel();
    private List<Autor> listAutor = new ArrayList<>();
    private Autor autor = new Autor();
    private int idAutor;

    /**
     * Creates new form ConsultaAutor
     */
    public ConsultaAutor() {
        initComponents();
        setTitle("Consultar Autor");

        tableModel.setColumnIdentifiers(new String[]{
            "ID", "Nome"});
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAreaDadosConsulta = new javax.swing.JTable();
        jRBNome = new javax.swing.JRadioButton();
        jRBObra = new javax.swing.JRadioButton();
        jTFCampoConsulta = new javax.swing.JTextField();
        jBConsultar = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBSelecionar = new javax.swing.JButton();
        jBCadAutor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Consultar Autor");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1376348904_User.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        buttonGroup1.add(jRBObra);
        jRBObra.setText("Consulta por Obra");

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

        jBSelecionar.setText("Ok");
        jBSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSelecionarActionPerformed(evt);
            }
        });

        jBCadAutor.setText("Cadastrar Autor");
        jBCadAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBNome)
                                .addGap(17, 17, 17)
                                .addComponent(jRBObra))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFCampoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBSelecionar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBCadAutor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBAlterar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBExcluir)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBFechar))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBNome)
                    .addComponent(jRBObra))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTFCampoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBConsultar))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBExcluir)
                        .addComponent(jBFechar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBAlterar)
                            .addComponent(jBSelecionar)
                            .addComponent(jBCadAutor))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed
        tableModel.setRowCount(0);
        if (jRBNome.isSelected()) {

            if (jTFCampoConsulta.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite  um nome para pesquisar" + jTFCampoConsulta.getText());
            } else {


                listAutor = new DaoAutor().retrieveNomeAutor(jTFCampoConsulta.getText());

                for (Autor a : listAutor) {
                    tableModel.addRow(new Object[]{
                        a.getId(), a.getNome()});
                    this.autor.setId(a.getId());
                }


            }
        } else if (jRBObra.isSelected()) {
            if (jTFCampoConsulta.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite  um nome para pesquisar" + jTFCampoConsulta.getText());
            } else {


                listAutor = new DaoAutor().retrieveAutorByNomeLivro(jTFCampoConsulta.getText());

                for (Autor a : listAutor) {
                    tableModel.addRow(new Object[]{
                        a.getId(), a.getNome()});
                    this.autor.setId(a.getId());
                }


            }
        }
    }//GEN-LAST:event_jBConsultarActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        int row = jTAreaDadosConsulta.getSelectedRow();
        String sa = tableModel.getValueAt(row, 0).toString();
        int ValorRowColum = Integer.parseInt(sa);
        try {
            autor = new HibernateDao<Autor>().retrieve(ValorRowColum);
        } catch (Exception ex) {
            Logger.getLogger(ConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (jTFCampoConsulta.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione um usuario para ser excluidos ");

        } else {
            try {
                if (((int) this.jTAreaDadosConsulta.getValueAt(row, 0)) == autor.getId()) {
                    new HibernateDao().delete(autor);
                    tableModel.removeRow(row);
                    JOptionPane.showMessageDialog(null, "Cliente removido com sucesso");
                    jTAreaDadosConsulta.setModel(tableModel);
                }
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        int row = jTAreaDadosConsulta.getSelectedRow();
        String sa = tableModel.getValueAt(row, 0).toString();
        int ValorRowColum = Integer.parseInt(sa);
        AlterarAutor alterarAutor = new AlterarAutor();
        try {
            alterarAutor.preencheTelaCadastro(ValorRowColum); 
            alterarAutor.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSelecionarActionPerformed
        retornaID();
        dispose();


    }//GEN-LAST:event_jBSelecionarActionPerformed

    private void jBCadAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadAutorActionPerformed
        CadastrarAutor ca = new CadastrarAutor();
        ca.setVisible(true);
    }//GEN-LAST:event_jBCadAutorActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaAutor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCadAutor;
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBSelecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBNome;
    private javax.swing.JRadioButton jRBObra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAreaDadosConsulta;
    private javax.swing.JTextField jTFCampoConsulta;
    // End of variables declaration//GEN-END:variables

    public int retornaID() {
        int row = jTAreaDadosConsulta.getSelectedRow();
        String sa = tableModel.getValueAt(row, 0).toString();
        idAutor = Integer.parseInt(sa);

        dispose();
        return idAutor;
    }
}
