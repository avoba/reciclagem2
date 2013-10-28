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
public class FuncionarioController{
    
    public int salvar(Funcionario f){
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.salve(f);
    }
    
    public List<Funcionario> listarTodos(){
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listAll();
    }
    public boolean remove (int id){
    FuncionarioDAO dao  = new FuncionarioDAOImplements();
    return dao.remove(id);
    
    }
    
    public Funcionario listById(int id){
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listById(id);
        
    }
    
    public List<Funcionario> listByNome(String nome){
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listByNome(nome);
    }
    
    public boolean Login(String login, String senha){
        FuncionarioDAO f = new FuncionarioDAOImplements();
        return f.Login(login, senha);
    }
}