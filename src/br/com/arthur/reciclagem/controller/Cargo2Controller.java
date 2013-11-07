/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.arthur.reciclagem.controller;

import br.com.arthur.reciclagem.modelo.Cargo2;
import br.com.arthur.reciclagem.modelo.persistencia.Cargo2DAOImplements;
import br.com.arthur.reciclagem.modelo.persistencia.dao.Cargo2DAO;
import java.util.List;

/**
 *
 * @author guest01
 */
public class Cargo2Controller {
     public int salvar(Cargo2 c){
        Cargo2DAO dao = new Cargo2DAOImplements();
        return dao.salvar(c); 
    }
    
    public List<Cargo2> listarTodos(){
        Cargo2DAO dao = new Cargo2DAOImplements();
        return dao.listarTodos();
    }
    public boolean remover (int codigo){
        Cargo2DAO dao = new Cargo2DAOImplements();
        return dao.remover(codigo);
    }
    public Cargo2 listarId(int codigo){
        Cargo2DAO dao = new Cargo2DAOImplements();
        return dao.buscarCodigo(codigo);
    }

    
    
}
