/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author adilson
 */

@Entity
@Table(name = "Endereco")
public class Endereco {
    @Id
    @GeneratedValue
    private int id;
    @Column (name = "logradouro")
    private String logradouro;
    @Column (name = "complemento")
    private String complemento;
    @Column (name = "numero")
    private String numero;
    @Column (name = "bairro")
    private String bairro;
    @Column (name = "cep")
    private String cep;  
    @OneToOne
    Municipio municipio;

    public Endereco() {
    }
    
    public int getId() {
        return id;
        
    }

    public void setId(int id) {
        this.id = id;
        System.out.println(id);
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
   

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

   

   

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + ", complemento=" + complemento + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep + ", id=" + id + ", municipio=" + municipio + '}';
    }

    
    
    
}
