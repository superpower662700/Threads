package Schedule;

import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {
	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.println("Task executed after 2 seconds");
			}
		};
		timer.schedule(task, 2000); // Lập lịch thực hiện task sau 2 giây
	}
}
