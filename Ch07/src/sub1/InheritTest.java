package sub1;

/*
 * 날짜 : 2020/05/12
 * 이름 : 신동호
 * 내용 : 클래스 상속 실습하기
 */
public class InheritTest {
	
	public static void main(String[] args) {
		
		StockAccount kb = new StockAccount("국민은행", "212-12-1234",  "홍길동", 10000, "삼성전자", 100, 30000);
		kb.deposit(50000);
		kb.withdraw(7000);
		kb.buy(100);
		kb.sell(10);
		
		kb.info();
				
		
	}

}
