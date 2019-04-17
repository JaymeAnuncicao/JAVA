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
public class Aluno extends Pessoa {
    private int falta;

    @Override
    public void anda() {
        System.out.println("Anda diferente...");
         //To change body of generated methods, choose Tools | Templates.
    }

    
    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    @Override
    public void frenquentarAula() {
        System.out.println("Eu vim pra aula"); //To change body of generated methods, choose Tools | Templates.
    }
    
            
}
