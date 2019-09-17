package main;

/**
 *
 * @author 144181032
 */
//Lista generica duplamente encadeada -> header
public class ListaGen<Type> {

    private ListNode header;
    private ListNode tail;
    private ListNode previous;
    private int size;

    private class ListNode {

        private Type element;
        private ListNode next;

        private ListNode(Type e, ListNode n) {
            element = e;
            next = n;
        }
    }

    public ListaGen() {
        previous = tail = null;
        header = new ListNode(null, null);
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0 && tail == null);
    }

    public void add(Type e) {
        ListNode element = new ListNode(e, null);
        if (tail == null) {

            header.next = element;

        } else {
            tail.next = element;
        }
        tail = element;
        size++;
    }

    public void clear() {
        header.next = null;
        tail = null;
        size = 0;
    }

    public int indexOf(Type e) {
        if (isEmpty()) {
            return -1;
        }

        ListNode itr = header.next;

        for (int i = 0; i < size; i++) {
            if (itr.element.equals(e)) {
                return i;
            }
            itr = itr.next;
        }

        return -1;
    }

    public void findPrevious(Type e) {
        ListNode itr = header.next;
        previous = null;

        for (int i = 0; i < size; i++) {
            if (itr.element.equals(e)) {
                return;
            }
            previous = itr;
            itr = itr.next;
        }

    }

    public void findPrevious(int index) {
        ListNode itr = header.next;
        previous = null;

        for (int i = 0; i < size; i++) {
            if (index == i) {
                return;
            }
            previous = itr;
            itr = itr.next;
        }
    }

    public Type getElement(int index) {
        if (isEmpty() || index < 0 || index > size - 1) {
            return null;
        }
        findPrevious(index);
        if (index == 0) {
            return header.next.element;
        } else {
            return previous.next.element;
        }
    }

    public void add(Type e, int index) {
        if (index < 0 || index > size - 1) {
            return;
        }

        if (index == 0) {
            ListNode element = new ListNode(e, header.next);
            header.next = element;
        } else {
            if (index == size - 1) {
                ListNode element = new ListNode(e, null);
                tail = element;
            }
            findPrevious(index);
            ListNode element = new ListNode(e, previous.next);
            previous.next = element;
        }

    }

    public void remove(Type e) {
        if (isEmpty()) {
            return;
        }

        findPrevious(e);
        if (previous.next.equals(tail)) {
            tail = previous;
        }
        previous.next = previous.next.next;
        size--;
    }

    public boolean remove(int index) {
        if (isEmpty()) {
            return false;
        }

        findPrevious(index);
        if (index == 0) {
            header.next = header.next.next;
            return true;
        }
        if (index == size - 1) {
            tail = previous;
        }

        previous.next = previous.next.next;
        return true;
    }

    public void set(Type e, int index) {
        if (isEmpty()) {
            add(e);
            return;
        }
        if (index < 0 || index > size - 1) {
            return;
        }

        if (index == 0) {
            header.next.element = e;
        }
        if (index == size - 1) {
            tail.element = e;
        }
        findPrevious(index);
        previous.next.element = e;
    }

    public void printList() {
        if (isEmpty()) {
            return;
        }
        ListNode itr = header.next;
        while (itr != null) {
            System.out.println(itr.element.toString());
            itr = itr.next;
        }
    }
}
