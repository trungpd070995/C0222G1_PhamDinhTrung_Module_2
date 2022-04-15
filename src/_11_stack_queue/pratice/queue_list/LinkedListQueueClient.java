package _11_stack_queue.pratice.queue_list;

public class LinkedListQueueClient {

    /**lớp LinkedListQueueClient chứa phương thức main để thực thi ứng dụng*/

    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
