/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author fabio
 */
@Entity
public class Emprestimo implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    @OneToMany
    private Usuario usuario;
    @ManyToOne
    private Livro livro;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataDoEmprestimo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataPrevistaDevolucao;
    
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
        return dataDoEmprestimo;
    }

    public void setDataEmprestimo(Calendar dataEmprestimo) {
        this.dataDoEmprestimo = dataEmprestimo;
    }

    public Calendar getDataDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataPrevistaDevolucao = dataDevolucao;
    }
    @Override
    public String toString() {
        return "Emprestimo{" + "livro=" + livro + ", id=" + id + ", usuario=" + usuario + ", dataEmprestimo=" + dataDoEmprestimo + ", dataDevolução=" + dataPrevistaDevolucao + '}';
    }
}
