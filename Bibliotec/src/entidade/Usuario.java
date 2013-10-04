/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

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
 * @author fabio
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "retrieveByNome",
            query = "SELECT u FROM Usuario u WHERE u.nome Like :nome"),
    @NamedQuery(name = "retrieveByCpf",
            query = "SELECT u FROM Usuario u WHERE u.cpf Like :cpf"),
         @NamedQuery(name = "retrieveListaTodosOsUsuarios",
            query = "SELECT u FROM Usuario u")
})
public class Usuario {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 50)
    private String email;
    @Column(length = 200)
    private String nome;
    @Column(length = 11)
    private String cpf;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Endereco endereco;
    @Column(length = 12)
    private String telefone;
    @Column(length = 9)
    private String rg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", email=" + email + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone + ", rg=" + rg + '}';
    }
    
    
    
}
