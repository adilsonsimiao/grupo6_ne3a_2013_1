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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author fabio
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "retrieveNomeAutores",
            query = "SELECT a.nome FROM Autor a"),
    @NamedQuery(name = "retrieveByNomeAutor",
            query = "SELECT a FROM Autor a WHERE a.nome Like :nome"),
    @NamedQuery(name = "retrieveAutorByNomeLivro",
            query = "SELECT a FROM Autor a JOIN A.livros l WHERE l.nomeLivro Like :nome"),
   
})
public class Autor {
    @Id
    @GeneratedValue
    private int id;
    @Column(length = 200)
    private String nome;
    
    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)    
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
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nome=" + nome + ", livros=" + livros + '}';
    }

  

   
    
}
