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
public class Programadores extends Funcionarios{
    private String typeProgram;

    public Programadores(String nome, String matricula, String funcao) {
        super(nome, matricula, funcao);
    }

    public String getTypeProgram() {
        return typeProgram;
    }

    public void setTypeProgram(String typeProgram) {
        this.typeProgram = typeProgram;
    }
}
