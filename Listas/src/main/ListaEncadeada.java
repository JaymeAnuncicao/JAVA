package main;

/**
 *
 * @author jayme
 */
public class ListaEncadeada {

    private ListNode head;
    private ListNode tail;
    private ListNode previous;
    private int size;

    // Creating a inner class
    private class ListNode {

        private Object element;
        private ListNode next;

        private ListNode(Object e, ListNode n) {
            element = e;
            next = n;
        }
    }

    public ListaEncadeada() {
        size = 0;
        head = tail = previous = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0 && head == null);
    }

    public void add(Object e) {
        ListNode element = new ListNode(e, null);
        if (size == 0 && head == null) {
            head = element;
        } else {
            tail.next = element;
        }
        tail = element;
        size++;
    }

    public int indexOf(Object e) {
        ListNode itr = head;
        previous = null;
        for (int i = 0; i < size; i++) {
            if (itr.element.equals(e)) {
                return i;
            } else {
                previous = itr;
                itr = itr.next;
            }
        }
        previous = null;
        return -1;
    }

    private void findPrevious(int index) {
        ListNode itr = head;
        previous = null;
        for (int i = 0; i < size; i++) {
            if (index == i) {
                return;
            }
            previous = itr;
            itr = itr.next;
        }
        return;
    }

    public Object getElement(int index) {
        if (index < 0 || index > size - 1) {
            return null;
        }
        if (index == 0) {
            return head.element;
        }
        findPrevious(index);
        return previous.next.element;
    }

    public void remove(Object e) {
        if (isEmpty() || indexOf(e) < 0) {
            return;
        }
        if (previous == null) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
        } else {
            if (previous.next.equals(tail)) {
                tail = previous;
            }
            previous.next = previous.next.next;
        }
        size--;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public void add(Object e, int index) {
        if (indexOf(e) < 0 || indexOf(e) > size - 1) {
            return;
        } else {
            if (index == 0) {
                if (head == tail) {
                    ListNode element = new ListNode(e, null);
                    head = tail = element;
                } else {
                    ListNode element = new ListNode(e, head);
                    head = element;
                }
            } else {
                findPrevious(index);
                ListNode element = new ListNode(e, previous.next);
                previous.next = element;
                if (element.next == null) {
                    tail = element;
                }
            }
        }
        size++;
    }

    public boolean remove(int index) {
        if (index < 0 || index > size - 1) {
            return false;
        } else {
            if (index == 0) {
                if (head == tail) {
                    head = tail = null;
                } else {
                    head = head.next;
                }
            } else {
                findPrevious(index);
                if (previous.next == tail) {
                    tail = previous;
                }
                previous.next = previous.next.next;
            }
            size--;
        }

        return true;
    }

    public void printList() {
        if (this.isEmpty()) {
            return;
        }
        ListNode itr = head;
        while (itr != null) {
            System.out.println(itr.element.toString());
            itr = itr.next;
        }
    }
}
