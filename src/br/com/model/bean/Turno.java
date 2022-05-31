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
public class Turno {

    private int id_turno;
    private String turno_curso;

    public Turno() {
    }

    public Turno(int id_turno, String turno_curso) {
        this.id_turno = id_turno;
        this.turno_curso = turno_curso;
    }   
    
    /**
     * @return the id_turno
     */
    public int getId_turno() {
        return id_turno;
    }

    /**
     * @param id_turno the id_turno to set
     */
    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    /**
     * @return the turno_curso
     */
    public String getTurno_curso() {
        return turno_curso;
    }

    /**
     * @param turno_curso the turno_curso to set
     */
    public void setTurno_curso(String turno_curso) {
        this.turno_curso = turno_curso;
    }

}
