public class Squeue implements IQueue {

    private SNode first;
    private SNode last;
    int size;

    public boolean isEmpty() {
        return first == null;
    }

    public Srtring front() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        return first.elem;
    }

    public void enqueue(String elem) {
        SNode node = new SNode(elem);
        if (isEmpty()) {
            first = node;
        } else {
            last.next = node;
        }
        last = node;
        size++;
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        size--;
        return firstElem;
    }
    
}