package p124;
/*
 * �ۼ��� : �ŵ�ȣ
 * �ۼ��� : 2020.05.08
 */
public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int m=2; m<=9; m++) {
		  System.out.println("*** "+ m + "�� ***");
		  for (int n=1; n<=9; n++) {
			  System.out.println(m + " x "+ n + " = "+(m*n));
		  }
		}
	}
}
