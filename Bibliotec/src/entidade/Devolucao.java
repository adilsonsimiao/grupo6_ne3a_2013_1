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
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author fabio
 */

@Entity
@Table(name = "Livro")
public class Devolucao implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    @ManyToMany
    private Emprestimo emprestimo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataDevolução;
    
    public Devolucao(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public Calendar getDataDevolução() {
        return dataDevolução;
    }

    public void setDataDevolução(Calendar dataDevolução) {
        this.dataDevolução = dataDevolução;
    }
    
    @Override
    public String toString() {
        return "Devolução{" + ", id=" + id + ", emprestimo=" + emprestimo + ", dataDevolução=" + dataDevolução +  '}';
    }
}
