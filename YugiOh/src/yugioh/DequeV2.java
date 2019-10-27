
package yugioh;

/*
 * @author jayme
 */
public class DequeV2 {
    private DequeNode front, rear;
    
    private class DequeNode{
        private Object element;        
        private DequeNode next, previous;
        
        private DequeNode(Object elem, DequeNode n,DequeNode p){
            element = elem;
            next = n;
            previous = p;
        }
    }
    
    public DequeV2(){
        front = rear = null;
    }
    
    public boolean isEmpty(){
        return (front==null);
    }
    
    public boolean makeEmpty(){
        if(isEmpty()) return false;
        front = rear = null;
        return true;
    }
    
    public void pushFront(Object elem){
        DequeNode element = new DequeNode(elem, null, null);
        if(isEmpty()){
            front = rear = element;
        }else{
            element.next = front;
            front.previous = element;
            front = element;
        }
    }
    
    public void pushBack(Object elem){
        DequeNode element = new DequeNode(elem, null, null);
        if(isEmpty()){
            front = rear = element;
        }else{
            rear.next = element;
            element.previous = rear;
            rear = element;
            
        }
    }
    
    public boolean popFront(){
        if(isEmpty()) return false;
        if(front.next == null && front == rear){
            front = rear = null;
            return true;
        }
        
        front.next.previous = front.previous;
        front = front.next;
        return true;
    }
    
    public boolean popBack(){
        if(isEmpty()) return false;
        if(rear.previous == null&& front == rear){
            front = rear = null;
            return true;
        }
        
        rear.previous.next = rear.next;
        rear = rear.previous;
        return true;
    }
    public Object front(){        
        if(isEmpty()) return null;
        return front.element;
    }
    
    public Object back(){
        if(isEmpty()) return null;
        return rear.element;
    }
    
    public void printDeque(){
        if(isEmpty()){
            System.out.println("Deque Fazio :(");
            return;
        }
        DequeNode itr = front;
        
        while(itr != null){
            System.out.println(itr.element.toString());
            itr = itr.next;
        }
    }
}
