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
public class ParcelamentoVenda {
    private int codVenda;
    private int numeroParc;
    private float valor_venda;
    private float valor_total;
    private float valorParcela;
    private String dataVencimento;

    public ParcelamentoVenda() {
    }

    public ParcelamentoVenda(int codVenda, int numeroParc, float valor_venda, float valor_total, float valorParcela, String dataVencimento) {
        this.codVenda = codVenda;
        this.numeroParc = numeroParc;
        this.valor_venda = valor_venda;
        this.valor_total = valor_total;
        this.valorParcela = valorParcela;
        this.dataVencimento = dataVencimento;
    }    
    /**
     * @return the codVenda
     */
    public int getCodVenda() {
        return codVenda;
    }

    /**
     * @param codVenda the codVenda to set
     */
    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    /**
     * @return the numeroParc
     */
    public int getNumeroParc() {
        return numeroParc;
    }

    /**
     * @param numeroParc the numeroParc to set
     */
    public void setNumeroParc(int numeroParc) {
        this.numeroParc = numeroParc;
    }

    /**
     * @return the valor_venda
     */
    public float getValor_venda() {
        return valor_venda;
    }

    /**
     * @param valor_venda the valor_venda to set
     */
    public void setValor_venda(float valor_venda) {
        this.valor_venda = valor_venda;
    }

    /**
     * @return the valor_total
     */
    public float getValor_total() {
        return valor_total;
    }

    /**
     * @param valor_total the valor_total to set
     */
    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    /**
     * @return the valorParcela
     */
    public float getValorParcela() {
        return valorParcela;
    }

    /**
     * @param valorParcela the valorParcela to set
     */
    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }

    /**
     * @return the dataVencimento
     */
    public String getDataVencimento() {
        return dataVencimento;
    }

    /**
     * @param dataVencimento the dataVencimento to set
     */
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
