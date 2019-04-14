/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.aplicacao;

import agenda.dominio.Contato;
import agenda.dominio.ContatoTelefone;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jayme
 */
public class AplAgenda {
    private ArrayList<Contato> contatos = new ArrayList<Contato>();
     private ArrayList<ContatoTelefone> types = new ArrayList<ContatoTelefone>();
      
   private void adicionarContato(Contato contato) {
        contatos.add(contato);
    } 
    public void imprimirContatos() {
        
        System.out.println(toString()) ;
    }
    public void executarMostrarContato(String info) {
        int value = -1;
        for(int i=0;i<contatos.size();i++){
            if(contatos.get(i).getNome().equals(info) || contatos.get(i).getContato().equals(info)){
                System.out.println(contatos.get(i).toString());
                value = 1;
            }else{
//                System.out.println("Contato não encontrado");
                value += 0;
            }
            if(value == 0){
            System.out.println("Contato não encontrado\n");
        }
        }
        
        
    }
    public void executarAdicionarTelefone(String nome, String numero) {
//       Contato contato = new Contato(nome,numero,"");
        adicionarContato(new Contato(nome,numero));
    }
    public void defineType(String tipo){
         contatos.get(0).setTipo(tipo);
    }
    

   
    @Override
    public String toString() {
        String values= " ";
        System.out.println("Lista de contatos:");
        for( Contato contato : contatos){
            values += "Nome: "+contato.getNome() + " Numero: " +contato.getContato()+" Tipo: "+contato.getTipo();
            values += "\n";
          
        }
        return values;
    }

  

    
}
