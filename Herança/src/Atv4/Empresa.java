/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atv4;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Empresa {
    ArrayList<Funcionarios>funcionarios = new ArrayList<Funcionarios>();
    
   private void efetivarFuncionario(Funcionarios funcionario){
       funcionarios.add(funcionario);
   }
   public void mostraFuncionarios(){
       System.out.println(toString());
   }
   public void funcionariosEspecifico(String info){
       for(int i=0;i<funcionarios.size();i++){
           if(funcionarios.get(i).getFuncao().equals(info)){
               System.out.println(funcionarios.get(i).toString());
           }
       }
   }
   
   public void adicionarFuncionario(String nome, String matricula, String funcao){
       efetivarFuncionario(new Funcionarios(nome,matricula,funcao));
   }
   
    @Override
    public String toString() {
        String values = " ";
        for(Funcionarios funcionario : funcionarios ){
            values += "Nome: ";
        }
        return values;
    }
   
   
}
