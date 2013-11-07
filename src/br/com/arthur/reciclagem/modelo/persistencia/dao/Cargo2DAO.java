/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.arthur.reciclagem.modelo.persistencia.dao;

import br.com.arthur.reciclagem.modelo.Cargo2;
import java.util.List;


public interface Cargo2DAO {
    int salvar(Cargo2 c);
    boolean remover(int codigo);
    List<Cargo2> listarTodos();
    Cargo2 buscarCodigo(int codigo);
}
