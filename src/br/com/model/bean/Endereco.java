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
public class Endereco {
    private int id;
    private String nomeRua;
    private String numeroCasa;
    private String complemento;
    private Cep cep;

    public Endereco() {
    }

    public Endereco(int id, String nomeRua, String numeroCasa, String complemento, Cep cep) {
        this.id = id;
        this.nomeRua = nomeRua;
        this.numeroCasa = numeroCasa;
        this.complemento = complemento;
        this.cep = cep;
    }

   
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

      /**
     * @return the nomeRua
     */
    public String getNomeRua() {
        return nomeRua;
    }

    /**
     * @param nomeRua the nomeRua to set
     */
    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    /**
     * @return the numeroCasa
     */
    public String getNumeroCasa() {
        return numeroCasa;
    }

    /**
     * @param numeroCasa the numeroCasa to set
     */
    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the cep
     */
    public Cep getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(Cep cep) {
        this.cep = cep;
    }


   
    
}