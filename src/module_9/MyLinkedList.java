package module_9;


import java.util.LinkedList;

public class MyLinkedList <E>{
    public int size = 0;
    private Node firstNode;
    private Node lastNode;

    public MyLinkedList(){
        firstNode = new Node<E>(null, null, lastNode);
        lastNode = new Node<E>(null, firstNode, null);
    }

    public void add(E element){
        Node<E> prev = lastNode;
        prev.setItem(element);
        lastNode = new Node<E>(null, prev, null);
        prev.setNext(lastNode);
        size++;
    }

    public int size(){
        return size;
    }

    public E get(int index){
        Node<E> result = firstNode.getNext();
        for (int i = 0; i < index; i++) {
            result = getNextElement(result);
        }
        return result.getItem();
    }
    private Node<E> getNextElement(Node<E> next){
        return next.getNext();
    }

    public void clear(){
        firstNode = lastNode = null;
        size = 0;
    }

    public E remove(int index){
        if(index >= 0 && index <= size){
            Node<E> node = firstNode.next;
            checkIndexAndSize(index);
            if (index == 0) {
                firstNode.next=node.next;
                node.next.prev=firstNode;
            } else if (index > 0) {
                for (int i = 0; i < index; i++) {
                    node = node.next;
                }
                if (size > 1) {
                    node.prev.next = node.next;
                    node.next.prev = node.prev;
                }
            }
            size--;
            return node.getItem();
        }
        throw new NegativeArraySizeException();
    }
    Node<E> checkIndexAndSize(int index) {
        if (index < (size >> 1)) {
            Node<E> x = firstNode;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = lastNode;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    private static class Node<E> {
        E item;
        MyLinkedList.Node<E> next;
        MyLinkedList.Node<E> prev;

        Node(E element, MyLinkedList.Node<E> prev, MyLinkedList.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }

        public E getItem() {
            return item;
        }

        public void setItem(E item) {
            this.item = item;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }
}
