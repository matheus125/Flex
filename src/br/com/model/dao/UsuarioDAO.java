/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.dao;

import br.com.ConexaoBD.Conexao;
import br.com.model.bean.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class UsuarioDAO {
    Conexao conex = new Conexao();
       
    public boolean save(Usuario usuario) {
      
        conex.conexao();
        try {
            PreparedStatement ps = conex.con.prepareStatement("INSERT INTO tb_users "
                    + "(idperson,deslogin,despassword,inadmin) "
                    + "VALUES (?,?,?,?)");
            ps.setInt(1, usuario.getPerson().getId_person());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getPerfil());
            ps.execute();
            System.out.println("Usuario cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Usuario/nErro!" + ex);
        } finally {
            conex.desconecta();
        }
        return false;
    }
}
