package sub1;

/*
 * ��¥ : 2020/05/12
 * �̸� : �ŵ�ȣ
 * ���� : Ŭ���� ��� �ǽ��ϱ�
 */
public class InheritTest {
	
	public static void main(String[] args) {
		
		StockAccount kb = new StockAccount("��������", "212-12-1234",  "ȫ�浿", 10000, "�Ｚ����", 100, 30000);
		kb.deposit(50000);
		kb.withdraw(7000);
		kb.buy(100);
		kb.sell(10);
		
		kb.info();
				
		
	}

}
