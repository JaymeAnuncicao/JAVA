/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha_fila;

/**
 *
 * @author jayme
 */
public class Pilha_Apontadores {

    private StackNode Top;

    private class StackNode {

        private Object element;
        private StackNode next;

        public StackNode(Object e, StackNode n) {
            element = e;
            next = n;
        }
    }

    public Pilha_Apontadores() {
        Top = null;
    }

    public void push(Object e) {
        Top = new StackNode(e, Top);
    }

    public Object top() {
        return Top.element;
    }
    
    public boolean pop(){
        Top = Top.next;
        return true;
    }
    
    public Object TopAndPop(){
        Object value = Top.element;
        pop();
        return value;
    }
    
    public void PrintStack(){
        StackNode itr = Top;
        
        while(itr != null){
            System.out.println(itr.element.toString());
            
            itr = itr.next;
        }
    }
}
