package module_9;


import java.util.NoSuchElementException;

public class MyQueue<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public void add(E element){
        Node<E> node = new Node<>(element);
        if(head == null){
            head = node;
        }
        if(tail != null){
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public void poll(){
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }
    public void remove(){
        head = head.next;
        if(size == 0){
            throw new NoSuchElementException();
        }
    }

    public E peek(){
        return head.value;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = tail = null;
        size = 0;
    }

    private static class Node <E>{
        private final E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
        }
    }
}
