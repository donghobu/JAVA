package sub4;
/*
 * 날짜 : 2020/05/11
 * 이름 : 신동호
 * 
 */
public class Calc {
	// 싱글톤 객체
	// 클래스 멤버가 자기 자신의 객체 
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
