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
public class Cep {
    
    private int id_cep;
    private Bairro bairro;
    private String cep;

    /**
     * @return the id_cep
     */
    public int getId_cep() {
        return id_cep;
    }

    /**
     * @param id_cep the id_cep to set
     */
    public void setId_cep(int id_cep) {
        this.id_cep = id_cep;
    }

    /**
     * @return the bairro
     */
    public Bairro getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }
}
