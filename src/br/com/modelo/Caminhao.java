/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

/**
 *
 * @author guest01
 */
public class Caminhao extends Veiculo{
    private String tipo;//que tipo de material transporta
    private String capacidade;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Caminhao{" + "tipo=" + tipo + ", capacidade=" + capacidade + '}';
    }
    
    
    
    
}
