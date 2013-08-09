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
@Table(name = "Endereco")
public class Editora {
    @Id
    @GeneratedValue
    private int id;
    @Column (name = "nome")
    private String nome;
    @Column (name = "email")
    private String email;
    
    @OneToOne
    private Endereco endereco;
   
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
