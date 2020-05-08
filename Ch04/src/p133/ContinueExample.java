package p133;
/*
 * 작성자 : 신동호
 * 작성일 : 2020.05.08
 */
public class ContinueExample {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
