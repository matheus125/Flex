/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.dao;

import br.com.ConexaoBD.Conexao;
import br.com.model.bean.Turno;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class TurnoDAO {

    Conexao conex = new Conexao();

    public boolean save(Turno turno) {
        conex.conexao();
        try {
            PreparedStatement ps = conex.con.prepareStatement("INSERT INTO tb_turno "
                    + "(turno_curso) "
                    + "VALUES (?)");
            ps.setString(1, turno.getTurno_curso());     
            ps.execute();
            //System.out.println("Turno cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar o Turno/nErro!" + ex);
        } finally {
            conex.desconecta();
        }
        return false;
    }

}
