package lists.linkedlists;

import lists.arraylists.Employee;

public class Main {

    public static void main(String[] args) {
        // disadvantage of linked list is storing the extra value for memory.
        // LL is a good choice if you want what's in front of the list; if you want random data it might not be a good choice.
        Employee hungLy = new Employee("Hung", "Ly", 123);
        Employee michaelJordan = new Employee("Michael", "Jordan", 23);
        Employee magicJohnson = new Employee("Magic", "Johnson", 32);
        Employee larryBird = new Employee("Larry", "Bird", 33);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(hungLy);
        list.addToFront(michaelJordan);
        list.addToFront(magicJohnson);
        list.addToFront(larryBird);

        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        list.printList();
        EmployeeNode removedNode = list.removeFromFront();
        System.out.println("removed " + removedNode);
        list.printList();
    }

}
