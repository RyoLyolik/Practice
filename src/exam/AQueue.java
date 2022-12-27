package exam;

public interface AQueue {
    public int size();
    public boolean isEmpty();

    public Object front();
    public void enqueue(Object o);
    public Object dequeue();
}
