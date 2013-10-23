/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.arthur.reciclagem.controller;

import br.com.arthur.reciclagem.modelo.Funcionario;
import br.com.arthur.reciclagem.modelo.persistencia.FuncionarioDAOImplements;
import br.com.arthur.reciclagem.modelo.persistencia.dao.FuncionarioDAO;
import java.util.List;

/**
 *
 * @author guest01
 */
public class FuncionarioController {
    
    public int salvar(Funcionario f){
        FuncionarioDAOImplements dao = 
                new FuncionarioDAOImplements();
        return dao.salve(f);
    }
    
    public List<Funcionario> listarTodos(){
        FuncionarioDAOImplements dao = 
                new FuncionarioDAOImplements();
        return dao.listAll();
    }
    public boolean remove (int id){
    FuncionarioDAOImplements dao  = new FuncionarioDAOImplements();
    return dao.remove(id);
    
    }
    
    public Funcionario listById(int codigo){
        FuncionarioDAOImplements dao = new FuncionarioDAOImplements();
        return dao.listById(codigo);
        
    }
    
    public List<Funcionario> listByNome(String nome){
        FuncionarioDAOImplements dao = new FuncionarioDAOImplements();
        return dao.listByNome(nome);
    }
}