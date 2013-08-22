/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import entidade.Autor;
import entidade.Editora;
import entidade.Emprestimo;
import entidade.Endereco;
import entidade.Livro;
import entidade.Municipio;
import entidade.Usuario;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author fabio
 */
public class HibernateConnection {

    public static AnnotationConfiguration HibernateConnection() {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.setProperty("hibernate.dialect", org.hibernate.dialect.MySQL5InnoDBDialect.class.getName());
        cfg.setProperty("hibernate.hbm2ddl.auto", "update");
        cfg.setProperty("hibernate.show_sql", "true");
        cfg.setProperty("hibernate.format_sql", "true");
        cfg.setProperty("hibernate.connection.driver", "com.mysql.jdbc.Driver");
        cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/bibliotec");
        cfg.setProperty("hibernate.connection.user", "root");
        cfg.setProperty("hibernate.connection.password", "megans");
        cfg.setProperty("hibernate.connection.autocommit", "true");

        cfg.addAnnotatedClass(Municipio.class);
        cfg.addAnnotatedClass(Endereco.class);
        cfg.addAnnotatedClass(Usuario.class);
        cfg.addAnnotatedClass(Autor.class);
        cfg.addAnnotatedClass(Livro.class);
        cfg.addAnnotatedClass(Editora.class);
        cfg.addAnnotatedClass(Emprestimo.class);

        SchemaExport se = new SchemaExport(cfg);

        se.setOutputFile("Bibliotec.sql");
        se.execute(true, false, false, true);
        
        return cfg;

        
    }

  
    
}
