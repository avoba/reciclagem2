/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

/**
 *
 * @author guest01
 */
public abstract class LixoReciclavel {
    private int codigoLixo;
    private float kg;
    private String descricao; 

    public int getCodigoLixo() {
        return codigoLixo;
    }

    public void setCodigoLixo(int codigoLixo) {
        this.codigoLixo = codigoLixo;
    }

    public float getKg() {
        return kg;
    }

    public void setKg(float kg) {
        this.kg = kg;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "LixoReciclavel{" + "codigoLixo=" + codigoLixo + ", kg=" + kg + ", descricao=" + descricao + '}';
    }
    
    
    
    
    
}
