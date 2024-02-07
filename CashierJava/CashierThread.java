package CashierJava;

public class CashierThread extends Thread {

	private String name;
	private Client client;
	private long initialTime;

	public CashierThread(String name, Client client, long initialTime) {
		this.name = name;
		this.client = client;
		this.initialTime = initialTime;
	}

	@Override
	public void run() {

		System.out.println("The cashier " + this.name + " STARTS PROCESSING THE CLIENTS SHOPPING " 
					+ this.client.getName() + " IN TIME: " 
					+ (System.currentTimeMillis() - this.initialTime) / 1000 
					+ "secs");

		for (int i = 0; i < this.client.getShoppingCar().length; i++) { 
			this.waitXSeconds(client.getShoppingCar()[i]); 
			System.out.println("PROCESSING PRODUCT " + (i + 1) 
			+ " from client " + this.client.getName() + "->TIME: " 
			+ (System.currentTimeMillis() - this.initialTime) / 1000 
			+ "secs");
		}

		System.out.println("The cashier " + this.name + " HAS FINISHED PROCESSING " 
						+ this.client.getName() + " IN TIME: " 
						+ (System.currentTimeMillis() - this.initialTime) / 1000 
						+ "secs");
	}

	private void waitXSeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}
