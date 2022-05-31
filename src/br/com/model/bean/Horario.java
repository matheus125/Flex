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
public class Horario {
    private int id_horario;
    private String hora_curso;
    private String dia_curso;

    public Horario() {
    }

    public Horario(int id_horario, String hora_curso, String dia_curso) {
        this.id_horario = id_horario;
        this.hora_curso = hora_curso;
        this.dia_curso = dia_curso;
    }
    
    /**
     * @return the id_horario
     */
    public int getId_horario() {
        return id_horario;
    }

    /**
     * @param id_horario the id_horario to set
     */
    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    /**
     * @return the hora_curso
     */
    public String getHora_curso() {
        return hora_curso;
    }

    /**
     * @param hora_curso the hora_curso to set
     */
    public void setHora_curso(String hora_curso) {
        this.hora_curso = hora_curso;
    }

    /**
     * @return the dia_curso
     */
    public String getDia_curso() {
        return dia_curso;
    }

    /**
     * @param dia_curso the dia_curso to set
     */
    public void setDia_curso(String dia_curso) {
        this.dia_curso = dia_curso;
    }
}
