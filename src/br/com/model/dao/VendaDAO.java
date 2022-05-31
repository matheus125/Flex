/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.dao;

import br.com.ConexaoBD.Conexao;
import br.com.model.bean.Venda;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class VendaDAO {

    int codCurso, codAluno;

    Conexao conex = new Conexao();

    public void adicionaItem(Venda mod) {
        AcharCodCurso(mod.getNomeCurso());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into tb_itens_vendas(id_venda,id_curso,quantidade)"
                    + " values (?,?,?)");
            pst.setInt(1, mod.getId_venda());
            pst.setInt(2, codCurso);
            pst.setInt(3, mod.getQtdItem());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Curso Adicionado!");
            conex.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao inserir a venda!" + ex);
        }
    }

    public void AcharCodCurso(String nome) {
        conex.conexao();
        conex.executaSql("select * from tb_curso where nome_curso ='" + nome + "'");
        try {
            conex.rs.first();
            codCurso = conex.rs.getInt("id_curso");
            conex.conexao();
        } catch (SQLException ex) {
            conex.conexao();
            JOptionPane.showMessageDialog(null, "erro ao achar o codigo do curso!" + ex);
        }

    }

    public void FecharVenda(Venda mod) {
        AcharAluno(mod.getNomeAluno());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update tb_venda set id_aluno_venda=?, data_venda=?, valor_total=?, tipo_pagamento=? where id_venda=?");
            pst.setInt(1, codAluno);
            pst.setString(2, mod.getData_venda());
            pst.setFloat(3, mod.getValor_total());
            pst.setString(4, mod.getPagamento());
            pst.setInt(5, mod.getId_venda());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo Finalizada!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao fechar venda!" + ex);
        }
        conex.desconecta();
    }

    public void AcharAluno(String nome) {
        conex.conexao();
        try {
            conex.executaSql("select * from tb_aluno where nome='" + nome + "'");
            conex.rs.first();
            codAluno = conex.rs.getInt("id_aluno");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao achar o cliente!\nErro:" + ex);
        }
        conex.desconecta();
    }

    public void CancelarVenda() {
        conex.conexao();
        PreparedStatement pst;
        conex.executaSql("select * from tb_venda inner join tb_itens_vendas \n"
                + "on tb_venda.id_venda = tb_itens_vendas.id_venda inner join tb_curso\n"
                + "on tb_itens_vendas.id_curso = tb_curso.id_curso where valor_total = 0");
        
        try {
            conex.rs.first();
            do {
                pst = conex.con.prepareStatement("delete from tb_itens_vendas where id_venda = ?");
                pst.setInt(1, conex.rs.getInt("id_venda"));
                pst.execute();
            } while (conex.rs.next());
             pst = conex.con.prepareStatement("delete from tb_venda_curso where valor_total=?");
            pst.setInt(1, 0);
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cancelar a venda!\nERRO" + ex);
        }
        conex.desconecta();
    }

}
