package Thread_synonym;

public class WithDrawTask implements Runnable {
	private Account account;

	public WithDrawTask(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		try {
			this.account.withdraw(10);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
