package Deadlock;

public class DeadlockExample {
	private static Object resource1 = new Object();
	private static Object resource2 = new Object();

	public static void main(String[] args) {
		// Luồng 1: Giữ tài nguyên 1 và cố gắng lấy tài nguyên 2
		Thread thread1 = new Thread(() -> {
			synchronized (resource1) {
				System.out.println("Thread 1: Đã có tài nguyên 1");
				try {
					Thread.sleep(100); // Giả lập thời gian xử lý
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("Thread 1: Đang cố gắng lấy tài nguyên 2...");
				synchronized (resource2) {
					System.out.println("Thread 1: Lấy được tài nguyên 2");
				}
			}
		});

		// Luồng 2: Giữ tài nguyên 2 và cố gắng lấy tài nguyên 1
		Thread thread2 = new Thread(() -> {
			synchronized (resource2) {
				System.out.println("Thread 2: Đã có tài nguyên 2");
				try {
					Thread.sleep(100); // Giả lập thời gian xử lý
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("Thread 2: Đang cố gắng lấy tài nguyên 1...");
				synchronized (resource1) {
					System.out.println("Thread 2: Lấy được tài nguyên 1");
				}
			}
		});

		// Khởi chạy các luồng
		thread1.start();
		thread2.start();
	}
}
