/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.ConexaoBD.Conexao;
import br.com.model.bean.Hora;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class Home extends javax.swing.JFrame {

    Conexao con = new Conexao();

    /**
     * Creates new form CadastroAluno
     *
     * @param usuário
     */
    public Home(String usuário) {
        initComponents();
        con.conexao();
        setExtendedState(MAXIMIZED_BOTH);
        lbusuarios.setText(usuário);

        Date data = new Date();
        DateFormat formatadorD = DateFormat.getDateInstance(DateFormat.LONG);
        CampoData.setText(formatadorD.format(data));

        // A linha Abaixo exibe a Hora Atual do Sistema.
        Hora mostra_hora = new Hora();
        mostra_hora.ler_hora();
        campohora.setText("Hora Atual: " + mostra_hora.hora);

        timer1.start();

        if (con != null) {
            lbdb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/img/banco.png")));
        } else {
            lbdb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/img/banco2.png")));
        }
    }

    private Home() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        lbusuarios = new javax.swing.JLabel();
        CampoData = new javax.swing.JLabel();
        campohora = new javax.swing.JLabel();
        lbdb = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        sub_Cad_Alu = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Home");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/img/usuarios.png"))); // NOI18N
        jLabel3.setText("Usuário:");

        lbusuarios.setForeground(new java.awt.Color(255, 255, 255));

        CampoData.setForeground(new java.awt.Color(255, 255, 255));

        campohora.setForeground(new java.awt.Color(255, 255, 255));

        lbdb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/img/banco.png"))); // NOI18N

        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbusuarios, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(CampoData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campohora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbdb, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(lbdb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campohora, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(462, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbdb, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CampoData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campohora, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );

        jScrollPane1.setViewportView(jDesktopPane1);

        jMenu1.setText("Cadastro");

        sub_Cad_Alu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        sub_Cad_Alu.setText("Aluno");
        sub_Cad_Alu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_Cad_AluActionPerformed(evt);
            }
        });
        jMenu1.add(sub_Cad_Alu);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("Usuario");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Vendas");

        jMenuItem1.setText("Realizar Venda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Consultar Vendas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Relatorios");

        jMenuItem3.setText("Vendas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuItem4.setText("Turma/turno");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Trocar Usuario");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu2.setText("Sair");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1084, 619));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sub_Cad_AluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_Cad_AluActionPerformed
        try {
            Cad_Aluno tela = new Cad_Aluno();
            con.executaSql("select*from tb_users where deslogin='" + lbusuarios.getText() + "'");
            con.rs.first();
            if (con.rs.getString("inadmin").equals("Administrador")) {
                if (tela == null) {
                    tela = new Cad_Aluno();
                    tela.setVisible(true);
                    tela.setResizable(false);
                } else {
                    tela.setVisible(true);
                    tela.setResizable(false);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Você não tem Acesso a essa Funcionalidade!\n Contate o Administrador do Sistema!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem Acesso a essa Funcionalidade!\n Contate o Administrador do Sistema!" + ex.getMessage());
        }

    }//GEN-LAST:event_sub_Cad_AluActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        Hora mostra_hora = new Hora();
        mostra_hora.ler_hora();
        campohora.setText("Hora Atual:" + mostra_hora.hora);
    }//GEN-LAST:event_timer1OnTime

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            TelaVendas tela = new TelaVendas();
            con.executaSql("select*from tb_users where deslogin='" + lbusuarios.getText() + "'");
            con.rs.first();
            if (con.rs.getString("inadmin").equals("Administrador")) {
                if (tela == null) {
                    tela = new TelaVendas();
                    tela.setVisible(true);
                    tela.setResizable(false);
                } else {
                    tela.setVisible(true);
                    tela.setResizable(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Você não tem Acesso a essa Funcionalidade!\n Contate o Administrador do Sistema!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem Acesso a essa Funcionalidade!\n Contate o Administrador do Sistema!" + ex.getMessage());
        }


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            TL_PesquisarVenda tela = new TL_PesquisarVenda();
            con.executaSql("select*from tb_users where deslogin='" + lbusuarios.getText() + "'");
            con.rs.first();
            if (con.rs.getString("inadmin").equals("Administrador") || con.rs.getString("inadmin").equals("Atendente")) {
                if (tela == null) {
                    tela = new TL_PesquisarVenda();
                    tela.setVisible(true);
                    tela.setResizable(false);
                } else {
                    tela.setVisible(true);
                    tela.setResizable(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Você não tem Acesso a essa Funcionalidade!\n Contate o Administrador do Sistema!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem Acesso a essa Funcionalidade!\n Contate o Administrador do Sistema!" + ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        System.exit(0);
        con.desconecta();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        TelaLogin Telas = new TelaLogin();
        Telas.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            // Cad_Usuarios telausu = new Cad_Usuarios();
            con.executaSql("select*from tb_users where deslogin='" + lbusuarios.getText() + "'");
            con.rs.first();
            if (con.rs.getString("inadmin").equals("Administrador")) {
                /* try {
                    con.executaSql("select * from relatorio_pagamento;");
                    JRResultSetDataSource relatReul = new JRResultSetDataSource(con.rs);
                    JasperPrint jpPrint = JasperFillManager.fillReport("Relatorios/RelatorioVendas.jasper", new HashMap(), relatReul);
                    JasperViewer jv = new JasperViewer(jpPrint);
                    jv.setVisible(true);
                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatório!\nERRO" + ex);
                    
                }*/
            } else {
                JOptionPane.showMessageDialog(null, "Você não tem Acesso a essa Funcionalidade!\n Contate o Administrador do Sistema!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem Acesso a essa Funcionalidade!\n Contate o Administrador do Sistema!" + ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // try {
        Cad_Usuarios telausu = new Cad_Usuarios();
        //   con.executaSql("select*from tb_users where deslogin='" + lbusuarios.getText() + "'");
        //      con.rs.first();
        //   if (con.rs.getString("inadmin").equals("Administrador")) {
        //      if (telausu == null) {
        telausu = new Cad_Usuarios();
        telausu.setVisible(true);
        telausu.setResizable(false);
        //    } else {
        //      telausu.setVisible(true);
        //        telausu.setResizable(false);
        //     }
        // } else {
        //      JOptionPane.showMessageDialog(null, "Você não tem Acesso a essa Funcionalidade!\n Contate o Administrador do Sistema!");
        //      }
        //  } catch (SQLException ex) {
        //       JOptionPane.showMessageDialog(null, "Você não tem Acesso a essa Funcionalidade!\n Contate o Administrador do Sistema!" + ex.getMessage());
        //  }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            // Cad_Usuarios telausu = new Cad_Usuarios();
            con.executaSql("select*from tb_users where deslogin='" + lbusuarios.getText() + "'");
            con.rs.first();
            if (con.rs.getString("inadmin").equals("Administrador")) {
                /*  try {
                    con.executaSql("select * from relatorio_pagamento;");
                    JRResultSetDataSource relatReul = new JRResultSetDataSource(con.rs);
                    JasperPrint jpPrint = JasperFillManager.fillReport("Relatorios/RelatorioVendas.jasper", new HashMap(), relatReul);
                    JasperViewer jv = new JasperViewer(jpPrint);
                    jv.setVisible(true);
                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatório!\nERRO" + ex);
                    
                }*/
            } else {
                JOptionPane.showMessageDialog(null, "Você não tem Acesso a essa Funcionalidade!\n Contate o Administrador do Sistema!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem Acesso a essa Funcionalidade!\n Contate o Administrador do Sistema!" + ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CampoData;
    private javax.swing.JLabel campohora;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbdb;
    private javax.swing.JLabel lbusuarios;
    private javax.swing.JMenuItem sub_Cad_Alu;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables
}