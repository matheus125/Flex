/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.bean;


public class Persons {
    
    private int id_person;
    private String nome;
    private String email;
    private String phone;

    public Persons() {
    }

    public Persons(int id_person, String nome, String email, String phone) {
        this.id_person = id_person;
        this.nome = nome;
        this.email = email;
        this.phone = phone;
    }

    
    
    /**
     * @return the id_person
     */
    public int getId_person() {
        return id_person;
    }

    /**
     * @param id_person the id_person to set
     */
    public void setId_person(int id_person) {
        this.id_person = id_person;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
