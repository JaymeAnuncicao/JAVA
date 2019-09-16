/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author jayme
 */
public class ListaDupla {

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

    public ListaDupla() {
        size = 0;
        head = tail = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0 && head == null);
    }
    
    public void clear(){
        size = 0;
        head = tail = null;
    }

    public void add(Object e) {
        ListNode element = new ListNode(e, null, null);
        if (head == null || isEmpty()) {
            head = tail = element;
        } else {
            tail.next = element;
            element.previous = tail;
        }
        tail = element;
        size++;
    }

    public int indexOf(Object e) {
        ListNode element = new ListNode(e, null, null);

        if (isEmpty()) {
            return -1;
        }
        ListNode itr = head;
        for (int i = 0; i < size; i++) {
            if (itr.element.equals(e)) {
                return i;
            }
            itr.previous = itr;
            itr = itr.next;
        }
        return -1;
    }

    public Object getElement(int index) {
        if (isEmpty() || index < 0 || index > size - 1) {
            return null;
        }
        ListNode itr = head;

        for (int i = 0; i < size; i++) {
            if (index == i) {
                return itr.element;
            }
            itr.previous = itr;
            itr = itr.next;
        }
        return null;
    }

    public void remove(Object e) {
        if (isEmpty()) {
            return;
        }
        ListNode itr = head;
        if (head == tail && size == 1) {
            head = tail = null;
        } else {

            for (int i = 0; i < size; i++) {
                if (head.element.equals(e)) {
                    head.next.previous = null;
                    head = head.next;
                    return;
                } else if (tail.element.equals(e)) {
                    tail = tail.previous;
                    tail.next = null;
                    return;
                }
                if (itr.element.equals(e)) {
                    itr.previous.next = itr.next;
                    itr.next.previous = itr.previous;
                }
                itr.previous = itr;
                itr = itr.next;
            }
        }
        size--;
    }

    public void add(Object e, int index) {
        if (index < 0 || index > size - 1) {
            return;
        }
        ListNode itr = head;

        for (int i = 0; i < size; i++) {
            if (index == i) {
                if (i == 0) {
                    ListNode element = new ListNode(e, head, head.previous);
                    head.previous = element;
                    head = element;
                    return;
                }
                if (i == size - 1) {
                    ListNode element = new ListNode(e, tail.next, tail);
                    tail.next = element;
                    tail = element;
                    return;
                }
                ListNode element = new ListNode(e, itr, itr.previous);
//                System.out.println("proximo: "+element.next.element+" anterior: "+element.previous.element);
                itr.previous.next = element;
                itr.previous = element;
                
            }
            itr = itr.next;
        }
        size++;
    }

    public boolean remove(int index) {
        if (index < 0 || index > size - 1) {
            return false;
        }
        ListNode itr = head;

        for (int i = 0; i < size; i++) {

            if (index == i) {
                if (i == 0) {
                    head.next.previous = head.previous;
                    head = head.next;
                    return true;
                }
                if (i == size - 1) {
                    System.out.println("sim");
                    tail.previous.next = tail.next;
                    tail = tail.previous;
                    return true;
                }
//                System.out.println(itr.next.element);
                
                itr.next.previous = itr.previous;
                itr.previous.next = itr.next;
//               System.out.println("proximo: "+itr.next.element+" anterior: "+itr.previous.element);
                
            }
            itr = itr.next;
        }
        size--;
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
