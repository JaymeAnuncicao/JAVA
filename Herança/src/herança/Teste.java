
package herança;

public class Teste {


    public static void main(String[] args) {
        Pessoa p1 = new Aluno();
        Aluno a1 = new Aluno();
        Professor pf1 = new Professor();
        
        p1.anda();
        p1.frenquentarAula();
        
        a1.anda();
        a1.frenquentarAula();
        
        pf1.anda();
        pf1.frenquentarAula();
    }
    
}
