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
import br.com.model.bean.Curso;
import javax.swing.JOptionPane;

/**
 *
 * @author dota
 */
public class CursoDAO {

    Conexao conex = new Conexao();
    
    public boolean save(Curso curso) {
        conex.conexao();
        try {
            PreparedStatement ps = conex.con.prepareStatement("INSERT INTO tb_curso "
                    + "(nome_curso,valor_curso,id_turma_curso) "
                    + "VALUES (?,?,?)");
            ps.setString(1, curso.getNomes_Curso());
            ps.setFloat(2, curso.getValor_curso());
            ps.setInt(3, curso.getTurma().getId_turma());
            ps.execute();
            System.out.println("Curso cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar Curso/nErro!" + ex);
        } finally {
            conex.desconecta();
        }
        return false;
    }
    
    
 
   /* public List<Curso> getAll() {
        conex.conexao();
        List<Curso> cursos = new ArrayList<>();
        try {
            PreparedStatement stm = conex.con.prepareStatement("select * from tb_curso");
            ResultSet rs = stm.executeQuery();
            
            
            while (rs.next()) {
              Curso curso = new Curso();
              curso.setId_curso(rs.getInt("id_curso"));
              curso.setNomes_Curso(rs.getString("nome_curso"));
              cursos.add(curso);
            }
            return cursos;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }*/
}
