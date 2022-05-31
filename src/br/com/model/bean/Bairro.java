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
public class Bairro {
    
    private int id_bairro;
    private String nome_bairro;
    private Cidade cidade;

    /**
     * @return the id_bairro
     */
    public int getId_bairro() {
        return id_bairro;
    }

    /**
     * @param id_bairro the id_bairro to set
     */
    public void setId_bairro(int id_bairro) {
        this.id_bairro = id_bairro;
    }

    /**
     * @return the nome_bairro
     */
    public String getNome_bairro() {
        return nome_bairro;
    }

    /**
     * @param nome_bairro the nome_bairro to set
     */
    public void setNome_bairro(String nome_bairro) {
        this.nome_bairro = nome_bairro;
    }

    /**
     * @return the cidade
     */
    public Cidade getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
