/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author adilson
 */
public class Municipio {
      private int  id;
      private String nome;
      private String uf;
    public Municipio(String nome) {
        this.nome = nome;
    }

    public Municipio() {
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

    

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Municipio{" + "id=" + id + ", nome=" + nome + ", uf=" + uf + '}';
    }
    
    
    
    
    
}
