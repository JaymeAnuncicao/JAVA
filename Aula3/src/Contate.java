/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Contate {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numeroConta = "123456";
        c1.saldo = -1500;
        c1.titularConta = "Alvin";
        
        
        System.out.println("O cliente 1: "+c1.saldo);
        c1.depositar(10);
        System.out.println("O cliente 1: "+c1.saldo);
        c1.saca(1000);
        System.out.println("O cliente 1: "+c1.saldo);
        c1.depositar(10000);
        System.out.println("O cliente 1: "+c1.saldo);
        
        
        System.out.println("O cliente 1: "+c1.titularConta);
        System.out.println("Saldo do cliente 1: "+c1.saldo);
        System.out.println("Numero da conta 1: "+c1.numeroConta);
        
        Conta c2 = new Conta();
    }
}
