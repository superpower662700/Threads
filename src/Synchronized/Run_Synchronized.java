package Synchronized;

public class Run_Synchronized {
	public static void main(String[] args) {
		SynchronizedExample ex = new SynchronizedExample();
		Thread t1 = new Thread(ex);
		Thread t2 = new Thread(ex);

		t1.start();
		t2.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ex.display();
	}
}
