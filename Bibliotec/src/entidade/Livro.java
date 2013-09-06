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
import javax.persistence.OneToOne;

/**
 *
 * @author a1294016
 */
@Entity
public class Livro {

    @Id
    @GeneratedValue
    
    private int id;
    
    @Column(length = 200)
    private String nomeLivro;
    
    @ManyToMany(cascade = CascadeType.PERSIST)
    private Set<Editora> editoras = new HashSet<Editora>();
    
    private int quantidade;
    
    @ManyToMany(mappedBy = "livros",cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<Autor> autores = new HashSet<Autor>();
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private Genero genero;
    @Column(length = 13)
    private String Isbn;
    
    public Set<Autor> getAutores() {
        return autores;
    }
    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

  

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Set<Editora> getEditoras() {
        return editoras;
    }

    public void setEditoras(Set<Editora> editoras) {
        this.editoras = editoras;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String Isbn) {
        this.Isbn = Isbn;
    }

    @Override
    public String toString() {
        return "Livro{" + "id=" + id + ", nomeLivro=" + nomeLivro + ", editoras=" + editoras + ", quantidade=" + quantidade + ", autores=" + autores + ", genero=" + genero + ", Isbn=" + Isbn + '}';
    }

    
   
    
}
