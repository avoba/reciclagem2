/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.arthur.reciclagem.modelo;

/**
 *
 * @author guest01
 */
public class Plastico extends LixoReciclavel{
    private float precoPlastico;//preco do kg

    public float getPrecoPlastico() {
        return precoPlastico;
    }

    public void setPrecoPlastico(float precoPlastico) {
        this.precoPlastico = precoPlastico;
    }

    @Override
    public String toString() {
        return "" + precoPlastico;
    }
    
    
    
}
