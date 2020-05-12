package sub1;

public class Account {
	// 특성(멤버변수) 접근권한 private 선언으로 무조건 캡슐화 한다/
	protected String bank;
	protected String id;
	protected String name;
	protected int money;
	
	// 생성자:객체를 생성할 때 멤버변수를 초기화하는 메서드(private로 개체보호 했기 때문에 생성자로 별도 지정하여 참조 가능케 함)
	Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
		
	}
	
	// 기능(메서드)
	public void deposit(int money) { // static 안 씀
		this.money += money; // class Account의 money 지칭하는 this 지시자
	}
	
	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void info() {
		System.out.println("===============");
		System.out.println("은행명 : "+bank);
		System.out.println("계좌번호 : "+id);
		System.out.println("입 금 주 : "+name);
		System.out.println("현재잔액 : "+money);
	}

}
