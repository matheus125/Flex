/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.dao;

import br.com.ConexaoBD.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import br.com.model.bean.Endereco;

/**
 *
 * @author dota
 */
public class EnderecoDAO {

    Conexao conex = new Conexao();

    // int codBai;
    public void save(Endereco endereco) {
        conex.conexao();
        try {
            PreparedStatement ps = conex.con.prepareStatement("INSERT INTO tb_endereco "
                    + "(id_cep_endereco, Logradouro, numeroCasa, complemento) VALUES (?,?,?,?)");
            ps.setInt(1, endereco.getCep().getId_cep());
            ps.setString(2, endereco.getNomeRua());
            ps.setString(3, endereco.getNumeroCasa());
            ps.setString(4, endereco.getComplemento());

            ps.execute();
            System.out.println("Endereco cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar os Dados/nErro!" + ex);
        } finally {
            conex.desconecta();
        }
    }

    /* public void update(Endereco endereco) {
         conex.conexao();
        try {                     
            PreparedStatement ps = conex.con.prepareStatement("UPDATE tb_endereco SET  cep=?, nome_bairro=?, nomeRua=?, numeroCasa=?, complemento=? WHERE id_endereco=?");
            ps.setString(1, endereco.getCep());
            ps.setString(2, endereco.getNomeRua());
            ps.setString(3, endereco.getBairro());
            ps.setString(4, endereco.getNumeroCasa());
            ps.setString(5, endereco.getComplemento());
            ps.setInt(6, endereco.getId());
            ps.execute();
            //JOptionPane.showMessageDialog(null, "atualizado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
}
