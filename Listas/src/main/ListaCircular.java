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
public class ListaCircular {

    private ListNode head;
    private ListNode tail;
    private ListNode previous;
    private int size;

    private class ListNode {

        private Object element;
        private ListNode next;

        private ListNode(Object e, ListNode n) {
            element = e;
            next = n;
        }
    }

    public ListaCircular() {
        size = 0;
        head = tail = previous = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (head == null && size == 0);
    }

    public void add(Object e) {
        ListNode element = new ListNode(e, null);
        if (isEmpty()) {
            head = tail = element;
            tail.next = head;
        } else {
            tail.next = element;
        }
        tail = element;
        tail.next = head;
        size++;
    }

    public int indexOf(Object e) {
        ListNode itr = head;
        previous = null;
        for (int i = 0; i < size; i++) {
            if (itr.element.equals(e)) {
                return i;
            }
            previous = itr;
            itr = itr.next;

        }
        previous = null;
        return -1;
    }

    private void findPrevious(Object e) {
        ListNode itr = head;
        previous = null;
        for (int i = 0; i < size; i++) {
            if (itr.element.equals(e)) {
                return;
            }
            previous = itr;
            itr = itr.next;
        }
    }
    private void findPrevious(int index) {
        ListNode itr = head;
        previous = null;
        for (int i = 0; i < size; i++) {
            if(index == i){
                return;
            }
            previous = itr;
            itr = itr.next;
        }
    }

    public Object getElement(int index) {
        if (isEmpty() || index < 0 || index > size - 1) {
            return null;
        }
        ListNode itr = head;
        for (int i = 0; i < size; i++) {
            if (index == 0 && i == 0) {
                return head.element;
            } else {
                if (indexOf(itr.element) == index) {
                    return itr.element;
                }
            }
            itr = itr.next;
        }
        return null;
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
                tail.next = head;
            }
        } else {
            if (previous.next.next.equals(head)) {
                tail = previous;
            }
            previous.next = previous.next.next;

        }
        size--;
    }

    public void add(Object e, int index) {
        if( index < 0 || index > size -1){
            return;
        }
        findPrevious(index);
        if(previous == null){
            ListNode element = new ListNode(e, head);
            head = element;
            tail.next = head;
        }else{
            if(index == size-1){
                ListNode element = new ListNode(e, head);
                previous.next = element;
                tail = element;
            }else{
                ListNode element = new ListNode(e, previous.next);
                previous.next = element;
            }
        }
        size++;
    }
    public boolean remove(int index){
        if(isEmpty() || index < 0 || index > size -1) return false;
        
        findPrevious(index);
        if(previous == null){
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
                tail.next = head;
            }
        }else{
            if(index == size -1){
                tail = previous;

                
            }
            previous.next = previous.next.next;
                    
        }
        size--;
        return true;
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

        while (!itr.next.equals(head)) {
            System.out.println(itr.element.toString());
            itr = itr.next;
            if (itr.next.equals(head)) {
                System.out.println("tail: " + itr.element.toString());
                return;
            }
        }
    }
}
