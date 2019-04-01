
package teste;

import java.util.Calendar;
import java.util.Scanner;

public class Unipraxis {
    private int matricula;
    private String graduacao;
    private String nome;
    private int anoIngresso;
    private String curso;
    private float valorMensa;
    private int aprovDici;
    private int creditos;
    private int anosPermanecidos;


    
   public String getGraduacao(){
        return graduacao;
    }
    public void setGraduacao(String graduacao){ 
        this.graduacao = graduacao;
//        if(this.aprovDici == 8){
//            this.creditos = 4;
//        }else if(this.aprovDici == 4){
//            this.creditos = 2;
//        }
        
    }
    
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
        Calendar atual = Calendar.getInstance();
        this.anosPermanecidos = atual.get(Calendar.YEAR) - anoIngresso;
    }
    
    public int getPermanecido(){    
        return this.anosPermanecidos;
    }
    
    public int getDiciplinas(){
        return aprovDici;
    }
    public void setDiciplinas(int aprovDici){
        this.aprovDici = aprovDici;
//        if(this.graduacao == "G"){
//            this.creditos = this.aprovDici*4;
//        }else if(this.graduacao == "PG"){
//            this.creditos = this.aprovDici*2;
//        }
//        
    }

    public int getCreditos(){
        return creditos;
    }    
    public void setCreditos(){
        if("G".equals(this.graduacao)){
            this.creditos = this.aprovDici*4;
        }else if("PG".equals(this.graduacao)){
            this.creditos = this.aprovDici*2;
        }
    }
    public float getMensalidade(){
        return valorMensa;
    }
    public void setMensalidade(float mensalidade){
        this.valorMensa = mensalidade;
    }

    public void Status(){
        System.out.println("Aluno: "+this.nome);
        System.out.println("Curso: "+this.curso);
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Tempo de faculdade: "+this.anosPermanecidos);
        System.out.println("Mensalidade: "+this.valorMensa+" reais");
        System.out.println("Creditos: "+this.creditos);
    }



}
