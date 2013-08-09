/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 *
 * @author a1294016
 */

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id", nullable = false)
    private int id;
   
   
   @Column(name ="NOME", nullable = false)  
    private String nome;
   
   @Column(name ="CPF", nullable = false)
    private String cpf;

    @OneToOne(cascade = CascadeType.ALL)   
    private Endereco endereco;
   
    @Column(name ="TELEFONE", nullable = false)
    private String telefone;
    
    @Column(name ="RG", nullable = false)
    private String rg;

    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone + ", rg=" + rg + '}';
    }

   
    
    
}
