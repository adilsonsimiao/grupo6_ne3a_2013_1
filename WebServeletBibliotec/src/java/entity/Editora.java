/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 *
 * @author a1294016
 */

@Entity
@NamedQueries({
    @NamedQuery(name = "retrieveNomeEditoras",
            query = "SELECT e.nome FROM Editora e"),
    @NamedQuery(name = "retrieveIdEditoras",
            query = "SELECT e FROM Editora e WHERE e.nome Like :nome"),
    
})
public class Editora {
    @Id
    @GeneratedValue
    private int id;
    @Column (length = 200)
    private String nome;
    @Column (length = 100)
    private String email;
    
    
   
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

}
