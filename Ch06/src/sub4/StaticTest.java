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
		
	}

}
