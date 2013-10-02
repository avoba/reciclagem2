
package br.com.modelo;


public class Motorista extends Funcionario{
    
    Caminhao caminhao;//definição do caminhão que o motorista está usando

    public Caminhao getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(Caminhao caminhao) {
        this.caminhao = caminhao;
    }

    @Override
    public String toString() {
        return "Motorista{" + "caminhao=" + caminhao + '}';
    }
 
}
