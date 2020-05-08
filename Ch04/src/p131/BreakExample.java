package p131;
/*
 * 작성자 : 신동호
 * 작성일 : 2020.05.08
 */
public class BreakExample {
	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
