/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.arthur.reciclagem.modelo;

/**
 *
 * @author guest01
 */
public class Metal extends LixoReciclavel{
    private float precoMetal;//preco do kg

    public float getPrecoMetal() {
        return precoMetal;
    }

    public void setPrecoMetal(float precoMetal) {
        this.precoMetal = precoMetal;
    }

    @Override
    public String toString() {
        return "Metal{" + "precoMetal=" + precoMetal + '}';
    }

    
}
