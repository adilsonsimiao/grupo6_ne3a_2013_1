/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author a1294016
 */
public class Editora {
    private int id;
    private String nome;
    private String email;
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
