package lists.linkedlists;

import lists.arraylists.Employee;

public class Main {

    public static void main(String[] args) {
        Employee hungLy = new Employee("Hung", "Ly", 123);
        Employee michaelJordan = new Employee("Michael", "Jordan", 23);
        Employee magicJohnson = new Employee("Magic", "Johnson", 32);
        Employee larryBird = new Employee("Larry", "Bird", 33);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(hungLy);
        list.addToFront(michaelJordan);
        list.addToFront(magicJohnson);
        list.addToFront(larryBird);

        list.printList();
    }

}
