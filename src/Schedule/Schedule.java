package Schedule;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedule {
	public static void main(String[] args) {
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		Runnable task = () -> {
			System.out.println("Task executed after 3 seconds");
		};
		scheduler.schedule(task, 3, TimeUnit.SECONDS); // Lập lịch thực hiện task sau 3 giây
	}
}
