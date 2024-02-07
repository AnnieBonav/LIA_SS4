package CashierJava;

public class MainRunnable implements Runnable{
	
	private Client client;
	private Cashier cashier;
	private long initialTime;
	
	public MainRunnable (Client client, Cashier cashier, long initialTime){
		this.cashier = cashier;
		this.client = client;
		this.initialTime = initialTime;
	}

	public static void main(String[] args) {
		System.out.println("Running MainRunnable");
		Client client1 = new Client("Client 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Client client2 = new Client("Client 2", new int[] { 1, 3, 5, 1, 1 });
		
		Cashier cajera1 = new Cashier("Cashier 1");
		Cashier cajera2 = new Cashier("Cashier 2");
		
		long initialTime = System.currentTimeMillis();
		
		Runnable process1 = new MainRunnable(client1, cajera1, initialTime);
		Runnable process2 = new MainRunnable(client2, cajera2, initialTime);
		
		new Thread(process1).start();
		new Thread(process2).start();
		System.out.println("ENDED MainRunnable");
	}

	@Override
	public void run() {
		this.cashier.processShopping(this.client, this.initialTime);
	}

}
