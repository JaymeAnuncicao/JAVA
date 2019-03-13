/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Conta {
    String numeroConta;
    String titularConta;
    float saldo;
    
    //metodos
    
    // saca do saldo o valor que é passado como parametro
    public void saca(float valor){
        
        if(valor > saldo){
            System.out.println("Saldo insuficiente");
        }
        saldo = saldo - valor;
    }

    public void depositar(float valor){
        saldo += valor;
    }
}
