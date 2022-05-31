/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.dao;

import br.com.ConexaoBD.Conexao;
import br.com.model.bean.Horario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class HorarioDAO {
    Conexao conex = new Conexao();
    
    public boolean save(Horario horario) {
        conex.conexao();
        try {
            PreparedStatement ps = conex.con.prepareStatement("INSERT INTO tb_horario "
                    + "(hora_curso,dia_curso) "
                    + "VALUES (?,?)");
            ps.setString(1, horario.getHora_curso());
            ps.setString(2, horario.getDia_curso());
            ps.execute();
            System.out.println("Horario cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Horario/nErro!" + ex);
        } finally {
            conex.desconecta();
        }
        return false;
    }
}
