package br.com.model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import br.com.model.bean.Aluno;
import br.com.ConexaoBD.Conexao;
import br.com.model.bean.Bairro;
import br.com.model.bean.Cep;
import br.com.model.bean.Cidade;
import br.com.model.bean.Curso;
import br.com.model.bean.Endereco;
import br.com.model.bean.Estado;
import br.com.model.bean.Horario;
import br.com.model.bean.Turma;
import br.com.model.bean.Turno;

public class AlunoDAO {

    Conexao conex = new Conexao();

    public void save(Aluno aluno) {
        conex.conexao();
        try {
            PreparedStatement ps = conex.con.prepareStatement("INSERT INTO tb_aluno "
                    + "(nome, nome_mae, nome_pai, estado_civil, dt_nascimento, rg, cpf,"
                    + " email, sexo, celular, id_Alu_Curso, id_enderecoAluno) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getNome_mae());
            ps.setString(3, aluno.getNome_pai());
            ps.setString(4, aluno.getEstado_civil());
            ps.setString(5, aluno.getDt_nascimento());
            ps.setString(6, aluno.getRg());
            ps.setString(7, aluno.getCpf());
            ps.setString(8, aluno.getEmail());
            ps.setString(9, aluno.getSexo());
            ps.setString(10, aluno.getTelefone());
            ps.setInt(11, aluno.getCurso().getId_curso());
            ps.setInt(12, aluno.getEndereco().getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Aluno Salvo!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar os Dados/nErro!" + ex);
        } finally {
            conex.desconecta();
        }
    }

    public Aluno buscarAluno(Aluno aluno) {

        conex.conexao();
        conex.executaSql("select * from view_aluno WHERE ALUNO LIKE '%" + aluno.getPesquisa() + "%'");
        try {
            conex.rs.first();
            aluno.setId(conex.rs.getInt("CODIGO ALUNO"));
            aluno.setNome(conex.rs.getString("ALUNO"));
            aluno.setNome_mae(conex.rs.getString("NOME MAE"));
            aluno.setNome_pai(conex.rs.getString("NOME PAI"));
            aluno.setEstado_civil(conex.rs.getString("ESTADO CIVIL"));
            aluno.setDt_nascimento(conex.rs.getString("DATA NASCIMENTO"));
            aluno.setRg(conex.rs.getString("RG"));
            aluno.setCpf(conex.rs.getString("CPF"));
            aluno.setEmail(conex.rs.getString("E-EMAIL"));
            aluno.setSexo(conex.rs.getString("SEXO"));
            aluno.setTelefone(conex.rs.getString("CELULAR"));

            Turno turno = new Turno();
            turno.setTurno_curso(conex.rs.getString("TURNO"));

            Horario horario = new Horario();
            horario.setHora_curso(conex.rs.getString("HORARIO"));
            horario.setDia_curso(conex.rs.getString("DIA"));

            Turma turma = new Turma();
            turma.setTurma_curso(conex.rs.getString("TURMA"));
            turma.setTurno(turno);
            turma.setHorario(horario);

            Curso curso = new Curso();
            curso.setId_curso(conex.rs.getInt("CODIGO CURSO"));
            curso.setNomes_Curso(conex.rs.getString("CURSO"));
            curso.setValor_curso(conex.rs.getFloat("VALOR CURSO"));
            curso.setTurma(turma);
            aluno.setCurso(curso);

            Estado estado = new Estado();
            estado.setSigla(conex.rs.getString("SIGLA"));

            Cidade cidade = new Cidade();
            cidade.setNome_cidade(conex.rs.getString("CIDADE"));
            cidade.setEstado(estado);

            Bairro bairro = new Bairro();
            bairro.setNome_bairro(conex.rs.getString("NOME BAIRRO"));
            bairro.setCidade(cidade);

            Cep cep = new Cep();
            cep.setCep(conex.rs.getString("CEP"));
            cep.setBairro(bairro);

            Endereco endereco = new Endereco();
            endereco.setNomeRua(conex.rs.getString("LOGRADOURO"));
            endereco.setNumeroCasa(conex.rs.getString("NUMERO CASA"));
            endereco.setComplemento(conex.rs.getString("COMPLEMENTO"));
            endereco.setCep(cep);
            aluno.setEndereco(endereco);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Alunos no Banco:/nErro" + ex);
        }

        conex.desconecta();
        return aluno;
    }

    /*public List<Aluno> buscarAluno(String nome) {
        conex.conexao();
        List<Aluno> alunos = new ArrayList<>();

        try {
            // PreparedStatement stmt = conex.con.prepareStatement("select * from tb_alunos inner join tb_curso inner join tb_endereco WHERE nome LIKE ?");
            PreparedStatement ps = conex.con.prepareStatement("select * from view_aluno WHERE ALUNO LIKE ?");
            ps.setString(1, "%" + nome + "%");
            conex.rs = ps.executeQuery();
            while (conex.rs.next()) {

                Aluno aluno = new Aluno();
                aluno.setId(conex.rs.getInt("CODIGO ALUNO"));
                aluno.setNome(conex.rs.getString("ALUNO"));
                aluno.setNome_mae(conex.rs.getString("NOME MAE"));
                aluno.setNome_pai(conex.rs.getString("NOME PAI"));
                aluno.setEstado_civil(conex.rs.getString("ESTADO CIVIL"));
                aluno.setDt_nascimento(conex.rs.getString("DATA NASCIMENTO"));
                aluno.setRg(conex.rs.getString("RG"));
                aluno.setCpf(conex.rs.getString("CPF"));
                aluno.setEmail(conex.rs.getString("E-EMAIL"));
                aluno.setSexo(conex.rs.getString("SEXO"));
                aluno.setTelefone(conex.rs.getString("CELULAR"));

                Turno turno = new Turno();
                turno.setTurno_curso(conex.rs.getString("TURNO"));

                Horario horario = new Horario();
                horario.setHora_curso(conex.rs.getString("HORARIO"));
                horario.setDia_curso(conex.rs.getString("DIA"));

                Turma turma = new Turma();
                turma.setTurma_curso(conex.rs.getString("TURMA"));
                turma.setTurno(turno);
                turma.setHorario(horario);

                Curso curso = new Curso();
                curso.setId_curso(conex.rs.getInt("CODIGO CURSO"));
                curso.setNomes_Curso(conex.rs.getString("CURSO"));
                curso.setValor_curso(conex.rs.getFloat("VALOR CURSO"));
                curso.setTurma(turma);
                aluno.setCurso(curso);

                Estado estado = new Estado();
                estado.setSigla(conex.rs.getString("SIGLA"));

                Cidade cidade = new Cidade();
                cidade.setNome_cidade(conex.rs.getString("CIDADE"));
                cidade.setEstado(estado);

                Bairro bairro = new Bairro();
                bairro.setNome_bairro(conex.rs.getString("NOME BAIRRO"));
                bairro.setCidade(cidade);

                Cep cep = new Cep();
                cep.setCep(conex.rs.getString("CEP"));
                cep.setBairro(bairro);

                Endereco endereco = new Endereco();
                endereco.setNomeRua(conex.rs.getString("LOGRADOURO"));
                endereco.setNumeroCasa(conex.rs.getString("NUMERO CASA"));
                endereco.setComplemento(conex.rs.getString("COMPLEMENTO"));
                 
                aluno.setEndereco(endereco);
                alunos.add(aluno);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Alunos no Banco:/nErro" + ex);
        }
        conex.desconecta();
        return alunos;
    }*/
    public void update(Aluno aluno) {
        conex.conexao();
        try {
            PreparedStatement ps = conex.con.prepareStatement("UPDATE tb_aluno SET  nome=?, nome_mae=?, nome_pai=?, estado_civil=?, dt_nascimento=?,"
                    + "rg=?, cpf=?, email=?, sexo=?, celular=? WHERE id_aluno=?");
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getNome_mae());
            ps.setString(3, aluno.getNome_pai());
            ps.setString(4, aluno.getEstado_civil());
            ps.setString(5, aluno.getDt_nascimento());
            ps.setString(6, aluno.getRg());
            ps.setString(7, aluno.getCpf());
            ps.setString(8, aluno.getEmail());
            ps.setString(9, aluno.getSexo());
            ps.setString(10, aluno.getTelefone());
            ps.setInt(11, aluno.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Aluno atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO ao atualizar!");
        }
    }

    public void saveOrUpdate(Aluno aluno) {
        if (aluno.getId() == 0) {
            save(aluno);
        } else {
            update(aluno);
        }
    }

    public void delete(Aluno aluno) {
        conex.conexao();
        try {
            PreparedStatement ps = conex.con.prepareStatement("DELETE FROM tb_aluno WHERE id_aluno=?");
            ps.setInt(1, aluno.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Aluno Removido com sucesso!");

        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
       conex.desconecta();
    }
}
