/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.bean;

/**
 *
 * @author Matheus
 */
public class Turma {

    private int id_turma;
    private String turma_curso;
    private Turno turno;
    private Horario horario;

    public Turma() {
    }

    public Turma(int id_turma, String turma_curso, Turno turno, Horario horario) {
        this.id_turma = id_turma;
        this.turma_curso = turma_curso;
        this.turno = turno;
        this.horario = horario;
    }
    
    /**
     * @return the id_turma
     */
    public int getId_turma() {
        return id_turma;
    }

    /**
     * @param id_turma the id_turma to set
     */
    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }

    /**
     * @return the turma_curso
     */
    public String getTurma_curso() {
        return turma_curso;
    }

    /**
     * @param turma_curso the turma_curso to set
     */
    public void setTurma_curso(String turma_curso) {
        this.turma_curso = turma_curso;
    }

    /**
     * @return the turno
     */
    public Turno getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    /**
     * @return the horario
     */
    public Horario getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
