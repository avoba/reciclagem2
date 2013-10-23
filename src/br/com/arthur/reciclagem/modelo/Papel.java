/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.arthur.reciclagem.modelo;

/**
 *
 * @author guest01
 */
public class Papel extends LixoReciclavel{
    private float precoPapel;//preco do kg

    public float getPrecoPapel() {
        return precoPapel;
    }

    public void setPrecoPapel(float precoPapel) {
        this.precoPapel = precoPapel;
    }

    @Override
    public String toString() {
        return "Papel{" + "precoPapel=" + precoPapel + '}';
    }
    
}
