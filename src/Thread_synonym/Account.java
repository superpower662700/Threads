package Thread_synonym;

public class Account {
	private String name;
	private double amount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Account(String name, double amount) {
		this.name = name;
		this.amount = amount;
	}

	public Account() {
	}

	public void withdraw(double a) {
		try {
			Thread.sleep(1000);
			if (this.amount >= a) {
				this.setAmount(this.getAmount() - a);
				System.out.println("success");
			} else {
				System.out.println("fail");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
