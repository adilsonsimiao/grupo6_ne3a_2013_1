/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author fabio
 */
@Entity
public class Emprestimo {
    @Id
    @GeneratedValue
    private int id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataDoEmprestimo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataPrevistaParaDevolucao;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private Usuario usuario;
   
    @OneToOne(cascade = CascadeType.PERSIST)
    private Livro livro;
    
    
    

    public Calendar getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    public void setDataDoEmprestimo(Calendar dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

    public Calendar getDataPrevistaDevolucao() {
        return dataPrevistaParaDevolucao;
    }

    public void setDataPrevistaDevolucao(Calendar dataPrevistaDevolucao) {
        this.dataPrevistaParaDevolucao = dataPrevistaDevolucao;
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
        return dataDoEmprestimo;
    }

    public void setDataEmprestimo(Calendar dataEmprestimo) {
        this.dataDoEmprestimo = dataEmprestimo;
    }

    public Calendar getDataDevolucao() {
        return dataPrevistaParaDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataPrevistaParaDevolucao = dataDevolucao;
    }
    @Override
    public String toString() {
        return "Emprestimo{" + "livro=" + livro + ", id=" + id + ", usuario=" + usuario + ", dataEmprestimo=" + dataDoEmprestimo + ", dataDevolução=" + dataPrevistaParaDevolucao + '}';
    }
}
