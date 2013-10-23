
package br.com.arthur.reciclagem.modelo;

import java.util.Date;

public class Funcionario extends Pessoa{
    private int id;
    private double salario;
    private double ctps;
    private Date dataAdmissao;
    private String setor;
    private String cargo;
    private String login;
    private String senha;

    public Funcionario() {
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getCtps() {
        return ctps;
    }

    public void setCtps(double ctps) {
        this.ctps = ctps;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", salario=" + salario + ", ctps=" + ctps + ", dataAdmissao=" + dataAdmissao + ", setor=" + setor + ", cargo=" + cargo + ", login=" + login + ", senha=" + senha + '}';
    }

   

   
    
}
