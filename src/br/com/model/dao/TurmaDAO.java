/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.dao;

import br.com.ConexaoBD.Conexao;
import br.com.model.bean.Turma;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class TurmaDAO {
    Conexao conex = new Conexao();

    public boolean save(Turma turma) {
        conex.conexao();
        try {
            PreparedStatement ps = conex.con.prepareStatement("INSERT INTO tb_turma "
                    + "(turma_curso,id_turma_turno,id_turma_horario) "
                    + "VALUES (?,?,?)");
            ps.setString(1, turma.getTurma_curso());
            ps.setInt(2, turma.getTurno().getId_turno());
            ps.setInt(3, turma.getHorario().getId_horario());
            ps.execute();
            System.out.println("Turma cadastrada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar o Turma/nErro!" + ex);
        } finally {
            conex.desconecta();
        }
        return false;
    }
}
