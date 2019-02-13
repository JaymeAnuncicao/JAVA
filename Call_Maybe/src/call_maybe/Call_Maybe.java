/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package call_maybe;
import java.util.Scanner;

/**
 *
 * @author 144181032
 */
public class Call_Maybe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int soma=0,n;
        float media;
        
        System.out.println("Digite o número de notas :");
        n = ler.nextInt();
        
        int[] nota = new int[n];
        
        for(int i=0;i<n;i++){
            System.out.println("Digite a nota "+(i+1)+" :");
            nota[i] = ler.nextInt();
        }
        
        for(int i=0;i<n;i++){
            soma = soma + nota[i];
        }
        media = (float)soma/n;
        System.out.println("A soma das notas é "+soma+" e a media é "+media+".");
        
    }
    
}
