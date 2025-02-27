package telas;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

public class TelaMenu extends javax.swing.JFrame {

    public TelaMenu() {
        initComponents();
    }

    public TelaMenu(String usuario, String cargo) {
        initComponents();
        pnlCadastrarProdutos.setVisible(false);
        lblSaudacao.setText("Bem-vindo(a), " + usuario);
        btnExcluir.setVisible(false);
        if (cargo.equalsIgnoreCase("caixa") || cargo.equalsIgnoreCase("balconista")) {
            habilitar();
        }
    }

    private void habilitar() {
        itmCadastrarProdutos.setEnabled(false);
        itmAlterarProdutos.setEnabled(false);
        itmExcluirProdutos.setEnabled(false);
        itmRelatoriosProdutos.setEnabled(true);
        itmCadastrarFuncionarios.setEnabled(false);
        itmAlterarFuncionarios.setEnabled(false);
        itmExcluirFuncionarios.setEnabled(false);
        itmRelatorioFuncionarios.setEnabled(false);
    }

    public TelaMenu(String cargo) {
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

        lblSaudacao = new javax.swing.JLabel();
        pnlCadastrarProdutos = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnOutrosRelatorios = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();
        barMenu = new javax.swing.JMenuBar();
        mnuProdutos = new javax.swing.JMenu();
        itmCadastrarProdutos = new javax.swing.JMenuItem();
        itmAlterarProdutos = new javax.swing.JMenuItem();
        itmExcluirProdutos = new javax.swing.JMenuItem();
        itmRelatoriosProdutos = new javax.swing.JMenuItem();
        mnuFuncionarios = new javax.swing.JMenu();
        itmCadastrarFuncionarios = new javax.swing.JMenuItem();
        itmAlterarFuncionarios = new javax.swing.JMenuItem();
        itmExcluirFuncionarios = new javax.swing.JMenuItem();
        itmRelatorioFuncionarios = new javax.swing.JMenuItem();

        setTitle("Menu");
        getContentPane().setLayout(null);

        lblSaudacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(470, 0, 220, 30);

        pnlCadastrarProdutos.setLayout(null);

        lblCodigo.setText("Código");
        pnlCadastrarProdutos.add(lblCodigo);
        lblCodigo.setBounds(20, 20, 70, 20);
        pnlCadastrarProdutos.add(txtCodigo);
        txtCodigo.setBounds(110, 10, 170, 40);

        lblNome.setText("Nome");
        pnlCadastrarProdutos.add(lblNome);
        lblNome.setBounds(20, 70, 70, 20);

        txtNome.setText("pão de ló");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(txtNome);
        txtNome.setBounds(110, 60, 350, 40);

        lblCategoria.setText("Categoria");
        pnlCadastrarProdutos.add(lblCategoria);
        lblCategoria.setBounds(20, 120, 70, 20);

        txtCategoria.setText("pães");
        pnlCadastrarProdutos.add(txtCategoria);
        txtCategoria.setBounds(110, 110, 240, 40);

        lblPreco.setText("Preço");
        pnlCadastrarProdutos.add(lblPreco);
        lblPreco.setBounds(20, 170, 70, 20);

        txtPreco.setText("10");
        pnlCadastrarProdutos.add(txtPreco);
        txtPreco.setBounds(110, 160, 150, 40);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnSalvar);
        btnSalvar.setBounds(20, 220, 150, 40);

        btnConsultar.setText("Buscar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnConsultar);
        btnConsultar.setBounds(290, 10, 100, 40);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnExcluir);
        btnExcluir.setBounds(180, 220, 140, 40);

