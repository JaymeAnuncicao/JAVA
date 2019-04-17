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
public class Funcionarios {
    private String nome;
    private String matricula;
    private String funcao;

    public Funcionarios(String nome, String matricula,String funcao) {
        this.nome = nome;
        this.matricula = matricula;
        this.funcao = funcao;
        
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}
