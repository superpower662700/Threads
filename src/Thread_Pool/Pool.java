package Thread_Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pool {
	public static void main(String[] args) {

		ExecutorService ex = Executors.newFixedThreadPool(3);
		for (int i = 0; i <= 10; i++) {
			Runnable t = new ThreadPool(i);
			ex.execute(t);
		}
		ex.shutdown();
	}
}
