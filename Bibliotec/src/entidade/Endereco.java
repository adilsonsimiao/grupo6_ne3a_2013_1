/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author adilson
 */
public class Endereco {
    private String logradouro;
    private String complemento;
    private String numero;
    private String bairro;
    private String cidade; 
    private String uf;
    private String cep;  
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
     @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + ", complemento=" + complemento + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep + '}';
    }
    
}
