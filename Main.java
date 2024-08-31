//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        System.out.println("Testando a lista duplamente encadeada:");

        // Testando isEmpty e getSize
        System.out.println("A lista está vazia? " + list.isEmpty());
        System.out.println("Tamanho da lista: " + list.getSize());

        // Adicionando elementos à lista
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Lista após adicionar elementos:");
        list.printList();

        // Testando getSize e isEmpty novamente
        System.out.println("A lista está vazia? " + list.isEmpty());
        System.out.println("Tamanho da lista: " + list.getSize());

        // Testando get e find
        System.out.println("Elemento na posição 3: " + list.get(3));
        System.out.println("Posição do elemento 4: " + list.find(4));

        // Testando set
        list.set(3, 10);
        System.out.println("Lista após alterar o valor na posição 3:");
        list.printList();

        // Testando remoção por posição
        list.remove(2);
        System.out.println("Lista após remover o elemento na posição 2:");
        list.printList();

        // Testando remoção por nó
        Node<Integer> node = list.getNode(3);
        list.remove(node);
        System.out.println("Lista após remover o nó na posição 3:");
        list.printList();

        // Testando adição em uma posição específica
        list.add(2, 15);
        System.out.println("Lista após adicionar 15 na posição 2:");
        list.printList();

        // Testando remoção de elemento não existente
        list.remove(10);
        System.out.println("Lista após tentativa de remover posição inexistente:");
        list.printList();
    }
}