package Priority;

public class Thread_Priority implements Runnable {
	@Override
	public void run() {
		System.out.println("running thread 1 name is:" + Thread.currentThread().getName());
		System.out.println("running thread 1 priority is: " + Thread.currentThread().getPriority());
	}
}
