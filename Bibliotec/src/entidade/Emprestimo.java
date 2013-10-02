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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author fabio
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "retrieveNomeLivroDeEmprestimo",
            query = "SELECT e FROM Emprestimo e JOIN E.livro l WHERE l.nomeLivro Like :nome")
})
public class Emprestimo {
    @Id
    @GeneratedValue
    private int id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataDoEmprestimo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataPrevistaParaDevolucao;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataDaDevolucao;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private Usuario usuario;
   
    @OneToOne(cascade = CascadeType.PERSIST)
    private Livro livro;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    public void setDataDoEmprestimo(Calendar dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

    public Calendar getDataPrevistaParaDevolucao() {
        return dataPrevistaParaDevolucao;
    }

    public void setDataPrevistaParaDevolucao(Calendar dataPrevistaParaDevolucao) {
        this.dataPrevistaParaDevolucao = dataPrevistaParaDevolucao;
    }

    public Calendar getDataDaDevolucao() {
        return dataDaDevolucao;
    }

    public void setDataDaDevolucao(Calendar dataDaDevolucao) {
        this.dataDaDevolucao = dataDaDevolucao;
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

    @Override
    public String toString() {
        return "Emprestimo{" + "id=" + id + ", dataDoEmprestimo=" + dataDoEmprestimo + ", dataPrevistaParaDevolucao=" + dataPrevistaParaDevolucao + ", dataDaDevolucao=" + dataDaDevolucao + ", usuario=" + usuario + ", livro=" + livro + '}';
    }

    
    
    
    
    
}
