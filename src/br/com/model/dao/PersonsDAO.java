/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.dao;

import br.com.ConexaoBD.Conexao;
import br.com.model.bean.Persons;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PersonsDAO {

    Conexao conex = new Conexao();

    public boolean save(Persons persons) {
        conex.conexao();
        try {
            PreparedStatement ps = conex.con.prepareStatement("INSERT INTO tb_persons "
                    + "(desperson,desemail,nrphone) "
                    + "VALUES (?,?,?)");
              ps.setString(1, persons.getNome());
              ps.setString(2, persons.getEmail());
              ps.setString(3, persons.getPhone());
            ps.execute();
            System.out.println("Persons cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Persons/nErro!" + ex);
        } finally {
            conex.desconecta();
        }
        return false;
    }
}
