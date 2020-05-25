package test06;
/*
 * 날짜 : 2020/05/25
 * 이름 : 신동호
 * 내용 : 자바 API클래스 연습문제
 */
public class JavaTest6 {
	
	public static void main(String[] args) {
		
		JavaTest6 test = new JavaTest6();
		
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("필리핀", 2000);
		Grape grape = new Grape("미국", 3000);
		
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
