/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author fabio
 */
@Entity
@Table(name = "Autor")  
public class Autor {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "Nome")
    private String Nome;
    @Column(name = "ISBN")
    private String ISBN;
    @OneToMany
    private Livro livro;
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
