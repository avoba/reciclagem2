/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.arthur.reciclagem.modelo;

/**
 *
 * @author guest01
 */
public abstract class Veiculo {
    private String placa;
    private String modelo;
    private String marca;
    private int ano;
    private String cor;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", cor=" + cor + '}';
    }
    
    
}
