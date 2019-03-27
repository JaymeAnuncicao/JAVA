/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Calendar;

/**
 *
 * @author aluno
 */
public class Unipraxis {
    private int matricula;
    private String nome;
    private int anoIngresso;
    private String curso;
    private float valorMensa;
    private int aprovDici;
    private int creditos;
    private int anosPermanecidos;
    
    
    public String getNome(){
        return nome;   
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public int getAno(){
        return anoIngresso;
    }
    public void setAno(int anoIngresso){
        this.anoIngresso = anoIngresso;
    }
    public int getPermanecido(){
        Calendar atual = Calendar.getInstance();    
        return this.anosPermanecidos =  atual.get(Calendar.YEAR) - this.anoIngresso;
    }
    public int getDiciplinas(){
        return aprovDici;
    }
    public void setDiciplinas(int aprovDici){
        this.aprovDici = aprovDici;
        this.creditos = aprovDici*4;
    }
    
    public float getMensalidade(){
        return valorMensa;
    }
    public void setMensalidade(float mensalidade){
        this.valorMensa = mensalidade;
    }
}
 
