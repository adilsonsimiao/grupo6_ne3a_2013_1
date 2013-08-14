/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import Dao.Dao;
import Dao.Filter;
import entidade.Autor;
import entidade.Editora;
import entidade.Emprestimo;
import entidade.Endereco;
import entidade.Livro;
import entidade.Municipio;
import entidade.Usuario;
import java.util.List;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author fabio
 */
public class HibernateDao implements Dao<Object> {

    @Override
    public void persist(Object o) throws Exception {

        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.setProperty("hibernate.dialect", org.hibernate.dialect.MySQL5InnoDBDialect.class.getName());
        cfg.setProperty("hibernate.show_sql", "true");
        cfg.setProperty("hibernate.format_sql", "true");
        cfg.setProperty("hibernate.connection.driver", "com.mysql.jdbc.Driver");
        cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/aluno");
        cfg.setProperty("hibernate.connection.user", "aluno");
        cfg.setProperty("hibernate.connection.password", "aluno");
        cfg.setProperty("hibernate.connection.autocommit", "true");

        cfg.addAnnotatedClass(Livro.class);
        cfg.addAnnotatedClass(Autor.class);
        cfg.addAnnotatedClass(Usuario.class);
        cfg.addAnnotatedClass(Editora.class);
        cfg.addAnnotatedClass(Endereco.class);
        cfg.addAnnotatedClass(Municipio.class);
        cfg.addAnnotatedClass(Emprestimo.class);

        SchemaExport se = new SchemaExport(cfg);

        se.setOutputFile("Bibliotec.sql");
        se.execute(true, false, false, true);


    }

    @Override
    public void delete(Object o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object retrieve(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> list(String whereClause, String orderClause) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> list(Filter... filters) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
