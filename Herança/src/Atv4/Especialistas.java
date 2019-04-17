/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atv4;

/**
 *
 * @author aluno
 */
public class Especialistas extends Funcionarios{
    private String redes;

    public Especialistas(String nome, String matricula, String funcao) {
        super(nome, matricula, funcao);
    }

    public String getRedes() {
        return redes;
    }

    public void setRedes(String redes) {
        this.redes = redes;
    }
}
