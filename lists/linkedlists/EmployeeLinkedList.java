package lists.linkedlists;

import lists.arraylists.Employee;

public class EmployeeLinkedList {

    private EmployeeNode head;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        this.head = node;
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
