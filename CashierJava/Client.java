package CashierJava;

public class Client {
	private String name;
	private int[] shoppingCar;

	public Client(String name, int[] shoppingCar) {
		this.name = name;
		this.shoppingCar = shoppingCar;
	}

	public int[] getShoppingCar() {
		return shoppingCar;
	}
	
	public String getName() {
		return name;
	}
}
