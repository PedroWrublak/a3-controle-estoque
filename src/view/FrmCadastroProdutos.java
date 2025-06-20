/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.Produto;
import model.Categoria;
import javax.swing.JOptionPane;
import dao.CategoriaDao;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author vinif
 */
public class FrmCadastroProdutos extends javax.swing.JFrame {
    
    private Produto objetoproduto;
    
    /**
     * Creates new form CadastroProdutos
     */
    
    private void carregarCategorias() {
        CategoriaDao categoriaDao = new CategoriaDao();
        
        ArrayList<Categoria> listaDeCategoria = categoriaDao.getListaDeCategoria();
        jCBCategoria.removeAllItems();
        
        for (Categoria cat : listaDeCategoria) {
        jCBCategoria.addItem(cat);
    }
    }
    
    public FrmCadastroProdutos() {
        initComponents();
        this.objetoproduto = new Produto();
        carregarCategorias();
        
    }
    
    public class Mensagem extends Exception {
        public Mensagem (String mensagem) {
           super(mensagem); 
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

        jTextField2 = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JLNome = new javax.swing.JLabel();
        JLCategoria = new javax.swing.JLabel();
        JLEstoque = new javax.swing.JLabel();
        jTFPrecoUnitario = new javax.swing.JTextField();
        JLPreco = new javax.swing.JLabel();
        jTFEstoque = new javax.swing.JTextField();
        jBCadastrar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        JLEstoqueMin = new javax.swing.JLabel();
        jTFEstoqueMin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JLEstoqueMax = new javax.swing.JLabel();
        jTFEstoqueMax = new javax.swing.JTextField();
        jCBCategoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTFUnidadeMedida = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Cadastro de Produto ");

        JLNome.setText("Nome ");

        JLCategoria.setText("Categoria ");

        JLEstoque.setText("Quantidade em Estoque ");

        jTFPrecoUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPrecoUnitarioActionPerformed(evt);
            }
        });

        JLPreco.setText("Preço Unitário ");

        jBCadastrar.setText("Cadastrar ");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar ");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        JLEstoqueMin.setText("Quantidade Mínima ");

        jTFEstoqueMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEstoqueMinActionPerformed(evt);
            }
        });

        JLEstoqueMax.setText("Quantidade Máxima");

        DefaultComboBoxModel<Categoria> modeloCategoria = new DefaultComboBoxModel<>();
        jCBCategoria.setModel(modeloCategoria);
        jCBCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCategoriaActionPerformed(evt);
            }
        });

        jLabel2.setText("Unidade de Medida");

        jTFUnidadeMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUnidadeMedidaActionPerformed(evt);
            }
        });

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLEstoqueMin)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFNome, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                .addComponent(jTFEstoqueMax, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                .addComponent(jTFEstoque)
                                .addComponent(jTFPrecoUnitario, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                .addComponent(jCBCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFUnidadeMedida)
                                .addComponent(jTFEstoqueMin)
                                .addComponent(JLNome)
                                .addComponent(JLCategoria)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(108, 108, 108)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(JLEstoqueMax)
                                .addComponent(JLPreco)
                                .addComponent(JLEstoque)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addContainerGap(161, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCadastrar)
                        .addGap(83, 83, 83))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLPreco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(JLCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLEstoqueMin)
                .addGap(4, 4, 4)
                .addComponent(jTFEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLEstoqueMax)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFEstoqueMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBCadastrar)
                            .addComponent(jBCancelar))
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        // TODO add your handling code here:
        try{
            // Recebendo a validandodados da interface
            String nomeProduto = "";
            double preco = 0;
            String unidadeMedida = "";
            int qtdEstoque = 0;
            int qtdMinima = 0;
            int qtdMaxima = 0;
            Categoria categoria = null;
            
            if (this.jTFNome.getText().length() < 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres");
            } else {
                nomeProduto = this.jTFNome.getText();
            }
            
            if (this.jTFPrecoUnitario.getText().length() <= 0) {
                throw new Mensagem("Preço deve ser número e maior que zero");
            } else {
                preco = Double.parseDouble(this.jTFPrecoUnitario.getText());
            }
            
            if (this.jTFUnidadeMedida.getText().isEmpty()) {
            throw new Mensagem("Unidade de medida deve ser informada");
            } else {
            unidadeMedida = this.jTFUnidadeMedida.getText();
            }
            
            if (this.jTFEstoque.getText().length() <= 0) {
                throw new Mensagem("Estoque deve ser número e maior que zero");
            } else {
                qtdEstoque = Integer.parseInt(this.jTFEstoque.getText());
            }
            
            if (this.jTFEstoqueMin.getText().length() <= 0) {
                throw new Mensagem("Estoque Min. deve ser número e maior que zero");
            } else {
                qtdMinima = Integer.parseInt(this.jTFEstoqueMin.getText());
            }
            
            if (this.jTFEstoqueMax.getText().length() <= 0) {
                throw new Mensagem("Estoque Max. deve ser número e maior que zero");
            } else {
                qtdMaxima = Integer.parseInt(this.jTFEstoqueMax.getText());
            }
            
            categoria = (Categoria) this.jCBCategoria.getSelectedItem();
            if (categoria == null) {
                throw new Mensagem("Categoria deve ser selecionada");
            }
            
            if(this.objetoproduto.insertProdutoDB(nomeProduto, preco, unidadeMedida, qtdEstoque, qtdMinima, qtdMaxima, categoria)) {
                JOptionPane.showMessageDialog(null, "Produto Cadastrado com sucesso");
                
                this.jTFNome.setText("");
                this.jTFPrecoUnitario.setText("");
                this.jTFEstoque.setText("");
                this.jTFEstoqueMin.setText("");
                this.jTFEstoqueMax.setText("");
                
                      
            }
            System.out.println(this.objetoproduto.getListaDeProduto().toString());
            
            
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido");
        }
        
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jTFPrecoUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPrecoUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPrecoUnitarioActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTFEstoqueMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEstoqueMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEstoqueMinActionPerformed

    private void jTFUnidadeMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUnidadeMedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUnidadeMedidaActionPerformed

    private void jCBCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLCategoria;
    private javax.swing.JLabel JLEstoque;
    private javax.swing.JLabel JLEstoqueMax;
    private javax.swing.JLabel JLEstoqueMin;
    private javax.swing.JLabel JLNome;
    private javax.swing.JLabel JLPreco;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JComboBox<Categoria> jCBCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTFEstoque;
    private javax.swing.JTextField jTFEstoqueMax;
    private javax.swing.JTextField jTFEstoqueMin;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPrecoUnitario;
    private javax.swing.JTextField jTFUnidadeMedida;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
