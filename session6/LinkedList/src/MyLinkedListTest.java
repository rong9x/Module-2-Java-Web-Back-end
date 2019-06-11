public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(1);

        myLinkedList.add(0, 1);
        myLinkedList.add(1, 2);
        myLinkedList.remove(1);
        myLinkedList.printList();
    }
}
