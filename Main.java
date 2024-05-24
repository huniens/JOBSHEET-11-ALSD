public class Main {
    public static void main(String[] args) {
        CustomerLinkedList customerList = new CustomerLinkedList();
        customerList.addCustomer("John Doe", "123 Main St", "123456");
        customerList.addCustomer("Jane Smith", "456 Elm St", "789012");
        customerList.displayCustomers();
    }
}
