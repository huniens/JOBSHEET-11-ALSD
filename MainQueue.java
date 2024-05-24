public class MainQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Queue elements:");
        queue.displayQueue();
        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Queue elements after dequeue:");
        queue.displayQueue();
    }
}
