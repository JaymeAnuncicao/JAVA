/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Scanner;

/**
 *
 * @author jayme
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String graduacao;
        String nome;
        String curso;
        int matricula;
        int anoIngresso;
        int aprovDici;
        float mensalidade;
        Scanner ler = new Scanner(System.in);
        Unipraxis aluno1 = new Unipraxis();
        
//      GRADUANDO ou PÓS-GRADUANDO ?   
        System.out.println("Está graduando ou pós-graduando?(G/PG)");
        graduacao = ler.next();
        aluno1.setGraduacao(graduacao);
        
//      NOME DO ALUNO
        System.out.println("Qual o nome do aluno ?");
        nome = ler.next();
        aluno1.setNome(nome);
        
//      Curso do aluno
        System.out.println("Qual o curso do aluno ?");
        curso = ler.next();
        aluno1.setCurso(curso);
        
//      Matricula do aluno 
        System.out.println("Qual a matricula do aluno ?");
        matricula = ler.nextInt();
        aluno1.setMatricula(matricula);
        
//      Diciplinas aprovadas do aluno
        System.out.println("Quantas diciplinas aprovadas ?");
        aprovDici = ler.nextInt();
        aluno1.setDiciplinas(aprovDici);
        
//      Mensalidade do aluno
        System.out.println("Qual a mensalidade ?");
        mensalidade = ler.nextFloat();
        aluno1.setMensalidade(mensalidade);
        
//      Ano de Ingresso do aluno
        System.out.println("Ano de ingresso do aluno:");
        anoIngresso = ler.nextInt();
        aluno1.setAno(anoIngresso);
        
//        
        System.out.println("Os dados do aluno:");
//        aluno1.setAno(2018);g
//        aluno1.setDiciplinas(8);
//        aluno1.setGraduacao("PG");
//        aluno1.getPermanecido();
//        aluno1.getCreditos();
//        System.out.println(aluno1.getPermanecido()+" anos");
//        System.out.println(aluno1.getCreditos()+" creditos");
//        System.out.println(aluno1.getGraduacao()+" gdr");
        aluno1.Status();
    }


    
}
