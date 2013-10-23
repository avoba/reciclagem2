
package br.com.arthur.reciclagem.modelo;


public class Vidro extends LixoReciclavel{
        private float precoVidro;//preco do kg

    public float getPrecoVidro() {
        return precoVidro;
    }

    public void setPrecoVidro(float precoVidro) {
        this.precoVidro = precoVidro;
    }

    @Override
    public String toString() {
        return "Vidro{" + "precoVidro=" + precoVidro + '}';
    }

        
}
