/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author a1294016
 */
public class Livro {
    private int id;
    private String nomeLivro;
    private String Autor;
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

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
     public String toString(){
        return "livro{"+"id="+id+", nomeLivro="+nomeLivro+", autor"+Autor+ ", quantidade"+quantidade +"}";
    }
    
}
