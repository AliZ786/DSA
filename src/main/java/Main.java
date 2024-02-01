import Queue.Queue;
import Deque.Deque;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new Queue<Integer>();
        Deque<Integer> integerDeque = new Deque<Integer>();

        System.out.println("---- Printing methods for Queue ----");
        integerQueue.enqueue(10);
        integerQueue.enqueue(20);
        integerQueue.enqueue(30);

        integerQueue.printQueue();

        while (!integerQueue.isEmpty()){
            integerQueue.dequeue();
            integerQueue.printQueue();
        }

        System.out.println("\n---- Printing methods for Deque ----");
        integerDeque.addFirst(16);
        integerDeque.addLast(12);

        integerDeque.printDeque();

        System.out.println(integerDeque.size());
        integerDeque.addFirst(45);
        integerDeque.addLast(24);
        integerDeque.printDeque();

        while(!integerDeque.isEmpty()){
            integerDeque.removeFirst();
            integerDeque.printDeque();
            integerDeque.removeLast();
            integerDeque.printDeque();
        }

        }
    }
