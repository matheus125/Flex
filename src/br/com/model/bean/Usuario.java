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
public class Usuario {
    private int id_user;
    private Persons person;
    private String login;
    private String senha;
    private String perfil;

    public Usuario() {
    }

    public Usuario(int id_user, Persons person, String login, String senha, String perfil) {
        this.id_user = id_user;
        this.person = person;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }
    

    /**
     * @return the id_user
     */
    public int getId_user() {
        return id_user;
    }

    /**
     * @param id_user the id_user to set
     */
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    /**
     * @return the person
     */
    public Persons getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(Persons person) {
        this.person = person;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the perfil
     */
    public String getPerfil() {
        return perfil;
    }

    /**
     * @param perfil the perfil to set
     */
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
