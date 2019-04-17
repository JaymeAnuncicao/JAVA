/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Professor extends Pessoa{
    
    private String titulacao;

    @Override
    public void anda() {
        System.out.println("Anda duas vezes...");
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void frenquentarAula() {
        System.out.println("Eu dei Aula hoje!!!"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
