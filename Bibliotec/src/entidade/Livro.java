/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author a1294016
 */
@Entity
@Table(name = "Livro")
public class Livro {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "nomeLivro")
    private String nomeLivro;
    @OneToOne
    private Autor Autor;
    @Column(name = "quantidade")
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

    public Autor getAutor() {
        return Autor;
    }

    public void setAutor(Autor Autor) {
        this.Autor = Autor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "livro{" + "id=" + id + ", nomeLivro=" + nomeLivro + ", autor" + Autor + ", quantidade" + quantidade + "}";
    }
}
