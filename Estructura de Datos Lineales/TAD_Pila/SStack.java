public class SStack implements IStack {
    Snode peak = null;
    int size;

    public boolean isEmpty() {
        return peak == null;
    }

    public void push(Integer newElem) {
        SNode newNode = new SNode(newElem);
        newNode.next = peak;
        peak = newNode;
        size++;
    }

    public Integer top() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
            return null;
        }
        return peak.elem;
    }

    public Integer pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
            return null;
        }
        Integer elem = peak.elem;
        peak = peak.next;
        size--;
        return elem;
    }
}