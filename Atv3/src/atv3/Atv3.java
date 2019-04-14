
package atv3;

import agenda.aplicacao.AplAgenda;
import agenda.dominio.Contato;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jayme
 */
public class Atv3 {

   
    public static void main(String[] args) {
        AplAgenda agenda = new AplAgenda();
        Scanner ler = new Scanner(System.in);
        
   
          System.out.println("Digite o nome e o numero:");
          agenda.executarAdicionarTelefone(ler.nextLine(),ler.nextLine());
          System.out.println("\nO numero é Residencial(1), Comercial(2), ou Celular(3)");
          agenda.defineType(ler.nextLine());
          
          
          
        agenda.executarMostrarContato("1212");
       
       
        agenda.imprimirContatos();
    }
    
}
