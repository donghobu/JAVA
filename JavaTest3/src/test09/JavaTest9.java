package test09;
/*
 * 날짜 : 2020/05/15
 * 이름 : 신동호
 * 내용 : 추상클래스, 다형성 연습문제
 */
public class JavaTest9 {
	public static void main(String[] args) {
		
		? here = new ?
				
		Circle circle = new Circle ();
		Triangle triangle =  new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
	}
	
	public void draw(? obj) {
		obj.draw();
	}
}
