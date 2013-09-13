/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import entidade.Endereco;
import entidade.Municipio;
import entidade.Usuario;
import hibernate.HibernateDao;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author a1294016
 */
public class CadastrarUsuario extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    Endereco endereco = new Endereco();
    Municipio municipio = new Municipio();

    public CadastrarUsuario() {
        initComponents();
        setTitle("Cadastro de Usuario");
        endereco = new Endereco();
        usuario = new Usuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLLogradouro = new javax.swing.JLabel();
        jTFLogradouro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLNumero = new javax.swing.JLabel();
        jTFComplemento = new javax.swing.JTextField();
        jLCep = new javax.swing.JLabel();
        jTFBairro = new javax.swing.JTextField();
        jLBairro = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTUF = new javax.swing.JComboBox();
        jTFCidade = new javax.swing.JComboBox();
        jFTFCep = new javax.swing.JFormattedTextField();
        jFTFNumero = new javax.swing.JFormattedTextField();
        jLNome = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLRg = new javax.swing.JLabel();
        jLcpf = new javax.swing.JLabel();
        jBuCadastro = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLTelefone = new javax.swing.JLabel();
        jFTFRg = new javax.swing.JFormattedTextField();
        jFTFCpf = new javax.swing.JFormattedTextField();
        jBAlterar = new javax.swing.JButton();
        jLInfo = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        JBValidar = new javax.swing.JButton();
        jFTFTelefone = new javax.swing.JFormattedTextField();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1cadastro.png"))); // NOI18N
        jLabel1.setText("Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 764, -1));

        jLLogradouro.setText("Logradouro*:");

        jLNumero.setText("N*:");

        jTFComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFComplementoActionPerformed(evt);
            }
        });

        jLCep.setText("Cep*:");

        jLBairro.setText("Bairro*:");

        jLabel10.setText("Complemento:");

        jLabel11.setText("Cidade:");

        jLabel14.setText("UF:");

        jTUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AM", "AP", "BA", "CE  ", "DF ", "ES ", "GO ", "MA ", "MG ", "MS ", "MT  ", "PA  ", "PB ", "PE ", "PI ", "PR ", "RJ ", "RN ", "RO ", "RR ", "RS ", "SC", "SE ", "SP ", "TO" }));

        jTFCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alto Paraná", "Amaporã", "Cruzeiro do Sul", "Diamante do Norte", "Guairaçá", "Inajá", "Itaúna do Sul", "Jardim Olinda", "Loanda", "Marilena", "Mirador", "Nova Aliança do Ivaí", "Nova Londrina", "Paraíso do Norte", "Paranacity", "Paranapoema", "Paranavaí", "Planaltina do Paraná", "Porto Rico", "Querência do Norte", "Santa Cruz de Monte Castelo", "Santa Isabel do Ivaí", "Santa Mônica", "Santo Antônio do Caiuá", "São Carlos do Ivaí", "São João do Caiuá", "São Pedro do Paraná", "Tamboara", "Terra Rica", "Altônia", "Alto Paraíso (1)", "Alto Piquiri", "Brasilândia do Sul", "Cafezal do Sul", "Cruzeiro do Oeste", "Douradina", "Esperança Nova", "Francisco Alves", "Icaraíma", "Iporã", "Ivaté", "Maria Helena", "Mariluz", "Nova Olímpia", "Perobal", "Pérola", "São Jorge do Patrocínio", "Tapira", "Umuarama", "Xambrê", "Cianorte", "Cidade Gaúcha", "Guaporema", "Indianópolis", "Japurá", "Jussara", "Rondon", "Campo mourão" }));

        try {
            jFTFCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jFTFNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLNumero)
                            .addComponent(jLLogradouro)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTFLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFComplemento))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jFTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLCep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTFCep, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFComplemento)
                        .addComponent(jLabel10)
                        .addComponent(jTFLogradouro))
                    .addComponent(jLLogradouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNumero)
                    .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLBairro)
                    .addComponent(jLCep)
                    .addComponent(jFTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(80, 80, 80))
        );

        jTabbedPane1.addTab("Endereço", jPanel3);

        jLNome.setText("Nome*:");

        jLRg.setText("RG*:");

        jLcpf.setText("CPF*:");

        jBuCadastro.setText("Cadastrar");
        jBuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuCadastroActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLTelefone.setText("Telefone*:");

        try {
            jFTFRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-###-###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFTFCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFCpfActionPerformed(evt);
            }
        });
        jFTFCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTFCpfFocusLost(evt);
            }
        });

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jLEmail.setText("E-mail:");

        jTFEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFEmailFocusLost(evt);
            }
        });

        JBValidar.setText("Validar");
        JBValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBValidarActionPerformed(evt);
            }
        });

        jFTFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###########"))));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLNome)
                                .addComponent(jLRg)
                                .addComponent(jLTelefone))
                            .addComponent(jLEmail))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNome)
                            .addComponent(jTFEmail)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jFTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFTFRg, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addComponent(jLcpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBValidar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jBAlterar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jBuCadastro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton1))
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNome))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmail)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRg)
                    .addComponent(jLcpf)
                    .addComponent(jFTFRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefone)
                    .addComponent(jFTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBuCadastro)
                        .addComponent(jButton1)
                        .addComponent(jBAlterar)
                        .addComponent(JBValidar))
                    .addComponent(jLInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 79, 750, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBValidarActionPerformed
        validar();
    }//GEN-LAST:event_JBValidarActionPerformed

    private void jTFEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFEmailFocusLost
        boolean b = validEmail(jTFEmail.getText().toString());
        if (jTFEmail.getText().trim().length() > 0) {

            if (b == true) {
                jLInfo.setText("E-mail válido");
            } else if (b == false) {
                jLInfo.setText("E-mail inválido");
                jLEmail.setForeground(Color.red);
            }
        } else {
        }
    }//GEN-LAST:event_jTFEmailFocusLost

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        if (validar() == false) {
            try {
                persistencia();

                JOptionPane.showMessageDialog(null, " Alteração realizada com sucesso!!");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, " Não foi alterar o cadastro!!");
            }

        } else {
        }
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jFTFCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFCpfFocusLost

        if (!jFTFCpf.getText().replace("-", "").toString().trim().equals("")) {

            boolean aux = CPF(jFTFCpf.getText().replace("-", "").toString());
            if (aux == true) {
                jLInfo.setText("Cpf válido");
                jLcpf.setForeground(Color.BLACK);

            } else if (aux == false) {
                jLcpf.setForeground(Color.red);
                jLInfo.setText("Cpf inválido");
            }
        } else {
            jFTFCpf.setText("");
            jLInfo.setText("cpf é obrigatório");
            jLcpf.setForeground(Color.red);
        }
    }//GEN-LAST:event_jFTFCpfFocusLost

    private void jFTFCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFCpfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuCadastroActionPerformed

        if (validar() == false) {
            try {
                persistencia();

                JOptionPane.showMessageDialog(null, " Cadastro realizada com sucesso!!");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, " Não foi possivel cadastrar!!");
            }

        } else {
        }

    }//GEN-LAST:event_jBuCadastroActionPerformed

    private void jTFComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFComplementoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBValidar;
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBuCadastro;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFTFCep;
    private javax.swing.JFormattedTextField jFTFCpf;
    private javax.swing.JFormattedTextField jFTFNumero;
    private javax.swing.JFormattedTextField jFTFRg;
    private javax.swing.JFormattedTextField jFTFTelefone;
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLCep;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLInfo;
    private javax.swing.JLabel jLLogradouro;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLRg;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLcpf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JComboBox jTFCidade;
    private javax.swing.JTextField jTFComplemento;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFLogradouro;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JComboBox jTUF;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private void persistencia() throws Exception {
        municipio.setUf(jTUF.getItemAt(jTUF.getSelectedIndex()).toString());
        municipio.setNome(jTFCidade.getItemAt(jTFCidade.getSelectedIndex()).toString());
        new HibernateDao<Municipio>(municipio.getClass()).persist(municipio);

        endereco.setLogradouro(jTFLogradouro.getText());
        endereco.setComplemento(jTFComplemento.getText());
        endereco.setNumero(jFTFNumero.getText());
        endereco.setBairro(jTFBairro.getText());
        endereco.setCep(jFTFCep.getText().replace("-", ""));
        endereco.setMunicipio(municipio);
        new HibernateDao<Endereco>(endereco.getClass()).persist(endereco);



        usuario.setNome(jTFNome.getText());
        usuario.setEmail(jTFEmail.getText());
        usuario.setCpf(jFTFCpf.getText().replace("-", ""));
        usuario.setRg(jFTFRg.getText().replace("-", ""));
        usuario.setTelefone(jFTFTelefone.getText());
        usuario.setEndereco(endereco);
        new HibernateDao<Usuario>(usuario.getClass()).persist(usuario);
    }

    static public boolean CPF(String strCpf) {
        int d1, d2;
        int digito1, digito2, resto;
        int digitoCPF;
        String nDigResult;

        d1 = d2 = 0;
        digito1 = digito2 = resto = 0;

        for (int nCount = 1; nCount < strCpf.length() - 1; nCount++) {
            digitoCPF = Integer.valueOf(strCpf.substring(nCount - 1, nCount)).intValue();

            d1 = d1 + (11 - nCount) * digitoCPF;

            d2 = d2 + (12 - nCount) * digitoCPF;
        };

        resto = (d1 % 11);

        if (resto < 2) {
            digito1 = 0;
        } else {
            digito1 = 11 - resto;
        }

        d2 += 2 * digito1;

        resto = (d2 % 11);

        if (resto < 2) {
            digito2 = 0;
        } else {
            digito2 = 11 - resto;
        }

        String nDigVerific = strCpf.substring(strCpf.length() - 2, strCpf.length());

        nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

        return nDigVerific.equals(nDigResult);
    }

    public boolean validEmail(String email) {
        Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$");
        Matcher m = p.matcher(email);
        if (m.find()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validar() {
        StringBuilder stringsBuilder = new StringBuilder();
        if (jTFNome.getText().length() < 3) {
            stringsBuilder.append("Nome é obrigatório\n");
            jLNome.setForeground(Color.red);
        } else {
            jLNome.setForeground(Color.BLACK);
        }

        if (jFTFRg.getText().replace("-", "").trim().length() < 9 || jFTFRg.getText().replace("-", "").trim().length() > 9) {
            stringsBuilder.append("Rg é obrigatório \n");
            jLRg.setForeground(Color.red);

        } else {
            jLRg.setForeground(Color.BLACK);
        }

        if (jFTFCpf.getText().length() < 11 || jFTFCpf.getText().length() > 11) {
            if (!jFTFCpf.getText().replace("-", "").toString().trim().equals("")) {

                boolean aux = CPF(jFTFCpf.getText().replace("-", "").toString());
                if (aux == true) {
                    jLInfo.setText("Cpf válido");
                    jLcpf.setForeground(Color.BLACK);

                } else if (aux == false) {
                    jLcpf.setForeground(Color.red);
                    jLInfo.setText("Cpf inválido");
                    stringsBuilder.append("cpf é Obrigatório \n");
                }
            } else {
                jFTFCpf.setText("");
                jLcpf.setForeground(Color.red);
                jLInfo.setText("cpf é obrigatório");
                stringsBuilder.append("cpf é obrigatório \n");
            }

        } else {
            jFTFCpf.setForeground(Color.BLACK);
        }

        if (jFTFCep.getText().replace("-", "").trim().length() < 8 || jFTFCep.getText().replace("-", "").trim().length() > 8) {
            stringsBuilder.append("cep é obrigatório \n");
            jLCep.setForeground(Color.red);
        } else {
            jLCep.setForeground(Color.BLACK);
        }

        if (jFTFTelefone.getText().length() < 4 || jFTFTelefone.getText().length() > 11) {
            stringsBuilder.append("telefone é obrigatório \n");
            jLTelefone.setForeground(Color.red);
        } else {
            jLTelefone.setForeground(Color.BLACK);
        }

        if (jTFLogradouro.getText().length() < 3) {
            stringsBuilder.append("Logradouro é obrigatório \n");
            jLLogradouro.setForeground(Color.red);
        } else {
            jLLogradouro.setForeground(Color.BLACK);
        }

        if (jTFBairro.getText().length() < 3) {
            stringsBuilder.append("Bairro é obrigatório \n");
            jLBairro.setForeground(Color.red);
        } else {
            jLBairro.setForeground(Color.BLACK);
        }

        if (jFTFNumero.getText().length() == 0) {
            stringsBuilder.append("Numero é obrigatório \n");
            jLNumero.setForeground(Color.red);
        } else {
            jLNumero.setForeground(Color.BLACK);
        }

        if (stringsBuilder.length() > 0) {
            JOptionPane.showMessageDialog(null, stringsBuilder.toString());
            return true;
        }
        return false;
    }
}
