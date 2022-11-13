package mirea.kvbo1.bichikov.practiceLists2;

public class MyLinkedList {
    private Node head;
    private int listCount;

    public MyLinkedList() {
        head = new Node(null);
        head.setNext(head);
        head.setPrevious(head);
        listCount = 0;
    }

    public void insertEnd(Comparable data) {
        Node tmp = new Node(data);
        Node current = getHead();
        while (current.getNext() != getHead()) {
            current = current.getNext();
        }
        current.setNext(tmp);
        current.getNext().setPrevious(current);
        current.getNext().setNext(getHead());
        listCount++;
    }

    public void insertStart(Comparable data){
        Node tmp = new Node(data);
        if (getHead().getNext() != null) {
            tmp.setNext(getHead().getNext());
            tmp.setPrevious(getHead());
            getHead().getNext().setPrevious(tmp);
            getHead().setNext(tmp);
        }
        else{
            tmp.setPrevious(getHead());
            tmp.setNext(getHead());
            getHead().setNext(tmp);
        }
        listCount++;
    }

    public void add(Comparable data, int index) {
        Node tmp = new Node(data);
        Node current = getHead();
        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        tmp.setNext(current.getNext());
        current.setNext(tmp);
        listCount++;
    }

    public Comparable get(int index) {
        if (index <= 0) return null;
        Node current = getHead().getNext();
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null) return null;
            current = current.getNext();
        }
        return current.getData();
    }

    public boolean remove(int index) {
        if (index < 1 && index > size()) return false;
        Node current = head;
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null) return false;
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        listCount--;
        return true;
    }

    public int size() {
        return listCount;
    }

    public Node getHead(){
        return head;
    }

    @Override
    public String toString() {
        Node current = head.getNext();
        String output = "";
        while (current.getData() != null) {
            output += "[" + current.getData().toString() + "]";
            current = current.getNext();
        }
        return output;
    }
}
