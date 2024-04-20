package Thread_synonym;

public class MyTask {
	public static void main(String[] args) throws InterruptedException {

		Account a = new Account("Pham Quang Anh", 15);
		WithDrawTask task1 = new WithDrawTask(a);
		Thread t1 = new Thread(task1);
		WithDrawTask task2 = new WithDrawTask(a);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
	}
}
