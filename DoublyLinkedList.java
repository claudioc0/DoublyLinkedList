public class DoublyLinkedList<T> {

    private Node<T> base;
    private Node<T> top;
    private int size;

    public DoublyLinkedList() {
        base = new Node<>(null, null, null);
        top = new Node<>(null, base, null);
        base.setNext(top);
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public int getSize() {
        return size;
    }

    public void add(int pos, T value) {
        if (pos < 1 || pos > size + 1) {
            System.out.println("Posição inválida para inserção");
            return;
        }
        Node<T> previousAddNode = base;
        for (int i = 1; i < pos; i++) {
            previousAddNode = previousAddNode.getNext();
        }

        Node<T> node = new Node<>(value, previousAddNode, null);
        node.setNext(previousAddNode.getNext());
        node.getNext().setPrev(node);
        previousAddNode.setNext(node);
        size++;
    }

    public void add(T value) {
        add(size + 1, value);
    }

    public T remove(int pos) {
        if (pos < 1 || pos > size) {
            System.out.println("Posição inválida");
            return null;
        }

        Node<T> previousRemoveNode = base;
        for (int i = 1; i < pos; i++) {
            previousRemoveNode = previousRemoveNode.getNext();
        }

        Node<T> removedNode = previousRemoveNode.getNext();
        previousRemoveNode.setNext(removedNode.getNext());
        removedNode.getNext().setPrev(previousRemoveNode);

        removedNode.setPrev(null);
        removedNode.setNext(null);

        size--;
        return removedNode.getData();
    }

    public T remove(Node<T> node) {
        if (node == base || node == top || node == null) {
            System.out.println("Remoção inválida");
            return null;
        }

        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());

        node.setPrev(null);
        node.setNext(null);

        size--;
        return node.getData();
    }

    public Node<T> getNode(int pos) {
        if (pos < 1 || pos > size) {
            return null;
        }

        Node<T> currentNode = base.getNext();
        for (int i = 1; i < pos; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public T get(int pos) {
        Node<T> node = getNode(pos);
        return node != null ? node.getData() : null;
    }

    public void set(int pos, T value) {
        Node<T> node = getNode(pos);
        if (node != null) {
            node.setData(value);
        } else {
            System.out.println("Posição inválida");
        }
    }

    public int find(T value) {
        Node<T> currentNode = base.getNext();
        int pos = 1;
        while (currentNode != null && currentNode != top) {
            if (currentNode.getData().equals(value)) {
                return pos;
            }
            currentNode = currentNode.getNext();
            pos++;
        }
        return -1;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }

        Node<T> aux = base.getNext();
        while (aux != null && aux != top) {
            System.out.print(aux.getData() + " <=> ");
            aux = aux.getNext();
        }
        System.out.println();
    }


    }
