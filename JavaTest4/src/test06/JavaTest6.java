package test06;
/*
 * ��¥ : 2020/05/25
 * �̸� : �ŵ�ȣ
 * ���� : �ڹ� APIŬ���� ��������
 */
public class JavaTest6 {
	
	public static void main(String[] args) {
		
		JavaTest6 test = new JavaTest6();
		
		Apple apple = new Apple("�ѱ�", 3000);
		Banana banana = new Banana("�ʸ���", 2000);
		Grape grape = new Grape("�̱�", 3000);
		
		test.showInfo(apple);
		test.showInfo(banana);
		test.showInfo(grape);
	}
	
	public void showInfo( fruit) {
		if(fruit    Apple) {
			Apple apple = ;
			apple.show();
			
		}else if(fruit  Banana) {
			Banana banana = ;
			banana.show();
			
		}else if(fruit  Grape) {
			Grape grape = ;
			grape.show();
		}
	}

}
