/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author a1294016
 */
@Entity
public class Livro {
    @ManyToMany
    private List<Editora> editoras;

    @Id
    @GeneratedValue
    private int id;
    
    @Column(length = 200)
    private String nomeLivro;
    
    @Column(length = 13)
    private String Isbn;
    
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Genero genero;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private Set<Autor> autores = new HashSet<Autor>();
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private  Editora editora;

    public Set<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }
    private int quantidade;

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

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String Isbn) {
        this.Isbn = Isbn;
    }

  

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    

    @Override
    public String toString() {
        return "livro{" + "id=" + id + ", nomeLivro=" + nomeLivro + ", autor=" + autores + ", quantidade=" + quantidade +", isbn="+ Isbn + ", Editora="+ editora + ",genero="+ genero+ "}";
    }
}
