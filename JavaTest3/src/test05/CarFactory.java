package test05;

public class CarFactory {
	private ? CarFactory instance = new CarFactory();
	? CarFactory() {}
	
	public ? ? getInstance() {
		return instance;
	}
	
	public ? creatCar(String name, int price) {
		return new Car(name, price);
	}

}
