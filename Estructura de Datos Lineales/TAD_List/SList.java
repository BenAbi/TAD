public class SList implements IList {
    public SNode first;
    public SNode last;
    int size; //by default is 0

    public boolean isEmpty() {
        return (first == null);
    }

    public void addFirst(String newElem) {
        SNode newNode = new SNode(newElem);
        newNode.next = firts;
        if (first==null) last = newNode;
        //we set the new first node
        first = newNode;
        size++;
    }

    public void removeFirst() {
        if (!isEmpty()) {
            first = first.next;
            if (first==null) last = null;
            size--;
        }
    }

    public void addLast(String newElem) {
        SNode node = new SNode(newElem);
        if (isEmpty()) addFirst(newElem);
        else {
            last.next = node;
            last = node;
            size++;
        }
    }

    public void removeLast() {
        if (!isEmpty()) {
            if (size == 1)
                removeFirst();
            else {
                SNode nodeIt = first;
                while (nodeIt.next!=last) {
                    nodeIt = nodeIt.next;
                }
                nodeIt.next = null;
                last = nextIt;
                size--;
            }
        }
    }

    getSize() {
        System.out.println("El tamaño de la lista es: " + size);
    }

    


}