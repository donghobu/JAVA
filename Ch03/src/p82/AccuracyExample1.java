package p82;
/*
 * 작성자 : 신동호
 * 작성일 : 2020.05.08
 */
public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한 개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result+ " 조각이 남는다");
	}
}
