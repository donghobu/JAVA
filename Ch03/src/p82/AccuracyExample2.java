package p82;
/*
 * �ۼ��� : �ŵ�ȣ
 * �ۼ��� : 2020.05.08
 */
public class AccuracyExample2 {
	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp/10.0;
		
		System.out.println("��� �� ������ ");
		System.out.println("0.7 ������ ����");
		System.out.println(result+ " ������ ���´�");
	}
}
