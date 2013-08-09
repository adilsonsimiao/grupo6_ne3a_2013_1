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
public class Devolucao {
    private int id;
    private int idEmprestimo;
    private Emprestimo emprestimo;
    private Calendar dataDevolução;
    
    public Devolucao(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
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
        return "Devolução{" + ", id=" + id +  ", idEmprestimo=" + idEmprestimo + ", emprestimo=" + emprestimo + ", dataDevolução=" + dataDevolução +  '}';
    }
}
