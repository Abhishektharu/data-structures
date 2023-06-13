public class LL {
    Node head;

    class Node {

        String data;
        Node next;

        Node(String data) {
            // constructor of Node class
            this.data = data;
            this.next = null;
        }
    }

    // insert element at first , last,
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        // currNode = newNode;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

    public void printList() {
        Node currNode = head;
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
        }

        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
        }
        if (head.next == null) {
            head = null;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public static void main(String[] args) {
        // LL list = new LL();
        // list.addFirst("is");
        // list.addLast("comleted");
        // list.addFirst("my example ");
        // list.addLast("this will removed.");
        // list.printList();

        // System.out.println();
        // System.out.println("===========================");
        // System.out.println();
        // list.deleteFirst();
        // list.printList();

        // System.out.println();
        // System.out.println();
        // list.deleteLast();
        // list.printList();

        // Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2,
        // 3). Search for the number 7 & display its index.

        LL list = new LL();
        list.addFirst("1");
        list.addLast("5");
        list.addLast("7");
        list.addLast("3");
        list.addLast("8");
        list.addLast("2");
        list.addLast("3");

        list.printList();

        
    }
}
