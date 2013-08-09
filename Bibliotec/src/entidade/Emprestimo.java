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
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author fabio
 */
@Entity
@Table(name = "Livro")
public class Emprestimo implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    @OneToMany
    private Usuario usuario;
    @ManyToOne
    private Livro livro;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataEmprestimo;
    @Temporal(javax.persistence.TemporalType.DATE)
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
