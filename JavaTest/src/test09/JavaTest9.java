package test09;

/*
 * 날짜 : 2020/05/01
 * 이름 : 신동호
 * 내용 : 자바 별 피라미드 연습문제
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
