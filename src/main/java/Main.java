import queue.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new Queue<>();

        integerQueue.enqueue(10);
        integerQueue.enqueue(20);
        integerQueue.enqueue(30);

        integerQueue.printQueue();

        while (!integerQueue.isEmpty()){
            integerQueue.dequeue();
            integerQueue.printQueue();
        }
        }
    }
