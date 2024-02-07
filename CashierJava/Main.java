package CashierJava;

public class Main {
	public static void main(String[] args) {
		System.out.println("Running Main");
		
		runWithoutThread();
		// runWithThread();
		System.out.println("ENDED Main");
	}
	
	public static void runWithoutThread() {
		System.out.println("Starting Without Thread");
		Client client1 = new Client("Client 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Client client2 = new Client("Client 2", new int[] { 1, 3, 5, 1, 1 });
	
		Cashier cashier1 = new Cashier("Cashier 1");
		Cashier cashier2 = new Cashier("Cashier 2");
	
		long initialTime = System.currentTimeMillis();
	
		cashier1.processShopping(client1, initialTime);
		cashier2.processShopping(client2, initialTime);
		System.out.println("Finished Without Thread");
	}
	
	public static void runWithThread() {
		System.out.println("Starting with Thread");
		Client client1 = new Client("Client 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Client client2 = new Client("Client 2", new int[] { 1, 3, 5, 1, 1 });

		long initialTime = System.currentTimeMillis();
		CashierThread cashier1 = new CashierThread("Cajera 1", client1, initialTime);
		CashierThread cashier2 = new CashierThread("Cajera 2", client2, initialTime);

		cashier1.start();
		cashier2.start();
		System.out.println("Finished With Thread");
	}
}
