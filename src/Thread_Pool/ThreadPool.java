package Thread_Pool;

public class ThreadPool implements Runnable {
	private int id;

	public ThreadPool(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thao tác thực hiện là : " + id);
		try {
			Thread.sleep(2000);
			System.out.println("END : " + id);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
