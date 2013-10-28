/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.arthur.reciclagem.modelo.persistencia.dao;

import br.com.arthur.reciclagem.modelo.Funcionario;
import java.util.List;

public interface FuncionarioDAO {
    int salve(Funcionario u);
    boolean remove (int codigo);
    List<Funcionario> listAll();
    Funcionario listById(int codigo);   
    List<Funcionario> listByNome(String nome);
    boolean Login (String login, String senha);
}
