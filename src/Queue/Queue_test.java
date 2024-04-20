package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_test {
	public static void main(String[] args) {
//		Queue<Integer> queue = new LinkedList<>();
//		Queue<Integer> queue = new ArrayBlockingQueue<>(3);
		Queue<Integer> queue = new PriorityQueue<>(); // sắp xếp bé -> lớn
		// Enqueue
		queue.add(30);
		queue.add(10);
		queue.add(20);
//		queue.add(40); => Exception: Queue full if ArrayBlockingQueue<>(3)
		// Front
		System.out.println("First : " + queue.peek());

		// Dequeue
		System.out.println("First and Delete : " + queue.poll());

		// size
		System.out.println("Size : " + queue.size());

		// empty
		System.out.println("Empty : " + queue.isEmpty());
	}
}
