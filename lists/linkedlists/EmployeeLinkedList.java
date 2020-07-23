package lists.linkedlists;

import lists.arraylists.Employee;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size = 0;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        // sets the new node's next value to the current list's current head (which is null);

        node.setNext(head);
        this.head = node;
        this.size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = this.head;
        this.head = this.head.getNext();
        // decrease the size after remove
        size--;
        // clean up the references
        removedNode.setNext(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("Current head: ");
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

}
