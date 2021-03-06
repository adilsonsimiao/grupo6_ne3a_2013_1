/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.DaoLivro;
import entidade.Livro;
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
public class ConsultaLivro extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaLivro
     */
    Livro livro = new Livro();
    List<Livro> listaLivros = new ArrayList<>();
    DefaultTableModel tableModel = new DefaultTableModel();

    public ConsultaLivro() {
        initComponents();
        setTitle("Consultar Livro");
        tableModel.setColumnIdentifiers(new String[]{
            "ID", "Nome", "Isbn", "Quantidade", "Cópias Disponíveis"});
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAreaDadosConsulta = new javax.swing.JTable();
        jRBNome = new javax.swing.JRadioButton();
        jRBAutor = new javax.swing.JRadioButton();
        jTFCampoConsulta = new javax.swing.JTextField();
        jBConsultar = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBEmprestar = new javax.swing.JButton();
        jBOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1376350938_Books.png"))); // NOI18N
        jLabel1.setText("Consultar Livro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        jRBNome.setText("Consulta por Titulo");

        buttonGroup1.add(jRBAutor);
        jRBAutor.setText("Consulta por Autor");

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

        jBEmprestar.setText("Emprestar");
        jBEmprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmprestarActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEmprestar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBFechar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jRBNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRBAutor))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTFCampoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jBConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBNome)
                    .addComponent(jRBAutor))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTFCampoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBConsultar))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBExcluir)
                    .addComponent(jBFechar)
                    .addComponent(jBAlterar)
                    .addComponent(jBEmprestar)
                    .addComponent(jBOk))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed
        tableModel.setRowCount(0);
        if (jRBNome.isSelected()) {

            if (jTFCampoConsulta.getText().trim().equals("")) {
                listaLivros = new DaoLivro().retrieveTodosOsNomesDeLivros();
                for (Livro l : listaLivros) {
                    tableModel.addRow(new Object[]{
                        l.getId(), l.getNomeLivro(), l.getIsbn(), l.getQuantidade(), l.getQuantidadeDisponivel()});
                    this.livro.setId(l.getId());
                }
            } else {
                listaLivros = new DaoLivro().retrieveNomeLivros(jTFCampoConsulta.getText());
                for (Livro l : listaLivros) {
                    tableModel.addRow(new Object[]{
                        l.getId(), l.getNomeLivro(), l.getIsbn(), l.getQuantidade(), l.getQuantidadeDisponivel()});
                    this.livro.setId(l.getId());
                }
            }
        } else {
            if (jTFCampoConsulta.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite  um nome para pesquisar" + jTFCampoConsulta.getText());
            } else {
                listaLivros = new DaoLivro().retrieveNomeAutores(jTFCampoConsulta.getText());
                for (Livro l : listaLivros) {
                    tableModel.addRow(new Object[]{
                        l.getId(), l.getNomeLivro(), l.getIsbn(), l.getQuantidade(), l.getQuantidadeDisponivel()});
                    this.livro.setId(l.getId());
                }


            }
        }

    }//GEN-LAST:event_jBConsultarActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        int row = jTAreaDadosConsulta.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Faça uma consulta e selecione um livro na tabela ou apenas selecione um livro");
        } else {
            String sa = tableModel.getValueAt(row, 0).toString();
            int ValorRowColum = Integer.parseInt(sa);
            try {
                livro = new HibernateDao<Livro>().retrieve(ValorRowColum);
            } catch (Exception ex) {
                Logger.getLogger(ConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
         
                try {
                    if (((int) this.jTAreaDadosConsulta.getValueAt(row, 0)) == livro.getId()) {
                        new HibernateDao().delete(livro);
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
        if (row <= 0) {
            JOptionPane.showMessageDialog(null, "Faça uma consulta e selecione um livro na tabela");
        } else {
            String sa = tableModel.getValueAt(row, 0).toString();
            int ValorRowColum = Integer.parseInt(sa);
            AlterarLivro alterarLivro = new AlterarLivro();
            try {
                alterarLivro.preencheTelaCadastro(ValorRowColum);
                alterarLivro.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(ConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOkActionPerformed
        dispose();
    }//GEN-LAST:event_jBOkActionPerformed

    private void jBEmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmprestarActionPerformed
        try {
            int row = jTAreaDadosConsulta.getSelectedRow();
            String sa = tableModel.getValueAt(row, 0).toString();
            int ValorRowColum = Integer.parseInt(sa);
            EmprestarLivro el = new EmprestarLivro();
            el.preencherTela(ValorRowColum);
            el.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ConsultaLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBEmprestarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaLivro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBEmprestar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBAutor;
    private javax.swing.JRadioButton jRBNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAreaDadosConsulta;
    private javax.swing.JTextField jTFCampoConsulta;
    // End of variables declaration//GEN-END:variables
}
