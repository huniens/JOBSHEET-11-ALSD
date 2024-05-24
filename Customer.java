public class Customer {
    String name;
    String address;
    String accountNumber;
    Customer next;

    public Customer(String name, String address, String accountNumber) {
        this.name = name;
        this.address = address;
        this.accountNumber = accountNumber;
        this.next = null;
    }
}
