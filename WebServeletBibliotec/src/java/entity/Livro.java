/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;



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
import javax.persistence.OneToOne;

/**
 *
 * @author a1294016
 */
@Entity
@NamedQueries({    
    @NamedQuery(name = "retrieveByNomeAutores",
            query = "SELECT l FROM Livro l INNER JOIN L.autores a WHERE a.nome Like :nome"),
    @NamedQuery(name = "retrieveByNomeLivros",
            query = "SELECT l FROM Livro l WHERE l.nomeLivro Like :nome"),
   
})
public class Livro {
    @Id
    @GeneratedValue    
    private int id;    
    @Column(length = 200)
    private String nomeLivro;    
    private int quantidade;
    @Column(length = 13)
    private String Isbn;    
    private int quantidadeDisponivel;

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

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String Isbn) {
        this.Isbn = Isbn;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
    
    }
