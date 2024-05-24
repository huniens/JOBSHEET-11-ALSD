public class Queue {
    QueueNode front;
    QueueNode rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (front == null)
            return -1;
        int data = front.data;
        front = front.next;
        if (front == null)
            rear = null;
        return data;
    }

    public void displayQueue() {
        QueueNode current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
