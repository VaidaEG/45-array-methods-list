/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sarasai;

/**
 *
 * @author 37067
 */
public class MyLinkedList {
    private Node head;
    
    public MyLinkedList() {
        head = null;
    }
    
    public void add(Object o) {
        if (head == null) {
            head = new Node();
            head.el = o;    
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;   
            }
            n.next = new Node();
            n.next.el = o;
            
        }
    }
    public Object get(int index) {
        return null;
    }
    public void set(int index, Object o) {
        
    }
    public void remove(int index) {
        
    }
    public void insert(int index, Object o) {
        
    }
    public int size() {
        int s = 0;
        Node n = head;
        while (n != null) {
            s++;
            n = n.next;   
        }
        return s;  
    }
    public String toString() {
        String ret = "[";
        ret += "]";
        return ret;
    }
    public void printAll() {
        Node n = head;
        while (n != null) {
            System.out.println(n.el);
            n = n.next;
        }
        System.out.println("------------------"); 
    }
    private class Node {
        Object el;
        Node next;
    }
}
