import javax.management.StandardMBean;

public class DoublyLinkedList <T>{

    private Node<T> base;
    private Node<T> top;
    private int size;

    public DoublyLinkedList(){
        base = new Node(null, null, null);
        top = new Node(null, base, null );

        base.setNext(top);
        size = 0;
    }

    public void add(T data, int pos){
        if (pos < 1 || pos > size + 1){
            System.out.println("Posição inválida para inserção");
            return;
        }
        Node<T> previousAddNode = base;
        for (int i = 1; i < pos; i++) {
            previousAddNode = previousAddNode.getNext();
        }

        Node<T> node = new Node<T>(data, previousAddNode, null);
        node.setNext(previousAddNode.getNext());
        node.getNext().setPrev(node);
        previousAddNode.setNext(node);
        size++;
    }


    public T remove(int pos){
        if (pos < 1 || pos > size){
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

    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }

    public void printList(){
        if (isEmpty()){
            System.out.println("Lista vazia");
        }

        Node<T> aux = base;
        while (aux != null){
            System.out.println(aux.getData() + " <=> ");
            aux = aux.getNext();
        }
        System.out.println();
    }


}

