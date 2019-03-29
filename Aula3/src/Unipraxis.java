
package teste;
import java.util.Calendar;

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
    }
    
    public int getPermanecido(){    
        return this.anosPermanecidos;
    }
    public void setPermanecidos(){
        Calendar atual = Calendar.getInstance();
        this.anosPermanecidos = atual.get(Calendar.YEAR) - this.anoIngresso;
    }
    
    public int getDiciplinas(){
        return aprovDici;
    }
    public void setDiciplinas(int aprovDici){
        this.aprovDici = aprovDici;
        if(this.graduacao == "graduando"){
            this.creditos = aprovDici*4;
        }else if(this.graduacao == "pós-graduando"){
            this.creditos = aprovDici*2;
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
