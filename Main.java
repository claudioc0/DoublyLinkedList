//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();

        doublyLinkedList.printList();

        doublyLinkedList.add("a", 0);
        doublyLinkedList.printList();

        doublyLinkedList.add("a", 1);
        doublyLinkedList.printList();

        doublyLinkedList.add("d", 2);
        doublyLinkedList.printList();

        doublyLinkedList.add("c", 2);
        doublyLinkedList.printList();

        doublyLinkedList.add("b", 2);
        doublyLinkedList.printList();
    }
}