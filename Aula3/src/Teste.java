
package teste;

import java.util.Random;


public class Teste {

   
    public static void main(String[] args) {
       Unipraxis aluno1 = new Unipraxis();
//      Graduando ou pós-graduando ?
            aluno1.setGraduacao("pós-graduando");
//      Come do aluno
            aluno1.setNome("jayme");
//      Curso do aluno  
            aluno1.setCurso("Engenharia da Computação");
//      Matricula do aluno 
            aluno1.setMatricula(144181032);
//      Diciplinas aprovadas do aluno
            aluno1.setDiciplinas(8);
//      Mensalidade do aluno
            aluno1.setMensalidade(1920.35F);
//      Ano de Ingresso do aluno
            aluno1.setAno(2017);
        
//        System.out.println(aluno1.getPermanecido()+" anos");
        aluno1.Status();
        
    }
    
}