        btnAlterar.setText("Salvar alteração");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnAlterar);
        btnAlterar.setBounds(340, 220, 140, 40);

        btnOutrosRelatorios.setText("Outros relatórios");
        btnOutrosRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutrosRelatoriosActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnOutrosRelatorios);
        btnOutrosRelatorios.setBounds(400, 10, 150, 40);

        getContentPane().add(pnlCadastrarProdutos);
        pnlCadastrarProdutos.setBounds(20, 50, 670, 270);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/fundoPadaria.jpg"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 720, 400);

        mnuProdutos.setMnemonic('P');
        mnuProdutos.setText("Produtos");

        itmCadastrarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarProdutos.setText("Cadastrar");
        itmCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmCadastrarProdutos);

        itmAlterarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarProdutos.setText("Alterar");
        itmAlterarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmAlterarProdutos);

        itmExcluirProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirProdutos.setText("Excluir");
        itmExcluirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmExcluirProdutos);

        itmRelatoriosProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatoriosProdutos.setText("Relatórios");
        itmRelatoriosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatoriosProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmRelatoriosProdutos);

        barMenu.add(mnuProdutos);

        mnuFuncionarios.setMnemonic('F');
        mnuFuncionarios.setText("Funcionários");

        itmCadastrarFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarFuncionarios.setText("Cadastrar");
        mnuFuncionarios.add(itmCadastrarFuncionarios);

        itmAlterarFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarFuncionarios.setText("Alterar");
        mnuFuncionarios.add(itmAlterarFuncionarios);

        itmExcluirFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirFuncionarios.setText("Excluir");
        mnuFuncionarios.add(itmExcluirFuncionarios);

        itmRelatorioFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatorioFuncionarios.setText("Relatórios");
        mnuFuncionarios.add(itmRelatorioFuncionarios);

        barMenu.add(mnuFuncionarios);

        setJMenuBar(barMenu);

        setSize(new java.awt.Dimension(758, 454));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmAlterarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarProdutosActionPerformed
        pnlCadastrarProdutos.setVisible(true);
        btnSalvar.setVisible(false);
        btnConsultar.setVisible(true);
        btnAlterar.setVisible(false);
        btnExcluir.setVisible(false);
        btnOutrosRelatorios.setVisible(false);
    }//GEN-LAST:event_itmAlterarProdutosActionPerformed

    private void itmCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarProdutosActionPerformed
        pnlCadastrarProdutos.setVisible(true);
        btnSalvar.setVisible(true);
        btnConsultar.setVisible(false);
        btnAlterar.setVisible(false);
        btnExcluir.setVisible(false);
        btnOutrosRelatorios.setVisible(false);
    }//GEN-LAST:event_itmCadastrarProdutosActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            // Declara as varáveis
            Connection conexao;
            PreparedStatement st;
            // fazer a conexão com o Banco de dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "abc123");
            // Inserir os dados na tabela
            st = conexao.prepareStatement("INSERT INTO produtos VALUES(?,?,?,?)");
            st.setString(1, txtCodigo.getText());
            st.setString(2, txtNome.getText());
            st.setString(3, txtCategoria.getText());
            st.setDouble(4, Double.parseDouble(txtPreco.getText()));
            st.executeUpdate();
            //Mostrar mensagem indicando sucesso na operação
            JOptionPane.showMessageDialog(btnSalvar, "Produto salvo com sucesso");
            txtCodigo.setText("");
            txtNome.setText("");
            txtCategoria.setText("");
            txtPreco.setText("");
            txtCodigo.requestFocus();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro " + ex.getMessage() + "\nEntre em contato com o administrador e informe");
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "Este código de produto já está cadastrado");
                txtCodigo.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Erro número " + ex.getErrorCode() + "\nEntre em contato com o administrador e informe o número do erro");
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void itmRelatoriosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatoriosProdutosActionPerformed
        pnlCadastrarProdutos.setVisible(true);
        btnSalvar.setVisible(false);
        btnConsultar.setVisible(true);
        btnAlterar.setVisible(false);
        btnExcluir.setVisible(false);
        btnOutrosRelatorios.setVisible(true);
    }//GEN-LAST:event_itmRelatoriosProdutosActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if (txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o código do produto");
            txtCodigo.requestFocus();
            return; // para a execução nesta linha (stop)       
        }
        try {
            Connection conexao;
            PreparedStatement st;
            ResultSet resultado;
            //Conexão com o BD
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "teruel");
            //Busca o código do produto na tabela produtos do BD
            st = conexao.prepareStatement("SELECT * FROM produtos WHERE codigo=?");
            st.setString(1, txtCodigo.getText());
            resultado = st.executeQuery(); //Executa o SELECT criado acima
            if (resultado.next()) { // Se encontrou o código do produto na tabela
                txtNome.setText(resultado.getString("nome"));
                txtCategoria.setText(resultado.getString("categoria"));
                txtPreco.setText(resultado.getString("preco"));
                btnExcluir.setVisible(true);
                btnAlterar.setVisible(true);
            } else { //Senão encontrou o produto
                JOptionPane.showMessageDialog(null, "Produto não encontrado");
                txtCodigo.requestFocus();
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(btnConsultar, "Você não tem o driver na biblioteca");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(btnConsultar, "Algum parâmetro do BD está incorreto");
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            //CONECTAR COM O BANCO DE DADOS
            Connection conexao;
            PreparedStatement st;
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "teruel");
            // DELETAR O PRODUTO PELO CÓDIGO INFORMADO
            st = conexao.prepareStatement("DELETE FROM produtos WHERE codigo=?");
            st.setString(1, txtCodigo.getText());
            int res = st.executeUpdate();
            //VERIFICAR SE O PRODUTO FOI OU NÃO DELETADO E INFORMAR
            if (res == 1) { // Se excluiu da tabela
                JOptionPane.showMessageDialog(null, "Produto excluído com sucesso");
                txtCodigo.setText("");
                txtNome.setText("");
                txtCategoria.setText("");
                txtPreco.setText("");
                txtCodigo.requestFocus();
                btnExcluir.setVisible(false);
                btnAlterar.setVisible(false);
            } else { // Se não excluiu da tabela
                JOptionPane.showMessageDialog(null, "Não foi possível excluir o produto com este código");
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem o driver na biblioteca " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro do BD está incorreto" + ex.getMessage());
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void itmExcluirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirProdutosActionPerformed
        pnlCadastrarProdutos.setVisible(true);
        btnSalvar.setVisible(false);
        btnConsultar.setVisible(true);
        btnAlterar.setVisible(false);
        btnExcluir.setVisible(false);
        btnOutrosRelatorios.setVisible(false);
    }//GEN-LAST:event_itmExcluirProdutosActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            Connection conexao;
            PreparedStatement st;
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "teruel");
            st = conexao.prepareStatement("UPDATE produtos SET nome = ?, categoria = ?, preco = ? WHERE codigo = ?");
            st.setString(1, txtNome.getText());
            st.setString(2, txtCategoria.getText());
            st.setString(3, txtPreco.getText());
            st.setString(4, txtCodigo.getText());
            st.executeUpdate(); //Executa o comando SQL UPDATE
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");
            txtCodigo.setText("");
            txtNome.setText("");
            txtCategoria.setText("");
            txtPreco.setText("");
            txtCodigo.requestFocus();
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem o driver na biblioteca " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro do BD está incorreto" + ex.getMessage());
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnOutrosRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutrosRelatoriosActionPerformed
      TelaRelatorios tela;
      tela = new TelaRelatorios();
      tela.setVisible(true);
    }//GEN-LAST:event_btnOutrosRelatoriosActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnOutrosRelatorios;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JMenuItem itmAlterarFuncionarios;
    private javax.swing.JMenuItem itmAlterarProdutos;
    private javax.swing.JMenuItem itmCadastrarFuncionarios;
    private javax.swing.JMenuItem itmCadastrarProdutos;
    private javax.swing.JMenuItem itmExcluirFuncionarios;
    private javax.swing.JMenuItem itmExcluirProdutos;
    private javax.swing.JMenuItem itmRelatorioFuncionarios;
    private javax.swing.JMenuItem itmRelatoriosProdutos;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuFuncionarios;
    private javax.swing.JMenu mnuProdutos;
    private javax.swing.JPanel pnlCadastrarProdutos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
