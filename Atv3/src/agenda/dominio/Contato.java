
package agenda.dominio;

import java.util.ArrayList;

/**
 *
 * @author jayme
 */
public class Contato {

    private String nome;
    private String numero;
    private String tipo;
       
    // CONSTRUTOR
    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }
     
    // GETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        if(tipo.equals("1")){
            this.tipo = "Residencial";
        }else if(tipo.equals("2")){
            this.tipo = "Comercial";
        }else if(tipo.equals("3")){
            this.tipo= "Celular";
        }else{
            this.tipo = "Não informado";
        }
    }
    public String getContato() {
        return numero;
    }
    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "\nContato pesquisado: \n" + "Nome: " + nome + " Numero: " + numero + " Tipo: " + tipo+"\n";
    }

   
    
}
