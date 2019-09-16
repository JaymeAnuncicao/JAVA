package main;

/**
 *
 * @author jayme
 */
public class ListaDuplaCircular {

    private ListNode head;
    private ListNode tail;
    private int size;

    private class ListNode {

        private Object element;
        private ListNode previous;
        private ListNode next;

        private ListNode(Object e, ListNode n, ListNode p) {
            element = e;
            previous = p;
            next = n;
        }
    }

    public ListaDuplaCircular() {
        size = 0;
        head = tail = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0 && head == null);
    }

    public void clear() {
        size = 0;
        head = tail = null;
    }

    public void add(Object e) {
        ListNode element = new ListNode(e, null, null);
        if (head == null) {
            if (head == tail) {
                head = tail = element;
                head.previous = tail;
                tail.next = head;
            }else{
                tail.next = element;
            }
        }
        tail = element;
        tail.next = head;
        size++;

    }
    
    public void printList() {
        if (this.isEmpty()) {
            return;
        }
        ListNode itr = head;
        if (size == 1) {
            System.out.println(itr.element.toString());
            return;
        }

        while (!itr.next.equals(head) || !head.previous.equals(itr)) {
            System.out.println(itr.element.toString());
            itr = itr.next;
            if (!itr.next.equals(head) || head.previous.equals(itr)) {
                System.out.println("tail: " + itr.element.toString());
                return;
            }
        }
    }
}
