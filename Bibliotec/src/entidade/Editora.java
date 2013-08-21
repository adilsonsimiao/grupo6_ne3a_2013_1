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
import javax.persistence.OneToOne;

/**
 *
 * @author a1294016
 */

@Entity
public class Editora {
    @Id
    @GeneratedValue
    private int id;
    @Column (length = 200)
    private String nome;
    @Column (length = 100)
    private String email;
    
    @ManyToMany(mappedBy = "editoras", cascade = CascadeType.PERSIST)
    private Set<Livro> livros  = new HashSet<Livro>();
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private Endereco endereco ;
   
    public Editora(){
        
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

    public void setNome(String nome) {
        this.nome = nome;
    }

   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    @Override
    public String toString() {
        return "Editora{" + "nome=" + nome + ", id=" + id + ", endereco=" + endereco + ", Email=" + email +'}';
    }
}
