package sub4;
/*
 * ��¥ : 2020/05/11
 * �̸� : �ŵ�ȣ
 * ���� : ���� p.236 Ŭ��������(��������), Ŭ�����޼���(�����޼���), �ǽ��ϱ� 
 */
public class StaticTest {
	public static void main(String[] args) {
		// ����  -> ���� -> ���� -> ����
		
		// �޸� ���� �Ҵ� ����(Method Area)�� �̹� Increment�� add(); �޼��尡
		// ���ǵǾ� �ֱ� ������ ��ü �������� �ٷ� ȣ�� ����
		Increment.add();
		
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		// �̱��� ��ü ������
		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();
		
		int r1 = c1.plus(1, 2);
		int r2 = c2.minus(1, 2);
		int r3 = c3.multi(2, 3);
		int r4 = c4.div(4, 2);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
	}

}
