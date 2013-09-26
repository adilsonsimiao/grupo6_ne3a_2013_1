package View;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1294016
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setTitle("Sistema Bibliotec");


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLBarraStatus = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jBCadastros = new javax.swing.JButton();
        jBConsultas = new javax.swing.JButton();
        jBDevolucao = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMCadastros = new javax.swing.JMenu();
        jMUsuario = new javax.swing.JMenuItem();
        jMLivro = new javax.swing.JMenuItem();
        jMEditora = new javax.swing.JMenuItem();
        jMFuncionario = new javax.swing.JMenuItem();
        jMAutor = new javax.swing.JMenuItem();
        jMConsultas = new javax.swing.JMenu();
        jMConsultaUsuario = new javax.swing.JMenuItem();
        jMConsultaLivro = new javax.swing.JMenuItem();
        jMConsultaEditora = new javax.swing.JMenuItem();
        jMConsultaFuncionário = new javax.swing.JMenuItem();
        jMConsultaAutor = new javax.swing.JMenuItem();
        jMEmprestimo = new javax.swing.JMenu();
        jMEmprestimos = new javax.swing.JMenuItem();
        jMDevolução = new javax.swing.JMenuItem();
        jMAjuda = new javax.swing.JMenu();
        jMenuItemAjuda = new javax.swing.JMenuItem();
        jMenuItemAjudaOnline = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 100)); // NOI18N
        jLabel1.setText("Bibliotec");

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLBarraStatus.setForeground(new java.awt.Color(0, 0, 0));

        jButton4.setText("Fechar");
        jButton4.setToolTipText("Botão para fechar o sistema");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLBarraStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(jButton4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLBarraStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel1)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jBCadastros.setText("Cadastrar");
        jBCadastros.setToolTipText("Opcões de cadastros");
        jBCadastros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCadastrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCadastrosMouseExited(evt);
            }
        });
        jBCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrosActionPerformed(evt);
            }
        });
        jBCadastros.setBounds(10, 20, 150, 51);
        jLayeredPane1.add(jBCadastros, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/consult.png"))); // NOI18N
        jBConsultas.setText("Consultar");
        jBConsultas.setToolTipText("Opções de consultas");
        jBConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBConsultasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBConsultasMouseExited(evt);
            }
        });
        jBConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultasActionPerformed(evt);
            }
        });
        jBConsultas.setBounds(170, 20, 140, 50);
        jLayeredPane1.add(jBConsultas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Books-icon.png"))); // NOI18N
        jBDevolucao.setText("Devoluções");
        jBDevolucao.setToolTipText("Botão para Devolução de Livro");
        jBDevolucao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDevolucaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDevolucaoMouseExited(evt);
            }
        });
        jBDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDevolucaoActionPerformed(evt);
            }
        });
        jBDevolucao.setBounds(320, 20, 160, 50);
        jLayeredPane1.add(jBDevolucao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 153));

        jMCadastros.setBackground(new java.awt.Color(255, 255, 255));
        jMCadastros.setForeground(new java.awt.Color(1, 1, 1));
        jMCadastros.setText("Cadastro");
        jMCadastros.setToolTipText("Botão de cadastros");
        jMCadastros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMCadastrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMCadastrosMouseExited(evt);
            }
        });

        jMUsuario.setText("Usuário");
        jMUsuario.setToolTipText("Cadastrar usuário");
        jMUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMUsuarioMouseExited(evt);
            }
        });
        jMUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMUsuarioActionPerformed(evt);
            }
        });
        jMCadastros.add(jMUsuario);

        jMLivro.setText("Livro");
        jMLivro.setToolTipText("Cadastrar livro");
        jMLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMUsuarioMouseExited(evt);
            }
        });
        jMLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLivroActionPerformed(evt);
            }
        });
        jMCadastros.add(jMLivro);

        jMEditora.setText("Editora");
        jMEditora.setToolTipText("Cadastrar editora");
        jMEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMUsuarioMouseExited(evt);
            }
        });
        jMEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEditoraActionPerformed(evt);
            }
        });
        jMCadastros.add(jMEditora);

        jMFuncionario.setText("Funcionário");
        jMFuncionario.setToolTipText("Cadastrar funcionário");
        jMFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMUsuarioMouseExited(evt);
            }
        });
        jMFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFuncionarioActionPerformed(evt);
            }
        });
        jMCadastros.add(jMFuncionario);

        jMAutor.setText("Autor");
        jMAutor.setToolTipText("Cadastrar autor");
        jMAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMUsuarioMouseExited(evt);
            }
        });
        jMAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAutorActionPerformed(evt);
            }
        });
        jMCadastros.add(jMAutor);

        jMenuBar1.add(jMCadastros);

        jMConsultas.setForeground(new java.awt.Color(1, 1, 1));
        jMConsultas.setText("Consulta");
        jMConsultas.setToolTipText("Botão de Consultas");
        jMConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMConsultasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMConsultasMouseExited(evt);
            }
        });

        jMConsultaUsuario.setText("Usuário");
        jMConsultaUsuario.setToolTipText("Consulta usuário");
        jMConsultaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultaUsuarioActionPerformed(evt);
            }
        });
        jMConsultas.add(jMConsultaUsuario);

        jMConsultaLivro.setText("Livro");
        jMConsultaLivro.setToolTipText("Consulta livro");
        jMConsultaLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultaLivroActionPerformed(evt);
            }
        });
        jMConsultas.add(jMConsultaLivro);

        jMConsultaEditora.setText("Editora");
        jMConsultaEditora.setToolTipText("Consulta editora");
        jMConsultaEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultaEditoraActionPerformed(evt);
            }
        });
        jMConsultas.add(jMConsultaEditora);

        jMConsultaFuncionário.setText("Funcionário");
        jMConsultaFuncionário.setToolTipText("Consulta funcionário");
        jMConsultaFuncionário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultaFuncionárioActionPerformed(evt);
            }
        });
        jMConsultas.add(jMConsultaFuncionário);

        jMConsultaAutor.setText("Autor");
        jMConsultaAutor.setToolTipText("Consulta autor");
        jMConsultaAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultaAutorActionPerformed(evt);
            }
        });
        jMConsultas.add(jMConsultaAutor);

        jMenuBar1.add(jMConsultas);

        jMEmprestimo.setForeground(new java.awt.Color(1, 1, 1));
        jMEmprestimo.setText("Empréstimos");
        jMEmprestimo.setToolTipText("Botão empréstimos");
        jMEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMEmprestimoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMEmprestimoMouseExited(evt);
            }
        });

        jMEmprestimos.setText("Empréstimos");
        jMEmprestimos.setToolTipText("Botão para empréstimos de Livros");
        jMEmprestimos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMEmprestimosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMEmprestimosMouseExited(evt);
            }
        });
        jMEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEmprestimosActionPerformed(evt);
            }
        });
        jMEmprestimo.add(jMEmprestimos);

        jMDevolução.setText("Devoluções");
        jMDevolução.setToolTipText("Botão para devolução de livros");
        jMDevolução.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMDevoluçãoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMDevoluçãoMouseExited(evt);
            }
        });
        jMDevolução.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMDevoluçãoActionPerformed(evt);
            }
        });
        jMEmprestimo.add(jMDevolução);

        jMenuBar1.add(jMEmprestimo);

        jMAjuda.setForeground(new java.awt.Color(1, 1, 1));
        jMAjuda.setText("Ajuda");
        jMAjuda.setToolTipText("Botão de ajuda");
        jMAjuda.addMenuDragMouseListener(new javax.swing.event.MenuDragMouseListener() {
            public void menuDragMouseDragged(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {
                jMAjudaMenuDragMouseEntered(evt);
            }
            public void menuDragMouseExited(javax.swing.event.MenuDragMouseEvent evt) {
                jMAjudaMenuDragMouseExited(evt);
            }
            public void menuDragMouseReleased(javax.swing.event.MenuDragMouseEvent evt) {
            }
        });

        jMenuItemAjuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItemAjuda.setText("Conteúdo de Ajuda");
        jMenuItemAjuda.setToolTipText("Ajuda");
        jMenuItemAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItemAjudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItemAjudaMouseExited(evt);
            }
        });
        jMenuItemAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAjudaActionPerformed(evt);
            }
        });
        jMAjuda.add(jMenuItemAjuda);

        jMenuItemAjudaOnline.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItemAjudaOnline.setText("Suporte Online");
        jMenuItemAjudaOnline.setToolTipText("conteudo online");
        jMenuItemAjudaOnline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItemAjudaOnlineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItemAjudaOnlineMouseExited(evt);
            }
        });
        jMenuItemAjudaOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAjudaOnlineActionPerformed(evt);
            }
        });
        jMAjuda.add(jMenuItemAjudaOnline);

        jMenuBar1.add(jMAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMUsuarioActionPerformed
        CadastrarUsuario cad = new CadastrarUsuario();
        cad.setVisible(true);
    }//GEN-LAST:event_jMUsuarioActionPerformed

    private void jMConsultaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsultaUsuarioActionPerformed
        ConsultarUsuario consult = new ConsultarUsuario();
        consult.setVisible(true);
    }//GEN-LAST:event_jMConsultaUsuarioActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLivroActionPerformed
        try {
            CadastrarLivros cadastrarLivros = new CadastrarLivros();
            cadastrarLivros.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMLivroActionPerformed

    private void jMEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEditoraActionPerformed
        CadastrarEditora cadastrarEditora = new CadastrarEditora();
        cadastrarEditora.setVisible(true);
    }//GEN-LAST:event_jMEditoraActionPerformed

    private void jMFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFuncionarioActionPerformed
        CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario();
        cadastrarFuncionario.setVisible(true);
    }//GEN-LAST:event_jMFuncionarioActionPerformed

    private void jMConsultaLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsultaLivroActionPerformed
        ConsultaLivro consultaLivro = new ConsultaLivro();
        consultaLivro.setVisible(true);
    }//GEN-LAST:event_jMConsultaLivroActionPerformed

    private void jMConsultaEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsultaEditoraActionPerformed
        ConsultaEditora consultaEditora = new ConsultaEditora();
        consultaEditora.setVisible(true);
    }//GEN-LAST:event_jMConsultaEditoraActionPerformed

    private void jMConsultaFuncionárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsultaFuncionárioActionPerformed
        ConsultaFuncionario consultaFuncionario = new ConsultaFuncionario();
        consultaFuncionario.setVisible(true);
    }//GEN-LAST:event_jMConsultaFuncionárioActionPerformed

    private void jMEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEmprestimosActionPerformed
        EmprestarLivro emprestarLivro = new EmprestarLivro();
        emprestarLivro.setVisible(true);
    }//GEN-LAST:event_jMEmprestimosActionPerformed

    private void jMDevoluçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMDevoluçãoActionPerformed
        DevolverLivro devolverLivro = new DevolverLivro();
        devolverLivro.setVisible(true);
    }//GEN-LAST:event_jMDevoluçãoActionPerformed

    private void jMenuItemAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAjudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemAjudaActionPerformed

    private void jMenuItemAjudaOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAjudaOnlineActionPerformed
        try {
            Desktop.getDesktop().open(new File("/home/fabio/Documentos/grupo6_ne3a_2013_1/Bibliotec/src/web/Paginas/Ajuda.html"));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItemAjudaOnlineActionPerformed

    private void jBDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDevolucaoActionPerformed
        DevolverLivro devolucao = new DevolverLivro();
        devolucao.setVisible(true);
    }//GEN-LAST:event_jBDevolucaoActionPerformed

    private void jBConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultasActionPerformed
        OpcoesConsultar opcoesConsultar = new OpcoesConsultar();
        opcoesConsultar.setVisible(true);
    }//GEN-LAST:event_jBConsultasActionPerformed

    private void jBCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrosActionPerformed
        OpcoesCadastrar opcoesCadastrar = new OpcoesCadastrar();
        opcoesCadastrar.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jBCadastrosActionPerformed

    private void jMAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAutorActionPerformed
        CadastrarAutor cadastrarAutor = new CadastrarAutor();
        cadastrarAutor.setVisible(true);
    }//GEN-LAST:event_jMAutorActionPerformed

    private void jMConsultaAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsultaAutorActionPerformed
        ConsultaAutor consultaAutor = new ConsultaAutor();
        consultaAutor.setVisible(true);
    }//GEN-LAST:event_jMConsultaAutorActionPerformed

    private void jBCadastrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCadastrosMouseEntered
        jLBarraStatus.setText(jBCadastros.getToolTipText());
    }//GEN-LAST:event_jBCadastrosMouseEntered

    private void jBCadastrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCadastrosMouseExited
        jLBarraStatus.setText("");
    }//GEN-LAST:event_jBCadastrosMouseExited

    private void jBConsultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBConsultasMouseEntered
        jLBarraStatus.setText(jBConsultas.getToolTipText());
    }//GEN-LAST:event_jBConsultasMouseEntered

    private void jBConsultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBConsultasMouseExited
        jLBarraStatus.setText("");

    }//GEN-LAST:event_jBConsultasMouseExited

    private void jBDevolucaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDevolucaoMouseEntered
        jLBarraStatus.setText(jBDevolucao.getToolTipText());

    }//GEN-LAST:event_jBDevolucaoMouseEntered

    private void jBDevolucaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDevolucaoMouseExited
        jLBarraStatus.setText("");
    }//GEN-LAST:event_jBDevolucaoMouseExited

    private void jMUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMUsuarioMouseEntered
        jLBarraStatus.setText(jMUsuario.getToolTipText());
    }//GEN-LAST:event_jMUsuarioMouseEntered

    private void jMUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMUsuarioMouseExited
        jLBarraStatus.setText("");
    }//GEN-LAST:event_jMUsuarioMouseExited

    private void jMCadastrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMCadastrosMouseEntered
        jLBarraStatus.setText(jMCadastros.getToolTipText());
    }//GEN-LAST:event_jMCadastrosMouseEntered

    private void jMCadastrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMCadastrosMouseExited
        jLBarraStatus.setText("");
    }//GEN-LAST:event_jMCadastrosMouseExited

    private void jMConsultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMConsultasMouseEntered
        jLBarraStatus.setText(jMConsultas.getToolTipText());
    }//GEN-LAST:event_jMConsultasMouseEntered

    private void jMConsultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMConsultasMouseExited
        jLBarraStatus.setText("");
    }//GEN-LAST:event_jMConsultasMouseExited

    private void jMEmprestimoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMEmprestimoMouseEntered
        jLBarraStatus.setText(jMEmprestimo.getToolTipText());
    }//GEN-LAST:event_jMEmprestimoMouseEntered

    private void jMEmprestimoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMEmprestimoMouseExited
        jLBarraStatus.setText("");
    }//GEN-LAST:event_jMEmprestimoMouseExited

    private void jMAjudaMenuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {//GEN-FIRST:event_jMAjudaMenuDragMouseEntered
        jLBarraStatus.setText(jMAjuda.getToolTipText());
    }//GEN-LAST:event_jMAjudaMenuDragMouseEntered

    private void jMAjudaMenuDragMouseExited(javax.swing.event.MenuDragMouseEvent evt) {//GEN-FIRST:event_jMAjudaMenuDragMouseExited
        jLBarraStatus.setText("");
    }//GEN-LAST:event_jMAjudaMenuDragMouseExited

    private void jMenuItemAjudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemAjudaMouseEntered
        jLBarraStatus.setText(jMenuItemAjuda.getToolTipText());
    }//GEN-LAST:event_jMenuItemAjudaMouseEntered

    private void jMenuItemAjudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemAjudaMouseExited
        jLBarraStatus.setText("");
    }//GEN-LAST:event_jMenuItemAjudaMouseExited

    private void jMenuItemAjudaOnlineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemAjudaOnlineMouseEntered
        jLBarraStatus.setText(jMenuItemAjudaOnline.getToolTipText());
    }//GEN-LAST:event_jMenuItemAjudaOnlineMouseEntered

    private void jMenuItemAjudaOnlineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemAjudaOnlineMouseExited
        jLBarraStatus.setText("");
    }//GEN-LAST:event_jMenuItemAjudaOnlineMouseExited

    private void jMEmprestimosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMEmprestimosMouseEntered
        jLBarraStatus.setText(jMEmprestimos.getToolTipText());
    }//GEN-LAST:event_jMEmprestimosMouseEntered

    private void jMEmprestimosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMEmprestimosMouseExited
        jLBarraStatus.setText("");
    }//GEN-LAST:event_jMEmprestimosMouseExited

    private void jMDevoluçãoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMDevoluçãoMouseEntered
        jLBarraStatus.setText(jMDevolução.getToolTipText());
    }//GEN-LAST:event_jMDevoluçãoMouseEntered

    private void jMDevoluçãoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMDevoluçãoMouseExited
        jLBarraStatus.setText("");
    }//GEN-LAST:event_jMDevoluçãoMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastros;
    private javax.swing.JButton jBConsultas;
    private javax.swing.JButton jBDevolucao;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLBarraStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMAjuda;
    private javax.swing.JMenuItem jMAutor;
    private javax.swing.JMenu jMCadastros;
    private javax.swing.JMenuItem jMConsultaAutor;
    private javax.swing.JMenuItem jMConsultaEditora;
    private javax.swing.JMenuItem jMConsultaFuncionário;
    private javax.swing.JMenuItem jMConsultaLivro;
    private javax.swing.JMenuItem jMConsultaUsuario;
    private javax.swing.JMenu jMConsultas;
    private javax.swing.JMenuItem jMDevolução;
    private javax.swing.JMenuItem jMEditora;
    private javax.swing.JMenu jMEmprestimo;
    private javax.swing.JMenuItem jMEmprestimos;
    private javax.swing.JMenuItem jMFuncionario;
    private javax.swing.JMenuItem jMLivro;
    private javax.swing.JMenuItem jMUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAjuda;
    private javax.swing.JMenuItem jMenuItemAjudaOnline;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
