/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.dominio;
import agenda.dominio.Contato;

/**
 *
 * @author jayme
 */
public class ContatoTelefone {
    private String nome;
    private String numero;
    private String tipo;
    private String typeValue;
       
    // CONSTRUTOR
    public ContatoTelefone (String typeValue) {
      
        this.typeValue = typeValue;
    }



   public void ContatoTelefoneResidencia(){
       if(this.typeValue.equals("1")){
           this.tipo = "Resindecial";
       }
   }
   public void ContatoTelefoneComercial(){
       if(this.typeValue.equals("2")){
          this.tipo = "Comercial";
       }
   }
   public void ContatoTelefoneCelular(){
       if(this.typeValue.equals("3")){
           this.tipo = "Celular";
       }
   }

    public String getTipo() {
        return tipo;
    }
    
}
