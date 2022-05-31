/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.dao;

import br.com.ConexaoBD.Conexao;
import br.com.model.bean.Bairro;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class BairroDAO {
    Conexao conex = new Conexao();

    public boolean save(Bairro bairro) {
        conex.conexao();
        try {
            PreparedStatement ps = conex.con.prepareStatement("INSERT INTO tb_bairro "
                    + "(nome_bairro,id_cidade_bairro) "
                    + "VALUES (?,?)");
            ps.setString(1, bairro.getNome_bairro());
            ps.setInt(2, bairro.getCidade().getId_cidade());
            ps.execute();
            System.out.println("Turno cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar o Turno/nErro!" + ex);
        } finally {
            conex.desconecta();
        }
        return false;
    }
}
