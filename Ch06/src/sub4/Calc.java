package sub4;
/*
 * ��¥ : 2020/05/11
 * �̸� : �ŵ�ȣ
 * 
 */
public class Calc {
	// �̱��� ��ü
	// Ŭ���� ����� �ڱ� �ڽ��� ��ü 
	private static Calc instance = new Calc;
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {
		
	}
	
	public int plus(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}
	
}
