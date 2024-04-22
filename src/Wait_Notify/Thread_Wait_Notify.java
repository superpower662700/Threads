package Wait_Notify;

public class Thread_Wait_Notify {
	public static void main(String[] args) {
		MyThread m = new MyThread();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);

		t1.start();
		t2.start();
	}
}
