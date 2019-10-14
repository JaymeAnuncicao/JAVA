package pilha_fila;

/*
 * @author jayme
 */
public class Pilha_vetor {

    private Object[] elements;
    private int size;
    private int capacity;
    
    public Pilha_vetor(){
        size = 0;
        capacity = 10;
        elements = new Object[capacity];
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return (size ==0);
    }
    
    public void push(Object e){
        elements[size] = e;        
        size++;
    }
    
    public Object top(){
        return elements[size-1];
    }
    public boolean pop(){
        for(int i=0;i<size;i++){
            elements[i] = elements[i++];
        }
        size--;
        return true;
    }
    public Object TopAndPop(){
        Object value = top();
        pop();
        return value;
    }
    public void PrintStack(){
        for(int i=size-1;i>=0;i--){
            System.out.println(elements[i]);
        }
    }
}
