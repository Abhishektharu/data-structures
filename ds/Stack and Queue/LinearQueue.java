class Queue{
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s)
    {
        maxSize = s; // array cell is 1 cell larger
        queArray = new long[maxSize]; // defines size of queue
        front = 0;
        rear = -1;
        nItems = 0;
    }
    
    //operation consist of insert , delete, peek, isempty()

    public void insert(long j)
    {
        if(rear == maxSize -1){
            rear = -1;
        }
            queArray[rear++] = j;
            nItems++;
    }

    public long delete()
    {
        long temp = queArray[front];
        front++;
        if(front == maxSize){
            front = 0;
        }

        nItems--;
        return temp;
    }

    public long peekFront(){
        return queArray[front];
    }
    public boolean isEmpty(){
        return (nItems == 0);
    }

    public void display(){
        for(int i = 0;i<nItems; i++){
            System.out.println(queArray[i]);
        }
    }
}

/**
 * LinearQueue
 */
public class LinearQueue {

    public static void main(String[] args) {
        Queue q = new Queue(15);
        q.insert(1);
        q.insert(2);
        q.insert(3);

        q.delete();
        q.insert(4);

        q.display();
    }
}