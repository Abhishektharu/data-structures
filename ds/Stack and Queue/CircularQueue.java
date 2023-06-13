public class CircularQueue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;
    
    public CircularQueue(int size) {
        queueArray = new int[size];
        front = -1;
        rear = -1;
        this.size = size;
    }
    
    public boolean isFull() {
        if ((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))) {
            return true;
        }
        return false;
    }
    
    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }
    
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            queueArray[rear] = element;
            System.out.println(element + " enqueued");
        }
    }
    
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            int element = queueArray[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            System.out.println(element + " dequeued");
        }
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Elements in queue are:");
            for (int i = front; i != rear; i = (i + 1) % size) {
                System.out.println(queueArray[i]);
            }
            System.out.println(queueArray[rear]);
        }
    }
}