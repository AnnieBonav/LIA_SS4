package CashierJava;

public class Cashier {
	private String name;

	public Cashier(String name) {
		this.name = name;
	}


	public void processShopping(Client client, long timeStamp) {

		System.out.println("The cashier" + this.name + 
				" STARTS PROCESSING CLIENTS SHOPPING " + client.getName() + 
				" IN TIME: " + (System.currentTimeMillis() - timeStamp) / 1000	+
				"sec");
		
		for (int i = 0; i < client.getShoppingCar().length; i++) { 
				this.waitXseconds(client.getShoppingCar()[i]); 
				System.out.println("Processing product " + (i + 1) +  
				" ->TIME: " + (System.currentTimeMillis() - timeStamp) / 1000 + 
				"sec");
		}

		System.out.println("The cashier " + this.name + " HAS FINISHED PROCESSING " + 
				client.getName() + " IN TIME: " + 
				(System.currentTimeMillis() - timeStamp) / 1000 + "sec");

	}


	private void waitXseconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
