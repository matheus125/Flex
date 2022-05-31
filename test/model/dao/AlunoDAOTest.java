/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import br.com.model.dao.AlunoDAO;
import br.com.model.bean.Aluno;
import br.com.model.bean.Endereco;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dota
 */
public class AlunoDAOTest {

    private String nome;

    public AlunoDAOTest() {
    }

   /* @Test
    public void listar() {

     AlunoDAO dao = new AlunoDAO();
     
        for (Aluno a: dao.buscarAluno(nome)) {
            
           System.out.println("Nome Aluno:"+a.getNome()+" - Nome Curso: "+a.getCurso().getNomes_Curso()+" - Nome Bairro: "+a.getEndereco().getBairro()+" - Cep: "+a.getEndereco().getCep());
        
        }
      
    }*/
}
