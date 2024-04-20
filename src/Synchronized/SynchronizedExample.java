package Synchronized;

public class SynchronizedExample implements Runnable {
	private int count = 0;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 1000; i++) {
				count++;
			}
		}
		// TODO Auto-generated method stub
	}

	public void display() {
		System.out.println(count);
	}
}
//private int count = 0;
//
//// Synchronized method
//public void increment() {
//	count++;
//}
//
//public synchronized int getCount() {
//	return count;
//}
//
//public static void main(String[] args) {
//	SynchronizedExample example = new SynchronizedExample();
//
//	// Tạo luồng 1 để tăng count
//	Thread thread1 = new Thread(() -> {
//		for (int i = 0; i < 1000; i++) {
//			example.increment();
//		}
//	});
//
//	// Tạo luồng 2 để giảm count
//	Thread thread2 = new Thread(() -> {
//		for (int i = 0; i < 1000; i++) {
//			example.increment();
//		}
//	});
//
//	thread1.start();
//	thread2.start();
//	try {
//		Thread.sleep(5000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	System.out.println("Final count: " + example.getCount()); // In ra kết quả cuối cùng của count
//}