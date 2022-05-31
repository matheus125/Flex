/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.dao;

import br.com.ConexaoBD.Conexao;
import br.com.model.bean.Cep;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class CepDAO {
    Conexao conex = new Conexao();

    public boolean save(Cep cep) {
        conex.conexao();
        try {
            PreparedStatement ps = conex.con.prepareStatement("INSERT INTO tb_cep "
                    + "(id_cep_bairro,cep) "
                    + "VALUES (?,?)");
            ps.setInt(1, cep.getBairro().getId_bairro());
            ps.setString(2, cep.getCep());
            ps.execute();
            System.out.println("Cep cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar o Cep/nErro!" + ex);
        } finally {
            conex.desconecta();
        }
        return false;
    }
}
