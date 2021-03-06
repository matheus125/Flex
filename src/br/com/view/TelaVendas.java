/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.ConexaoBD.Conexao;
import br.com.model.bean.Venda;
import br.com.model.dao.VendaDAO;
import br.com.tabelas.Tabela;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Matheus
 */
public class TelaVendas extends javax.swing.JFrame {

    Conexao con = new Conexao();
    Venda mod = new Venda();
    VendaDAO control = new VendaDAO();

    int codVenda;
    float preco_curso, total, porc, desc;

    /**
     * Creates new form TelaVendas
     */
    public TelaVendas() {
        initComponents();

        // A  linha Abaixo exibe a Data Atual do Sistema.
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();
        txtData1.setText(df.format(data));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        lbNome = new javax.swing.JLabel();
        lbCurso = new javax.swing.JLabel();
        txtnomeAluno1 = new javax.swing.JTextField();
        txtQtd1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtnomeCurso1 = new javax.swing.JTextField();
        txtData1 = new javax.swing.JTextField();
        lbData = new javax.swing.JLabel();
        lbTitulosVenda = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtValorCurso1 = new javax.swing.JTextField();
        btnAdicionar1 = new javax.swing.JButton();
        txtDesconto1 = new javax.swing.JTextField();
        btnDesconto1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_pesquisa1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_venda1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        comboPagamento1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtValorTotal1 = new javax.swing.JTextField();
        btnCancelarVenda1 = new javax.swing.JButton();
        btnFinalizarVenda1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venda");

        lbNome.setForeground(new java.awt.Color(255, 255, 255));
        lbNome.setText("Nome:");

        lbCurso.setForeground(new java.awt.Color(255, 255, 255));
        lbCurso.setText("Curso:");

        txtQtd1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQtd1FocusGained(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtnomeCurso1.setEnabled(false);

        txtData1.setEnabled(false);

        lbData.setForeground(new java.awt.Color(255, 255, 255));
        lbData.setText("Data:");

        lbTitulosVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTitulosVenda.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulosVenda.setText("Vendas");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Qtd:");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Valor:");

        txtValorCurso1.setEditable(false);
        txtValorCurso1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorCurso1FocusGained(evt);
            }
        });
        txtValorCurso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorCurso1ActionPerformed(evt);
            }
        });

        btnAdicionar1.setText("Add");
        btnAdicionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionar1ActionPerformed(evt);
            }
        });

        txtDesconto1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDesconto1FocusGained(evt);
            }
        });
        txtDesconto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesconto1ActionPerformed(evt);
            }
        });

        btnDesconto1.setText("Adicionar Desconto");
        btnDesconto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesconto1ActionPerformed(evt);
            }
        });

        tb_pesquisa1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_pesquisa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_pesquisa1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tb_pesquisa1);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tabela de Pesquisa");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Itens da Venda");

        tb_venda1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tb_venda1);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Pagamento:");

        comboPagamento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A vista", "Parcelado", " " }));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Valor Total:");

        txtValorTotal1.setEnabled(false);
        txtValorTotal1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorTotal1FocusGained(evt);
            }
        });

        btnCancelarVenda1.setText("Cancelar Venda");
        btnCancelarVenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVenda1ActionPerformed(evt);
            }
        });

        btnFinalizarVenda1.setText("Finalizar Venda");
        btnFinalizarVenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarVenda1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(lbNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbCurso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtnomeAluno1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtQtd1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtnomeCurso1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtData1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbTitulosVenda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtValorCurso1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnAdicionar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtDesconto1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnDesconto1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(comboPagamento1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtValorTotal1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnCancelarVenda1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnFinalizarVenda1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulosVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(comboPagamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel14)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel13))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnomeAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(txtQtd1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtValorCurso1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdicionar1)
                                    .addComponent(btnBuscar))))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(txtnomeCurso1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbData)
                                    .addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(txtDesconto1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDesconto1))
                            .addComponent(lbCurso)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(btnCancelarVenda1)
                .addGap(10, 10, 10)
                .addComponent(btnFinalizarVenda1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulosVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNome)
                            .addComponent(lbCurso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(lbData)
                        .addGap(3, 3, 3)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnomeCurso1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnomeAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar1)
                    .addComponent(btnDesconto1)
                    .addComponent(txtDesconto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorCurso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPagamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(31, 31, 31)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarVenda1)
                    .addComponent(btnFinalizarVenda1))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        setSize(new java.awt.Dimension(752, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void limparCampos() {
        txtnomeAluno1.setText("");
        txtQtd1.setText("");
        txtValorCurso1.setText("");
        txtnomeCurso1.setText("");
        txtValorTotal1.setText("");
        txtDesconto1.setText("");
      //  tb_pesquisa1.setToolTipText("");
        
    }

    ;
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        con.conexao();
        try {
            PreparedStatement pst = con.con.prepareStatement("insert into tb_venda (valor_total) values(?)");
            pst.setFloat(1, 0);
            pst.execute();
            con.executaSql("select * from tb_venda");
            con.rs.last();
            codVenda = con.rs.getInt("id_venda");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao abrir a venda" + ex);
        }
        preencherTabela("select * from view_aluno where ALUNO like '%" + txtnomeAluno1.getText() + "%'");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtQtd1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtd1FocusGained
        total = Float.parseFloat(txtValorCurso1.getText()) * Integer.parseInt(txtQtd1.getText());
        txtValorTotal1.setText(String.valueOf(total));
    }//GEN-LAST:event_txtQtd1FocusGained

    private void txtValorCurso1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorCurso1FocusGained
        total = Float.parseFloat(txtValorCurso1.getText()) * Integer.parseInt(txtQtd1.getText());
        txtValorCurso1.setText(String.valueOf(total));
        txtValorTotal1.setText(String.valueOf(total));
    }//GEN-LAST:event_txtValorCurso1FocusGained

    private void txtValorCurso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorCurso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorCurso1ActionPerformed

    private void btnAdicionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionar1ActionPerformed
        mod.setNomeCurso(txtnomeCurso1.getText());
        mod.setQtdItem(Integer.parseInt(txtQtd1.getText()));
        mod.setId_venda(codVenda);
        control.adicionaItem(mod);
        txtValorTotal1.setText(String.valueOf(total));
        preencherTabelaItensVenda("select * from tb_curso inner join tb_itens_vendas \n"
                + "on tb_curso.id_curso = tb_itens_vendas.id_curso inner join tb_venda \n"
                + "on tb_venda.id_venda = tb_itens_vendas.id_venda where tb_venda.id_venda =" + codVenda);
    }//GEN-LAST:event_btnAdicionar1ActionPerformed

    private void txtDesconto1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDesconto1FocusGained
       
    }//GEN-LAST:event_txtDesconto1FocusGained

    private void txtDesconto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesconto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesconto1ActionPerformed

    private void btnDesconto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesconto1ActionPerformed
        /*porc = Float.parseFloat(txtDesconto.getText());*/
        porc = Float.parseFloat(txtValorCurso1.getText()) * Integer.parseInt(txtDesconto1.getText());
        desc = porc / 100;
        total = Float.parseFloat(txtValorTotal1.getText()) - desc;
        txtValorTotal1.setText(String.valueOf(total));
    }//GEN-LAST:event_btnDesconto1ActionPerformed

    private void tb_pesquisa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_pesquisa1MouseClicked
        con.conexao();
        try {
            String nome = "" + tb_pesquisa1.getValueAt(tb_pesquisa1.getSelectedRow(), 1);
            con.executaSql("select * from view_aluno where ALUNO='" + nome + "'");
            con.rs.first();
            txtnomeAluno1.setText(con.rs.getString("ALUNO"));
            txtnomeCurso1.setText(con.rs.getString("CURSO"));
            preco_curso = con.rs.getFloat("VALOR CURSO");
            txtValorCurso1.setText(String.valueOf(preco_curso));
            txtValorTotal1.setText(String.valueOf(preco_curso));
            txtQtd1.setText("1");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no mouse clicked ao selecionar os dados" + ex);
        }
        con.desconecta();
    }//GEN-LAST:event_tb_pesquisa1MouseClicked

    private void txtValorTotal1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorTotal1FocusGained
        /* total = Float.parseFloat(txtValorTotal.getText()) - Integer.parseInt(txtDesconto.getText());
        txtValorTotal.setText(String.valueOf(total));*/
    }//GEN-LAST:event_txtValorTotal1FocusGained

    private void btnCancelarVenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVenda1ActionPerformed
        control.CancelarVenda();
        limparCampos();
    }//GEN-LAST:event_btnCancelarVenda1ActionPerformed

    private void btnFinalizarVenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarVenda1ActionPerformed
        if (comboPagamento1.getSelectedItem().equals("A vista")) {
            mod.setId_venda(codVenda);
            mod.setNomeAluno(txtnomeAluno1.getText());
            mod.setData_venda(txtData1.getText());
            mod.setValor_total(Float.parseFloat(txtValorTotal1.getText()));
            mod.setPagamento((String) comboPagamento1.getSelectedItem());
            control.FecharVenda(mod);
        } else {
            mod.setId_venda(codVenda);
            mod.setData_venda(txtData1.getText());
            mod.setNomeAluno(txtnomeAluno1.getText());
            mod.setValor_total(Float.parseFloat(txtValorTotal1.getText()));
            mod.setPagamento((String) comboPagamento1.getSelectedItem());
            control.FecharVenda(mod);
            TL_ParcelaVenda venda = new TL_ParcelaVenda(codVenda);
            venda.setVisible(true);
        }
        limparCampos();
    }//GEN-LAST:event_btnFinalizarVenda1ActionPerformed
    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Nome", "Curso"};
        con.conexao();
        con.executaSql(Sql);
        try {
            con.rs.first();
            do {
                dados.add(new Object[]{con.rs.getInt("CODIGO ALUNO"), con.rs.getString("ALUNO"), con.rs.getString("CURSO")});
            } while (con.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Busque Novamente");
        }
        Tabela tabelaVenda = new Tabela(dados, colunas);
        tb_pesquisa1.setModel(tabelaVenda);
        tb_pesquisa1.getColumnModel().getColumn(0).setPreferredWidth(30);
        tb_pesquisa1.getColumnModel().getColumn(0).setResizable(false);
        tb_pesquisa1.getColumnModel().getColumn(1).setPreferredWidth(157);
        tb_pesquisa1.getColumnModel().getColumn(1).setResizable(false);
        tb_pesquisa1.getColumnModel().getColumn(2).setPreferredWidth(200);
        tb_pesquisa1.getColumnModel().getColumn(2).setResizable(false);
        tb_pesquisa1.getTableHeader().setReorderingAllowed(false);
        tb_pesquisa1.setAutoResizeMode(tb_pesquisa1.AUTO_RESIZE_OFF);
        tb_pesquisa1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        con.desconecta();
    }

    public void preencherTabelaItensVenda(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Curso", "Qtd", "Valor Total"};
        con.conexao();
        con.executaSql(Sql);
        try {
            con.rs.first();
            do {
                float valorCurso = con.rs.getFloat("valor_curso");
                int qtdVendida = con.rs.getInt("quantidade");
                dados.add(new Object[]{con.rs.getString("nome_curso"), con.rs.getInt("quantidade"), valorCurso * qtdVendida});
            } while (con.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Busque Novamente");
        }
        Tabela tabelaItensVenda = new Tabela(dados, colunas);
        tb_venda1.setModel(tabelaItensVenda);
        tb_venda1.getColumnModel().getColumn(0).setPreferredWidth(195);
        tb_venda1.getColumnModel().getColumn(0).setResizable(false);
        tb_venda1.getColumnModel().getColumn(1).setPreferredWidth(30);
        tb_venda1.getColumnModel().getColumn(1).setResizable(false);
        tb_venda1.getColumnModel().getColumn(2).setPreferredWidth(149);
        tb_venda1.getColumnModel().getColumn(2).setResizable(false);
        tb_venda1.getTableHeader().setReorderingAllowed(false);
        tb_venda1.setAutoResizeMode(tb_venda1.AUTO_RESIZE_OFF);
        tb_venda1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

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
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarVenda1;
    private javax.swing.JButton btnDesconto1;
    private javax.swing.JButton btnFinalizarVenda1;
    private javax.swing.JComboBox<String> comboPagamento1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbCurso;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTitulosVenda;
    private javax.swing.JTable tb_pesquisa1;
    private javax.swing.JTable tb_venda1;
    private javax.swing.JTextField txtData1;
    private javax.swing.JTextField txtDesconto1;
    private javax.swing.JTextField txtQtd1;
    private javax.swing.JTextField txtValorCurso1;
    private javax.swing.JTextField txtValorTotal1;
    private javax.swing.JTextField txtnomeAluno1;
    private javax.swing.JTextField txtnomeCurso1;
    // End of variables declaration//GEN-END:variables
}
