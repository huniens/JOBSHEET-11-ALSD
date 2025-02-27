/**
 * SingleLinkedList12
 */
public class SingleLinkedList12 {
        Node12 head; // initial position in linked list
        Node12 tail; // last position in linked list

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node12 tmp = head;
            System.out.print("Linked list content: \t");
            while (tmp !=null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked list is empty");
        }
    }

    public void addFirst(int input) {
        Node12 ndInput = new Node12(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(int input) {
        Node12 ndInput = new Node12(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, int input) {
        Node12 ndInput = new Node12(input, null);
        Node12 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next==null) tail=ndInput;
                break;    
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Wrong index");
        } else if(index == 0){
            addFirst(input);
        }else{
            Node12 temp = head;
            for (int i = 0; i < index -1 ; i++) {
                temp = temp.next;
        }
        temp.next = new Node12(input, temp.next);
        if (temp.next.next == null) tail = temp.next;
        }
    }
}