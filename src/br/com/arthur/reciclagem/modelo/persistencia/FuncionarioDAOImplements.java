/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.arthur.reciclagem.modelo.persistencia;

import br.com.arthur.modelo.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionarioDAOImplements {

    private static final String INSERT = "insert into funcionario ( nome, data_nascimento, cpf, rg,endereco,bairro,cidade,telefone,celular,email,salario,ctps,data_admissao,setor, cargo, login, senha) values (?, ?, ?, ?, ?, ?, ?);";
    private static final String LIST = "select * from funcionario;";
    private static final String REMOVE = "delete from funcionario where id = ?;";
    private static final String UPDATE = "update funcionario set nome=?, data_nascimento = ?, cpf=?, rg=?,endereco=?,bairro=?,cidade=?,telefone=?,celular=?,email=?,salario=?,ctps=?,data_admissao=?,setor=?, cargo=?, login=?, senha=? where id=?;";
    private static final String LISTBYID = "select * from funcionario where id =?;";
    private static final String LISTBYNOME = "select * from funcionario where nome like ?;";

    @Override
    public int salve(Funcionario f) {
        if (f.getId() == 0) {
            return insert(f);
        } else {
            return update(f);
        }

    }

    private int insert(Funcionario f) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, f.getNome());
            pstm.setDate(2, new java.sql.Date(f.getDataNascimento().getTime()));
            pstm.setString(3, f.getCpf());
            pstm.setString(4, f.getRg());
            pstm.setString(5, f.getEndereco());
            pstm.setString(6, f.getBairro());
            pstm.setString(7, f.getCidade());
            pstm.setString(8, f.getTelefone());
            pstm.setString(9, f.getCelular());
            pstm.setString(10, f.getEmail());
            pstm.setDouble(11, f.getSalario());
            pstm.setDouble(12, f.getCtps());
            pstm.setDate(13, new java.sql.Date(f.getDataAdmissao().getTime()));
            pstm.setString(14, f.getSetor());
            pstm.setString(15, f.getCargo());
            pstm.setString(16, f.getLogin());
            pstm.setString(17, f.getSenha());
            pstm.execute();

            try (ResultSet rs =
                    pstm.getGeneratedKeys()) {
                if (rs.next()) {
                    retorno = rs.getInt(1);
                }
            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao inserir: " + e);
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (SQLException ex) {
            }
            return retorno;
        }
    }

    @Override
    public boolean remove(int id) {
        boolean status = false;
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(REMOVE);
            pstm.setInt(1, id);
            pstm.execute();
            status = true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro ao excluir um funcionario" + e.getMessage());

        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexao" + e.getMessage());
            }
        }
        return status;
    }

    @Override
    public List<Funcionario> listAll() {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Funcionario> funcionarios =
                new ArrayList<>();
        try {
            con = ConnectionFactory.
                    getConnection();
            pstm = con.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Funcionario f = new Funcionario();
                f.setNome(rs.getString("nome"));
                f.setDataNascimento(rs.getDate("DataNascimento"));
                f.setCpf(rs.getString("CPF"));
                f.setRg(rs.getString("rg"));
                f.setEndereco(rs.getString("endereco"));
                f.setBairro(rs.getString("bairro"));
                f.setCidade(rs.getString("cidade"));
                f.setBairro(rs.getString("telefone"));
                f.setCelular(rs.getString("celular"));
                f.setEmail(rs.getString("email"));
                f.setSalario(rs.getDouble("salario"));
                f.setCtps(rs.getDouble("ctps"));
                f.setDataAdmissao(rs.getDate("DataAdmissao"));
                f.setSetor(rs.getString("setor"));
                f.setCargo(rs.getString("cargo"));
                f.setLogin(rs.getString("login"));
                f.setSenha(rs.getString("senha"));
                funcionarios.add(f);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao listar os funcionarios"
                    + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Erro ao fechar a conexão"
                        + e.getMessage());
            }
        }
        return funcionarios;


    }

    @Override
    public Funcionario listById(int id) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Funcionario f = new Funcionario();
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                f.setNome(rs.getString("nome"));
                f.setDataNascimento(rs.getDate("DataNascimento"));
                f.setCpf(rs.getString("CPF"));
                f.setRg(rs.getString("rg"));
                f.setEndereco(rs.getString("endereco"));
                f.setBairro(rs.getString("bairro"));
                f.setCidade(rs.getString("cidade"));
                f.setBairro(rs.getString("telefone"));
                f.setCelular(rs.getString("celular"));
                f.setEmail(rs.getString("email"));
                f.setSalario(rs.getDouble("salario"));
                f.setCtps(rs.getDouble("ctps"));
                f.setDataAdmissao(rs.getDate("DataAdmissao"));
                f.setSetor(rs.getString("setor"));
                f.setCargo(rs.getString("cargo"));
                f.setLogin(rs.getString("login"));
                f.setSenha(rs.getString("senha"));

            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar o funcionario" + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "erro ao fechar conexao" + e.getMessage());
            }
        }


        return f;
    }

    private int update(Funcionario f) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(UPDATE);
            pstm.setString(1, f.getNome());
            pstm.setDate(2, new java.sql.Date(f.getDataNascimento().getTime()));
            pstm.setString(3, f.getCpf());
            pstm.setString(4, f.getRg());
            pstm.setString(5, f.getEndereco());
            pstm.setString(6, f.getBairro());
            pstm.setString(7, f.getCidade());
            pstm.setString(8, f.getTelefone());
            pstm.setString(9, f.getCelular());
            pstm.setString(10, f.getEmail());
            pstm.setDouble(11, f.getSalario());
            pstm.setDouble(12, f.getCtps());
            pstm.setDate(13, new java.sql.Date(f.getDataAdmissao().getTime()));
            pstm.setString(14, f.getSetor());
            pstm.setString(15, f.getCargo());
            pstm.setString(16, f.getLogin());
            pstm.setString(17, f.getSenha());
            pstm.execute();
            retorno = f.getId();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar" + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexao" + e.getMessage());
            }
        }
        return retorno;
    }

    @Override
    public List<Funcionario> listByNome(String nome) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Funcionario> funcionarios = new ArrayList<>();
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYNOME);
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Funcionario u = new Funcionario();
                u.setCodigo(rs.getInt("codigo"));
                u.setNome(rs.getString("nome"));
                u.setLogin(rs.getString("login"));
                u.setSenha(rs.getString("senha"));
                u.setCpf(rs.getString("CPF"));
                u.setTelefone(rs.getString("telefone"));
                u.setDataNascimento(rs.getDate("DataNascimento"));
                u.setSexo(rs.getString("Sexo"));
                funcionarios.add(u);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar funcionario" + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "erro ao fechar conexao" + e.getMessage());
            }
        }
        return funcionarios;
    }
}
}
