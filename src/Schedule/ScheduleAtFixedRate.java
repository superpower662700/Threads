package Schedule;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleAtFixedRate {
	public static void main(String[] args) {
		Thread_Schedule thread1 = new Thread_Schedule();
		Thread t1 = new Thread(thread1);
		Thread_Schedule thread2 = new Thread_Schedule();
		Thread t2 = new Thread(thread2);
		ScheduledExecutorService schedule = Executors.newScheduledThreadPool(2);
		schedule.scheduleAtFixedRate(t1, 0, 1, TimeUnit.SECONDS);
		schedule.scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thực hiện hành động đặt lịch 2");
			}
		}, 0, 1, TimeUnit.SECONDS);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		schedule.shutdown();
		System.out.println("End!");
	}
}
