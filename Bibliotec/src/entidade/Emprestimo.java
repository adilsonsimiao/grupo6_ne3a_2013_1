/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.Calendar;

/**
 *
 * @author fabio
 */
public class Emprestimo {
    private int id;

    private Usuario usuario;
    private Livro livro;
    private Calendar dataEmprestimo;
    private Calendar dataDevolucao;
    
    public Emprestimo(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Calendar getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Calendar dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    @Override
    public String toString() {
        return "Emprestimo{" + "livro=" + livro + ", id=" + id + ", usuario=" + usuario + ", dataEmprestimo=" + dataEmprestimo + ", dataDevolução=" + dataDevolucao + '}';
    }
}
