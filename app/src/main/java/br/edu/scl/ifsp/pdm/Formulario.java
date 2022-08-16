package br.edu.scl.ifsp.pdm;

import androidx.annotation.NonNull;

public class Formulario {

    private String nome;
    private String telefone;
    private String email;
    private Boolean ingressar;
    private String sexo;
    private String cidade;
    private String uf;

    public Formulario(String nome, String telefone, String email, Boolean ingressar,
                      String sexo, String cidade, String uf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.ingressar = ingressar;
        this.sexo = sexo;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Formulario(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIngressar() {
        return ingressar;
    }

    public void setIngressar(Boolean ingressar) {
        this.ingressar = ingressar;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @NonNull
    @Override
    public String toString() {
        return "Formulario{" + "nome='" + nome + '\n' +
                ", telefone='" + telefone + '\n' +
                ", email='" + email + '\n' +
                ", ingressar=" + ingressar +
                ", sexo='" + sexo + '\n' +
                ", cidade='" + cidade + '\n'+
                ", uf='" + uf + '\n' +
                '}';
    }
}
