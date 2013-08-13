package View;

import Dao.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
        jButton4 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jBEmprestimo = new javax.swing.JButton();
        jBCriarSql = new javax.swing.JButton();
        jBDevolucao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMUsuario = new javax.swing.JMenuItem();
        jMLivro = new javax.swing.JMenuItem();
        jMEditora = new javax.swing.JMenuItem();
        jMFuncionario = new javax.swing.JMenuItem();
        jMAutor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMConsultaUsuario = new javax.swing.JMenuItem();
        jMConsultaLivro = new javax.swing.JMenuItem();
        jMConsultaEditora = new javax.swing.JMenuItem();
        jMConsultaFuncionário = new javax.swing.JMenuItem();
        jMConsultaAutor = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMAlterarUsuario = new javax.swing.JMenuItem();
        jMAlterarLivro = new javax.swing.JMenuItem();
        jMAlterarEditora = new javax.swing.JMenuItem();
        jMAlterarFuncionario = new javax.swing.JMenuItem();
        jMAlterarAutor = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMEmprestimos = new javax.swing.JMenuItem();
        jMDevolução = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 100)); // NOI18N
        jLabel1.setText("Bibliotec");

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jButton4.setText("Fechar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel1)
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(10, 20, 150, 51);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/consult.png"))); // NOI18N
        jButton2.setText("Consultar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(170, 20, 140, 50);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Books-icon (1).png"))); // NOI18N
        jBEmprestimo.setText("Empréstimos");
        jBEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmprestimoActionPerformed(evt);
            }
        });
        jBEmprestimo.setBounds(320, 20, 161, 50);
        jLayeredPane1.add(jBEmprestimo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBCriarSql.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Sql-runner-icon.png"))); // NOI18N
        jBCriarSql.setText("Criar Banco");
        jBCriarSql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCriarSqlActionPerformed(evt);
            }
        });
        jBCriarSql.setBounds(660, 20, 160, 50);
        jLayeredPane1.add(jBCriarSql, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jBDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Books-icon.png"))); // NOI18N
        jBDevolucao.setText("Devoluções");
        jBDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDevolucaoActionPerformed(evt);
            }
        });
        jBDevolucao.setBounds(490, 20, 160, 50);
        jLayeredPane1.add(jBDevolucao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setText("Usuário");
        jLabel2.setBounds(190, 0, 60, 15);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 153));

        jMenu1.setText("Cadastro");

        jMUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMUsuario.setText("Usuário");
        jMUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMUsuario);

        jMLivro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMLivro.setText("Livro");
        jMLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLivroActionPerformed(evt);
            }
        });
        jMenu1.add(jMLivro);

        jMEditora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMEditora.setText("Editora");
        jMEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEditoraActionPerformed(evt);
            }
        });
        jMenu1.add(jMEditora);

        jMFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMFuncionario.setText("Funcionário");
        jMFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMFuncionario);

        jMAutor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMAutor.setText("Autor");
        jMAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAutorActionPerformed(evt);
            }
        });
        jMenu1.add(jMAutor);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");

        jMConsultaUsuario.setText("Usuário");
        jMConsultaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultaUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(jMConsultaUsuario);

        jMConsultaLivro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMConsultaLivro.setText("Livro");
        jMConsultaLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultaLivroActionPerformed(evt);
            }
        });
        jMenu2.add(jMConsultaLivro);

        jMConsultaEditora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMConsultaEditora.setText("Editora");
        jMConsultaEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultaEditoraActionPerformed(evt);
            }
        });
        jMenu2.add(jMConsultaEditora);

        jMConsultaFuncionário.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMConsultaFuncionário.setText("Funcionário");
        jMConsultaFuncionário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultaFuncionárioActionPerformed(evt);
            }
        });
        jMenu2.add(jMConsultaFuncionário);

        jMConsultaAutor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMConsultaAutor.setText("Autor");
        jMConsultaAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultaAutorActionPerformed(evt);
            }
        });
        jMenu2.add(jMConsultaAutor);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Alterar");

        jMAlterarUsuario.setText("Usuário");
        jMAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAlterarUsuarioActionPerformed(evt);
            }
        });
        jMenu3.add(jMAlterarUsuario);

        jMAlterarLivro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMAlterarLivro.setText("Livro");
        jMAlterarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAlterarLivroActionPerformed(evt);
            }
        });
        jMenu3.add(jMAlterarLivro);

        jMAlterarEditora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMAlterarEditora.setText("Editora");
        jMAlterarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAlterarEditoraActionPerformed(evt);
            }
        });
        jMenu3.add(jMAlterarEditora);

        jMAlterarFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMAlterarFuncionario.setText("Funcionário");
        jMAlterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAlterarFuncionarioActionPerformed(evt);
            }
        });
        jMenu3.add(jMAlterarFuncionario);

        jMAlterarAutor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMAlterarAutor.setText("Autor");
        jMAlterarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAlterarAutorActionPerformed(evt);
            }
        });
        jMenu3.add(jMAlterarAutor);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Empréstimos");

        jMEmprestimos.setText("Emprestimos");
        jMEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEmprestimosActionPerformed(evt);
            }
        });
        jMenu4.add(jMEmprestimos);

        jMDevolução.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMDevolução.setText("Devoluções");
        jMDevolução.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMDevoluçãoActionPerformed(evt);
            }
        });
        jMenu4.add(jMDevolução);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ajuda");

        jMenuItem19.setText("Conteúdo de Ajuda");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem19);

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem20.setText("Suporte Online");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem20);

        jMenuBar1.add(jMenu5);

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
                .addGap(0, 6, Short.MAX_VALUE))
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

    private void jMAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAlterarUsuarioActionPerformed
        AlterarUsuario alt = new AlterarUsuario();
        alt.setVisible(true);
    }//GEN-LAST:event_jMAlterarUsuarioActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLivroActionPerformed
        CadastrarLivros cadastrarLivro = new CadastrarLivros();
        cadastrarLivro.setVisible(true);
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

    private void jMAlterarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAlterarLivroActionPerformed
        AlterarLivro alterarLivro = new AlterarLivro();
        alterarLivro.setVisible(true);
        
    }//GEN-LAST:event_jMAlterarLivroActionPerformed

    private void jMAlterarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAlterarEditoraActionPerformed
        AlterarEditora alterarEditora = new AlterarEditora();
        alterarEditora.setVisible(true);
    }//GEN-LAST:event_jMAlterarEditoraActionPerformed

    private void jMAlterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAlterarFuncionarioActionPerformed
        AlterarFuncionario alterarFuncionario = new AlterarFuncionario();
        alterarFuncionario.setVisible(true);
    }//GEN-LAST:event_jMAlterarFuncionarioActionPerformed

    private void jMEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEmprestimosActionPerformed
        EmprestarLivro emprestarLivro = new EmprestarLivro();
        emprestarLivro.setVisible(true);
    }//GEN-LAST:event_jMEmprestimosActionPerformed

    private void jMDevoluçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMDevoluçãoActionPerformed
        DevolverLivro devolverLivro = new DevolverLivro();
        devolverLivro.setVisible(true);
    }//GEN-LAST:event_jMDevoluçãoActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jBDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDevolucaoActionPerformed
       DevolverLivro devolucao = new DevolverLivro();
       devolucao.setVisible(true);
    }//GEN-LAST:event_jBDevolucaoActionPerformed

    private void jBCriarSqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCriarSqlActionPerformed
        try {
            
            PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("DROP DATABASE IF EXISTS bibliotec;\\n\"\n"
                    + "CREATE DATABASE IF NOT EXISTS bibliotec;\\n\"\n"
                    + "USE bibliotec;"
                    +"DROP TABLE IF EXISTS Cidade"
                    + "CREATE TABLE Cidade(\n"
                    + "		id int PRIMARY KEY NOT NULL AUTO_INCREMENT,\n"
                    + "        nome varchar(100) NOT NULL,\n"
                    + "        uf char(2) NOT NULL);\n"
                    +"DROP TABLE IF EXISTS Endereco;\n"
                    + "CREATE TABLE Endereco\n"
                    + "		(id INT NOT NULL AUTO_INCREMENT,\n"
                    + "		numero INT NOT NULL,\n"
                    + "		complemento VARCHAR(45),\n"
                    + "		cep VARCHAR(8) NOT NULL,\n"
                    + "		logradouro VARCHAR(200) NOT NULL,\n"
                    + "		idCidade INT NOT NULL,\n"
                    + "		PRIMARY KEY (id),\n"
                    + "		FOREIGN KEY (idCidade) REFERENCES Cidade(id));"
                    +"DROP TABLE IF EXISTS Usuario;\n"
                    + "CREATE TABLE Usuario\n"
                    + "		(id INT NOT NULL AUTO_INCREMENT,\n"
                    + "		nome VARCHAR(100) NOT NULL,\n"
                    + "		cpf VARCHAR(11) UNIQUE NOT NULL,\n"
                    + "		idEndereco INT NOT NULL,\n"
                    + "		telefone varchar(11) NOT NULL,\n"
                    + "		PRIMARY KEY (id),\n"
                    + "        	FOREIGN KEY (idEndereco) REFERENCES Endereco(id) ON DELETE CASCADE);");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }




    }//GEN-LAST:event_jBCriarSqlActionPerformed

    private void jBEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmprestimoActionPerformed
        AlterarUsuario alt = new AlterarUsuario();
        alt.setVisible(true);
    }//GEN-LAST:event_jBEmprestimoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        OpcoesConsultar opcoesConsultar = new OpcoesConsultar();
        opcoesConsultar.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        OpcoesCadastrar opcoesCadastrar = new OpcoesCadastrar();
        opcoesCadastrar.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAutorActionPerformed
        CadastrarAutor cadastrarAutor = new CadastrarAutor();
        cadastrarAutor.setVisible(true);
    }//GEN-LAST:event_jMAutorActionPerformed

    private void jMConsultaAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsultaAutorActionPerformed
        ConsultaAutor consultaAutor = new ConsultaAutor();
        consultaAutor.setVisible(true);
    }//GEN-LAST:event_jMConsultaAutorActionPerformed

    private void jMAlterarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAlterarAutorActionPerformed
        AlterarAutor alterarAutor = new AlterarAutor();
        alterarAutor.setVisible(true);
    }//GEN-LAST:event_jMAlterarAutorActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCriarSql;
    private javax.swing.JButton jBDevolucao;
    private javax.swing.JButton jBEmprestimo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuItem jMAlterarAutor;
    private javax.swing.JMenuItem jMAlterarEditora;
    private javax.swing.JMenuItem jMAlterarFuncionario;
    private javax.swing.JMenuItem jMAlterarLivro;
    private javax.swing.JMenuItem jMAlterarUsuario;
    private javax.swing.JMenuItem jMAutor;
    private javax.swing.JMenuItem jMConsultaAutor;
    private javax.swing.JMenuItem jMConsultaEditora;
    private javax.swing.JMenuItem jMConsultaFuncionário;
    private javax.swing.JMenuItem jMConsultaLivro;
    private javax.swing.JMenuItem jMConsultaUsuario;
    private javax.swing.JMenuItem jMDevolução;
    private javax.swing.JMenuItem jMEditora;
    private javax.swing.JMenuItem jMEmprestimos;
    private javax.swing.JMenuItem jMFuncionario;
    private javax.swing.JMenuItem jMLivro;
    private javax.swing.JMenuItem jMUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
