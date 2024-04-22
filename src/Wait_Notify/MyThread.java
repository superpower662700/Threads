package Wait_Notify;

public class MyThread implements Runnable {
	private boolean check = false;

	public synchronized void acquireLock() throws InterruptedException {
		while (check) {
			wait();
			System.out.println("Đang đợi Base");
		}
		check = true;
		System.out.println("Nhận Base");
	}

	public synchronized void releaseLock() {
		check = false;
		notify();
		System.out.println("Giai phóng Base");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			acquireLock();
			Thread.sleep(2000);
			releaseLock();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
