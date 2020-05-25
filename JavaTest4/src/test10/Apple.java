package test10;

public class Apple implements Serializable {
	
	//��ü �ø��� ���� ����(�ɼ�)
	private static final long serialVersionUID = 1L;
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("������ : "+country);
		System.out.println("��   �� : "+price);
		
	}

}
