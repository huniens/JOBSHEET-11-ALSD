public class Stack {
    private SingleLinkedList12 list = new SingleLinkedList12();

    public void push(String data) {
        list.addFirst(data);
    }

    public void pop() {
        if (!list.isEmpty()) {
            list.removeFirst();
        } else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }

    public String peek() {
        if (!list.isEmpty()) {
            return list.head.data;
        } else {
            throw new RuntimeException("Stack is empty. Cannot peek.");
        }
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void printStack() {
        list.print();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        // Implementing the stack: "Multimedia", "Statistika", "Algoritma", "Matematika"
        stack.push("Multimedia");
        stack.push("Statistika");
        stack.push("Algoritma");
        stack.push("Matematika");

        // Implementing the stack: "Basis Data", "Komputer", "Android", "Bahasa"
        stack.push("Basis Data");
        stack.push("Komputer");
        stack.push("Android");
        stack.push("Bahasa");

        // Print the stack
        stack.printStack(); // Output: Linked list content: Bahasa	Android	Komputer	Basis Data	Matematika	Algoritma	Statistika	Multimedia	
    }
}
