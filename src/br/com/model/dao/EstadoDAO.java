/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.dao;

import br.com.ConexaoBD.Conexao;
import br.com.model.bean.Estado;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class EstadoDAO {
    Conexao conex = new Conexao();
    
    public boolean save(Estado estado) {
        conex.conexao();
        try {
            PreparedStatement ps = conex.con.prepareStatement("INSERT INTO tb_estado "
                    + "(sigla) "
                    + "VALUES (?)");
            ps.setString(1, estado.getSigla());
            ps.execute();
            //System.out.println("Estado cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Estado/nErro!" + ex);
        } finally {
            conex.desconecta();
        }
        return false;
    }
}
