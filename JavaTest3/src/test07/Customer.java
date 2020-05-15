package test07;

public class Customer {

		? int id;
		? String name;
		? String grade;
		? int point;
		? double pointRatio;
		
		public Customer(int id, String name) {
			this.id = id;
			this.name = name;
			this.grade = "SILVER";
			this.point = 100;
			this.pointRatio = 0.01;
		}
	
		public int calcPrice(int price) {
			point += price * pointRatio;
			return price;
		}
		
		public void showInfo() {
			System.out.println("========================");
			System.out.println("����ȣ : "+id);
			System.out.println("���̸� : "+name);
			System.out.println("����� : "+grade);
			System.out.println("���� ����Ʈ : "+point);
			System.out.println("����Ʈ ������ : "+pointRatio);
		}

}
