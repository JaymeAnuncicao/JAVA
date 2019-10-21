package yugioh;

/*
 * @author jayme
 */
public class Deque {

    private DequeNode frontier;
    private DequeNode rearward;
    private DequeNode previous;
    private int size;

    private class DequeNode {

        private Object element;
        private DequeNode next;

        public DequeNode(Object elem, DequeNode n) {
            element = elem;
            next = n;
        }
    }

    public Deque() {
        frontier = new DequeNode(null, null);
        rearward = new DequeNode(null, null);
        size = 0;
    }

    public boolean isEmpty() {
        return (size == 0 || frontier == null);
    }

    private void findPrevious(){
        DequeNode itr = frontier.next;
        
        while(itr !=null){
            if(itr.next == rearward.next){
                previous = itr;
            }
            itr = itr.next;
        }
    }
    public void pushFront(Object elem) {
        if (isEmpty()) {
            frontier.next = rearward.next = new DequeNode(elem, null);
        } else {
            frontier.next = new DequeNode(elem, frontier.next);
        }
        size++;
    }

    public void pushBack(Object elem) {
        if (isEmpty()) {
            frontier.next = rearward.next = new DequeNode(elem, null);
        } else {
            rearward.next.next = rearward.next = new DequeNode(elem, null);
        }
        size++;
    }

    public boolean popFront(){
        if(isEmpty())return false;
        
        frontier.next = frontier.next.next;
        return true;
    }
    
    public boolean popBack(){
        if(isEmpty())return false;
        
        findPrevious();
        previous.next = null;
        rearward.next = previous;
        return true;
    }
    
    public Object front() {
        if (isEmpty()) {
            return null;
        }
        return frontier.next.element;
    }

    public Object back() {
        if (isEmpty()) {
            return null;
        }
        return rearward.next.element;
    }

    public void printDeque() {
        DequeNode itr = frontier.next;

        while (itr != null) {
            System.out.println(itr.element.toString());
            itr = itr.next;
        }
    }
}
