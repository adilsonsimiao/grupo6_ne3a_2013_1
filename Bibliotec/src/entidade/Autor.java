/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author fabio
 */
@Entity
public class Autor {
    @Id
    @GeneratedValue
    private int id;
    @Column(length = 200)
    private String Nome;
    @Column(length = 20)
    private String ISBN;
    
    @ManyToMany(mappedBy = "autores", cascade = CascadeType.PERSIST)    
    private Set<Livro> livros = new HashSet<Livro>();

    public Set<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Set<Livro> livros) {
        this.livros = livros;
    }

    public Autor(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    @Override
    public String toString() {
        return "Autor{" + "nome=" + Nome + ", id=" + id + ", ISBN"+ ISBN +'}';
    }
}
