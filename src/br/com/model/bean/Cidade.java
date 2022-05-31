/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.bean;


public class Cidade {
   private int id_cidade;
   private String nome_cidade;
   private Estado estado;

    public Cidade() {
    }

    public Cidade(int id_cidade, String nome_cidade, Estado estado) {
        this.id_cidade = id_cidade;
        this.nome_cidade = nome_cidade;
        this.estado = estado;
    }
   
    /**
     * @return the id_cidade
     */
    public int getId_cidade() {
        return id_cidade;
    }

    /**
     * @param id_cidade the id_cidade to set
     */
    public void setId_cidade(int id_cidade) {
        this.id_cidade = id_cidade;
    }

    /**
     * @return the nome_cidade
     */
    public String getNome_cidade() {
        return nome_cidade;
    }

    /**
     * @param nome_cidade the nome_cidade to set
     */
    public void setNome_cidade(String nome_cidade) {
        this.nome_cidade = nome_cidade;
    }

    /**
     * @return the estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
