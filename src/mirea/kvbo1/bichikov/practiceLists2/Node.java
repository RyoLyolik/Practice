package mirea.kvbo1.bichikov.practiceLists2;

public class Node {
    private Comparable data;
    private Node next;
    private Node previous;

    public Node(Comparable dataValue) {
        next = null;
        data = dataValue;
    }

    public Node(Comparable dataValue, Node nextValue, Node previousValue) {
        previous = previousValue;
        next = nextValue;
        data = dataValue;
    }

    public Comparable getData() {
        return data;
    }

    public void setData(Comparable dataValue) {
        data = dataValue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextValue) {
        next = nextValue;
    }

    public Node getPrevious(){
        return previous;
    }
    public void setPrevious(Node previousValue)
    {
        previous = previousValue;
    }

    @Override
    public String toString() {
        String output = "";
        output = "node data=" + data;
        return output;
    }
}
