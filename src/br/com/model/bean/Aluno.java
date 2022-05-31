package br.com.model.bean;

/**
 *
 * @author Otavio
 */
public class Aluno {

    private int id;
    private String nome;
    private String nome_mae;
    private String nome_pai;
    private String estado_civil;
    private String Dt_nascimento;
    private String rg;
    private String cpf;
    private String email;
    private String sexo;
    private String telefone;
    private Endereco endereco;
    private Curso curso;
    private String pesquisa;

    public Aluno() {
    }

    public Aluno(int id, String nome, String nome_mae, String nome_pai, String estado_civil, String Dt_nascimento, String rg, String cpf, String email, String sexo, String telefone, Endereco endereco, Curso curso) {
        this.id = id;
        this.nome = nome;
        this.nome_mae = nome_mae;
        this.nome_pai = nome_pai;
        this.estado_civil = estado_civil;
        this.Dt_nascimento = Dt_nascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
        this.curso = curso;
    }

    /**
     * @return the nome_mae
     */
    public String getNome_mae() {
        return nome_mae;
    }

    /**
     * @param nome_mae the nome_mae to set
     */
    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    /**
     * @return the nome_pai
     */
    public String getNome_pai() {
        return nome_pai;
    }

    /**
     * @param nome_pai the nome_pai to set
     */
    public void setNome_pai(String nome_pai) {
        this.nome_pai = nome_pai;
    }

    /**
     * @return the estado_civil
     */
    public String getEstado_civil() {
        return estado_civil;
    }

    /**
     * @param estado_civil the estado_civil to set
     */
    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    /**
     * @return the Dt_nascimento
     */
    public String getDt_nascimento() {
        return Dt_nascimento;
    }

    /**
     * @param Dt_nascimento the Dt_nascimento to set
     */
    public void setDt_nascimento(String Dt_nascimento) {
        this.Dt_nascimento = Dt_nascimento;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

}
