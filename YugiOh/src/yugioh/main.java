/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yugioh;

/**
 *
 * @author jayme
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Deque myDeque = new Deque();
        DequeV2 myDeque = new DequeV2();

//        ADIÇÕES INICIAS
        myDeque.pushFront(new Aluno("tourinho", "144181032"));
        myDeque.pushFront(new Aluno("mascarenhas", "144180083"));
        myDeque.pushFront(new Aluno("ivan", "144181024"));
        myDeque.pushFront(new Aluno("renan", "025484422"));
        myDeque.pushBack(new Aluno("jayme", "144181032"));
        myDeque.pushBack(new Aluno("paulo", "144181032"));
        myDeque.pushBack(new Aluno("marcelo", "144181032"));
        myDeque.pushFront(new Aluno("vivas", "144181032"));
        myDeque.pushBack(new Aluno("carlos", "144181032"));
        myDeque.pushBack(new Aluno("eduardo", "144181032"));
        myDeque.pushBack(new Aluno("bianca", "144181032"));

//        REMOÇÕES INICIAS
        System.out.println("Removeu o primeiro? " + myDeque.popFront());
        System.out.println("Removeu o primeiro? " + myDeque.popFront());
        System.out.println("Removeu o primeiro? " + myDeque.popFront());
        System.out.println("Removeu o primeiro? " + myDeque.popFront());
        System.out.println("Removeu o ultimo? " + myDeque.popBack());
        System.out.println("Removeu o ultimo? " + myDeque.popBack());
        System.out.println("Removeu o primeiro? " + myDeque.popFront());
        System.out.println("Removeu o ultimo? " + myDeque.popBack());
        System.out.println("Removeu o primeiro? " + myDeque.popFront());
        System.out.println("Removeu o ultimo? " + myDeque.popBack());

//        DEIXANDO O DEQUE VAZIO
        System.out.println("Removeu o primeiro? " + myDeque.popFront());

//        TENTANDO REMOVER
        System.out.println("Removeu o ultimo? " + myDeque.popBack());
        System.out.println("Removeu o primeiro? " + myDeque.popFront());
        System.out.println("Removeu o ultimo? " + myDeque.popBack());
        System.out.println("Removeu o primeiro? " + myDeque.popFront());
        System.out.println("Removeu o ultimo? " + myDeque.popBack());

//        ADICIONANDO MAIS ITENS
        myDeque.pushBack(new Aluno("Tobirama", "144181032"));
        myDeque.pushFront(new Aluno("Madara", "144181032"));
        myDeque.pushBack(new Aluno("Hashirama", "144181032"));

//        REMOVENDO ITENS
        System.out.println("Removeu o primeiro? " + myDeque.popFront());

        //        ADICIONANDO MAIS ITENS
        myDeque.pushBack(new Aluno("Tobirama", "144181032"));
        myDeque.pushFront(new Aluno("Seiya", "144181032"));
        myDeque.pushBack(new Aluno("Hyoga", "144181032"));
        myDeque.pushBack(new Aluno("Shun", "144181032"));
        myDeque.pushFront(new Aluno("Shiryu", "144181032"));
        myDeque.pushFront(new Aluno("Ikki", "144181032"));

//        USANDO MAKE EMPTY
        System.out.println("Esvaziou? " + myDeque.makeEmpty());
        
//        REMOVENDO ITENS
        myDeque.pushFront(new Aluno("Madara", "144181032"));
        System.out.println("Removeu o primeiro? " + myDeque.popFront());
        
        System.out.println("\nFront -> " + myDeque.front());
        System.out.println("Back -> " + myDeque.back() + "\n");

        System.out.println("----Deque----");
        myDeque.printDeque();
    }

}
