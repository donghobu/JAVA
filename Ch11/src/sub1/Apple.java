package sub1;

public class Apple {
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		System.out.println("원산지 : "+country);
		System.out.println("가   격 : "+price);
		
		return super.toString();
		
	}

	public void info() {
		// TODO Auto-generated method stub
		
	}
}
