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
public abstract class Pessoa {
    private String nome;
    private String matricula;
    private java.util.Date dataEntrada;

    public abstract void frenquentarAula();
    
    public void anda(){
        System.out.println("Pessoa anda, otario!!");
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

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
}
