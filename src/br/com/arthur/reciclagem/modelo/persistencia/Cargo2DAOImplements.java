/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.arthur.reciclagem.modelo.persistencia;

import br.com.arthur.reciclagem.modelo.Cargo2;
import br.com.arthur.reciclagem.modelo.persistencia.dao.Cargo2DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author guest01
 */
public class Cargo2DAOImplements implements Cargo2DAO{
    private static final String INSERT = "insert into cargo (cargo, descricao, horas) values (?, ?, ?);";
    private static final String UPDATE = "update cargo set cargo = ?, descricao = ?, horas = ? where id = ?;";
    private static final String REMOVE = "delete from cargo where id = ?;";
    private static final String LIST = "select * from cargo";
    private static final String LISTBYID = "select * from cargo where id = ?;";

    @Override
    public int salvar(Cargo2 c) {
        if (c.getCodigo() > 0) {
            return update(c);
        } else {
            return insert(c);
        }
    }

    @Override
    public boolean remover(int id) {
        Connection con = null;
        PreparedStatement pstm = null;
        boolean retorno = false;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(REMOVE);
            pstm.setInt(1, id);
            pstm.execute();
            retorno = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover: " + e.getMessage());

        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão: " + e.getMessage());
            }
        }
        return retorno;
    }

    @Override
    public List<Cargo2> listarTodos() {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Cargo2> cargos = new ArrayList<>();
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while(rs.next()){
                Cargo2 c = new Cargo2();
                c.setCodigo(rs.getInt("id"));
                c.setCargo2(rs.getString("cargo"));
                c.setHoras(rs.getInt("horas"));
                cargos.add(c);
            }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar: " + e.getMessage());

        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão: " + e.getMessage());
            }
        }
        return cargos;
    }
    

    @Override
    public Cargo2 buscarCodigo(int id) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Cargo2 c = new Cargo2();
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while(rs.next()){
                c.setCodigo(rs.getInt("id"));
                c.setCargo2(rs.getString("cargo"));
                c.setHoras(rs.getInt("horas"));
                c.setDescricao(rs.getString("descricao"));
            }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar: " + e.getMessage());

        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão: " + e.getMessage());
            }
        }
        return c;
    }

    private int update(Cargo2 c) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(UPDATE);
            pstm.setInt(1, c.getCodigo());
            pstm.setString(2, c.getCargo2());
            pstm.setString(3, c.getDescricao());
            pstm.setInt(4, c.getHoras());
            
            pstm.execute();
            retorno = c.getCodigo();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir: " + e.getMessage());

        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão: " + e.getMessage());
            }
        }
        return retorno;
    }

    private int insert(Cargo2 c) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, c.getCargo2());
            pstm.setString(2, c.getDescricao());
            pstm.setInt(3, c.getHoras());
            pstm.execute();
            //Retorna a chave gerada pelo MYSQL
            try(ResultSet rs = pstm.getGeneratedKeys()){
                if(rs.next()){
                    retorno = rs.getInt(1);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir: " + e.getMessage());

        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão: " + e.getMessage());
            }
        }
        return retorno;
    }
    
}
