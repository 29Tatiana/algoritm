public class LinkedList{
    private class Node {
        private int value;
        private Node next;

    }

    public static Node reverseList(Node head) {
        Node prev = null; 
        Node current = head;
        Node next = null;  

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

}
