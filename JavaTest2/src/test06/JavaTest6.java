package test06;
import java.util.Scanner;
/*
 * ��¥ : 2020/05/07
 * �̸� : �ŵ�ȣ
 * ���� : �Լ� ��������
 */
public class JavaTest6 {
	public static void ?() {
		System.out.println("******* START *******");
		System.out.println("�ΰ��� ������ �Է�");
		
	}
	
	public static int ?(? name) {
		System.out.print("���� "+name+" �� �Է� : ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
	
	public static ? result(int val) {
		System.out.println("���� ��� : "+val);
		System.out.println("******* END *******");
		
	}
	
	public static ? add(int x, int y) {
		return x + y;
	}
	
	public static void main(String [] args) {
		intro();
		
		int a = input("a");
		int b = input("b");
		
		int output = add(a, b);
		result(output);
		
	}
}
