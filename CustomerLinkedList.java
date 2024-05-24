public class CustomerLinkedList {
    Customer head;

    public CustomerLinkedList() {
        this.head = null;
    }

    public void addCustomer(String name, String address, String accountNumber) {
        Customer newCustomer = new Customer(name, address, accountNumber);
        if (head == null) {
            head = newCustomer;
        } else {
            Customer current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newCustomer;
        }
    }

    public void displayCustomers() {
        Customer current = head;
        while (current != null) {
            System.out.println("Name: " + current.name);
            System.out.println("Address: " + current.address);
            System.out.println("Account Number: " + current.accountNumber);
            System.out.println("------------------");
            current = current.next;
        }
    }
}
