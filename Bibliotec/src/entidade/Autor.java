/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author fabio
 */
public class Autor {
    private int id;
    private String Nome;
    private String ISBN;
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
