/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.arthur.modelo;

import java.util.Date;

/**
 *
 * @author guest01
 */
public abstract class Pessoa {
    private int id;
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String rg;
    private String endereco;
    private String email;
    private String telefone;
    private String bairro;
    private String cidade;
    private String celular;

    public int getId() {
        return id;
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

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf + ", rg=" + rg + ", endereco=" + endereco + ", email=" + email + ", telefone=" + telefone + ", bairro=" + bairro + ", cidade=" + cidade + ", celular=" + celular + '}';
    }

   
    
    
    
}
