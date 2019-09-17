package main;

/**
 *
 * @author jayme
 */
public class main {

    public static void main(String[] args) {

//        ListaCircular myList = new ListaCircular();
//        
////        CRIANDO OS ELEMENTOS BASES DA LISTA
//        System.out.println("-----Lista Completa------");
//        myList.add(new Aluno("jayme", "1111"));
//        myList.add(new Aluno("carlos", "22222"));
//        myList.add(new Aluno("julio", "00000"));
//        myList.add(new Aluno("antonio", "33333"));
//        myList.add(new Aluno("fernando", "5555"));
//        
//        System.out.println("Size: "+myList.size());
//        System.out.println("Index: "+ myList.indexOf(new Aluno("carlos", "22222")));        
//        myList.printList();
//        
////        BUSCANDO ITEM NA LISTA
//        System.out.println("----Item Buscado----");
//        System.out.println(myList.getElement(2));
//        
////        REMONVENDO PELO ELEMENTO
////        System.out.println("------Lista Deletada-----");
////        myList.remove(new Aluno("jayme", "1111"));
////        System.out.println("Size: "+myList.size());
////        myList.printList();
//
////        ADICONADO EM ALGUM LUGAR DA LISTA
//        System.out.println("---Adicionando em algum lugar na lista---");
//        myList.add(new Aluno("raquel", "88888"), 2);
//        System.out.println("Size: "+myList.size());
//        myList.printList();
//        
////        REMOVENDO EM ALGUM LUGAR DA LISTA
//        System.out.println("----Removendo em algum lugar na lista----");
//        myList.remove(1);
//        System.out.println("Size: "+myList.size());
//        myList.printList();
//        
//        System.out.println("---Adicionando em algum lugar na lista---");
//        myList.add(new Aluno("lucas", "9999"), 2);
//        System.out.println("Size: "+myList.size());
//        myList.printList();
//        LISTA DUPLAMENTE ENCADEADA
//        ListaDupla myList = new ListaDupla();
//                CRIANDO OS ELEMENTOS BASES DA LISTA
//        System.out.println("-----Lista Completa------");;
//        myList.add(new Aluno("jayme", "1111"));
//        myList.add(new Aluno("carlos", "22222"));
//        myList.add(new Aluno("julio", "00000"));
//        myList.add(new Aluno("antonio", "33333"));
//        myList.add(new Aluno("jose", "7777"));
//        myList.add(new Aluno("fernando", "5555"));
//        
//        System.out.println("Size: "+myList.size());
//        System.out.println("Index: "+ myList.indexOf(new Aluno("carlos", "22222")));
//        System.out.println("Elemento buscado: "+myList.getElement(2));
//        myList.add(new Aluno("raquel", "99999"), 5);
//        myList.remove(2);
//        myList.printList();
//        LITA DUPLAMENTE ENCADEADA CIRCULAR
//        ListaDuplaCircular myList = new ListaDuplaCircular();
//        
//        myList.add(new Aluno("jayme", "1111"));
//        myList.add(new Aluno("carlos", "22222"));
//        myList.add(new Aluno("julio", "00000"));
//        myList.printList();
        ListaGen<Aluno> myList = new ListaGen();

        myList.add(new Aluno("jayme", "1111"));
        myList.add(new Aluno("carlos", "22222"));
        myList.add(new Aluno("julio", "00000"));
        myList.add(new Aluno("antonio", "33333"));
        myList.add(new Aluno("jose", "7777"));
        myList.add(new Aluno("fernando", "5555"));
//        System.out.println("index: "+ myList.indexOf(new Aluno("jayme", "1111")));
        System.out.println("elemento buscado: " + myList.getElement(1));
//        myList.add(new Aluno("raquel", "99999"), 3);
//        myList.remove(4);
//        myList.remove(new Aluno("fernando", "5555"));
        myList.set(new Aluno("raquel", "99999"), 1);
        myList.printList();
    }

}
