package test09;

/*
 * ��¥ : 2020/05/01
 * �̸� : �ŵ�ȣ
 * ���� : �ڹ� �� �Ƕ�̵� ��������
 */
public class JavaTest9 {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 0; i < n ; i++) {
			
			for(int j = n-1 ; j > 1 ; j--) {
				System.out.println(" ");
			}
			
			for(int j = 0 ; j < 2 * i + 1 ; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}

}
