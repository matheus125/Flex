/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.dao;

import br.com.ConexaoBD.Conexao;
import br.com.model.bean.Cidade;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class CidadeDAO {

    Conexao conex = new Conexao();

    public boolean save(Cidade cidade) {
        conex.conexao();
        try {
            PreparedStatement ps = conex.con.prepareStatement("INSERT INTO tb_cidade "
                    + "(nome_cidade, id_estado_cidade) "
                    + "VALUES (?,?)");
            ps.setString(1, cidade.getNome_cidade());
            ps.setInt(2, cidade.getEstado().getId_estado());
            ps.execute();
            //System.out.println("Cidade cadastrada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Estado/nErro!" + ex);
        } finally {
            conex.desconecta();
        }
        return false;
    }
}
