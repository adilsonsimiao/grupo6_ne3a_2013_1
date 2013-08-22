/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entidade.Endereco;
import entidade.Municipio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adilson
 */
public class DaoEndereco implements Dao<Endereco> {

    Endereco end;
    Municipio municipio = new Municipio();

    private static Endereco converteRsParaEndereco(ResultSet rs) throws SQLException {
        Endereco end = new Endereco();
        end.setId(rs.getInt("Id"));
        end.setLogradouro(rs.getString("Logradouro"));
        end.setComplemento(rs.getString("Complemento"));
        end.setBairro(rs.getString("Bairro"));
        end.setNumero(rs.getString("numero"));
        end.setCep(rs.getString("CEP"));
        //end.setIdMunicipio(rs.getInt("IdMunicipio"));
        return end;

    }

    @Override
    public void persist(Endereco o) throws Exception {
        if (o.getId() == 0) {
            insert(o);
        } else {
            update(o);
        }
    }

    @Override
    public void delete(Endereco o) throws Exception {
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("DELETE FROM Usuario WHERE id = " + o.getId());
    }

    @Override
    public Endereco retrieve(Class tipoObjeto,int id) throws Exception {
        Statement st = ConnectionFactory.prepareConnection().createStatement();
        st.execute("SELECT * FROM Endereco WHERE id = " + id);
        ResultSet rs = st.getResultSet();

        rs.next();
        Endereco end = converteRsParaEndereco(rs);

        return end;
    }

    public List<Endereco> list(String whereClause, String orderClause) throws SQLException {
        List<Endereco> enderecos = new ArrayList<Endereco>();

        Statement st = ConnectionFactory.prepareConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Endereco"
                + (whereClause == null || whereClause.trim().isEmpty() ? "" : " WHERE " + whereClause)
                + (orderClause == null || orderClause.trim().isEmpty() ? "" : " ORDER BY " + orderClause));

        while (rs.next()) {
            Endereco p = converteRsParaEndereco(rs);
            enderecos.add(p);
        }

        return enderecos;
    }

    public List<Endereco> list(Filter... filters) throws SQLException {

        List<Endereco> pessoas = new ArrayList<Endereco>();

        ResultSet rs = null;

        /* Verifica se algum friltro foi fornecido para o método */
        if (filters == null || filters.length == 0) {
            Statement st = ConnectionFactory.prepareConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM Endereco");
        } else {
            String sql = "SELECT * FROM Endereco WHERE ";

            for (Filter f : filters) {
                System.out.println(f);
                switch (f.getOperator()) {
                    case IS_NULL:
                        sql += f.getAttribute() + " IS NULL";
                        break;
                    case LIKE:
                        sql += f.getAttribute() + " LIKE '%" + f.getValue() + "%'";
                        break;
                    case EQUAL:
                        sql += f.getAttribute() + "='" + f.getValue() + "'";
                        break;
                    default:
                        throw new RuntimeException("Tipo de operador não suportado:" + f.getOperator());
                }
            }
            PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement(sql);
            System.out.println("SQL:" + sql);
            rs = pst.executeQuery();
        }

        /* Converte o ResultSet da query para uma lista de objetos */
        while (rs.next()) {
            Endereco p = converteRsParaEndereco(rs);
            pessoas.add(p);
        }

        return pessoas;
    }

    private void insert(Endereco end) throws SQLException {

        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("INSERT INTO Endereco ( logradouro, complemento,  bairro, numero, cep, idMunicipio) VALUES(?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

        pst.setString(1, end.getLogradouro());
        pst.setString(2, end.getComplemento());
        pst.setString(3, end.getBairro());
        pst.setString(4, end.getNumero());
        pst.setString(5, end.getCep());




        pst.execute();

        ResultSet rs = pst.getGeneratedKeys();
        while (rs.next()) {
            System.out.println(rs.getInt(1));
            end.setId(rs.getInt(1));

        }


    }

    private void update(Endereco end) throws SQLException {
        PreparedStatement pst = ConnectionFactory.prepareConnection().prepareStatement("UPDATE INTO Endereco (id, logradouro, complemento,  bairro, numero, cep, idmunicipio) VALUES(?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, end.getLogradouro());
        pst.setString(2, end.getComplemento());
        pst.setString(3, end.getNumero());
        pst.setString(4, end.getBairro());
        pst.setString(5, end.getCep());
        pst.setString(7, municipio.getNome());


        pst.executeUpdate();
    }

    @Override
    public List<Endereco> list(Class tipoObjeto, String nome, String whereClause) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Endereco> list(Class classe, Filter... filters) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
