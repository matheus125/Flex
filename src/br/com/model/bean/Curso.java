/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.bean;

/**
 *
 * @author dota
 */
public class Curso {

    private int Id_curso;
    private String Nomes_Curso;
    private Float valor_curso;
    private Turma turma;

    public Curso() {
    }

    public Curso(int Id_curso, String Nomes_Curso, Float valor_curso, Turma turma, String dia) {
        this.Id_curso = Id_curso;
        this.Nomes_Curso = Nomes_Curso;
        this.valor_curso = valor_curso;
        this.turma = turma;
    }

    

    /**
     * @return the Id_curso
     */
    public int getId_curso() {
        return Id_curso;
    }

    /**
     * @param Id_curso the Id_curso to set
     */
    public void setId_curso(int Id_curso) {
        this.Id_curso = Id_curso;
    }

    /**
     * @return the Nomes_Curso
     */
    public String getNomes_Curso() {
        return Nomes_Curso;
    }

    /**
     * @param Nomes_Curso the Nomes_Curso to set
     */
    public void setNomes_Curso(String Nomes_Curso) {
        this.Nomes_Curso = Nomes_Curso;
    }

    @Override
    public String toString() {
        return getNomes_Curso(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the valor_curso
     */
    public Float getValor_curso() {
        return valor_curso;
    }

    /**
     * @param valor_curso the valor_curso to set
     */
    public void setValor_curso(Float valor_curso) {
        this.valor_curso = valor_curso;
    }

    /**
     * @return the turma
     */
    public Turma getTurma() {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
